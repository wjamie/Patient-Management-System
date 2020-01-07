/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecretaryPackage;

import LoginPackage.CurrentUser;
import static DoctorPackage.DoctorArrayClass.doctors;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
// this class holds all secretary objects in an array of them. allows adding removing getting LOGIN

public class SecretaryArrayClass {
     
    public static ArrayList<Secretary> secretarys = new ArrayList<>();
  
    public static void addSecretary(String ID, String name, String address, String password){
        Secretary newSecretary = new Secretary(ID, name, address, password);
        SecretaryArrayClass.secretarys.add(newSecretary);
    }
    
    public static void removeSecretary(Secretary secretary){
         SecretaryArrayClass.secretarys.remove(secretary);
     }
    
    
     public static void removeSecretaryByCMBName(String value){
      
        for (Secretary s: secretarys) {
             s.getName();
             if (s.getName().equals(value)) {
                 secretarys.remove(s);
             }
         }
     }
    
       public static boolean PatientLogIn(String ID, String pass){
     boolean log = false;
         for (Secretary d: secretarys){
             if (d.getID().equals(ID) && d.getPassword().equals(pass)){
                 log = true;
             }
         }
         return log;
     }
    
    public static ArrayList<String> getSecretarysNames(){
    ArrayList<String> secretaryNames = new ArrayList<>();
         for (Secretary d: secretarys) {
             secretaryNames.add(d.getName());
         }
         return secretaryNames;
     }
    
    public static String[] getSecretarysNamesAsStringArray(){
    ArrayList<String> secretaryNames = new ArrayList<>();
 

         for (Secretary d: secretarys) {
             secretaryNames.add(d.getName());
         }
  
         String[] secretaryNamesAsStringArray = secretaryNames.toArray(new String[0]);
         
         return secretaryNamesAsStringArray;
     }
    
    
    public static boolean SecretaryLogIn(String ID, String pass){
     boolean log = false;
         for (Secretary d: secretarys){
             if (d.getID().equals(ID) && d.getPassword().equals(pass)){
                 log = true;
                 CurrentUser.makeUser(d);
             }
         }
         return log;
     }
}
