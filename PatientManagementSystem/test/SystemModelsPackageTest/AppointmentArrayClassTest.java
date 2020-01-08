/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackageTest;

import SystemModelsPackage.AppointmentArrayClass;
import static SystemModelsPackage.AppointmentArrayClass.appointments;
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
// testing the appointment array class adding and showing functions

public class AppointmentArrayClassTest {
    
    public AppointmentArrayClassTest() {
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
     * Test of addAppointment method, of class AppointmentArrayClass.
     */
    @Test
    public void testAddAppointment() {
        System.out.println("addAppointment");
        String doctorID = "D0213";
        String patientID = "P4634";
        String dates = "21st Test Month";
        AppointmentArrayClass.addAppointment(doctorID, patientID, dates);
        assertEquals(appointments.get(appointments.size()-1).getDoctorID(), doctorID);
        assertEquals(appointments.get(appointments.size()-1).getPatientID(), patientID);
        assertEquals(appointments.get(appointments.size()-1).getPossibleDates(), dates);
    }

    /**
     * Test of showDoctorAppointments method, of class AppointmentArrayClass.
     */
    @Test
    public void testShowDoctorAppointments() {
        System.out.println("showDoctorAppointments");
        String doctorName = "Dr";
        String expResult = "Here is Dr 's appointments:  []";
        String result = AppointmentArrayClass.showDoctorAppointments(doctorName);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of showPatientAppointments method, of class AppointmentArrayClass.
     */
    @Test
    public void testShowPatientAppointments() {
        System.out.println("showPatientAppointments");
        String patientName = "patient";
        String expResult = "Here is patient 's appointments:  []";
        String result = AppointmentArrayClass.showPatientAppointments(patientName);
        assertEquals(expResult, result);
        
    }
    
}
