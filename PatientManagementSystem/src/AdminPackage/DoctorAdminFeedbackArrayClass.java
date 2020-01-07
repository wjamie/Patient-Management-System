/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPackage;

import DoctorPackage.DoctorArrayClass;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
 // Class for holding Doctors feedback from admins (an array of them) and allows adding and showing
public class DoctorAdminFeedbackArrayClass {
     
    public static ArrayList<DoctorAdminFeedback> doctorAdminFeedbacks = new ArrayList<>();
  
    public static void addDoctorAdminFeedback(String doctorID, String feedback){
        DoctorAdminFeedback newDoctorAdminFeedback = new DoctorAdminFeedback(doctorID, feedback);
        DoctorAdminFeedbackArrayClass.doctorAdminFeedbacks.add(newDoctorAdminFeedback);
    }
    
    public static String showDoctorAdminFeedback(String doctorName){
    ArrayList<String> doctorAdminFeedback = new ArrayList<>();
    
    String doctorID = DoctorArrayClass.getDoctorIDByName(doctorName);
         for (DoctorAdminFeedback d: doctorAdminFeedbacks) {
             
             if(doctorID.equals(d.getDoctorID())){
                 doctorAdminFeedback.add(d.getFeedback());
             }
             
         }
         String feedbackString = doctorName + " 's feedback from Admins: " + doctorAdminFeedback;
         return feedbackString;
     }
    

    
}
