package keywords;

import java.io.*;
import java.util.*;

/**
 *
 * @author jradcliffe
 */
public class Keywords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inFileName = "words.txt";
        String[] list = new String[25];
        int lineCount = 0;
        
        
        //Reading in from "words" file to String list[]----------------------------------------
        try{
            Scanner inputStream = new Scanner(new File(inFileName));
            
            while(inputStream.hasNextLine()){                
                list[lineCount] = inputStream.nextLine();
                System.out.println(list[lineCount]);
                
                lineCount++;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("The file was not found...");
        }
        //-------------------------------------------------------------------------------------
        
        
        
        //$$$$$$$Split into double array: String[][] keyword$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
        String[][]keywords = new String[list.length][1];
        for(int x=0; x<list.length; x++){
            keywords[x] = list[x].split(",");
            System.out.println("The length of list #:" + x + " is: " + keywords[x].length);            
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
        for(int index1=0; index1< keywords[4].length; index1++){
            for(int index2=0; index2 < keywords[0].length; index2++ ){
                for(int index3=0; index3 < keywords[6].length; index3++){
                    for(int index4=0; index4< keywords[3].length; index4++){
                        outputStream.println(keywords[4][index1] + " " + keywords[0][index2] + " " + keywords[6][index3] + " " + keywords[3][index4]);
                    }
                }
            }
        }
        
        
        
        
        
        outputStream.close();
        System.out.println("Success! Check it out!");
        
        
        
        
        
    }
    
}
