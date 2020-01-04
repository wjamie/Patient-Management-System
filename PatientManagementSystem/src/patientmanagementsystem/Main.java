/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import GUIs.LoginGUI;
import Models.*;

import java.util.ArrayList;

/**
 *
 * @author Walker
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginGUI loginGUIInstance = new LoginGUI();
        loginGUIInstance.setVisible(true);
        
      
        
        PatientArrayClass.addPatient("P101", "John Burrows", "31 Castle Road, Eggton", "pass123", 23, "Male");
        PatientArrayClass.addPatient("P102", "Bob Sett", "8 Reaper Hill, Eggton", "applefanta2", 19, "Male");
        PatientArrayClass.addPatient("P103", "Mary Herman", "23 Toran Road, Eggton", "goryprince6", 38, "Female");
        
        DoctorArrayClass.addDoctor("D101", "Dr Langford", "61 Castle Road, Eggton", "dass123");
        DoctorArrayClass.addDoctor("D102", "Dr Beans", "85 Reader Hill, Eggton", "adlefanta2");
        DoctorArrayClass.addDoctor("D103", "Dr Payne", "236 Toran Road, Eggton", "gorydrince6");
        DoctorArrayClass.addDoctor("D104", "Dr Walker", "2 Well Road, Plymstock", "passie123");
        
        SecretaryArrayClass.addSecretary("S101", "Riley Mel", "7 Castle Road, Eggton", "dass3");
        SecretaryArrayClass.addSecretary("S102", "Shirley Reid", "8 Reader Hill, Eggton", "adlenta2");
        SecretaryArrayClass.addSecretary("S103", "Sheila Thompson", "2 Toran Road, Eggton", "goryince6");
        
        MedicineArrayClass.addMedicine("Tyreloil");
        MedicineArrayClass.addMedicine("Etynol");
        MedicineArrayClass.addMedicine("Cirinol");
        MedicineArrayClass.addMedicine("Niquityl");
        MedicineArrayClass.addMedicine("Remedyl");
        MedicineArrayClass.addMedicine("Nitrate Treatitol");
        MedicineArrayClass.addMedicine("Quititol");
        MedicineArrayClass.addMedicine("Medicyl");
        MedicineArrayClass.addMedicine("Lipsquityl");
        MedicineArrayClass.addMedicine("Itratitil");
       
        DoctorFeedbackArrayClass.addDoctorFeedback("D103",4, "Very good guy. Made me better!");
        DoctorFeedbackArrayClass.addDoctorFeedback("D102",1, "Horrible to me. Gave me terrible advice too!");
        DoctorFeedbackArrayClass.addDoctorFeedback("D101",5, "Extremely nice doctor, was very smart too!");
        
        DoctorAdminFeedbackArrayClass.addDoctorAdminFeedback("D104","Well done recently, very good ratings!");
    }
    
    
}
