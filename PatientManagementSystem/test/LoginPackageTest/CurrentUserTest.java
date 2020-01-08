/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginPackageTest;

import AdminPackage.Admin;
import DoctorPackage.Doctor;
import LoginPackage.CurrentUser;
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
// Testing the current user / make current user class
public class CurrentUserTest {
    
    public CurrentUserTest() {
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
     * Test of makeUser method, of class CurrentUser.
     */
    @Test
    public void testMakeUser() {
        System.out.println("makeUser");
      
        String ID = "A0009";
        String name = "TestN";
        String address = "9 Test Street";
        String password = "TestPassword";
      
        
        Admin admin = new Admin(ID, name, address, password);
        CurrentUser.makeUser(admin);
           
        assertEquals(ID, CurrentUser.currentUser.getID());
        assertEquals(name, CurrentUser.currentUser.getName());
        assertEquals(address, CurrentUser.currentUser.getAddress());
        assertEquals(password, CurrentUser.currentUser.getPassword());
        
    }
    
}
