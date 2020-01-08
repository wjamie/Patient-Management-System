/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientPackageTest;

import PatientPackage.Patient;
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
// TESTING PATIENTS CLASS gets and sets, show history and removal status, make Current Patient
public class PatientTest {
    
    public PatientTest() {
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
     * Test of makeCurrentPatient method, of class Patient.
     */
    @Test
    public void testMakeCurrentPatient() {
        System.out.println("makeCurrentPatient");
        
        String ID = "P0009";
        String name = "TestN";
        String address = "9 Test Street";
        String password = "TestPassword";
        int age = 50;
        String gender = "Male";
        
        Patient patient = new Patient(ID, name, address, password,age, gender);
        Patient.makeCurrentPatient(patient);
           
        assertEquals(ID, Patient.currentPatient.getID());
        assertEquals(name, Patient.currentPatient.getName());
        assertEquals(address, Patient.currentPatient.getAddress());
        assertEquals(password, Patient.currentPatient.getPassword());
        assertEquals(age, Patient.currentPatient.getAge());
        assertEquals(gender,Patient.currentPatient.getGender());
    }

    /**
     * Test of getAge method, of class Patient.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Patient instance = new Patient("P0010", "JD", "1 George Street", "ps12",56, "Male");
        int expResult = 56;
        int result = instance.getAge();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAge method, of class Patient.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 4;
        Patient instance = new Patient("P0010", "JD", "1 George Street", "ps12",0, "Male");
        instance.setAge(age);
        assertEquals(instance.getAge(), age);
    }

    /**
     * Test of getGender method, of class Patient.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Patient instance = new Patient("P0010", "JD", "1 George Street", "ps12",4, "Male");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setGender method, of class Patient.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "Female";
        Patient instance = new Patient("P0010", "JD", "1 George Street", "ps12",4, "Male");
        instance.setGender(gender);
        assertEquals( instance.getGender(), gender);
    }

    /**
     * Test of showPatientHistory method, of class Patient.
     */
    @Test
    public void testShowPatientHistory() {
        System.out.println("showPatientHistory");
        Patient instance = new Patient("P0010", "JD", "1 George Street", "ps12",4, "Male");
        instance.historys.add("Test History");
        
        String expResult = "Test History" + "\n";
        String result = instance.showPatientHistory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of showRemoval method, of class Patient.
     */
    @Test
    public void testShowRemoval() {
        System.out.println("showRemoval");
        String expResult = "";
        String result = Patient.showRemoval();
        assertEquals(expResult, result);
       
    }
    
}
