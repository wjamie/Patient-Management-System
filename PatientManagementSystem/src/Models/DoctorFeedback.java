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
// typical doctor feedback class, includes rating feedback and doctor

public class DoctorFeedback {
    private String doctorID;
    private int rating;
    private String feedback;
            
    public DoctorFeedback(String doctorID, int rating, String feedback) {
        this.doctorID = doctorID;
        this.rating = rating;
        this.feedback = feedback;
       
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
    
}
