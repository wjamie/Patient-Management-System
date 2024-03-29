/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientPackage;

import static PatientPackage.PatientArrayClass.patients;
import UserPackage.User;


import java.util.ArrayList;

/**
 *
 * @author Walker
 */

 // Patient class which extends USER, adding AGE and GENDER
public class Patient extends User{
    
  
    private int age;
    private String gender;
    
  
    
    public Patient(String ID, String name, String address, String password, int age, String gender) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }
  
     // Patient history array of strings
    public ArrayList<String> historys = new ArrayList<>();
  
// Current patient after login 
    public static Patient currentPatient;
    
    // assigns this user as current patient after log in 
    public static void makeCurrentPatient(Patient patient){
        currentPatient = patient;
    }
    
  
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    // Shows this Patient's History
     public String showPatientHistory(){
         
         StringBuilder sb = new StringBuilder();
      
         for (String s : historys)
         {
         sb.append(s);
         sb.append("\n");

         }
         return sb.toString();
     }
    
     public boolean wantsRemoval = false;
   
     public static String showRemoval(){
         String str = "";
         for (Patient p : patients){
         if (p.wantsRemoval == true) {
            str = p.getName() + " "+ p.getID();
         }
     }
     return str;
     }
}
