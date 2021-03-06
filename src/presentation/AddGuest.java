/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentation;

import domain.ControllerInterface;
import javax.swing.JFrame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Charles
 */
public class AddGuest extends javax.swing.JFrame {

    JFrame fr1;
    ControllerInterface conIf;
    String PersonCategory = null;
    /**
     * Creates new form AddGuest
     */
    public AddGuest(ControllerInterface c, JFrame fr1) {
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

        jbuttonAddGuest = new javax.swing.JButton();
        JTextFirstNameGuest = new javax.swing.JTextField();
        JTextLastNameGuest = new javax.swing.JTextField();
        JTextPhoneGuest = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextEmailGuest = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabelAddGuestStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbuttonAddGuest.setText("Add Guest");
        jbuttonAddGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonAddGuestActionPerformed(evt);
            }
        });

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("Phone");

        JTextEmailGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextEmailGuestActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTextFirstNameGuest, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(JTextPhoneGuest))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(JTextLastNameGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(JTextEmailGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbuttonAddGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabelAddGuestStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextFirstNameGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextLastNameGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(JTextPhoneGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextEmailGuest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonAddGuest)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAddGuestStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextEmailGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextEmailGuestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextEmailGuestActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fr1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

        //Charles og Christoffer
    private void jbuttonAddGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonAddGuestActionPerformed
        String fnGuest = JTextFirstNameGuest.getText().toLowerCase();
        String lnGuest = JTextLastNameGuest.getText().toLowerCase();
        String emGuest = JTextEmailGuest.getText().toLowerCase(); //??
        boolean succes = false;
        int phoneNr = 0;
        
        try{
            phoneNr = Integer.parseInt(JTextPhoneGuest.getText());
        }
        catch(java.lang.NullPointerException ex){
            jLabelAddGuestStatus.setText("Missing phone number");
        }
        if(fnGuest.isEmpty()){
            jLabelAddGuestStatus.setText("Missing Firstname");
        }
        if(lnGuest.isEmpty()){
            jLabelAddGuestStatus.setText("Missing Lastname");
        }
        if(emGuest.isEmpty()){
            jLabelAddGuestStatus.setText("Missing Email");
        }
        
        if(!fnGuest.isEmpty() && !lnGuest.isEmpty() && phoneNr != 0 ){
            try{        
                succes = conIf.addGuestEmail(fnGuest, lnGuest, phoneNr, emGuest); //emguest?                
            }catch(Exception ex){
                succes = false;
            }
        }
        if(succes == true){
            JTextFirstNameGuest.setText("");
            JTextLastNameGuest.setText("");
            JTextPhoneGuest.setText("");
            JTextEmailGuest.setText("");
            
            int reply = JOptionPane.showConfirmDialog(
            fr1,
            "Would you like to add another guest?",
            "Guest added successfully",
            JOptionPane.YES_NO_OPTION);
            
            if(reply == JOptionPane.NO_OPTION){
                fr1.setVisible(true);
                this.setVisible(false);
            }
            
            
            
        }else{
            jLabelAddGuestStatus.setText("guest not added");
        }
    }//GEN-LAST:event_jbuttonAddGuestActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextEmailGuest;
    private javax.swing.JTextField JTextFirstNameGuest;
    private javax.swing.JTextField JTextLastNameGuest;
    private javax.swing.JTextField JTextPhoneGuest;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAddGuestStatus;
    private javax.swing.JButton jbuttonAddGuest;
    // End of variables declaration//GEN-END:variables
}
