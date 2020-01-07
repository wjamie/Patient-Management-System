/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileHandlingPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


/**
 *
 * @author Walker
 */
// Class for reading from a File

public class FileReaderClass {
    
    public static void ReadFile() {
          
        try {
            FileReader fr = new FileReader("ReadFromThis.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String str;
            while((str = br.readLine()) != null){
            // Fake Users shown on login screen for assessment
            LoginPackage.LoginGUI.txtAreaFile.append(str + "\n");
            }
        } catch (Exception e) {
            
        }
    }
   
}
