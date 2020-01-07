/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPackage;

import UserPackage.User;

/**
 *
 * @author Walker
 */
// Admin class
public class Admin extends User{ 
    
    // typical Admin class with constructor getters and setters for id, name password and address
    
     public Admin(String ID, String name, String address, String password) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.password = password;
    }

    
}
