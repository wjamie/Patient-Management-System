/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorPackageTest;

import DoctorPackage.DoctorFeedbackArrayClass;
import static DoctorPackage.DoctorFeedbackArrayClass.doctorFeedbacks;
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
// TESTING doctor feedback array class for adding and showing doctor feedback from patients for admin view
public class DoctorFeedbackArrayClassTest {
    
    public DoctorFeedbackArrayClassTest() {
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
     * Test of addDoctorFeedback method, of class DoctorFeedbackArrayClass.
     */
    @Test
    public void testAddDoctorFeedback() {
        System.out.println("addDoctorFeedback");
        String doctorID = "D5454";
        int rating = 2;
        String feedback = "This is test feedback";
        DoctorFeedbackArrayClass.addDoctorFeedback(doctorID, rating, feedback);
        assertEquals(doctorFeedbacks.get(doctorFeedbacks.size()-1).getDoctorID(),doctorID);
        assertEquals(doctorFeedbacks.get(doctorFeedbacks.size()-1).getRating(), rating);
        assertEquals(doctorFeedbacks.get(doctorFeedbacks.size()-1).getFeedback(), feedback);
    }

    /**
     * Test of showDoctorFeedback method, of class DoctorFeedbackArrayClass.
     */
    @Test
    public void testShowDoctorFeedback() {
        System.out.println("showDoctorFeedback");
        String doctorName = "Dr Test";
        String expResult = "Here is Dr Test 's feedback:  []";
        String result = DoctorFeedbackArrayClass.showDoctorFeedback(doctorName);
        assertEquals(expResult, result);
        
    }
    
}
