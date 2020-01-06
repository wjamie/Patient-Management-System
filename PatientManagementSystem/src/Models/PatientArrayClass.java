/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import static Models.DoctorArrayClass.doctors;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
 // Class for holding PATIENTS (an array of them) and allows adding removing getting LOGIN
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
    
      public static Patient getPatientByName(String value){
      Patient patient = null;
        for (Patient d: patients) {
             d.getName();
             if (d.getName().equals(value)) {
                 patient = d;
             }
         }
        return patient;
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
    
      public static String getPatientIDByName(String value){
      String patientID = "";
        for (Patient d: patients) {
             d.getName();
             if (d.getName().equals(value)) {
                 patientID = d.getID();
             }
         }
        return patientID;
     }
    
    
    
     public static boolean PatientLogIn(String ID, String pass){
     boolean log = false;
         for (Patient d: patients){
             if (d.getID().equals(ID) && d.getPassword().equals(pass)){
                 log = true;
                 CurrentUser.makeUser(d);
                 Patient.makeCurrentPatient(d);
             }
         }
         return log;
     }
}
