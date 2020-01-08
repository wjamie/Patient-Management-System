/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientPackageTest;


import PatientPackage.Patient;
import PatientPackage.PatientArrayClass;
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
// TESTING PATIENTS ARRAY CLASS  add remove get and LOGIN
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
        String ID = "P9999";
        String name = "TestName";
        String address = "9 Test Street";
        String password = "TestPassword";
        int age = 50;
        String gender = "Male";
        
        PatientArrayClass.addPatient(ID, name, address, password, age, gender);
        Patient testPatient = PatientArrayClass.patients.get(PatientArrayClass.patients.size() -1);
        
        assertEquals(ID, testPatient.getID());
        assertEquals(name, testPatient.getName());
        assertEquals(address, testPatient.getAddress());
        assertEquals(password, testPatient.getPassword());
        assertEquals(age, testPatient.getAge());
        assertEquals(gender, testPatient.getGender());
    }
    /**
     * Test of removePatientByCMBName method, of class PatientArrayClass.
     */
    @Test
    public void testRemovePatientByCMBName() {
        System.out.println("removePatientByCMBName");
        String value = "SetUp";
        PatientArrayClass.removePatientByCMBName(value);
        assertNotEquals(PatientArrayClass.patients.get(0).getName(), value);
    }

    /**
     * Test of getPatientByName method, of class PatientArrayClass.
     */
    @Test
    public void testGetPatientByName() {
        System.out.println("getPatientByName");
        String ID = "P9999";
        String name = "TestName";
        String address = "9 Test Street";
        String password = "TestPassword";
        int age = 50;
        String gender = "Male";
        
        PatientArrayClass.addPatient(ID, name, address, password, age, gender);
        String value = "TestName";
        Patient result = PatientArrayClass.getPatientByName(value);
        assertNotNull(result);
       
    }

    /**
     * Test of getPatientsNames method, of class PatientArrayClass.
     */
    @Test
    public void testGetPatientsNames() {
        System.out.println("getPatientsNames");
        ArrayList<String> result = PatientArrayClass.getPatientsNames();
        assertNotNull(result);
        
    }

    /**
     * Test of getPatientsNamesAsStringArray method, of class PatientArrayClass.
     */
    @Test
    public void testGetPatientsNamesAsStringArray() {
        System.out.println("getPatientsNamesAsStringArray");
        
        String[] result = PatientArrayClass.getPatientsNamesAsStringArray();
        assertNotNull(result);
        
    }

    /**
     * Test of getPatientIDByName method, of class PatientArrayClass.
     */
    @Test
    public void testGetPatientIDByName() {
        System.out.println("getPatientIDByName");
        
        String value = "NameTest";
        String expResult = "P4000";
        PatientArrayClass.addPatient("P4000", "NameTest","1 Street", "pass", 5, "Male");
        String result = PatientArrayClass.getPatientIDByName(value);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of PatientLogIn method, of class PatientArrayClass.
     */
    @Test
    public void testPatientLogIn() {
        System.out.println("PatientLogIn");
        String ID = "P3000";
        String pass = "pw";
        String ID2 = "P2000";
        String pass2 = "pw2";
        boolean expResult = false;
        boolean result = PatientArrayClass.PatientLogIn(ID, pass);
        PatientArrayClass.addPatient(ID2, "nameIns"  ," Street", pass2, 5, "Male");
        boolean expResult2 = true;
        boolean result2 = PatientArrayClass.PatientLogIn(ID2, pass2);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }
    
}
