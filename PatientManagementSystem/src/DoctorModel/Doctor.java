/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorModel;

import UserModel.User;

/**
 *
 * @author Walker
 */
public class Doctor extends User{ 
    
     public Doctor(String ID, String name, String address, String password) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.password = password;
    }
}
