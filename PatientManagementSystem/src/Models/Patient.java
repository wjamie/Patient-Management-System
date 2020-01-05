/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import static Models.DoctorFeedbackArrayClass.doctorFeedbacks;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
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

    public ArrayList<String> historys = new ArrayList<>();

    public static Patient currentPatient;
    
    public static void makeCurrentPatient(Patient patient){
        currentPatient = patient;
    }
     
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

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
