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
        String[] list = new String[8];
        int lineCount = 0;
        
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
        
        String[][]keywords = new String[8][1];
        for(int x=0; x<8; x++){
            keywords[x] = list[x].split(",");
            System.out.println("The length of list #:" + x + " is: " + keywords[x].length);            
        }
        System.out.println(keywords[7][1]);
    }
    
}
