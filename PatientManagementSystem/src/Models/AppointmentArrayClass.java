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
public class AppointmentArrayClass {
     
    public static ArrayList<Appointment> appointments = new ArrayList<>();
  
    public static void addAppointment(String doctorID, String patientID, String dates){
        Appointment newAppointment = new Appointment(doctorID, patientID, dates);
        AppointmentArrayClass.appointments.add(newAppointment);
    }
    
    public static String showDoctorAppointments(String doctorName){
    ArrayList<String> doctorFeedback = new ArrayList<>();
    
    String doctorID = DoctorArrayClass.getDoctorIDByName(doctorName);
         for (Appointment p: appointments) {
             
             if(doctorID.equals(p.getDoctorID())){
                 doctorFeedback.add(String.valueOf(p.getPatientID()));
                 doctorFeedback.add(p.getPossibleDates());
             }
             
         }
         String feedbackString = "Here is " + doctorName + " 's feedback:  " + doctorFeedback;
         return feedbackString;
     }
    

    
}
