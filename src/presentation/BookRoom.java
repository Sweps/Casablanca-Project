/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package presentation;

import domain.ControllerInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Charlie
 */
public class BookRoom extends javax.swing.JFrame {
    ControllerInterface conIf;
    
    JFrame fr1;
    /**
     * Creates new form BookRoom
     */
    public BookRoom(ControllerInterface c, JFrame fr1) {
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

        JTextFirstNameBooker = new javax.swing.JTextField();
        JTextLastNameBooker = new javax.swing.JTextField();
        JTextEmail = new javax.swing.JTextField();
        JTextPhone = new javax.swing.JTextField();
        JTextAddress = new javax.swing.JTextField();
        JTextCountry = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTextDay = new javax.swing.JTextField();
        JTextMonth = new javax.swing.JTextField();
        JTextYear = new javax.swing.JTextField();
        JTextNightsStaying = new javax.swing.JTextField();
        JTextSpecificRoom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBoxSingle = new javax.swing.JCheckBox();
        jCheckBoxDouble = new javax.swing.JCheckBox();
        jCheckBoxFamily = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JLabelStatus = new javax.swing.JLabel();
        JTextTravelAgency = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTextFirstNameBooker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFirstNameBookerActionPerformed(evt);
            }
        });

        JTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextEmailActionPerformed(evt);
            }
        });

        jLabel1.setText("First name");

        jLabel2.setText("Last name");

        jLabel3.setText("Email");

        jLabel4.setText("Phone");

        jLabel5.setText("Address");

        jLabel6.setText("Country");

        JTextDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextDayActionPerformed(evt);
            }
        });

        JTextMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextMonthActionPerformed(evt);
            }
        });

        JTextNightsStaying.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextNightsStayingActionPerformed(evt);
            }
        });

        jLabel7.setText("/");

        jLabel8.setText("/");

        jCheckBoxSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSingleActionPerformed(evt);
            }
        });

        jCheckBoxDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDoubleActionPerformed(evt);
            }
        });

        jCheckBoxFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFamilyActionPerformed(evt);
            }
        });

        jLabel9.setText("Day");

        jLabel10.setText("Month");

        jLabel11.setText("Year");

        jLabel12.setText("Nights staying");

        jLabel13.setText("Period start");

        jLabel14.setText("Single Room");

        jLabel15.setText("Double Room");

        jLabel16.setText("Family Room");

        jLabel17.setText("Specific room no");

        jLabel18.setText("Travel agency");

        jButton1.setText("Book Room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(JTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTextEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(JTextFirstNameBooker, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(JTextLastNameBooker, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(JTextCountry)))))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JTextSpecificRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(JTextDay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7)))
                            .addComponent(jCheckBoxSingle)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JTextMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(jCheckBoxDouble, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextYear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel15)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(JTextNightsStaying, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxFamily)))
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jButton2)
                    .addComponent(JTextTravelAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFirstNameBooker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextLastNameBooker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextNightsStaying, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxDouble, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBoxSingle))))
                    .addComponent(jCheckBoxFamily))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextSpecificRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextTravelAgency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(JLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFirstNameBookerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFirstNameBookerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFirstNameBookerActionPerformed

    private void JTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextEmailActionPerformed

    private void JTextMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextMonthActionPerformed

    private void JTextDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextDayActionPerformed

    private void JTextNightsStayingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextNightsStayingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextNightsStayingActionPerformed

    private void jCheckBoxSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSingleActionPerformed
        if(jCheckBoxSingle.isSelected()){
            jCheckBoxDouble.setSelected(false);
            jCheckBoxFamily.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxSingleActionPerformed

    private void jCheckBoxFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFamilyActionPerformed
        if(jCheckBoxFamily.isSelected()){
            jCheckBoxDouble.setSelected(false);
            jCheckBoxSingle.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxFamilyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        fr1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        int nights = 0;
        int phone = 0;
        
        Date date = null;
        
        String fn = JTextFirstNameBooker.getText().toLowerCase();
        String ln = JTextLastNameBooker.getText().toLowerCase();
        String email = JTextEmail.getText().toLowerCase();
        String address = JTextAddress.getText().toLowerCase();
        String country = JTextCountry.getText().toLowerCase();
        System.out.println("før tagency");
        String tAgency = JTextTravelAgency.toString().toLowerCase();
        System.out.println("efter tagency");
        
        if(fn.isEmpty()){
            JLabelStatus.setText("Missing booker firstname");
        }
        
        if(ln.isEmpty()){
            JLabelStatus.setText("Missing booker lastname");
        }
        
        if(email.isEmpty()){
            JLabelStatus.setText("Missing booker email");
        }
        
        if(address.isEmpty()){
            JLabelStatus.setText("Missing booker address");
        }
        
        if(country.isEmpty()){
            JLabelStatus.setText("Missing booker country");
        }
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String datestr = (JTextDay.getText() + "/" + JTextMonth.getText() +  "/" +JTextYear.getText());
        try { 
            date = formatter.parse(datestr); }
        catch (ParseException e) {
            JLabelStatus.setText("Error in date");
        }
        
        try{
            phone = Integer.parseInt(JTextPhone.getText());
        }catch(java.lang.NullPointerException ex){
            JLabelStatus.setText("Error in phone number");
        }
        
        try{
            nights = Integer.parseInt(JTextNightsStaying.getText());
        }catch(java.lang.NullPointerException ex){
            JLabelStatus.setText("Error in nights staying");
        }
        
        
        
//        if(!JTextNoOfSingle.getText().isEmpty()){
//            try{
//                singleR = Integer.parseInt(JTextNoOfSingle.getText());
//            }catch(java.lang.NullPointerException ex){}
//        }
//        
//        if(!JTextNoOfDouble.getText().isEmpty()){
//            try{
//                doubleR = Integer.parseInt(JTextNoOfDouble.getText());
//            }catch(java.lang.NullPointerException ex){}
//        }
//        
//        if(!JTextNoOfFamily.getText().isEmpty()){
//            try{
//                familyR = Integer.parseInt(JTextNoOfFamily.getText());
//            }catch(java.lang.NullPointerException ex){}
//        }
        
        
        
//        if(singleR == 0 && doubleR == 0 && familyR == 0){
//            JLabelStatus.setText("Error in room amount");
//        }
        
        
        
//        int totalRooms = singleR + doubleR + familyR;
        
        if(!fn.isEmpty() || !email.isEmpty() || !ln.isEmpty() || !address.isEmpty() || !country.isEmpty() || date!=null || 
                nights != 0 || phone != 0){ // || totalRooms != 0
            System.out.println("efter totalrooms");
            
        //EDIT BY PHILL - TEMP HAQ
        boolean bookedState = false;
        if(jCheckBoxSingle.isSelected())
        {           
            bookedState = conIf.newRoomBooking(fn, ln, email, phone, address, country, date, nights, "singleroom", "tAgency");            
        }
        else if(jCheckBoxDouble.isSelected())
        {            
            bookedState = conIf.newRoomBooking(fn, ln, email, phone, address, country, date, nights, "doubleroom", "tAgency");
        }
        else if(jCheckBoxFamily.isSelected())
        {
            bookedState = conIf.newRoomBooking(fn, ln, email, phone, address, country, date, nights, "familyroom", "tAgency");
        }
        // TEMP HAQ END
        
            
        
        if(bookedState==true){
            JTextFirstNameBooker.setText("");
            JTextLastNameBooker.setText("");
            JTextEmail.setText("");
            JTextAddress.setText("");
            JTextCountry.setText("");
            JTextDay.setText("");
            JTextMonth.setText("");
            JTextYear.setText("");
            JTextNightsStaying.setText("");
            JTextPhone.setText("");
            JTextSpecificRoom.setText("");
            jCheckBoxSingle.setSelected(false);
            jCheckBoxDouble.setSelected(false);
            jCheckBoxFamily.setSelected(false);
            
            int reply = JOptionPane.showConfirmDialog(
            fr1,
            "Would you like to add another room booking?",
            "Room booked successfully",
            JOptionPane.YES_NO_OPTION);
            
            if(reply == JOptionPane.NO_OPTION){
                fr1.setVisible(true);
                this.setVisible(false);
            }
            
        }else{
            JLabelStatus.setText("Error in booking");
        }
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDoubleActionPerformed
        if(jCheckBoxDouble.isSelected()){
            jCheckBoxSingle.setSelected(false);
            jCheckBoxFamily.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxDoubleActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelStatus;
    private javax.swing.JTextField JTextAddress;
    private javax.swing.JTextField JTextCountry;
    private javax.swing.JTextField JTextDay;
    private javax.swing.JTextField JTextEmail;
    private javax.swing.JTextField JTextFirstNameBooker;
    private javax.swing.JTextField JTextLastNameBooker;
    private javax.swing.JTextField JTextMonth;
    private javax.swing.JTextField JTextNightsStaying;
    private javax.swing.JTextField JTextPhone;
    private javax.swing.JTextField JTextSpecificRoom;
    private javax.swing.JTextField JTextTravelAgency;
    private javax.swing.JTextField JTextYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxDouble;
    private javax.swing.JCheckBox jCheckBoxFamily;
    private javax.swing.JCheckBox jCheckBoxSingle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}