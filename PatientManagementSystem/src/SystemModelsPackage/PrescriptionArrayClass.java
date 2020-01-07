/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackage;

import PatientPackage.Patient;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
// holds all prescriptions in an array, allows showing presciptions for selcted patients and adding

public class PrescriptionArrayClass {
     
     public static ArrayList<Prescription> prescriptions = new ArrayList<>();  
  
         
     // show patient their medicine prescriptions
     public static String showPatientPrescriptions(){
        ArrayList<String> patientPrescriptions = new ArrayList<>();
    
       String patientID = Patient.currentPatient.getID();
        
           for (Prescription d: prescriptions) {
             
             if(patientID.equals(d.getPatientID())){
                 patientPrescriptions.add(d.getQuantityDosageNotes());
             }
             
         }
         String feedbackString = "Here is " + Patient.currentPatient.getName() + " 's prescriptions:  " + patientPrescriptions;
         return feedbackString;
     }
    
   // add new prescription
    public static void addPrescription(String patientID, Medicine prescribedMedicine, String dosageNotes){
        
        Prescription newPrescription = new Prescription(patientID, prescribedMedicine, dosageNotes);
        
        PrescriptionArrayClass.prescriptions.add(newPrescription);
    }
  
}
