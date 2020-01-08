/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorPackageTest;

import DoctorPackage.DoctorFeedback;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Walker
 */
// testing doctor feedback from patients (for admin view) gets and sets
public class DoctorFeedbackTest {
    
    public DoctorFeedbackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDoctorID method, of class DoctorFeedback.
     */
    @Test
    public void testGetDoctorID() {
        System.out.println("getDoctorID");
        String doctorID = "D9000";
        int rating = 5;
        String feedback = "Test good!";
        DoctorFeedback instance = new DoctorFeedback(doctorID, rating, feedback);
        String expResult = doctorID;
        String result = instance.getDoctorID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDoctorID method, of class DoctorFeedback.
     */
    @Test
    public void testSetDoctorID() {
        System.out.println("setDoctorID");
        String doctorID = "D9000";
        int rating = 5;
        String feedback = "Test good!";
        DoctorFeedback instance = new DoctorFeedback("", rating, feedback);
        instance.setDoctorID(doctorID);
        assertEquals(instance.getDoctorID(), doctorID);
    }

    /**
     * Test of getRating method, of class DoctorFeedback.
     */
    @Test
    public void testGetRating() {
        System.out.println("getRating");
        String doctorID = "D9000";
        int rating = 5;
        String feedback = "Test good!";
        DoctorFeedback instance = new DoctorFeedback(doctorID, rating, feedback);
        int expResult = rating;
        int result = instance.getRating();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setRating method, of class DoctorFeedback.
     */
    @Test
    public void testSetRating() {
        System.out.println("setRating");
        String doctorID = "D9000";
        int rating = 5;
        String feedback = "Test good!";
        DoctorFeedback instance = new DoctorFeedback(doctorID, 0, feedback);;
        instance.setRating(rating);
        assertEquals(instance.getRating(), rating);
    }

    /**
     * Test of getFeedback method, of class DoctorFeedback.
     */
    @Test
    public void testGetFeedback() {
        System.out.println("getFeedback");
        String doctorID = "D9000";
        int rating = 5;
        String feedback = "Test good!";
        DoctorFeedback instance = new DoctorFeedback(doctorID, rating, feedback);
        String expResult = feedback;
        String result = instance.getFeedback();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setFeedback method, of class DoctorFeedback.
     */
    @Test
    public void testSetFeedback() {
        System.out.println("setFeedback");
        String doctorID = "D9000";
        int rating = 5;
        String feedback = "Test good!";
        DoctorFeedback instance = new DoctorFeedback(doctorID, rating, "");
        instance.setFeedback(feedback);
        assertEquals(instance.getFeedback(), feedback);
    }
    
}
