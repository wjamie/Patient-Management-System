/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorPackage;

import LoginPackage.CurrentUser;
import SecretaryPackage.Secretary;
import SecretaryPackage.SecretaryArrayClass;
import UserPackage.UserArrayClass;
import java.util.ArrayList;

/**
 *
 * @author Walker
 */
// Holds Doctors in array, allows add remove, get, LOGIN

public class DoctorArrayClass {
     
    public static ArrayList<Doctor> doctors = new ArrayList<>();
  // add new doctor
    public static void addDoctor(String ID, String name, String address, String password){
        Doctor newDoctor = new Doctor(ID, name, address, password);
        DoctorArrayClass.doctors.add(newDoctor);
    }
    // remove doctor
     public static void removeDoctor(Doctor doctor){
         DoctorArrayClass.doctors.remove(doctor);
     }
     
     // remove doctor by combobox name
     public static void removeDoctorByCMBName(String value){
      
        for (Doctor d: doctors) {
             d.getName();
             if (d.getName().equals(value)) {
                 doctors.remove(d);
             }
         }
     }
     // Get doctor object from their string name
     public static Doctor getDoctorByName(String value){
      Doctor doctor = null;
        for (Doctor d: doctors) {
             d.getName();
             if (d.getName().equals(value)) {
                 doctor = d;
             }
         }
        return doctor;
     }
     
     
     // get DOCTOR ID from NAME
     public static String getDoctorIDByName(String value){
      String doctorID = "";
        for (Doctor d: doctors) {
             d.getName();
             if (d.getName().equals(value)) {
                 doctorID = d.getID();
             }
         }
        return doctorID;
     }
     // get all doctor names as array
    public static ArrayList<String> getDoctorsNames(){
    ArrayList<String> doctorNames = new ArrayList<>();
         for (Doctor d: doctors) {
             doctorNames.add(d.getName());
         }
         return doctorNames;
     }
    // log in doctor
     public static boolean DoctorLogIn(String ID, String pass){
     boolean log = false;
         for (Doctor d: doctors){
             if (d.getID().equals(ID) && d.getPassword().equals(pass)){
                 log = true;
                 CurrentUser.makeUser(d);
                 Doctor.makeCurrentDoctor(d);
             }
         }
         return log;
     }
    
    
    
    
    
    
    
    
    public static String[] getDoctorsNamesAsStringArray(){
    ArrayList<String> doctorNames = new ArrayList<>();
 

         for (Doctor d: doctors) {
             doctorNames.add(d.getName());
         }
  
         String[] doctorNamesAsStringArray = doctorNames.toArray(new String[0]);
         
         return doctorNamesAsStringArray;
     }
    
      public static String[] getDoctorsSecretarysAsStringArray(){
    ArrayList<String> doctorSecretaryNames = new ArrayList<>();
 

         for (Doctor d: doctors) {
             doctorSecretaryNames.add(d.getName());
         }
         for (Secretary s: SecretaryArrayClass.secretarys) {
             doctorSecretaryNames.add(s.getName());
         }
         String[] doctorNamesAsStringArray = doctorSecretaryNames.toArray(new String[0]);
         
         return doctorNamesAsStringArray;
     }
}
