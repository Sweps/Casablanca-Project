/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import domain.FacilityControllerIF;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Phill
 */
public class FacilityGui extends javax.swing.JFrame {

    FacilityControllerIF control;
    String day1,day2,day3,day4,day5,day6,day7;
    String[] days;
    Calendar pickeddate;
    /**
     * Creates new form FacilityGui
     */
    public FacilityGui(FacilityControllerIF c) {
        initComponents();
        control = c;
        jPanelSplashKeypad.setVisible(true);
        jPanelSplashWelcome.setVisible(false);
        jLayeredPaneTennis.setVisible(false);
        jLayeredPaneTimePicker.setVisible(false);
        
        //calc dates
        days = new String[7];
        Calendar cal = Calendar.getInstance();
        Locale locale = Locale.ENGLISH;
        for (int i = 0; i<7 ; i++)
        { 
            days[i] = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
            cal.add(Calendar.DAY_OF_WEEK, 1);
        }

        jButtonTennisDatePickerDay3.setText(days[2]);
        jButtonTennisDatePickerDay4.setText(days[3]);
        jButtonTennisDatePickerDay5.setText(days[4]);
        jButtonTennisDatePickerDay6.setText(days[5]);
        jButtonTennisDatePickerDay7.setText(days[6]);
        //calc dates

        
    }
    private void bookTennis(int hour)
    {
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-YYYY HH:MM");
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH");
        pickeddate.set(Calendar.HOUR_OF_DAY, hour);
        Date thedate = pickeddate.getTime();
        int success = control.bookTennis(thedate);
        if (success != 0)
         {
             JOptionPane.showMessageDialog(this,
             "You have booked Tennis court number " + success + " on\n"
                     + sdfDate.format(thedate) + " \n"
                     + "From " + hour + " To "+ (hour+1));
             control.logout();
             cleanTimePicker();
             pickeddate = null;
             jLayeredPaneTimePicker.setVisible(false);
             jLayeredPaneSplash.setVisible(true);
             jPanelSplashWelcome.setVisible(false);
             jPanelSplashKeypad.setVisible(true);
             jTextFieldSplashKeypadGuestID.setText("");
         }
        else
         {
             
         }
        
    }
    private void displayTennisTimes(int additionnalday)
    {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, additionnalday);
        pickeddate = cal;
        ArrayList<Integer> indates = control.getIncompatibleTennisTimes(cal);
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        
        
