/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPackageTest;



import AdminPackage.Admin;
import AdminPackage.AdminArrayClass;
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
// TESTING ADMINS ARRAY CLASS which can ADD GET and LOGIN admins
public class AdminArrayClassTest {
    
    public AdminArrayClassTest() {
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
     * Test of addSecretary method, of class SecretaryArrayClass.
     */
    @Test
    public void testAddAdmin() {
        System.out.println("addAdmin");
        String ID = "A9999";
        String name = "TestName";
        String address = "9 Test Street";
        String password = "TestPassword";
       
        AdminArrayClass.addAdmin(ID, name, address, password);
        Admin testAdmin = AdminArrayClass.admins.get(AdminArrayClass.admins.size() -1);
        
        assertEquals(ID, testAdmin.getID());
        assertEquals(name, testAdmin.getName());
        assertEquals(address, testAdmin.getAddress());
        assertEquals(password, testAdmin.getPassword());
        
    }
 

    /**
     * Test of getAdminsNames method, of class AdminArrayClass.
     */
    @Test
    public void testGetAdminsNames() {
        System.out.println("getAdminsNames");
        ArrayList<String> result = AdminArrayClass.getAdminsNames();
        assertNotNull(result);
        
    }

    /**
     * Test of getAdminsNamesAsStringArray method, of class AdminArrayClass.
     */
    @Test
    public void testGetAdminsNamesAsStringArray() {
        System.out.println("getAdminsNamesAsStringArray");
        
        String[] result = AdminArrayClass.getAdminsNamesAsStringArray();
        assertNotNull(result);
        
    }


    /**
     * Test of AdminLogIn method, of class AdminArrayClass.
     */
    @Test
    public void testAdminLogIn() {
        System.out.println("AdminLogIn");
        String ID = "A3000";
        String pass = "pw";
        String ID2 = "A2000";
        String pass2 = "pw2";
        boolean expResult = false;
        boolean result = AdminArrayClass.AdminLogIn(ID, pass);
        AdminArrayClass.addAdmin(ID2, "nameIns"  ," Street", pass2);
        boolean expResult2 = true;
        boolean result2 = AdminArrayClass.AdminLogIn(ID2, pass2);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }
    
}
