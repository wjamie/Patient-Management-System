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
public class Appointment {
    private String doctorID;
    private String patientID;
    private String possibleDates;

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPossibleDates() {
        return possibleDates;
    }

    public void setPossibleDates(String possibleDates) {
        this.possibleDates = possibleDates;
    }
    

    public Appointment(String doctorID,String patientID, String possibleDates) {
       this.doctorID = doctorID;
       this.patientID = patientID;
       this.possibleDates = possibleDates;
       
    }
    
    
    
    
}
