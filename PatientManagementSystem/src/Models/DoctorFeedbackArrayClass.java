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
public class DoctorFeedbackArrayClass {
     
    public static ArrayList<DoctorFeedback> doctorFeedbacks = new ArrayList<>();
  
    public static void addDoctorFeedback(String doctorID, int rating, String feedback){
        DoctorFeedback newDoctorFeedback = new DoctorFeedback(doctorID, rating, feedback);
        DoctorFeedbackArrayClass.doctorFeedbacks.add(newDoctorFeedback);
    }
    
    public static String showDoctorFeedback(String doctorName){
    ArrayList<String> doctorFeedback = new ArrayList<>();
    
    String doctorID = DoctorArrayClass.getDoctorIDByName(doctorName);
         for (DoctorFeedback d: doctorFeedbacks) {
             
             if(doctorID.equals(d.getDoctorID())){
                 doctorFeedback.add(String.valueOf(d.getRating()));
                 doctorFeedback.add(d.getFeedback());
             }
             
         }
         String feedbackString = "Here is " + doctorName + " 's feedback:  " + doctorFeedback;
         return feedbackString;
     }
    

    
}