/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandlingPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


/**
 *
 * @author Walker
 */
public class FileWriterClass {
    
    public static void WriteFile(String input) {
         
        
        
        try {
            FileWriter fw = new FileWriter("WriteToThis.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            
            pw.write("This user was created: " + input + "\n");
         
            
            
           
            pw.close();
    
        } catch (Exception e) {
            
        }
    
    }
}
