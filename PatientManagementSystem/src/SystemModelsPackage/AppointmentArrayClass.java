/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackage;

import PatientPackage.PatientArrayClass;
import DoctorPackage.DoctorArrayClass;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
 // Class for holding Appointments (an array of them) and allows adding and getting appointments
public class AppointmentArrayClass {
     
    public static ArrayList<Appointment> appointments = new ArrayList<>();
  
    public static void addAppointment(String doctorID, String patientID, String dates){
        Appointment newAppointment = new Appointment(doctorID, patientID, dates);
        AppointmentArrayClass.appointments.add(newAppointment);
    }
    
    public static String showDoctorAppointments(String doctorName){
    ArrayList<String> appoints = new ArrayList<>();
    
    String doctorID = DoctorArrayClass.getDoctorIDByName(doctorName);
         for (Appointment p: appointments) {
             
             if(doctorID.equals(p.getDoctorID())){
                 
                 appoints.add(p.getPossibleDates());
             }
             
         }
         String feedbackString = "Here is " + doctorName + " 's appointments:  " + appoints;
         return feedbackString;
     }
    
     public static String showPatientAppointments(String patientName){
    ArrayList<String> appoints = new ArrayList<>();
    
    String patientID = PatientArrayClass.getPatientIDByName(patientName);
         for (Appointment p: appointments) {
             
             if(patientID.equals(p.getPatientID())){
                 
                 appoints.add(p.getPossibleDates());
             }
             
         }
         String feedbackString = "Here is " + patientName + " 's appointments:  " + appoints;
         return feedbackString;
     }
  
}
