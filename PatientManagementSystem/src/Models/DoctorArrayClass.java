/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import GUIs.DoctorPrescribeMedicineGUI;
import Models.*;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public class DoctorArrayClass {
     
    public static ArrayList<Doctor> doctors = new ArrayList<>();
  
    public static void addDoctor(String ID, String name, String address, String password){
        Doctor newDoctor = new Doctor(ID, name, address, password);
        DoctorArrayClass.doctors.add(newDoctor);
    }
    
     public static void removeDoctor(Doctor doctor){
         DoctorArrayClass.doctors.remove(doctor);
     }
      
     public static void removeDoctorByCMBName(String value){
      
        for (Doctor d: doctors) {
             d.getName();
             if (d.getName().equals(value)) {
                 doctors.remove(d);
             }
         }
     }
     
     public static Doctor getDoctorByName(String value){
      Doctor doctor = null;
        for (Doctor d: doctors) {
             d.getName();
             if (d.getName().equals(value)) {
                 doctor = d;
             }
         }
        return doctor;
     }
     
     
     
     public static String getDoctorIDByName(String value){
      String doctorID = "";
        for (Doctor d: doctors) {
             d.getName();
             if (d.getName().equals(value)) {
                 doctorID = d.getID();
             }
         }
        return doctorID;
     }
     
    public static ArrayList<String> getDoctorsNames(){
    ArrayList<String> doctorNames = new ArrayList<>();
         for (Doctor d: doctors) {
             doctorNames.add(d.getName());
         }
         return doctorNames;
     }
    
    public static String[] getDoctorsNamesAsStringArray(){
    ArrayList<String> doctorNames = new ArrayList<>();
 

         for (Doctor d: doctors) {
             doctorNames.add(d.getName());
         }
  
         String[] doctorNamesAsStringArray = doctorNames.toArray(new String[0]);
         
         return doctorNamesAsStringArray;
     }
    
      public static String[] getDoctorsSecretarysAsStringArray(){
    ArrayList<String> doctorSecretaryNames = new ArrayList<>();
 

         for (Doctor d: doctors) {
             doctorSecretaryNames.add(d.getName());
         }
         for (Secretary s: SecretaryArrayClass.secretarys) {
             doctorSecretaryNames.add(s.getName());
         }
         String[] doctorNamesAsStringArray = doctorSecretaryNames.toArray(new String[0]);
         
         return doctorNamesAsStringArray;
     }
}
