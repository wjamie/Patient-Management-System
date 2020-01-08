/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPackageTest;

import LoginPackage.Login;
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
// TESTING THE RANDOM PATIENT ID GIVEN TO NEW PATIENTS
public class LoginTest {
    
    public LoginTest() {
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
     * Test of givePatientID method, of class Login.
     */
    @Test
    public void testGivePatientID() {
        System.out.println("givePatientID");
        String result = Login.givePatientID();
        assertNotNull(result);
    }


    
}
