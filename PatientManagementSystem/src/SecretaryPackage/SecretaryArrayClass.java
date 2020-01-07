/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecretaryPackage;

import LoginPackage.CurrentUser;

import java.util.ArrayList;

/**
 *
 * @author Walker
 */
// this class holds all secretary objects in an array of them. allows adding removing getting LOGIN

public class SecretaryArrayClass {
     
    public static ArrayList<Secretary> secretarys = new ArrayList<>();
  // add new secretary to array
    public static void addSecretary(String ID, String name, String address, String password){
        Secretary newSecretary = new Secretary(ID, name, address, password);
        SecretaryArrayClass.secretarys.add(newSecretary);
    }
    // remove secretary from array
    public static void removeSecretary(Secretary secretary){
         SecretaryArrayClass.secretarys.remove(secretary);
     }
    
    // remove secretary by combo box name 
     public static void removeSecretaryByCMBName(String value){
      
        for (Secretary s: secretarys) {
             s.getName();
             if (s.getName().equals(value)) {
                 secretarys.remove(s);
             }
         }
     }
   
    
    // get secretary names as array
    public static ArrayList<String> getSecretarysNames(){
    ArrayList<String> secretaryNames = new ArrayList<>();
         for (Secretary d: secretarys) {
             secretaryNames.add(d.getName());
         }
         return secretaryNames;
     }
    // get secretary names as string array
    public static String[] getSecretarysNamesAsStringArray(){
    ArrayList<String> secretaryNames = new ArrayList<>();
 

         for (Secretary d: secretarys) {
             secretaryNames.add(d.getName());
         }
  
         String[] secretaryNamesAsStringArray = secretaryNames.toArray(new String[0]);
         
         return secretaryNamesAsStringArray;
     }
    
     // log in secretary
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
