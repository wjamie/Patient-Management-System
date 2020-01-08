/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPackageTest;

import DoctorPackage.Doctor;
import PatientPackage.Patient;
import UserPackage.User;
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
//testing the default abstract user class getters and setters
public class UserTest {
    
    public UserTest() {
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
     * Test of getID method, of class User.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        String ID = "D0500";
        String name = "Tester";
        String address = "1 address";
        String password = "passwordTest";
        User instance = new Doctor(ID, name, address, password);
        String expResult = "D0500";
        String result = instance.getID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setID method, of class User.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        String ID = "";
        User instance = new UserImpl();
        instance.setID(ID);
       
    }

    /**
     * Test of getName method, of class User.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String ID = "D0500";
        String name = "Tester";
        String address = "1 address";
        String password = "passwordTest";
        User instance = new Doctor(ID, name, address, password);
        String expResult = "Tester";
        String result = instance.getName();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setName method, of class User.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        User instance = new UserImpl();
        instance.setName(name);
       
    }

    /**
     * Test of getAddress method, of class User.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        String ID = "D0500";
        String name = "Tester";
        String address = "1 address";
        String password = "passwordTest";
        User instance = new Doctor(ID, name, address, password);
        String expResult = "1 address";
        String result = instance.getAddress();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAddress method, of class User.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        User instance = new UserImpl();
        instance.setAddress(address);
       
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String ID = "D0500";
        String name = "Tester";
        String address = "1 address";
        String password = "passwordTest";
        User instance = new Doctor(ID, name, address, password);
        String expResult = "passwordTest";
        String result = instance.getPassword();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new UserImpl();
        instance.setPassword(password);
      
    }

    public class UserImpl extends User {
        
    }
    
}
