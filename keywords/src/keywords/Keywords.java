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
        String[] keyword = new String[8];
        int lineCount = 0;
        
        try{
            Scanner inputStream = new Scanner(new File(inFileName));
            
            while(inputStream.hasNextLine()){                
                keyword[lineCount] = inputStream.nextLine();
                System.out.println(keyword[lineCount]);
                
                lineCount++;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("The file was not found...");
        }
        
        
        
        System.out.println("OK:\nHere is the 5th line:");
        System.out.println(keyword[4]);
    }
    
}
