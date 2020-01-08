/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPackage;

/**
 *
 * @author Walker
 */
// typical class for doctor feedback from admin

public class DoctorAdminFeedback {
    private String doctorID;
    
    private String feedback;
            
    public DoctorAdminFeedback(String doctorID, String feedback) {
        this.doctorID = doctorID;
       
        this.feedback = feedback;
       
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
    
}
