/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPackageTest;

import AdminPackage.DoctorAdminFeedback;
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
// TESTING THE GET METHODS FOR DOCTOR FEEDBACK FROM ADMINS

public class DoctorAdminFeedbackTest {
    
    public DoctorAdminFeedbackTest() {
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
     * Test of getDoctorID method, of class DoctorAdminFeedback.
     */
    @Test
    public void testGetDoctorID() {
        System.out.println("getDoctorID");
        String ID = "D5400";
        String feedback = "Test feedback here";
        DoctorAdminFeedback instance = new DoctorAdminFeedback(ID, feedback);
        String expResult = ID;
        String result = instance.getDoctorID();
        assertEquals(expResult, result);
        
    }

    

    /**
     * Test of getFeedback method, of class DoctorAdminFeedback.
     */
    @Test
    public void testGetFeedback() {
        System.out.println("getFeedback");
        String ID = "D5400";
        String feedback = "Test feedback here";
        DoctorAdminFeedback instance = new DoctorAdminFeedback(ID, feedback);
        String expResult = feedback;
        String result = instance.getFeedback();
        assertEquals(expResult, result);
        
    }

    
}
