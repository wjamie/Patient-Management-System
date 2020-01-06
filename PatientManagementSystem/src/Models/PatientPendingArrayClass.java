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
// class for holding all pending patients , allows adding removing  getting

public class PatientPendingArrayClass {
     
    public static ArrayList<Patient> patientsPending = new ArrayList<>();
  
     public static void addPatient(String ID, String name, String address, String password, int age, String gender){
        Patient newPatient = new Patient(ID, name, address, password, age, gender);
        PatientPendingArrayClass.patientsPending.add(newPatient);
    }
      
      public static void removePatientByCMBName(String value){
      
        for (Patient p: patientsPending) {
             p.getName();
             if (p.getName().equals(value)) {
                 patientsPending.remove(p);
             }
         }
     }
    
      public static Patient getPatientByName(String name){
          Patient patient1 = null;
    
         for (Patient p: patientsPending) {
             if (p.getName() ==name){
                 patient1 = p;
             }
         }
         return patient1;
     }
      
    public static ArrayList<String> getPatientsNames(){
    ArrayList<String> patientNames = new ArrayList<>();
         for (Patient p: patientsPending) {
             patientNames.add(p.getName());
         }
         return patientNames;
     }
    
    public static String[] getPatientsNamesAsStringArray(){
    ArrayList<String> patientNames = new ArrayList<>();
 

         for (Patient p: patientsPending) {
             patientNames.add(p.getName());
         }
  
         String[] patientNamesAsStringArray = patientNames.toArray(new String[0]);
         
         return patientNamesAsStringArray;
     }
    

    
    
}
