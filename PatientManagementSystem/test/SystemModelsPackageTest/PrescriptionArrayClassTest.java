/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackageTest;

import PatientPackage.Patient;
import PatientPackage.PatientArrayClass;
import SystemModelsPackage.Medicine;
import static SystemModelsPackage.MedicineArrayClass.medicines;
import SystemModelsPackage.Prescription;
import SystemModelsPackage.PrescriptionArrayClass;
import static SystemModelsPackage.PrescriptionArrayClass.prescriptions;
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
// Testing the Prescription array class add prescription
public class PrescriptionArrayClassTest {
    
    public PrescriptionArrayClassTest() {
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
     * Test of addPrescription method, of class PrescriptionArrayClass.
     */
    @Test
    public void testAddPrescription() {
        System.out.println("addPrescription");
        String patientID = "P4234";
        Medicine meds = new Medicine("Test Medicine name");
        String dosageNotes = "Test 4 a day for 5 weeks";
        PrescriptionArrayClass.addPrescription(patientID, meds, dosageNotes);
        assertEquals(prescriptions.get(prescriptions.size()-1).getPatientID(), patientID);
        assertEquals(prescriptions.get(prescriptions.size()-1).getPrescribedMedicine(), meds);
        assertEquals(prescriptions.get(prescriptions.size()-1).getQuantityDosageNotes(), dosageNotes);
    }
    
}
