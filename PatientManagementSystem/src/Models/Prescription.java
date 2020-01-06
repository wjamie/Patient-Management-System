/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Walker
 */

  // typical Prescription class with patient ID Medicine and Notes

public class Prescription {
   
  
    
    private String patientID;
    private Medicine prescribedMedicine;
    private String quantityDosageNotes;

    public Prescription(String patientID, Medicine prescribedMedicine, String quantityDosageNotes) {
        this.patientID = patientID;
        this.prescribedMedicine = prescribedMedicine;
        this.quantityDosageNotes = quantityDosageNotes;
    }

    
    
    
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public Medicine getPrescribedMedicine() {
        return prescribedMedicine;
    }

    public void setPrescribedMedicine(Medicine prescribedMedicine) {
        this.prescribedMedicine = prescribedMedicine;
    }

    public String getQuantityDosageNotes() {
        return quantityDosageNotes;
    }

    public void setQuantityDosageNotes(String quantityDosageNotes) {
        this.quantityDosageNotes = quantityDosageNotes;
    }
    
    
    
}
