/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public class MedicineArrayClass {
     
    public static ArrayList<Medicine> medicines = new ArrayList<>();
  
    public static void addMedicine(String name){
        Medicine newMedicine = new Medicine(name);
        MedicineArrayClass.medicines.add(newMedicine);
    }
      
    public static ArrayList<String> getMedicinesNames(){
    ArrayList<String> medicineNames = new ArrayList<>();
         for (Medicine m: medicines) {
             medicineNames.add(m.getName());
         }
         return medicineNames;
     }
    
    public static String[] getMedicinesNamesAsStringArray(){
    ArrayList<String> medicineNames = new ArrayList<>();
 

         for (Medicine m: medicines) {
             medicineNames.add(m.getName());
         }
  
         String[] medicineNamesAsStringArray = medicineNames.toArray(new String[0]);
         
         return medicineNamesAsStringArray;
     }
    
}
