/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecretaryPackageTest;


import SecretaryPackage.Secretary;
import SecretaryPackage.SecretaryArrayClass;
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
// TESTING SECRETARY ARRAY CLASS add get login and remove
public class SecretaryArrayClassTest {
    
    public SecretaryArrayClassTest() {
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
    public void testAddSecretary() {
        System.out.println("addSecretary");
        String ID = "S9999";
        String name = "TestName";
        String address = "9 Test Street";
        String password = "TestPassword";
       
        SecretaryArrayClass.addSecretary(ID, name, address, password);
        Secretary testSecretary = SecretaryArrayClass.secretarys.get(SecretaryArrayClass.secretarys.size() -1);
        
        assertEquals(ID, testSecretary.getID());
        assertEquals(name, testSecretary.getName());
        assertEquals(address, testSecretary.getAddress());
        assertEquals(password, testSecretary.getPassword());
        
    }
 

    /**
     * Test of getSecretarysNames method, of class SecretaryArrayClass.
     */
    @Test
    public void testGetSecretarysNames() {
        System.out.println("getSecretarysNames");
        ArrayList<String> result = SecretaryArrayClass.getSecretarysNames();
        assertNotNull(result);
        
    }

    /**
     * Test of getSecretarysNamesAsStringArray method, of class SecretaryArrayClass.
     */
    @Test
    public void testGetSecretarysNamesAsStringArray() {
        System.out.println("getSecretarysNamesAsStringArray");
        
        String[] result = SecretaryArrayClass.getSecretarysNamesAsStringArray();
        assertNotNull(result);
        
    }


    /**
     * Test of SecretaryLogIn method, of class SecretaryArrayClass.
     */
    @Test
    public void testSecretaryLogIn() {
        System.out.println("SecretaryLogIn");
        String ID = "S3000";
        String pass = "pw";
        String ID2 = "S2000";
        String pass2 = "pw2";
        boolean expResult = false;
        boolean result = SecretaryArrayClass.SecretaryLogIn(ID, pass);
        SecretaryArrayClass.addSecretary(ID2, "nameIns"  ," Street", pass2);
        boolean expResult2 = true;
        boolean result2 = SecretaryArrayClass.SecretaryLogIn(ID2, pass2);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }
  
    /**
     * Test of removeSecretaryByCMBName method, of class SecretaryArrayClass.
     */
    @Test
    public void testRemoveSecretaryByCMBName() {
        System.out.println("removeSecretaryByCMBName");
        String value = "SetUp";
        SecretaryArrayClass.removeSecretaryByCMBName(value);
        assertNotEquals(SecretaryArrayClass.secretarys.get(0).getName(), value);
    }

}
