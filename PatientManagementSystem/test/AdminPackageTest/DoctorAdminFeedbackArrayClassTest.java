/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPackageTest;

import AdminPackage.DoctorAdminFeedbackArrayClass;
import static AdminPackage.DoctorAdminFeedbackArrayClass.doctorAdminFeedbacks;
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
// TESTING doctor admin feedback array classs which can add and show doctor feedback from admins
public class DoctorAdminFeedbackArrayClassTest {
    
    public DoctorAdminFeedbackArrayClassTest() {
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
     * Test of addDoctorAdminFeedback method, of class DoctorAdminFeedbackArrayClass.
     */
    @Test
    public void testAddDoctorAdminFeedback() {
        System.out.println("addDoctorAdminFeedback");
        String doctorID = "D0900";
        String feedback = "Test feedback";
        DoctorAdminFeedbackArrayClass.addDoctorAdminFeedback(doctorID, feedback);
        assertEquals(doctorAdminFeedbacks.get(doctorAdminFeedbacks.size()-1).getDoctorID(),doctorID);
        assertEquals(doctorAdminFeedbacks.get(doctorAdminFeedbacks.size()-1).getFeedback(), feedback);
    }

    /**
     * Test of showDoctorAdminFeedback method, of class DoctorAdminFeedbackArrayClass.
     */
    @Test
    public void testShowDoctorAdminFeedback() {
        System.out.println("showDoctorAdminFeedback");
        String doctorName = "Dr";
        String expResult = "Dr 's feedback from Admins: []";
        String result = DoctorAdminFeedbackArrayClass.showDoctorAdminFeedback(doctorName);
        assertEquals(expResult, result);
      
    }
    
}