        if (indates != null)
        {
            for (int i = 0; i<indates.size(); i++)
            {
                switch(indates.get(i))
                {
                   case 8: jButtonTimePickerHour8.setEnabled(false);
                              break;
                   case 9: jButtonTimePickerHour9.setEnabled(false);
                              break;
                   case 10: jButtonTimePickerHour10.setEnabled(false);
                              break;
                   case 11: jButtonTimePickerHour11.setEnabled(false);
                              break;
                   case 12: jButtonTimePickerHour12.setEnabled(false);
                              break;
                   case 13: jButtonTimePickerHour13.setEnabled(false);
                              break;
                   case 14: jButtonTimePickerHour14.setEnabled(false);
                              break;
                   case 15: jButtonTimePickerHour15.setEnabled(false);
                              break;
                   case 16: jButtonTimePickerHour16.setEnabled(false);
                              break;
                   case 17: jButtonTimePickerHour17.setEnabled(false);
                              break;
                   case 18: jButtonTimePickerHour18.setEnabled(false);
                              break;
                   case 19: jButtonTimePickerHour19.setEnabled(false);
                              break;
                }
            }
        }
    }
    
    private void cleanTimePicker()
    {
        jButtonTimePickerHour8.setEnabled(true);
        jButtonTimePickerHour9.setEnabled(true);
        jButtonTimePickerHour10.setEnabled(true);
        jButtonTimePickerHour11.setEnabled(true);
        jButtonTimePickerHour12.setEnabled(true);
        jButtonTimePickerHour13.setEnabled(true);
        jButtonTimePickerHour14.setEnabled(true);
        jButtonTimePickerHour15.setEnabled(true);
        jButtonTimePickerHour16.setEnabled(true);
        jButtonTimePickerHour17.setEnabled(true);
        jButtonTimePickerHour18.setEnabled(true);
        jButtonTimePickerHour19.setEnabled(true);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanelSplash = new javax.swing.JPanel();
        jLayeredPaneSplash = new javax.swing.JLayeredPane();
        jPanelSplashKeypad = new javax.swing.JPanel();
        jButtonSplashKeypad7 = new javax.swing.JButton();
        jButtonSplashKeypad8 = new javax.swing.JButton();
        jButtonSplashKeypad9 = new javax.swing.JButton();
        jButtonSplashKeypad4 = new javax.swing.JButton();
        jButtonSplashKeypad1 = new javax.swing.JButton();
        jButtonSplashKeypad5 = new javax.swing.JButton();
        jButtonSplashKeypad2 = new javax.swing.JButton();
        jButtonSplashKeypad6 = new javax.swing.JButton();
        jButtonSplashKeypad3 = new javax.swing.JButton();
        jButtonSplashKeypad0 = new javax.swing.JButton();
        jButtonSplashKeypadBack = new javax.swing.JButton();
        jButtonSplashKeypadOK = new javax.swing.JButton();
        jTextFieldSplashKeypadGuestID = new javax.swing.JTextField();
        jLabelSplashKeypad = new javax.swing.JLabel();
        jPanelSplashWelcome = new javax.swing.JPanel();
        jLabelSplashWelcomeWelcome = new javax.swing.JLabel();
        jLabelSplashWelcomeName = new javax.swing.JLabel();
        jButtonSplashWelcomeNotYou = new javax.swing.JButton();
        jButtonSplashWelcomeTennis = new javax.swing.JButton();
        jButtonSplashWelcomeVolleyball = new javax.swing.JButton();
        jButtonSplashWelcomeBadminton = new javax.swing.JButton();
        jButtonSplashWelcomeHandball = new javax.swing.JButton();
        jButtonSplashWelcomeFitness = new javax.swing.JButton();
        jButtonSplashWelcomeGolf = new javax.swing.JButton();
        jButtonSplashWelcomeSwimming = new javax.swing.JButton();
        jButtonSplashWelcomeMountainBiking = new javax.swing.JButton();
        jButtonSplashWelcomeTableTennis = new javax.swing.JButton();
        jLabelSplashWelcomeWhat = new javax.swing.JLabel();
        jLayeredPaneTennis = new javax.swing.JLayeredPane();
        jPanelTennisDatePicker = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonTennisDatePickerDay1 = new javax.swing.JButton();
        jButtonTennisDatePickerDay2 = new javax.swing.JButton();
        jButtonTennisDatePickerDay3 = new javax.swing.JButton();
        jButtonTennisDatePickerDay4 = new javax.swing.JButton();
        jButtonTennisDatePickerDay5 = new javax.swing.JButton();
        jButtonTennisDatePickerDay6 = new javax.swing.JButton();
        jButtonTennisDatePickerDay7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLayeredPaneTimePicker = new javax.swing.JLayeredPane();
        jLabelTimePickerHeader = new javax.swing.JLabel();
        jButtonTimePickerHour8 = new javax.swing.JButton();
        jButtonTimePickerHour9 = new javax.swing.JButton();
        jButtonTimePickerHour10 = new javax.swing.JButton();
        jButtonTimePickerHour11 = new javax.swing.JButton();
        jButtonTimePickerHour12 = new javax.swing.JButton();
        jButtonTimePickerHour13 = new javax.swing.JButton();
        jButtonTimePickerHour14 = new javax.swing.JButton();
        jButtonTimePickerHour15 = new javax.swing.JButton();
        jButtonTimePickerHour16 = new javax.swing.JButton();
        jButtonTimePickerHour17 = new javax.swing.JButton();
        jButtonTimePickerHour18 = new javax.swing.JButton();
        jButtonTimePickerHour19 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanelSplashLayout = new javax.swing.GroupLayout(jPanelSplash);
        jPanelSplash.setLayout(jPanelSplashLayout);
        jPanelSplashLayout.setHorizontalGroup(
            jPanelSplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        jPanelSplashLayout.setVerticalGroup(
            jPanelSplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSplashKeypad.setPreferredSize(new java.awt.Dimension(515, 100));

        jButtonSplashKeypad7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad7.setText("7");
        jButtonSplashKeypad7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad7ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad8.setText("8");
        jButtonSplashKeypad8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad8ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad9.setText("9");
        jButtonSplashKeypad9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad9ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad4.setText("4");
        jButtonSplashKeypad4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad4ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad1.setText("1");
        jButtonSplashKeypad1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad1ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad5.setText("5");
        jButtonSplashKeypad5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad5ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad2.setText("2");
        jButtonSplashKeypad2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad2ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad6.setText("6");
        jButtonSplashKeypad6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad6ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad3.setText("3");
        jButtonSplashKeypad3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad3ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad0.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad0.setText("0");
        jButtonSplashKeypad0.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypad0ActionPerformed(evt);
            }
        });

        jButtonSplashKeypadBack.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypadBack.setText("<-");
        jButtonSplashKeypadBack.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypadBackActionPerformed(evt);
            }
        });

        jButtonSplashKeypadOK.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypadOK.setText("OK");
        jButtonSplashKeypadOK.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashKeypadOKActionPerformed(evt);
            }
        });

        jTextFieldSplashKeypadGuestID.setFocusable(false);
        jTextFieldSplashKeypadGuestID.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jTextFieldSplashKeypadGuestIDActionPerformed(evt);
            }
        });

        jLabelSplashKeypad.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelSplashKeypad.setText("Please enter your Guest ID");

        javax.swing.GroupLayout jPanelSplashKeypadLayout = new javax.swing.GroupLayout(jPanelSplashKeypad);
        jPanelSplashKeypad.setLayout(jPanelSplashKeypadLayout);
        jPanelSplashKeypadLayout.setHorizontalGroup(
            jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSplashKeypadLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelSplashKeypadLayout.createSequentialGroup()
                        .addComponent(jButtonSplashKeypad7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSplashKeypad8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSplashKeypad9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSplashKeypadLayout.createSequentialGroup()
                        .addComponent(jButtonSplashKeypad4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSplashKeypad5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSplashKeypad6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSplashKeypadLayout.createSequentialGroup()
                        .addGroup(jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSplashKeypadLayout.createSequentialGroup()
                                .addComponent(jButtonSplashKeypadBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSplashKeypad0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSplashKeypadLayout.createSequentialGroup()
                                .addComponent(jButtonSplashKeypad1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSplashKeypad2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSplashKeypad3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSplashKeypadOK, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSplashKeypadLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSplashKeypadLayout.createSequentialGroup()
                        .addComponent(jLabelSplashKeypad)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSplashKeypadLayout.createSequentialGroup()
                        .addComponent(jTextFieldSplashKeypadGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        jPanelSplashKeypadLayout.setVerticalGroup(
            jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSplashKeypadLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabelSplashKeypad)
                .addGap(51, 51, 51)
                .addComponent(jTextFieldSplashKeypadGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSplashKeypad7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashKeypad8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashKeypad9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSplashKeypad6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashKeypad5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashKeypad4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSplashKeypad3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashKeypad2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashKeypad1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSplashKeypadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSplashKeypad0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashKeypadBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashKeypadOK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelSplashKeypad.setBounds(160, 10, 480, 440);
        jLayeredPaneSplash.add(jPanelSplashKeypad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanelSplashWelcome.setPreferredSize(new java.awt.Dimension(515, 100));

        jLabelSplashWelcomeWelcome.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelSplashWelcomeWelcome.setText("Welcome");

        jLabelSplashWelcomeName.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabelSplashWelcomeName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSplashWelcomeName.setText("Name");

        jButtonSplashWelcomeNotYou.setText("Not You?");
        jButtonSplashWelcomeNotYou.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashWelcomeNotYouActionPerformed(evt);
            }
        });

        jButtonSplashWelcomeTennis.setText("Tennis");
        jButtonSplashWelcomeTennis.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashWelcomeTennisActionPerformed(evt);
            }
        });

        jButtonSplashWelcomeVolleyball.setText("Volleyball");

        jButtonSplashWelcomeBadminton.setText("Badminton");

        jButtonSplashWelcomeHandball.setText("Handball");

        jButtonSplashWelcomeFitness.setText("Fitness");

        jButtonSplashWelcomeGolf.setText("Golf");

        jButtonSplashWelcomeSwimming.setText("Swimming Pool");

        jButtonSplashWelcomeMountainBiking.setText("Mountain Biking");

        jButtonSplashWelcomeTableTennis.setText("TableTennis");
        jButtonSplashWelcomeTableTennis.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonSplashWelcomeTableTennisActionPerformed(evt);
            }
        });

        jLabelSplashWelcomeWhat.setText("What do you wish to do?");

        javax.swing.GroupLayout jPanelSplashWelcomeLayout = new javax.swing.GroupLayout(jPanelSplashWelcome);
        jPanelSplashWelcome.setLayout(jPanelSplashWelcomeLayout);
        jPanelSplashWelcomeLayout.setHorizontalGroup(
            jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSplashWelcomeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSplashWelcomeTennis, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashWelcomeHandball, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashWelcomeSwimming, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSplashWelcomeLayout.createSequentialGroup()
                        .addComponent(jLabelSplashWelcomeWelcome)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSplashWelcomeLayout.createSequentialGroup()
                        .addGroup(jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSplashWelcomeLayout.createSequentialGroup()
                                .addComponent(jButtonSplashWelcomeMountainBiking, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jButtonSplashWelcomeTableTennis, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSplashWelcomeLayout.createSequentialGroup()
                                .addComponent(jButtonSplashWelcomeFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSplashWelcomeGolf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSplashWelcomeLayout.createSequentialGroup()
                                .addGroup(jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSplashWelcomeBadminton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSplashWelcomeWhat))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSplashWelcomeVolleyball, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
            .addGroup(jPanelSplashWelcomeLayout.createSequentialGroup()
                .addGroup(jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSplashWelcomeLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jButtonSplashWelcomeNotYou))
                    .addGroup(jPanelSplashWelcomeLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabelSplashWelcomeName)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSplashWelcomeLayout.setVerticalGroup(
            jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSplashWelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSplashWelcomeWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSplashWelcomeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSplashWelcomeNotYou)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSplashWelcomeWhat)
                .addGap(12, 12, 12)
                .addGroup(jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSplashWelcomeBadminton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashWelcomeVolleyball, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashWelcomeTennis, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSplashWelcomeHandball, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashWelcomeFitness, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashWelcomeGolf, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSplashWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSplashWelcomeSwimming, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashWelcomeMountainBiking, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSplashWelcomeTableTennis, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanelSplashWelcome.setBounds(150, 50, 510, 490);
        jLayeredPaneSplash.add(jPanelSplashWelcome, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("When do you want to book a tennis court?");

        jButtonTennisDatePickerDay1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTennisDatePickerDay1.setText("Today");
        jButtonTennisDatePickerDay1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisDatePickerDay1ActionPerformed(evt);
            }
        });

        jButtonTennisDatePickerDay2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTennisDatePickerDay2.setText("Tomorow");
        jButtonTennisDatePickerDay2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisDatePickerDay2ActionPerformed(evt);
            }
        });

        jButtonTennisDatePickerDay3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTennisDatePickerDay3.setText("jButton1");
        jButtonTennisDatePickerDay3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisDatePickerDay3ActionPerformed(evt);
            }
        });

        jButtonTennisDatePickerDay4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTennisDatePickerDay4.setText("jButton1");
        jButtonTennisDatePickerDay4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisDatePickerDay4ActionPerformed(evt);
            }
        });

        jButtonTennisDatePickerDay5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTennisDatePickerDay5.setText("jButton1");
        jButtonTennisDatePickerDay5.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisDatePickerDay5ActionPerformed(evt);
            }
        });

        jButtonTennisDatePickerDay6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTennisDatePickerDay6.setText("jButton1");
        jButtonTennisDatePickerDay6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisDatePickerDay6ActionPerformed(evt);
            }
        });

        jButtonTennisDatePickerDay7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonTennisDatePickerDay7.setText("jButton1");
        jButtonTennisDatePickerDay7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTennisDatePickerDay7ActionPerformed(evt);
            }
        });

        jLabel3.setText("Wrong activity?");

        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTennisDatePickerLayout = new javax.swing.GroupLayout(jPanelTennisDatePicker);
        jPanelTennisDatePicker.setLayout(jPanelTennisDatePickerLayout);
        jPanelTennisDatePickerLayout.setHorizontalGroup(
            jPanelTennisDatePickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTennisDatePickerLayout.createSequentialGroup()
                .addGroup(jPanelTennisDatePickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTennisDatePickerLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButtonTennisDatePickerDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTennisDatePickerDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTennisDatePickerDay3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTennisDatePickerDay4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTennisDatePickerLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTennisDatePickerLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jButtonTennisDatePickerDay5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonTennisDatePickerDay6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonTennisDatePickerDay7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTennisDatePickerLayout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addGroup(jPanelTennisDatePickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanelTennisDatePickerLayout.setVerticalGroup(
            jPanelTennisDatePickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTennisDatePickerLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addGroup(jPanelTennisDatePickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTennisDatePickerDay1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTennisDatePickerDay2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTennisDatePickerDay3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTennisDatePickerDay4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTennisDatePickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTennisDatePickerDay7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTennisDatePickerDay6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTennisDatePickerDay5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(232, 232, 232))
        );

        jPanelTennisDatePicker.setBounds(0, 0, 780, 580);
        jLayeredPaneTennis.add(jPanelTennisDatePicker, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabelTimePickerHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTimePickerHeader.setText("Pick a time to book");
        jLabelTimePickerHeader.setBounds(310, 40, 250, 50);
        jLayeredPaneTimePicker.add(jLabelTimePickerHeader, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour8.setText("8:00 -> 9:00");
        jButtonTimePickerHour8.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour8ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour8.setBounds(130, 160, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour9.setText("9:00 -> 10:00");
        jButtonTimePickerHour9.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour9ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour9.setBounds(280, 160, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour10.setText("10:00 -> 11:00");
        jButtonTimePickerHour10.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour10ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour10.setBounds(430, 160, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour11.setText("11:00 -> 12:00");
        jButtonTimePickerHour11.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour11ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour11.setBounds(580, 160, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour12.setText("12:00 -> 13:00");
        jButtonTimePickerHour12.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour12ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour12.setBounds(130, 240, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour13.setText("13:00 -> 14:00");
        jButtonTimePickerHour13.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour13ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour13.setBounds(280, 240, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour14.setText("14:00 -> 15:00");
        jButtonTimePickerHour14.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour14ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour14.setBounds(430, 240, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour15.setText("15:00 -> 16:00");
        jButtonTimePickerHour15.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour15ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour15.setBounds(580, 240, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour16.setText("16:00 -> 17:00");
        jButtonTimePickerHour16.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour16ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour16.setBounds(130, 320, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour17.setText("17:00 -> 18:00");
        jButtonTimePickerHour17.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour17ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour17.setBounds(280, 320, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour18.setText("18:00 -> 19:00");
        jButtonTimePickerHour18.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour18ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour18.setBounds(430, 320, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButtonTimePickerHour19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTimePickerHour19.setText("19:00 -> 20:00");
        jButtonTimePickerHour19.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButtonTimePickerHour19ActionPerformed(evt);
            }
        });
        jButtonTimePickerHour19.setBounds(580, 320, 130, 60);
        jLayeredPaneTimePicker.add(jButtonTimePickerHour19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("Greyed out times are fully booked");
        jLabel2.setBounds(350, 110, 190, 14);
        jLayeredPaneTimePicker.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPaneSplash, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPaneTennis, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPaneTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPaneSplash, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLayeredPaneTennis, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLayeredPaneTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSplashKeypadGuestIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSplashKeypadGuestIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSplashKeypadGuestIDActionPerformed

    private void jButtonSplashWelcomeTennisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashWelcomeTennisActionPerformed
        jLayeredPaneSplash.setVisible(false);
        jLayeredPaneTennis.setVisible(true);
    }//GEN-LAST:event_jButtonSplashWelcomeTennisActionPerformed

    private void jButtonSplashKeypad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad1ActionPerformed
        jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 1);
    }//GEN-LAST:event_jButtonSplashKeypad1ActionPerformed

    private void jButtonSplashKeypad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad2ActionPerformed
        jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 2);
    }//GEN-LAST:event_jButtonSplashKeypad2ActionPerformed

    private void jButtonSplashKeypad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad3ActionPerformed
       jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 3);
    }//GEN-LAST:event_jButtonSplashKeypad3ActionPerformed

    private void jButtonSplashKeypad4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad4ActionPerformed
       jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 4);
    }//GEN-LAST:event_jButtonSplashKeypad4ActionPerformed

    private void jButtonSplashKeypad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad5ActionPerformed
       jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 5);
    }//GEN-LAST:event_jButtonSplashKeypad5ActionPerformed

    private void jButtonSplashKeypad6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad6ActionPerformed
       jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 6);
    }//GEN-LAST:event_jButtonSplashKeypad6ActionPerformed

    private void jButtonSplashKeypad7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad7ActionPerformed
       jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 7);
    }//GEN-LAST:event_jButtonSplashKeypad7ActionPerformed

    private void jButtonSplashKeypad8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad8ActionPerformed
       jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 8);
    }//GEN-LAST:event_jButtonSplashKeypad8ActionPerformed

    private void jButtonSplashKeypad9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad9ActionPerformed
        jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 9);
    }//GEN-LAST:event_jButtonSplashKeypad9ActionPerformed

    private void jButtonSplashKeypad0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypad0ActionPerformed
        jTextFieldSplashKeypadGuestID.setText(jTextFieldSplashKeypadGuestID.getText() + 0);
    }//GEN-LAST:event_jButtonSplashKeypad0ActionPerformed

    private void jButtonSplashKeypadBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypadBackActionPerformed
        String orig = jTextFieldSplashKeypadGuestID.getText();
        if (!orig.isEmpty())
        {
            orig = orig.substring(0, orig.length()-1);
            jTextFieldSplashKeypadGuestID.setText(orig);
        }
    }//GEN-LAST:event_jButtonSplashKeypadBackActionPerformed

    private void jButtonSplashKeypadOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashKeypadOKActionPerformed

        String idString = jTextFieldSplashKeypadGuestID.getText();
        if(idString.isEmpty())
        {
          JOptionPane.showMessageDialog(this,
          "Please enter your GuestID using the keypad\n");
        }
        else
        {
          boolean loggedin = control.login(Long.parseLong(idString));
          if(loggedin)
          {
             jPanelSplashKeypad.setVisible(false);
             jPanelSplashWelcome.setVisible(true);
             jLabelSplashWelcomeName.setText(control.getCurrentGuestName());
          }
          else
          {
            JOptionPane.showMessageDialog(this,
            "Couldn't identify you, Please try again\n"+
            "If problems persist, please Contact the Reception");
            jTextFieldSplashKeypadGuestID.setText("");
          }
        }
    }//GEN-LAST:event_jButtonSplashKeypadOKActionPerformed

    private void jButtonSplashWelcomeNotYouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashWelcomeNotYouActionPerformed
        jPanelSplashKeypad.setVisible(true);
        jPanelSplashWelcome.setVisible(false);
        jTextFieldSplashKeypadGuestID.setText("");
        control.logout();
    }//GEN-LAST:event_jButtonSplashWelcomeNotYouActionPerformed

    private void jButtonTennisDatePickerDay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTennisDatePickerDay3ActionPerformed
        jLayeredPaneTennis.setVisible(false);
        displayTennisTimes(2);
        jLayeredPaneTimePicker.setVisible(true);
    }//GEN-LAST:event_jButtonTennisDatePickerDay3ActionPerformed

    private void jButtonTimePickerHour10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour10ActionPerformed
       bookTennis(10);
    }//GEN-LAST:event_jButtonTimePickerHour10ActionPerformed

    private void jButtonTennisDatePickerDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTennisDatePickerDay1ActionPerformed
        jLayeredPaneTennis.setVisible(false);
        displayTennisTimes(0);
        jLayeredPaneTimePicker.setVisible(true);
    }//GEN-LAST:event_jButtonTennisDatePickerDay1ActionPerformed

    private void jButtonTennisDatePickerDay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTennisDatePickerDay2ActionPerformed
               jLayeredPaneTennis.setVisible(false);
        displayTennisTimes(1);
        jLayeredPaneTimePicker.setVisible(true);
    }//GEN-LAST:event_jButtonTennisDatePickerDay2ActionPerformed

    private void jButtonTennisDatePickerDay4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTennisDatePickerDay4ActionPerformed
              jLayeredPaneTennis.setVisible(false);
        displayTennisTimes(3);
        jLayeredPaneTimePicker.setVisible(true);
    }//GEN-LAST:event_jButtonTennisDatePickerDay4ActionPerformed

    private void jButtonTennisDatePickerDay5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTennisDatePickerDay5ActionPerformed
              jLayeredPaneTennis.setVisible(false);
        displayTennisTimes(4);
        jLayeredPaneTimePicker.setVisible(true);
    }//GEN-LAST:event_jButtonTennisDatePickerDay5ActionPerformed

    private void jButtonTennisDatePickerDay6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTennisDatePickerDay6ActionPerformed
               jLayeredPaneTennis.setVisible(false);
        displayTennisTimes(5);
        jLayeredPaneTimePicker.setVisible(true);
    }//GEN-LAST:event_jButtonTennisDatePickerDay6ActionPerformed

    private void jButtonTennisDatePickerDay7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTennisDatePickerDay7ActionPerformed
               jLayeredPaneTennis.setVisible(false);
        displayTennisTimes(6);
        jLayeredPaneTimePicker.setVisible(true);
    }//GEN-LAST:event_jButtonTennisDatePickerDay7ActionPerformed

    private void jButtonTimePickerHour8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour8ActionPerformed
        bookTennis(8);
    }//GEN-LAST:event_jButtonTimePickerHour8ActionPerformed

    private void jButtonTimePickerHour9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour9ActionPerformed
         bookTennis(9);
    }//GEN-LAST:event_jButtonTimePickerHour9ActionPerformed

    private void jButtonTimePickerHour11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour11ActionPerformed
         bookTennis(11);
    }//GEN-LAST:event_jButtonTimePickerHour11ActionPerformed

    private void jButtonTimePickerHour12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour12ActionPerformed
        bookTennis(12);
    }//GEN-LAST:event_jButtonTimePickerHour12ActionPerformed

    private void jButtonTimePickerHour13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour13ActionPerformed
         bookTennis(13);
    }//GEN-LAST:event_jButtonTimePickerHour13ActionPerformed

    private void jButtonTimePickerHour14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour14ActionPerformed
         bookTennis(14);
    }//GEN-LAST:event_jButtonTimePickerHour14ActionPerformed

    private void jButtonTimePickerHour15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour15ActionPerformed
        bookTennis(15);
    }//GEN-LAST:event_jButtonTimePickerHour15ActionPerformed

    private void jButtonTimePickerHour16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour16ActionPerformed
       bookTennis(16);
    }//GEN-LAST:event_jButtonTimePickerHour16ActionPerformed

    private void jButtonTimePickerHour17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour17ActionPerformed
       bookTennis(17);
    }//GEN-LAST:event_jButtonTimePickerHour17ActionPerformed

    private void jButtonTimePickerHour18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour18ActionPerformed
        bookTennis(18);
    }//GEN-LAST:event_jButtonTimePickerHour18ActionPerformed

    private void jButtonTimePickerHour19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimePickerHour19ActionPerformed
        bookTennis(19);
    }//GEN-LAST:event_jButtonTimePickerHour19ActionPerformed

    private void jButtonSplashWelcomeTableTennisActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonSplashWelcomeTableTennisActionPerformed
    {//GEN-HEADEREND:event_jButtonSplashWelcomeTableTennisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSplashWelcomeTableTennisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        jLayeredPaneSplash.setVisible(true);
        jLayeredPaneTennis.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSplashKeypad0;
    private javax.swing.JButton jButtonSplashKeypad1;
    private javax.swing.JButton jButtonSplashKeypad2;
    private javax.swing.JButton jButtonSplashKeypad3;
    private javax.swing.JButton jButtonSplashKeypad4;
    private javax.swing.JButton jButtonSplashKeypad5;
    private javax.swing.JButton jButtonSplashKeypad6;
    private javax.swing.JButton jButtonSplashKeypad7;
    private javax.swing.JButton jButtonSplashKeypad8;
    private javax.swing.JButton jButtonSplashKeypad9;
    private javax.swing.JButton jButtonSplashKeypadBack;
    private javax.swing.JButton jButtonSplashKeypadOK;
    private javax.swing.JButton jButtonSplashWelcomeBadminton;
    private javax.swing.JButton jButtonSplashWelcomeFitness;
    private javax.swing.JButton jButtonSplashWelcomeGolf;
    private javax.swing.JButton jButtonSplashWelcomeHandball;
    private javax.swing.JButton jButtonSplashWelcomeMountainBiking;
    private javax.swing.JButton jButtonSplashWelcomeNotYou;
    private javax.swing.JButton jButtonSplashWelcomeSwimming;
    private javax.swing.JButton jButtonSplashWelcomeTableTennis;
    private javax.swing.JButton jButtonSplashWelcomeTennis;
    private javax.swing.JButton jButtonSplashWelcomeVolleyball;
    private javax.swing.JButton jButtonTennisDatePickerDay1;
    private javax.swing.JButton jButtonTennisDatePickerDay2;
    private javax.swing.JButton jButtonTennisDatePickerDay3;
    private javax.swing.JButton jButtonTennisDatePickerDay4;
    private javax.swing.JButton jButtonTennisDatePickerDay5;
    private javax.swing.JButton jButtonTennisDatePickerDay6;
    private javax.swing.JButton jButtonTennisDatePickerDay7;
    private javax.swing.JButton jButtonTimePickerHour10;
    private javax.swing.JButton jButtonTimePickerHour11;
    private javax.swing.JButton jButtonTimePickerHour12;
    private javax.swing.JButton jButtonTimePickerHour13;
    private javax.swing.JButton jButtonTimePickerHour14;
    private javax.swing.JButton jButtonTimePickerHour15;
    private javax.swing.JButton jButtonTimePickerHour16;
    private javax.swing.JButton jButtonTimePickerHour17;
    private javax.swing.JButton jButtonTimePickerHour18;
    private javax.swing.JButton jButtonTimePickerHour19;
    private javax.swing.JButton jButtonTimePickerHour8;
    private javax.swing.JButton jButtonTimePickerHour9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSplashKeypad;
    private javax.swing.JLabel jLabelSplashWelcomeName;
    private javax.swing.JLabel jLabelSplashWelcomeWelcome;
    private javax.swing.JLabel jLabelSplashWelcomeWhat;
    private javax.swing.JLabel jLabelTimePickerHeader;
    private javax.swing.JLayeredPane jLayeredPaneSplash;
    private javax.swing.JLayeredPane jLayeredPaneTennis;
    private javax.swing.JLayeredPane jLayeredPaneTimePicker;
    private javax.swing.JPanel jPanelSplash;
    private javax.swing.JPanel jPanelSplashKeypad;
    private javax.swing.JPanel jPanelSplashWelcome;
    private javax.swing.JPanel jPanelTennisDatePicker;
    private javax.swing.JTextField jTextFieldSplashKeypadGuestID;
    // End of variables declaration//GEN-END:variables
}
