/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.*;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
 // Class for holding appointment requests (an array of them) and allows adding and showing the requests
public class AppointmentRequestArrayClass {
     
    public static ArrayList<Appointment> appointmentRequests = new ArrayList<>();
  
    public static void addAppointment(String doctorID, String patientID, String dates){
        Appointment newAppointment = new Appointment(doctorID, patientID, dates);
        AppointmentRequestArrayClass.appointmentRequests.add(newAppointment);
    }
 
    
    public static String showPatientAppointmentsRequests(String patientName){
    ArrayList<String> appoints = new ArrayList<>();
    
    String patientID = PatientArrayClass.getPatientIDByName(patientName);
         for (Appointment p: appointmentRequests) {
             
             if(patientID.equals(p.getPatientID())){
                 
                 appoints.add(p.getPossibleDates());
             }
             
         }
         String feedbackString = "Here is " + patientName + " 's appointments:  " + appoints;
         return feedbackString;
     }
  
    public static String showAllPatientAppointmentsRequests(){
    ArrayList<String> appoints = new ArrayList<>();
    
   
         for (Appointment p: appointmentRequests) {
             appoints.add(p.getPatientID());
             appoints.add(p.getDoctorID());
             appoints.add(p.getPossibleDates());
             }
            
         
         String feedbackString = "All appointment requests:  " + appoints;
         return feedbackString;
     }
  
}
