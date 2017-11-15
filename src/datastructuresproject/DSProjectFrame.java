/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructuresproject;

import static com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDLoader.LOCALE;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.Timer;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;

/**
 *
 * @author Somnath
 */
public class DSProjectFrame extends javax.swing.JFrame implements ActionListener{
    
    private LocalTime lt = LocalTime.now();
    private final Calendar c = Calendar.getInstance(Locale.US);
    private File outputNotes = new File("src/datastructuresproject/notesHistory.txt");
    private int xMouse, yMouse;
    /**
     * Creates new form DSProjectFrame
     */
    public DSProjectFrame() {
        initComponents(); 
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(54,97,106)));
        startTimer();
        buttonGroup1.add(AMButton);
        buttonGroup1.add(PMButton);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titleImageLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        dragLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        medPanel = new javax.swing.JPanel();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        medSubmissionPanel = new javax.swing.JPanel();
        medicationField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        medsToTakeSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        medsTotalSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        hourSpinner = new javax.swing.JSpinner();
        minuteSpinner = new javax.swing.JSpinner();
        PMButton = new javax.swing.JRadioButton();
        AMButton = new javax.swing.JRadioButton();
        medSubmissionButton = new javax.swing.JButton();
        notesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        notesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesText = new javax.swing.JTextArea();
        addedNotif = new javax.swing.JLabel();
        historyPanel = new javax.swing.JPanel();
        historyButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyLabel = new javax.swing.JTextArea();
        dLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyMed Premium");
        setBackground(new java.awt.Color(255, 153, 51));
        setForeground(java.awt.Color.yellow);
        setUndecorated(true);
        setResizable(false);

        titleImageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datastructuresproject/myMedPremium.png"))); // NOI18N
        titleImageLabel.setToolTipText("My Med is an organization devoted to be the best in medication reminders");
        titleImageLabel.setOpaque(true);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(29, 96, 103));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.setOpaque(true);

        timeLabel.setFont(new java.awt.Font("Arial Unicode MS", 1, 36)); // NOI18N
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("Loading Time...");

        dateLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("Loading Date...");
        dateLabel.setToolTipText("");
        dateLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        medSubmissionPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        medicationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicationFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Medication:");

        jLabel3.setText("Tablets / Pills to take:");

        jLabel4.setText("Tablets / Pills total:");

        jLabel5.setText("Time of Day: ");

        hourSpinner.setModel(new javax.swing.SpinnerNumberModel(12, 1, 12, 1));

        minuteSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 45, 15));

        PMButton.setText("PM");

        AMButton.setSelected(true);
        AMButton.setText("AM");
        AMButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMButtonActionPerformed(evt);
            }
        });

        medSubmissionButton.setText("Submit Medication");

        javax.swing.GroupLayout medSubmissionPanelLayout = new javax.swing.GroupLayout(medSubmissionPanel);
        medSubmissionPanel.setLayout(medSubmissionPanelLayout);
        medSubmissionPanelLayout.setHorizontalGroup(
            medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(medSubmissionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                            .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(medicationField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(medsToTakeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(medsTotalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(hourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(minuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PMButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        medSubmissionPanelLayout.setVerticalGroup(
            medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                        .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(medsToTakeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(medsTotalSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(medSubmissionPanelLayout.createSequentialGroup()
                        .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(medSubmissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuteSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PMButton)
                    .addComponent(AMButton)
                    .addComponent(medSubmissionButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout medPanelLayout = new javax.swing.GroupLayout(medPanel);
        medPanel.setLayout(medPanelLayout);
        medPanelLayout.setHorizontalGroup(
            medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPanelLayout.createSequentialGroup()
                        .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(medSubmissionPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        medPanelLayout.setVerticalGroup(
            medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPanelLayout.createSequentialGroup()
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medSubmissionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Medications", medPanel);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 29, 26));
        jLabel1.setText("How are you feeling?");

        notesButton.setBackground(new java.awt.Color(21, 38, 42));
        notesButton.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        notesButton.setForeground(new java.awt.Color(21, 38, 42));
        notesButton.setText("Add to notes");
        notesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notesButtonActionPerformed(evt);
            }
        });

        notesText.setColumns(20);
        notesText.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        notesText.setForeground(new java.awt.Color(21, 38, 42));
        notesText.setRows(5);
        notesText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        notesText.setMargin(new java.awt.Insets(3, 8, 3, 8));
        jScrollPane1.setViewportView(notesText);

        addedNotif.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        addedNotif.setForeground(new java.awt.Color(238, 238, 238));
        addedNotif.setText("Added to your notes");
        addedNotif.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                addedNotifComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout notesPanelLayout = new javax.swing.GroupLayout(notesPanel);
        notesPanel.setLayout(notesPanelLayout);
        notesPanelLayout.setHorizontalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesPanelLayout.createSequentialGroup()
                .addGroup(notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notesPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(notesPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(addedNotif))
                    .addGroup(notesPanelLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(notesPanelLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(notesButton)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        notesPanelLayout.setVerticalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notesButton)
                .addGap(18, 18, 18)
                .addComponent(addedNotif)
                .addGap(42, 42, 42))
        );

        jTabbedPane1.addTab("Notes", notesPanel);

        historyButton.setBackground(new java.awt.Color(21, 38, 42));
        historyButton.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        historyButton.setForeground(new java.awt.Color(21, 38, 42));
        historyButton.setText("Refresh History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        historyLabel.setEditable(false);
        historyLabel.setColumns(20);
        historyLabel.setRows(5);
        jScrollPane2.setViewportView(historyLabel);

        javax.swing.GroupLayout historyPanelLayout = new javax.swing.GroupLayout(historyPanel);
        historyPanel.setLayout(historyPanelLayout);
        historyPanelLayout.setHorizontalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        historyPanelLayout.setVerticalGroup(
            historyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(historyButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("History", historyPanel);

        dLabel.setBackground(new java.awt.Color(0, 102, 102));
        dLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dLabel.setAlignmentY(0.0F);
        dLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        dLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dLabel.setIconTextGap(0);
        dLabel.setInheritsPopupMenu(false);
        dLabel.setOpaque(true);
        dLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dLabelMouseDragged(evt);
            }
        });
        dLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dLabelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(dLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dragLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleImageLabel)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dragLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(dLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void notesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notesButtonActionPerformed
        // TODO add your handling code here:
        if(!notesText.getText().trim().isEmpty())
        {
   PrintWriter output = null;
        try {
            output = new  PrintWriter(new FileOutputStream(outputNotes, true));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DSProjectFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    output.println("\""+notesText.getText()+"\"   ~"+ c.get(Calendar.MONTH)+"/"+c.get(Calendar.DAY_OF_MONTH)+ "/"+c.get(Calendar.YEAR)+" at "+timeLabel.getText());
notesText.setText("");
    output.close();
    addedNotif.setForeground(new java.awt.Color(54, 97, 106));
 

        }
    }//GEN-LAST:event_notesButtonActionPerformed

    private void addedNotifComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_addedNotifComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_addedNotifComponentHidden

    private void dLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dLabelMouseClicked

    private void dLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dLabelMouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_dLabelMouseDragged

    private void dLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dLabelMousePressed
       xMouse = evt.getX();
        yMouse = evt.getY();      
    }//GEN-LAST:event_dLabelMousePressed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
         try {
             String line = null, hist = "";
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(outputNotes);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                
                hist += "\n - "+line;
          
            }   
if(!hist.equalsIgnoreCase(historyLabel.getText()))
    historyLabel.setText(hist);
    
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                outputNotes + "'");                
        }
         catch (IOException ex1)
         {
             ex1.printStackTrace();
         }
    }//GEN-LAST:event_historyButtonActionPerformed

    private void medicationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicationFieldActionPerformed

    private void AMButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AMButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DSProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSProjectFrame().setVisible(true);
               
            }
        });
    
        /* We can put stuff below here */
     
    }
    public void startTimer()
    {
          Timer t = new Timer(1000, this);
          t.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        lt = LocalTime.now();
      String minAppend = "";
      String minColon = ":";
      if(lt.getMinute()<10)
    minAppend = "0";
      if(lt.getSecond()%2 == 0)
          minColon = " ";
 
      
         if(lt.getHour()>12)
         {
            timeLabel.setText(lt.getHour()-12 + minColon+ minAppend+lt.getMinute() +" PM");
            }
         else if(lt.getHour() == 12)
         {
           timeLabel.setText(lt.getHour() + minColon+ minAppend+lt.getMinute() + " PM");
             }
         else
         {
           timeLabel.setText(lt.getHour() + minColon+minAppend+lt.getMinute()+" AM");
         }
         
         dateLabel.setText((c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.DAY_OF_MONTH) + "/"+c.get(Calendar.YEAR));
       //  timeLabel.setText(timeLabel.getText() + " " + Calendar)
          repaint();
    }
         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AMButton;
    private javax.swing.JRadioButton PMButton;
    private javax.swing.JLabel addedNotif;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dragLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JTextArea historyLabel;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JSpinner hourSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel medPanel;
    private javax.swing.JButton medSubmissionButton;
    private javax.swing.JPanel medSubmissionPanel;
    private javax.swing.JTextField medicationField;
    private javax.swing.JSpinner medsToTakeSpinner;
    private javax.swing.JSpinner medsTotalSpinner;
    private javax.swing.JSpinner minuteSpinner;
    private javax.swing.JButton notesButton;
    private javax.swing.JPanel notesPanel;
    private javax.swing.JTextArea notesText;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel titleImageLabel;
    // End of variables declaration//GEN-END:variables
}
