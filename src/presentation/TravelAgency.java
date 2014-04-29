/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentation;

import domain.ControllerInterface;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Charlie
 */
public class TravelAgency extends javax.swing.JFrame {

    JFrame fr1;
    ControllerInterface conIf;
    
    /**
     * Creates new form TravelAngecy
     */
    public TravelAgency(ControllerInterface c, JFrame fr1) {
        initComponents();
        
        this.fr1 = fr1;
        conIf = c;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAddAgency = new javax.swing.JToggleButton();
        JButtonBack = new javax.swing.JToggleButton();
        jTextCompanyName = new javax.swing.JTextField();
        jTextPhone = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelAddTravelAngecyStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddAgency.setText("Add agency");
        jButtonAddAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAgencyActionPerformed(evt);
            }
        });

        JButtonBack.setText("Back");
        JButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonBackActionPerformed(evt);
            }
        });

        jTextPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPhoneActionPerformed(evt);
            }
        });

        jLabel1.setText("Company name");

        jLabel2.setText("Phone");

        jLabel3.setText("Email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jTextPhone)
                            .addComponent(jTextCompanyName)
                            .addComponent(jButtonAddAgency, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(42, 42, 42)
                        .addComponent(JButtonBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabelAddTravelAngecyStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabelAddTravelAngecyStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddAgency)
                    .addComponent(JButtonBack))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPhoneActionPerformed

    private void JButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonBackActionPerformed
        fr1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JButtonBackActionPerformed

    private void jButtonAddAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAgencyActionPerformed
        String comName = jTextCompanyName.getText().toLowerCase();
        String comEmail = jTextEmail.getText().toLowerCase();
        boolean succes = false;
        int phoneNo = 0;
        
        try{
            phoneNo = Integer.parseInt(jTextPhone.getText());
        }
        catch(java.lang.NullPointerException ex){
            jLabelAddTravelAngecyStatus.setText("Missing phone number");
        }
        if(comName.isEmpty()){
            jLabelAddTravelAngecyStatus.setText("Missing company name");
        }
        if(comEmail.isEmpty()){
            jLabelAddTravelAngecyStatus.setText("Missing company email");
        }
        
        if(!comEmail.isEmpty() && !comName.isEmpty() && phoneNo != 0){
            try{
//                System.out.println("før succes");
//                System.out.println("efter succes");
            }
            catch(Exception ex){
                succes = false;
            }
        }
        
        if(succes == true){
            jTextCompanyName.setText("");
            jTextEmail.setText("");
            jTextPhone.setText("");
//            System.out.println("success");
            int reply = JOptionPane.showConfirmDialog(
            fr1,
            "Would you like to add another travel angecy?",
            "Travel angecy added successfully",
            JOptionPane.YES_NO_OPTION);
            
            if(reply == JOptionPane.NO_OPTION){
                fr1.setVisible(true);
                this.setVisible(false);
            }
        }
        else{
            System.out.println("ikke succes");
                jLabelAddTravelAngecyStatus.setText("Travel angecy not added");
            }        
    }//GEN-LAST:event_jButtonAddAgencyActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JButtonBack;
    private javax.swing.JToggleButton jButtonAddAgency;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAddTravelAngecyStatus;
    private javax.swing.JTextField jTextCompanyName;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextPhone;
    // End of variables declaration//GEN-END:variables
}
