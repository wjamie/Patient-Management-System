/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPackage;

import LoginPackage.CurrentUser;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
 // Class for holding Admins (an array of admins) and allows adding and getting admins logging in admins 
public class AdminArrayClass {
     
    public static ArrayList<Admin> admins = new ArrayList<>();
  // add a new admin
    public static void addAdmin(String ID, String name, String address, String password){
        Admin newAdmin = new Admin(ID, name, address, password);
        AdminArrayClass.admins.add(newAdmin);
    }
      // get admins names ARRAY
    public static ArrayList<String> getAdminsNames(){
    ArrayList<String> adminNames = new ArrayList<>();
         for (Admin d: admins) {
             adminNames.add(d.getName());
         }
         return adminNames;
     }
    // get Admin names array as a STRING
    public static String[] getAdminsNamesAsStringArray(){
    ArrayList<String> adminNames = new ArrayList<>();
 

         for (Admin d: admins) {
             adminNames.add(d.getName());
         }
  
         String[] adminNamesAsStringArray = adminNames.toArray(new String[0]);
         
         return adminNamesAsStringArray;
     }
    // Logs in ADMIN
      public static boolean AdminLogIn(String ID, String pass){
     boolean log = false;
         for (Admin d: admins){
             if (d.getID().equals(ID) && d.getPassword().equals(pass)){
                 log = true;
               CurrentUser.makeUser(d);
               
             }
         }
         return log;
     }

}
