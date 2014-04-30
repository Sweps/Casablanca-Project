/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentation;

import dataSource.RoomBookingMapper;
import domain.ControllerInterface;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Charles
 */
public class DeleteBooking extends javax.swing.JFrame {

    JFrame fr1;
    ControllerInterface conIf;
    RoomBookingMapper rbmap;
    /**
     * Creates new form DeleteBooking
     */
    public DeleteBooking(ControllerInterface c, JFrame fr1) {
        initComponents();
        
        conIf = c;
        
        this.fr1 = fr1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonDeleteBooking = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTextFirstNameDelete = new javax.swing.JTextField();
        JTextLastNameDelete = new javax.swing.JTextField();
        JTextphoneDelete = new javax.swing.JTextField();
        JTextdayDelete = new javax.swing.JTextField();
        JTextMonthDelete = new javax.swing.JTextField();
        JTextYearDelete = new javax.swing.JTextField();
        JTextNightStayingDelete = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JLabelDeleteStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonDeleteBooking.setText("Delete booking");
        ButtonDeleteBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteBookingActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        JTextYearDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextYearDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("Phone");

        jLabel4.setText("Day");

        jLabel5.setText("Month");

        jLabel6.setText("Year");

        jLabel7.setText("Nights staying");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ButtonDeleteBooking)
                            .addGap(48, 48, 48)
                            .addComponent(jButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JTextdayDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JTextMonthDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JTextYearDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(JTextFirstNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(JTextLastNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JTextNightStayingDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))))))
                    .addComponent(JTextphoneDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelDeleteStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextFirstNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextLastNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextphoneDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextdayDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextMonthDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextYearDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextNightStayingDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonDeleteBooking)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelDeleteStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        fr1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
        //Charles og Christoffer
    private void ButtonDeleteBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteBookingActionPerformed
        boolean succes = false;
        int phoneNr = 0;
        int day = 0;
        int month = 0;
        int year = 0;
        int nights = 0;
        Date date = null;
        String fn = JTextFirstNameDelete.getText().toLowerCase();
        String ln = JTextLastNameDelete.getText().toLowerCase();
        
        try{
            phoneNr = Integer.parseInt(JTextphoneDelete.getText());
        }catch(java.lang.NullPointerException ex){
            JLabelDeleteStatus.setText("Missing phone number");
        }
        try{
            day = Integer.parseInt(JTextdayDelete.getText());
        }catch(java.lang.NullPointerException ex){
            JLabelDeleteStatus.setText("Missing day");
        }
        try{
            month = Integer.parseInt(JTextMonthDelete.getText());
        }catch(java.lang.NullPointerException ex){
            JLabelDeleteStatus.setText("Missing month");
        }
        try{
            year = Integer.parseInt(JTextYearDelete.getText());
        }catch(java.lang.NullPointerException ex){
            JLabelDeleteStatus.setText("Missing year");
        }
        try{
            nights = Integer.parseInt(JTextNightStayingDelete.getText());
        }catch(java.lang.NullPointerException ex){
            JLabelDeleteStatus.setText("Missing nights staying");
        }
        
        if(day!=0 && month!=0 && year!=0){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String datestr = (JTextdayDelete.getText() + "/" + JTextMonthDelete.getText() +  "/" +JTextYearDelete.getText());
        try { 
            date = formatter.parse(datestr); }
        catch (ParseException e) {
            JLabelDeleteStatus.setText("Error in date");
        }
        }
        
        if(fn.isEmpty()){
            JLabelDeleteStatus.setText("Missing Firstname");
        }
        if(ln.isEmpty()){
            JLabelDeleteStatus.setText("Missing Lastname");
        }
        
        if(!fn.isEmpty() && !ln.isEmpty() && phoneNr != 0 && date != null && nights != 0){
            try{
                succes = conIf.CancelRoomBooking(fn, ln, phoneNr, date, nights);
            }catch(SQLException ex){
                succes = false;
            }
        }
        if(succes == true){
            JTextYearDelete.setText("");
            JTextdayDelete.setText("");
            JTextMonthDelete.setText("");
            JTextFirstNameDelete.setText("");
            JTextLastNameDelete.setText("");
            JTextphoneDelete.setText("");
            JTextNightStayingDelete.setText("");
            
            int reply = JOptionPane.showConfirmDialog(
            fr1,
            "Would you like to delete another room booking?",
            "Roombooking deleted",
            JOptionPane.YES_NO_OPTION);
            
            if(reply == JOptionPane.NO_OPTION){
                fr1.setVisible(true);
                this.setVisible(false);
            }
            
        }else{
            JLabelDeleteStatus.setText("No booking cancelled");
        }        
    }//GEN-LAST:event_ButtonDeleteBookingActionPerformed

    private void JTextYearDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextYearDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextYearDeleteActionPerformed

    private void fillcombo(){
        
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDeleteBooking;
    private javax.swing.JLabel JLabelDeleteStatus;
    private javax.swing.JTextField JTextFirstNameDelete;
    private javax.swing.JTextField JTextLastNameDelete;
    private javax.swing.JTextField JTextMonthDelete;
    private javax.swing.JTextField JTextNightStayingDelete;
    private javax.swing.JTextField JTextYearDelete;
    private javax.swing.JTextField JTextdayDelete;
    private javax.swing.JTextField JTextphoneDelete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
