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
        //Open Log in GUI
        LoginGUI loginGUIInstance = new LoginGUI();
        loginGUIInstance.setVisible(true);
        
      
        //Adding data 
        PatientArrayClass.addPatient("P0001", "John Burrows", "31 Castle Road, Eggton", "password", 23, "Male");
        PatientArrayClass.addPatient("P0002", "Bob Sett", "8 Reaper Hill, Eggton", "applefanta2", 19, "Male");
        PatientArrayClass.addPatient("P0003", "Mary Herman", "23 Toran Road, Eggton", "goryprince6", 38, "Female");
        
        Patient p1 = PatientArrayClass.getPatientByName("John Burrows");
        Patient p2 = PatientArrayClass.getPatientByName("Bob Sett");
        Patient p3 = PatientArrayClass.getPatientByName("Mary Herman");
        p1.historys.add("You need to eat more vegetables");
        p1.historys.add("Leg sore looks like epotytus");
        p2.historys.add("Very healthy");
        p3.historys.add("Might need to cut off right arm");
        
        PatientPendingArrayClass.addPatient("P1234","Pollie Pending", "32 Hover Street", "wooliesocks2", 17, "Female");
        
        DoctorArrayClass.addDoctor("D0001", "Dr Langford", "61 Castle Road, Eggton", "password");
        DoctorArrayClass.addDoctor("D0002", "Dr Beans", "85 Reader Hill, Eggton", "adlefanta2");
        DoctorArrayClass.addDoctor("D0003", "Dr Payne", "236 Toran Road, Eggton", "gorydrince6");
        DoctorArrayClass.addDoctor("D0004", "Dr Walker", "2 Well Road, Plymstock", "passie123");
        
        AppointmentArrayClass.addAppointment("D0001", "P0001", "21st February");
        AppointmentArrayClass.addAppointment("D0002", "P0002", "21st January");
        AppointmentArrayClass.addAppointment("D0003", "P0003", "9th January");
        
        AppointmentRequestArrayClass.addAppointment("D0002", "P0001", "9th March");
        
        
        SecretaryArrayClass.addSecretary("S0001", "Riley Mel", "7 Castle Road, Eggton", "password");
        SecretaryArrayClass.addSecretary("S0002", "Shirley Reid", "8 Reader Hill, Eggton", "adlenta2");
        SecretaryArrayClass.addSecretary("S0003", "Sheila Thompson", "2 Toran Road, Eggton", "goryince6");
        
        AdminArrayClass.addAdmin("A0001", "Aaron Adminson", "2 Admin Street", "password");
        
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
        
        PrescriptionArrayClass.addPrescription("P0001", MedicineArrayClass.getMedicineByName("Etynol"), "1 a day for 6 weeks. Make sure to check area regularly");
        PrescriptionArrayClass.addPrescription("P0002", MedicineArrayClass.getMedicineByName("Niquityl"), "3 a day for 9 weeks. Rub gently before applying");
        PrescriptionArrayClass.addPrescription("P0003", MedicineArrayClass.getMedicineByName("Medicyl"), "1 a day for 2 weeks. Don't Eat After Taking");
       
        
        DoctorFeedbackArrayClass.addDoctorFeedback("D0001",4, "Very good guy. Made me better!");
        DoctorFeedbackArrayClass.addDoctorFeedback("D0002",1, "Horrible to me. Gave me terrible advice too!");
        DoctorFeedbackArrayClass.addDoctorFeedback("D0003",5, "Extremely nice doctor, was very smart too!");
        DoctorFeedbackArrayClass.addDoctorFeedback("D0003",5, "Extremely nice doctor, was very smart too!");
        DoctorFeedbackArrayClass.addDoctorFeedback("D0004",5, "This genius is incredible!");
        DoctorAdminFeedbackArrayClass.addDoctorAdminFeedback("D0004","Well done recently, very good ratings!");
        
        
        
        CurrentUser.makeUser(DoctorArrayClass.doctors.get(3));
    }
    
    
}
