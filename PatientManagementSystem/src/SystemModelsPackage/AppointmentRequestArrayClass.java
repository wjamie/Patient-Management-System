/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackage;

import PatientPackage.PatientArrayClass;
import SystemModelsPackage.Appointment;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
 // Class for holding appointment requests (an array of them) and allows adding and showing the requests
public class AppointmentRequestArrayClass {
     
    public static ArrayList<Appointment> appointmentRequests = new ArrayList<>();
 
    // add appointment request
    
    public static void addAppointment(String doctorID, String patientID, String dates){
        Appointment newAppointment = new Appointment(doctorID, patientID, dates);
        AppointmentRequestArrayClass.appointmentRequests.add(newAppointment);
    }
 
    // show appointment requests (FOR SECRETARY VIEW)
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
