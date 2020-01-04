/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public class PatientArrayClass {
     
    public static ArrayList<Patient> patients = new ArrayList<>();
  
     public static void addPatient(String ID, String name, String address, String password, int age, String gender){
        Patient newPatient = new Patient(ID, name, address, password, age, gender);
        PatientArrayClass.patients.add(newPatient);
    }
      
      public static void removePatientByCMBName(String value){
      
        for (Patient p: patients) {
             p.getName();
             if (p.getName().equals(value)) {
                 patients.remove(p);
             }
         }
     }
    
      
    public static ArrayList<String> getPatientsNames(){
    ArrayList<String> patientNames = new ArrayList<>();
         for (Patient p: patients) {
             patientNames.add(p.getName());
         }
         return patientNames;
     }
    
    public static String[] getPatientsNamesAsStringArray(){
    ArrayList<String> patientNames = new ArrayList<>();
 

         for (Patient p: patients) {
             patientNames.add(p.getName());
         }
  
         String[] patientNamesAsStringArray = patientNames.toArray(new String[0]);
         
         return patientNamesAsStringArray;
     }
    
}
