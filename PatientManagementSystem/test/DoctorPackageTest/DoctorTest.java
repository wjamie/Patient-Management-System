/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorPackageTest;

import DoctorPackageTest.*;
import DoctorPackage.Doctor;
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
// TESTING DOCTORS CLASS make current doctor
public class DoctorTest {
    
    public DoctorTest() {
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
     * Test of makeCurrentDoctor method, of class Doctor.
     */
    @Test
    public void testMakeCurrentDoctor() {
        System.out.println("makeCurrentDoctor");
        
        String ID = "P0009";
        String name = "TestN";
        String address = "9 Test Street";
        String password = "TestPassword";
      
        
        Doctor doctor = new Doctor(ID, name, address, password);
        Doctor.makeCurrentDoctor(doctor);
           
        assertEquals(ID, Doctor.currentDoctor.getID());
        assertEquals(name, Doctor.currentDoctor.getName());
        assertEquals(address, Doctor.currentDoctor.getAddress());
        assertEquals(password, Doctor.currentDoctor.getPassword());
        
    }

  
    
}
