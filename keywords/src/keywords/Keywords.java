package keywords;

import java.io.*;
import java.util.*;

/**
 *
 * @author Jason Radcliffe
 * August 15, 2014
 */
public class Keywords {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inFileName = "words.txt";
        List<String> list = new ArrayList<String>();
        int lineCount = 0;
        
        
        //Reading in from "words" file to String list[]----------------------------------------
        /*^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        ^  Preconditions: Each list of keywords is on a serperate line,
        ^  the words are delimited by commas,
        ^  no spaces inbetween keywords
        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^*/
        try{
            Scanner inputStream = new Scanner(new File(inFileName));
            
            while(inputStream.hasNextLine()){ 
                list.add(inputStream.nextLine());
                lineCount++;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("The file was not found...");
        }
        //-------------------------------------------------------------------------------------
        
        
        
        //$$$$$$$Split into double array: String[][] keyword$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        System.out.println(list.size());
        
        String[][]keywords = new String[list.size()][1];
        for(int x=0; x<list.size(); x++){
            keywords[x] = list.get(x).split(",");  
        }
        //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        
        String outFileName;
        System.out.println("What do you want to call the output file?");
        outFileName = scan.nextLine();
        
        PrintWriter outputStream = null;
        try{
            outputStream = new PrintWriter(outFileName);
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file " + outFileName);
            System.exit(0);
        }
        
        
        //mother of all for-loops... brace yourself
        //The numbers here control which combination gets created.
        for(int index1=0; index1< keywords[4].length; index1++){
            for(int index2=0; index2 < keywords[1].length; index2++ ){
                for(int index3=0; index3 < keywords[3].length; index3++){
                    outputStream.println(keywords[4][index1] + " " + keywords[1][index2] + " " + keywords[3][index3]);
                    
                    
                    /*for(int index4=0; index4< keywords[3].length; index4++){
                        outputStream.println(keywords[4][index1] + " " + keywords[1][index2] + " " + keywords[2][index3] + " " + keywords[3][index4]);
                    }*/
                    
                }
            }
        }
        
        
        
        outputStream.close();
        System.out.println("Success! Check it out!");
        
        
        
        
        
    }
    
}
