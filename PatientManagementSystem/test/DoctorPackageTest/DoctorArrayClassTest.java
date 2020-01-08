/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorPackageTest;



import DoctorPackage.Doctor;
import DoctorPackage.DoctorArrayClass;
import static DoctorPackage.DoctorArrayClass.doctors;
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
// TESTING THE DOCTOR ARRAY CLASS  add get remove show and LOGIN
public class DoctorArrayClassTest {
    
    public DoctorArrayClassTest() {
      
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
     * Test of addDoctor method, of class DoctorArrayClass.
     */
    @Test
    public void testAddDoctor() {
        System.out.println("addDoctor");
        String ID = "D9999";
        String name = "TestName";
        String address = "9 Test Street";
        String password = "TestPassword";
       
        DoctorArrayClass.addDoctor(ID, name, address, password);
        Doctor testDoctor = DoctorArrayClass.doctors.get(DoctorArrayClass.doctors.size() -1);
        
        assertEquals(ID, testDoctor.getID());
        assertEquals(name, testDoctor.getName());
        assertEquals(address, testDoctor.getAddress());
        assertEquals(password, testDoctor.getPassword());
        
    }
   

    
       @Test
    public void testGetDoctorIDByName() {
        System.out.println("getDoctorIDByName");
        
        String value = "NameTest";
        String expResult = "D4000";
        DoctorArrayClass.addDoctor("D4000", "NameTest","1 Street", "pass");
        String result = DoctorArrayClass.getDoctorIDByName(value);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDoctorsNames method, of class DoctorArrayClass.
     */
    @Test
    public void testGetDoctorsNames() {
        System.out.println("getDoctorsNames");
        ArrayList<String> result = DoctorArrayClass.getDoctorsNames();
        assertNotNull(result);
        
    }

    /**
     * Test of getDoctorsNamesAsStringArray method, of class DoctorArrayClass.
     */
    @Test
    public void testGetDoctorsNamesAsStringArray() {
        System.out.println("getDoctorsNamesAsStringArray");
        
        String[] result = DoctorArrayClass.getDoctorsNamesAsStringArray();
        assertNotNull(result);
        
    }


    /**
     * Test of DoctorLogIn method, of class DoctorArrayClass.
     */
    @Test
    public void testDoctorLogIn() {
        System.out.println("DoctorLogIn");
        String ID = "D3000";
        String pass = "pw";
        String ID2 = "D2000";
        String pass2 = "pw2";
        boolean expResult = false;
        boolean result = DoctorArrayClass.DoctorLogIn(ID, pass);
        DoctorArrayClass.addDoctor(ID2, "nameIns"  ," Street", pass2);
        boolean expResult2 = true;
        boolean result2 = DoctorArrayClass.DoctorLogIn(ID2, pass2);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }
     /**
     * Test of removeDoctorByCMBName method, of class DoctorArrayClass.
     */
    @Test
    public void testRemoveDoctorByCMBName() {
        System.out.println("removeDoctorByCMBName");
        String value = "Dr Test";
        DoctorArrayClass.removeDoctorByCMBName(value);
        String str = "";
        for (Doctor d: doctors){
            if("Dr Test".equals(d.getName()))
        str = d.getName();
        }
        assertNotEquals(str, value);
    }
}
