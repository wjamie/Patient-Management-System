/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientPackage;

import java.util.ArrayList;

/**
 *
 * @author Walker
 */
// class for holding all pending patients , allows adding removing  getting

public class PatientPendingArrayClass {
     
    public static ArrayList<Patient> patientsPending = new ArrayList<>();
  // add patient to pending list
     public static void addPatient(String ID, String name, String address, String password, int age, String gender){
        Patient newPatient = new Patient(ID, name, address, password, age, gender);
        PatientPendingArrayClass.patientsPending.add(newPatient);
    }
      // remove pending patient by their combo box name
      public static void removePatientByCMBName(String value){
      
        for (Patient p: patientsPending) {
             p.getName();
             if (p.getName().equals(value)) {
                 patientsPending.remove(p);
             }
         }
     }
    // get pending patient by name
      public static Patient getPatientByName(String name){
          Patient patient1 = null;
    
         for (Patient p: patientsPending) {
             if (p.getName().equals(name)){
                 patient1 = p;
             }
         }
         return patient1;
     }
      // get pending patients names as arraylist
    public static ArrayList<String> getPatientsNames(){
    ArrayList<String> patientNames = new ArrayList<>();
         for (Patient p: patientsPending) {
             patientNames.add(p.getName());
         }
         return patientNames;
     }
   // get patient pending  as string array
    public static String[] getPatientsNamesAsStringArray(){
    ArrayList<String> patientNames = new ArrayList<>();
 

         for (Patient p: patientsPending) {
             patientNames.add(p.getName());
         }
  
         String[] patientNamesAsStringArray = patientNames.toArray(new String[0]);
         
         return patientNamesAsStringArray;
     }
    

    
    
}
