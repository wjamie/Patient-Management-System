/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemModelsPackage;


import java.util.ArrayList;

/**
 *
 * @author Walker
 */
  // Class for holding Medicines (an array of medicines) and allows adding and getting medicines

public class MedicineArrayClass {
     
    public static ArrayList<Medicine> medicines = new ArrayList<>();
  //add new medicine
    public static void addMedicine(String name){
        Medicine newMedicine = new Medicine(name);
        MedicineArrayClass.medicines.add(newMedicine);
    }
      // get medicines as array
    public static ArrayList<String> getMedicinesNames(){
    ArrayList<String> medicineNames = new ArrayList<>();
         for (Medicine m: medicines) {
             medicineNames.add(m.getName());
         }
         return medicineNames;
     }
    // get medicine object by name
      public static Medicine getMedicineByName(String value){
      Medicine medicine = null;
        for (Medicine d: medicines) {
             d.getName();
             if (d.getName().equals(value)) {
                 medicine = d;
             }
         }
        return medicine;
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
