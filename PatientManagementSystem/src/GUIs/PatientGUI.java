/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

/**
 *
 * @author Walker
 */
public class PatientGUI extends javax.swing.JFrame {

    /**
     * Creates new form PatientGUI
     */
    public PatientGUI() {
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

        btnViewAppointments = new javax.swing.JButton();
        btnViewPrescriptions = new javax.swing.JButton();
        btnAppointmentRequest = new javax.swing.JButton();
        btnRequestAccountTermination = new javax.swing.JButton();
        btnGiveDoctorFeedback = new javax.swing.JButton();
        btnViewHistory = new javax.swing.JButton();
        lblPatient = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPatient = new javax.swing.JTextArea();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnViewAppointments.setText("View Appointments");
        btnViewAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentsActionPerformed(evt);
            }
        });

        btnViewPrescriptions.setText("View Prescriptions");
        btnViewPrescriptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPrescriptionsActionPerformed(evt);
            }
        });

        btnAppointmentRequest.setText("Appointment Request");
        btnAppointmentRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentRequestActionPerformed(evt);
            }
        });

        btnRequestAccountTermination.setText("Request Account Termination");
        btnRequestAccountTermination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestAccountTerminationActionPerformed(evt);
            }
        });

        btnGiveDoctorFeedback.setText("Give Doctor Feedback");
        btnGiveDoctorFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveDoctorFeedbackActionPerformed(evt);
            }
        });

        btnViewHistory.setText("View History");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        lblPatient.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPatient.setText("Patient");

        txtAreaPatient.setColumns(20);
        txtAreaPatient.setRows(5);
        txtAreaPatient.setText("Welcome Patient.");
        jScrollPane1.setViewportView(txtAreaPatient);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGiveDoctorFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewPrescriptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAppointmentRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(btnRequestAccountTermination)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAppointmentRequest, btnGiveDoctorFeedback, btnViewAppointments, btnViewHistory, btnViewPrescriptions});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewAppointments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewPrescriptions)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewHistory)
                        .addGap(11, 11, 11)
                        .addComponent(btnAppointmentRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGiveDoctorFeedback))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnRequestAccountTermination)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogout)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestAccountTerminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestAccountTerminationActionPerformed
        // request account removal code
    }//GEN-LAST:event_btnRequestAccountTerminationActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        PatientViewHistoryGUI pGo = new PatientViewHistoryGUI();
        PatientGUI pLeave = new PatientGUI();
        pGo.setVisible(true);
        pLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnViewHistoryActionPerformed

    private void btnAppointmentRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentRequestActionPerformed
        PatientRequestAppointmentGUI pGo = new PatientRequestAppointmentGUI();
        PatientGUI pLeave = new PatientGUI();
        pGo.setVisible(true);
        pLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnAppointmentRequestActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginGUI loginGUIInstance = new LoginGUI();
        PatientGUI patientGUIInstance = new PatientGUI();
        loginGUIInstance.setVisible(true);
        patientGUIInstance.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnGiveDoctorFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveDoctorFeedbackActionPerformed
        PatientGiveFeedbackGUI pGo = new PatientGiveFeedbackGUI();
        PatientGUI pLeave = new PatientGUI();
        pGo.setVisible(true);
        pLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnGiveDoctorFeedbackActionPerformed

    private void btnViewAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentsActionPerformed
        PatientViewAppointmentsGUI pGo = new PatientViewAppointmentsGUI();
        PatientGUI pLeave = new PatientGUI();
        pGo.setVisible(true);
        pLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnViewAppointmentsActionPerformed

    private void btnViewPrescriptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPrescriptionsActionPerformed
        PatientViewPrescriptionGUI pGo = new PatientViewPrescriptionGUI();
        PatientGUI pLeave = new PatientGUI();
        pGo.setVisible(true);
        pLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnViewPrescriptionsActionPerformed

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
            java.util.logging.Logger.getLogger(PatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointmentRequest;
    private javax.swing.JButton btnGiveDoctorFeedback;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRequestAccountTermination;
    private javax.swing.JButton btnViewAppointments;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JButton btnViewPrescriptions;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JTextArea txtAreaPatient;
    // End of variables declaration//GEN-END:variables
}
