/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackageTest;

import SystemModelsPackage.Medicine;
import SystemModelsPackage.Prescription;
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
// testing the prescription class getters and setters
public class PrescriptionTest {
    
    public PrescriptionTest() {
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
     * Test of getPatientID method, of class Prescription.
     */
    @Test
    public void testGetPatientID() {
        System.out.println("getPatientID");
        String patientID = "P4234";
        Medicine meds = new Medicine("Test Medicine name");
        String quantityDosageNotes = "Test 4 a day for 5 weeks";
        Prescription instance = new Prescription(patientID, meds, quantityDosageNotes);
        String expResult = patientID;
        String result = instance.getPatientID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPatientID method, of class Prescription.
     */
    @Test
    public void testSetPatientID() {
        System.out.println("setPatientID");
        String patientID = "P4234";
        Medicine meds = new Medicine("Test Medicine name");
        String quantityDosageNotes = "Test 4 a day for 5 weeks";
        Prescription instance = new Prescription("", meds, quantityDosageNotes);
        instance.setPatientID(patientID);
        assertEquals(instance.getPatientID(), patientID);
      
       
    }

    /**
     * Test of getPrescribedMedicine method, of class Prescription.
     */
    @Test
    public void testGetPrescribedMedicine() {
        System.out.println("getPrescribedMedicine");
        String patientID = "P4234";
        Medicine meds = new Medicine("Test Medicine name");
        String quantityDosageNotes = "Test 4 a day for 5 weeks";
        Prescription instance = new Prescription(patientID, meds, quantityDosageNotes);
        Medicine expResult = meds;
        Medicine result = instance.getPrescribedMedicine();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPrescribedMedicine method, of class Prescription.
     */
    @Test
    public void testSetPrescribedMedicine() {
        System.out.println("setPrescribedMedicine");
        String patientID = "P4234";
        Medicine meds = new Medicine("Test Medicine name");
        String quantityDosageNotes = "Test 4 a day for 5 weeks";
        Prescription instance = new Prescription(patientID, null, quantityDosageNotes);
        instance.setPrescribedMedicine(meds);
        assertEquals(instance.getPrescribedMedicine(), meds);
      
    }

    /**
     * Test of getQuantityDosageNotes method, of class Prescription.
     */
    @Test
    public void testGetQuantityDosageNotes() {
        System.out.println("getQuantityDosageNotes");
        String patientID = "P4234";
        Medicine meds = new Medicine("Test Medicine name");
        String quantityDosageNotes = "Test 4 a day for 5 weeks";
        Prescription instance = new Prescription(patientID, meds, quantityDosageNotes);
        String expResult = quantityDosageNotes;
        String result = instance.getQuantityDosageNotes();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setQuantityDosageNotes method, of class Prescription.
     */
    @Test
    public void testSetQuantityDosageNotes() {
        System.out.println("setQuantityDosageNotes");
        String patientID = "P4234";
        Medicine meds = new Medicine("Test Medicine name");
        String quantityDosageNotes = "Test 4 a day for 5 weeks";
        Prescription instance = new Prescription(patientID, meds, "");
        instance.setQuantityDosageNotes(quantityDosageNotes);
        assertEquals(instance.getQuantityDosageNotes(), quantityDosageNotes);
    }
    
}
