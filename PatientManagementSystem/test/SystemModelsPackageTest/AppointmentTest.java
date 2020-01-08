/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackageTest;

import SystemModelsPackage.Appointment;
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
// testing the appointment class getters and setters
public class AppointmentTest {
    
    public AppointmentTest() {
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
     * Test of getDoctorID method, of class Appointment.
     */
    @Test
    public void testGetDoctorID() {
        System.out.println("getDoctorID");
        String doctorID = "D7777";
        String patientID = "P8888";
        String possibleDates = "Test Date";
        Appointment instance = new Appointment(doctorID, patientID, possibleDates);
        String expResult = doctorID;
        String result = instance.getDoctorID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDoctorID method, of class Appointment.
     */
    @Test
    public void testSetDoctorID() {
        System.out.println("setDoctorID");
        String doctorID = "D7777";
        String patientID = "P8888";
        String possibleDates = "Test Date";
        Appointment instance = new Appointment("", patientID, possibleDates);
        instance.setDoctorID(doctorID);
        assertEquals(instance.getDoctorID(), doctorID);
       
    }

    /**
     * Test of getPatientID method, of class Appointment.
     */
    @Test
    public void testGetPatientID() {
        String doctorID = "D7777";
        String patientID = "P8888";
        String possibleDates = "Test Date";
        Appointment instance = new Appointment(doctorID, patientID, possibleDates);
        String expResult = patientID;
        String result = instance.getPatientID();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPatientID method, of class Appointment.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        String doctorID = "D7777";
        String patientID = "P8888";
        String possibleDates = "Test Date";
        Appointment instance = new Appointment(doctorID, "", possibleDates);
        instance.setPatientID(patientID);
        assertEquals(instance.getPatientID(), patientID);
       
    }

    /**
     * Test of getPossibleDates method, of class Appointment.
     */
    @Test
    public void testGetPossibleDates() {
        String doctorID = "D7777";
        String patientID = "P8888";
        String possibleDates = "Test Date";
        Appointment instance = new Appointment(doctorID, patientID, possibleDates);
        String expResult = possibleDates;
        String result = instance.getPossibleDates();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPossibleDates method, of class Appointment.
     */
    @Test
    public void testSetPossibleDates() {
        System.out.println("setPossibleDates");
        String doctorID = "D7777";
        String patientID = "P8888";
        String possibleDates = "Test Date";
        Appointment instance = new Appointment(doctorID, patientID, "");
        instance.setPossibleDates(possibleDates);
        assertEquals(instance.getPossibleDates(), possibleDates);
    }
    
}
