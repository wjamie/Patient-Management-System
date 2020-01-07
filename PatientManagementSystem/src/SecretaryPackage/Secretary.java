package SecretaryPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import UserPackage.User;
import UserPackage.User;

/**
 *
 * @author Walker
 */
// typical secretary class extends user, with getters and setters

public class Secretary extends User{
    
     public Secretary(String ID, String name, String address, String password) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     
     
}
