/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackageTest;

import SystemModelsPackage.Medicine;
import SystemModelsPackage.MedicineArrayClass;
import static SystemModelsPackage.MedicineArrayClass.medicines;
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
// testing the medicine array class adding and getting from the array

public class MedicineArrayClassTest {
    
    public MedicineArrayClassTest() {
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
     * Test of addMedicine method, of class MedicineArrayClass.
     */
    @Test
    public void testAddMedicine() {
        System.out.println("addMedicine");
        String name = "Test Name";
        
        MedicineArrayClass.addMedicine(name);
        assertEquals(medicines.get(medicines.size()-1).getName(), name);
       
    }

    /**
     * Test of getMedicinesNames method, of class MedicineArrayClass.
     */
    @Test
    public void testGetMedicinesNames() {
        System.out.println("getMedicinesNames");
        ArrayList<String> result = MedicineArrayClass.getMedicinesNames();
        assertNotNull(result);
       
    }

    /**
     * Test of getMedicineByName method, of class MedicineArrayClass.
     */
    @Test
    public void testGetMedicineByName() {
        System.out.println("getMedicineByName");
        String value = "Tyrol";
        MedicineArrayClass.addMedicine(value);
        Medicine result = MedicineArrayClass.getMedicineByName(value);
       
        assertNotNull(result);
       
    
    }

    /**
     * Test of getMedicinesNamesAsStringArray method, of class MedicineArrayClass.
     */
    @Test
    public void testGetMedicinesNamesAsStringArray() {
        System.out.println("getMedicinesNamesAsStringArray");
        
        String[] result = MedicineArrayClass.getMedicinesNamesAsStringArray();
        assertNotNull(result);
     
    }
}
