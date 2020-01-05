/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import GUIs.*;
import Models.*;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JOptionPane;




/**
 *
 * @author Walker
 */
public class Login {
     
 public static String givePatientID(){
     
     int random4 = (int)(Math.random()*9000)+1000;
     String id = "P" + String.valueOf(random4);
     
     return id;
 }

    public static boolean LogIn(String ID, String pass){
    
    
        if (DoctorArrayClass.DoctorLogIn(ID, pass) == true){
        LoginGUI loginGUIInstance = new LoginGUI();
        DoctorGUI doctorGUIInstance = new DoctorGUI();
        doctorGUIInstance.setVisible(true);
        loginGUIInstance.setVisible(false);
        loginGUIInstance.dispose();
      return true;
          
        }else if (
                PatientArrayClass.PatientLogIn(ID, pass) == true){
        LoginGUI loginGUIInstance = new LoginGUI();
        PatientGUI patientGUIInstance = new PatientGUI();
        patientGUIInstance.setVisible(true);
        loginGUIInstance.setVisible(false);
        loginGUIInstance.dispose();
         return true;
        } else if (
                AdminArrayClass.AdminLogIn(ID, pass) == true){
        LoginGUI loginGUIInstance = new LoginGUI();
        AdminGUI adminGUIInstance = new AdminGUI();
        adminGUIInstance.setVisible(true);
        loginGUIInstance.setVisible(false);
        loginGUIInstance.dispose();
       return true;
        } else if (
                SecretaryArrayClass.SecretaryLogIn(ID, pass) == true){
        LoginGUI loginGUIInstance = new LoginGUI();
        SecretaryGUI secretaryGUIInstance = new SecretaryGUI();
        secretaryGUIInstance.setVisible(true);
        loginGUIInstance.setVisible(false);
        loginGUIInstance.dispose();
       return true;
        }
        else{JOptionPane.showMessageDialog(null, "Invalid Password!", "Alert", JOptionPane.INFORMATION_MESSAGE); 
           return false;
        }

    
    }
    
 
}