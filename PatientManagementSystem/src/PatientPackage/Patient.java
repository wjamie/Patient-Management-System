/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientPackage;

import UserPackage.User;
import static DoctorPackage.DoctorFeedbackArrayClass.doctorFeedbacks;
import static SystemModelsPackage.MedicineArrayClass.medicines;

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
     
    @Override
    public String getID() {
        return ID;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
   
}
