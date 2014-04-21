/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import domain.FacilityControllerIF;
import javax.swing.JOptionPane;

/**
 *
 * @author Phill
 */
public class FacilityGui extends javax.swing.JFrame {

    FacilityControllerIF control;
    /**
     * Creates new form FacilityGui
     */
    public FacilityGui(FacilityControllerIF c) {
        initComponents();
        control = c;
        jPanelSplashKeypad.setVisible(true);
        jPanelSplashWelcome.setVisible(false);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanelSplashKeypad.setPreferredSize(new java.awt.Dimension(515, 100));

        jButtonSplashKeypad7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad7.setText("7");
        jButtonSplashKeypad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad7ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad8.setText("8");
        jButtonSplashKeypad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad8ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad9.setText("9");
        jButtonSplashKeypad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad9ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad4.setText("4");
        jButtonSplashKeypad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad4ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad1.setText("1");
        jButtonSplashKeypad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad1ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad5.setText("5");
        jButtonSplashKeypad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad5ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad2.setText("2");
        jButtonSplashKeypad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad2ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad6.setText("6");
        jButtonSplashKeypad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad6ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad3.setText("3");
        jButtonSplashKeypad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad3ActionPerformed(evt);
            }
        });

        jButtonSplashKeypad0.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypad0.setText("0");
        jButtonSplashKeypad0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypad0ActionPerformed(evt);
            }
        });

        jButtonSplashKeypadBack.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypadBack.setText("<-");
        jButtonSplashKeypadBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypadBackActionPerformed(evt);
            }
        });

        jButtonSplashKeypadOK.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButtonSplashKeypadOK.setText("OK");
        jButtonSplashKeypadOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashKeypadOKActionPerformed(evt);
            }
        });

        jTextFieldSplashKeypadGuestID.setFocusable(false);
        jTextFieldSplashKeypadGuestID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
                .addGap(120, 120, 120)
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
        jButtonSplashWelcomeNotYou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSplashWelcomeNotYouActionPerformed(evt);
            }
        });

        jButtonSplashWelcomeTennis.setText("Tennis");
        jButtonSplashWelcomeTennis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPaneSplash, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLayeredPaneTennis, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSplashKeypadGuestIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSplashKeypadGuestIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSplashKeypadGuestIDActionPerformed

    private void jButtonSplashWelcomeTennisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSplashWelcomeTennisActionPerformed
        // TODO add your handling code here:
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

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabelSplashKeypad;
    private javax.swing.JLabel jLabelSplashWelcomeName;
    private javax.swing.JLabel jLabelSplashWelcomeWelcome;
    private javax.swing.JLabel jLabelSplashWelcomeWhat;
    private javax.swing.JLayeredPane jLayeredPaneSplash;
    private javax.swing.JLayeredPane jLayeredPaneTennis;
    private javax.swing.JPanel jPanelSplash;
    private javax.swing.JPanel jPanelSplashKeypad;
    private javax.swing.JPanel jPanelSplashWelcome;
    private javax.swing.JTextField jTextFieldSplashKeypadGuestID;
    // End of variables declaration//GEN-END:variables
}
