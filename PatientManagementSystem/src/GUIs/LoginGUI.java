/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import java.text.Normalizer;

/**
 *
 * @author Walker
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPatient = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnSecretary = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPatient.setText("Patient");
        btnPatient.setActionCommand("btnPatient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSecretary.setText("Secretary");
        btnSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecretaryActionPerformed(evt);
            }
        });

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPatient)
                .addGap(32, 32, 32)
                .addComponent(btnAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnSecretary)
                .addGap(29, 29, 29)
                .addComponent(btnDoctor)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPatient)
                    .addComponent(btnAdmin)
                    .addComponent(btnSecretary)
                    .addComponent(btnDoctor))
                .addContainerGap(266, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        LoginGUI loginGUIInstance = new LoginGUI();
        PatientGUI patientGUIInstance = new PatientGUI();
        patientGUIInstance.setVisible(true);
        loginGUIInstance.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        LoginGUI loginGUIInstance = new LoginGUI();
        AdminGUI adminGUIInstance = new AdminGUI();
        adminGUIInstance.setVisible(true);
        loginGUIInstance.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnSecretaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecretaryActionPerformed
        LoginGUI loginGUIInstance = new LoginGUI();
        SecretaryGUI secretaryGUIInstance = new SecretaryGUI();
        secretaryGUIInstance.setVisible(true);
        loginGUIInstance.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnSecretaryActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        LoginGUI loginGUIInstance = new LoginGUI();
        DoctorGUI doctorGUIInstance = new DoctorGUI();
        doctorGUIInstance.setVisible(true);
        loginGUIInstance.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnDoctorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnSecretary;
    // End of variables declaration//GEN-END:variables
}