/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorPackage;

import UserPackage.User;

/**
 *
 * @author Walker
 */
public class Doctor extends User{ 
    
      // typical Doctor class with constructor getters and setters for id, name password and address
    
     public Doctor(String ID, String name, String address, String password) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.password = password;
    }

// current doctor after login
    public static Doctor currentDoctor;
   
    // makes a doctor the current user after LOGIN
    public static void makeCurrentDoctor(Doctor doctor){
        currentDoctor = doctor;
    }
     
  
     
}
