/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientPackage;

import java.util.ArrayList;
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
public class PatientArrayClassTest {
    
    public PatientArrayClassTest() {
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
     * Test of addPatient method, of class PatientArrayClass.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        String ID = "";
        String name = "";
        String address = "";
        String password = "";
        int age = 0;
        String gender = "";
        PatientArrayClass.addPatient(ID, name, address, password, age, gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removePatientByCMBName method, of class PatientArrayClass.
     */
    @Test
    public void testRemovePatientByCMBName() {
        System.out.println("removePatientByCMBName");
        String value = "";
        PatientArrayClass.removePatientByCMBName(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientByName method, of class PatientArrayClass.
     */
    @Test
    public void testGetPatientByName() {
        System.out.println("getPatientByName");
        String value = "";
        Patient expResult = null;
        Patient result = PatientArrayClass.getPatientByName(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientsNames method, of class PatientArrayClass.
     */
    @Test
    public void testGetPatientsNames() {
        System.out.println("getPatientsNames");
        ArrayList<String> expResult = null;
        ArrayList<String> result = PatientArrayClass.getPatientsNames();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientsNamesAsStringArray method, of class PatientArrayClass.
     */
    @Test
    public void testGetPatientsNamesAsStringArray() {
        System.out.println("getPatientsNamesAsStringArray");
        String[] expResult = null;
        String[] result = PatientArrayClass.getPatientsNamesAsStringArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientIDByName method, of class PatientArrayClass.
     */
    @Test
    public void testGetPatientIDByName() {
        System.out.println("getPatientIDByName");
        String value = "";
        String expResult = "";
        String result = PatientArrayClass.getPatientIDByName(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PatientLogIn method, of class PatientArrayClass.
     */
    @Test
    public void testPatientLogIn() {
        System.out.println("PatientLogIn");
        String ID = "";
        String pass = "";
        boolean expResult = false;
        boolean result = PatientArrayClass.PatientLogIn(ID, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
