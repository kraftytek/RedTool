/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redtool;

import java.awt.Desktop;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.HyperlinkEvent;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author kraft & esans
 */
public class RedMainFrame extends javax.swing.JFrame {
    Desktop desktop = Desktop.getDesktop();
    /**
     * Creates new form RedMainFrame
     */
    public RedMainFrame() {
        initComponents();
        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** Useful Links ***"
            + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.malwarebytes.com/mwb-download/thankyou\">MalwareBytes</a>"
            + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.guru3d.com/files-details/display-driver-uninstaller-download.html\">DDU</a>"
            + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.adlice.com/roguekiller/#alt_download\">RogueKiller</a>"
            + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.hdsentinel.com/download.php\">HDD Sentinel</a>"
            + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.magicaljellybean.com/keyfinder/\">Magic Jellybean Key Finder</a></p>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sfcButt = new javax.swing.JButton();
        chkButt = new javax.swing.JButton();
        dismButt = new javax.swing.JButton();
        bcdButt = new javax.swing.JButton();
        safeButt = new javax.swing.JButton();
        userButt = new javax.swing.JButton();
        restoreButt = new javax.swing.JButton();
        copyButt = new javax.swing.JButton();
        pwButt = new javax.swing.JButton();
        removeButt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        frontTxt = new javax.swing.JTextPane();
        gitKraftButt = new javax.swing.JButton();
        gitEsansButt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Windows CMD Commands");

        sfcButt.setBackground(new java.awt.Color(0, 0, 0));
        sfcButt.setForeground(new java.awt.Color(51, 255, 0));
        sfcButt.setText("System File Check");
        sfcButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sfcButt.setFocusable(false);
        sfcButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfcButtActionPerformed(evt);
            }
        });

        chkButt.setBackground(new java.awt.Color(0, 0, 0));
        chkButt.setForeground(new java.awt.Color(51, 255, 0));
        chkButt.setText("Disck Error Check");
        chkButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkButt.setFocusable(false);
        chkButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkButtActionPerformed(evt);
            }
        });

        dismButt.setBackground(new java.awt.Color(0, 0, 0));
        dismButt.setForeground(new java.awt.Color(51, 255, 0));
        dismButt.setText("Disk Image Check");
        dismButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dismButt.setFocusable(false);
        dismButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismButtActionPerformed(evt);
            }
        });

        bcdButt.setBackground(new java.awt.Color(0, 0, 0));
        bcdButt.setForeground(new java.awt.Color(51, 255, 0));
        bcdButt.setText("Rebuild Boot Config Data");
        bcdButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bcdButt.setFocusable(false);
        bcdButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcdButtActionPerformed(evt);
            }
        });

        safeButt.setBackground(new java.awt.Color(0, 0, 0));
        safeButt.setForeground(new java.awt.Color(51, 255, 0));
        safeButt.setText("Reboot In Safe Mode");
        safeButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        safeButt.setFocusable(false);
        safeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                safeButtActionPerformed(evt);
            }
        });

        userButt.setBackground(new java.awt.Color(0, 0, 0));
        userButt.setForeground(new java.awt.Color(51, 255, 0));
        userButt.setText("Add User As Admin");
        userButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userButt.setFocusable(false);
        userButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtActionPerformed(evt);
            }
        });

        restoreButt.setBackground(new java.awt.Color(0, 0, 0));
        restoreButt.setForeground(new java.awt.Color(51, 255, 0));
        restoreButt.setText("System Restore");
        restoreButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        restoreButt.setFocusable(false);
        restoreButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreButtActionPerformed(evt);
            }
        });

        copyButt.setBackground(new java.awt.Color(0, 0, 0));
        copyButt.setForeground(new java.awt.Color(51, 255, 0));
        copyButt.setText("Copy Directory");
        copyButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        copyButt.setFocusable(false);
        copyButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtActionPerformed(evt);
            }
        });

        pwButt.setBackground(new java.awt.Color(0, 0, 0));
        pwButt.setForeground(new java.awt.Color(51, 255, 0));
        pwButt.setText("Remove PW Expiry");
        pwButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pwButt.setFocusable(false);
        pwButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwButtActionPerformed(evt);
            }
        });

        removeButt.setBackground(new java.awt.Color(0, 0, 0));
        removeButt.setForeground(new java.awt.Color(51, 255, 0));
        removeButt.setText("Remove Directory");
        removeButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeButt.setFocusable(false);
        removeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(51, 204, 0));
        jScrollPane2.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N

        frontTxt.setEditable(false);
        frontTxt.setBackground(new java.awt.Color(0, 0, 0));
        frontTxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        frontTxt.setContentType("text/html"); // NOI18N
        frontTxt.setFont(new java.awt.Font("Inter", 1, 10)); // NOI18N
        frontTxt.setForeground(new java.awt.Color(51, 255, 0));
        frontTxt.setText("<html><head></head><body><pre></pre></body></html>");
        frontTxt.setToolTipText("");
        frontTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        frontTxt.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                frontTxtHyperlinkUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(frontTxt);

        gitKraftButt.setBackground(new java.awt.Color(0, 0, 0));
        gitKraftButt.setForeground(new java.awt.Color(0, 255, 0));
        gitKraftButt.setText("https://github.com/kraftytek");
        gitKraftButt.setToolTipText("Click me.");
        gitKraftButt.setBorder(null);
        gitKraftButt.setBorderPainted(false);
        gitKraftButt.setContentAreaFilled(false);
        gitKraftButt.setFocusable(false);
        gitKraftButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gitKraftButtActionPerformed(evt);
            }
        });

        gitEsansButt.setBackground(new java.awt.Color(0, 0, 0));
        gitEsansButt.setForeground(new java.awt.Color(0, 255, 0));
        gitEsansButt.setText("https://github.com/esanscoopsers");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                                    .addGap(81, 81, 81))
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(copyButt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userButt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(removeButt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(pwButt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(sfcButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(restoreButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(chkButt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bcdButt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dismButt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(safeButt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(gitKraftButt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gitEsansButt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sfcButt)
                    .addComponent(chkButt)
                    .addComponent(dismButt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restoreButt)
                    .addComponent(bcdButt)
                    .addComponent(safeButt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userButt)
                    .addComponent(pwButt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(copyButt)
                    .addComponent(removeButt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gitKraftButt)
                    .addComponent(gitEsansButt))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gitKraftButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gitKraftButtActionPerformed
        URI getLink = null;
        try {
            getLink = new URI("https://github.com/kraftytek");
        } catch (URISyntaxException ex) {
            Logger.getLogger(RedMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            java.awt.Desktop.getDesktop().browse(getLink);
        } catch (IOException ex) {
            Logger.getLogger(RedMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gitKraftButtActionPerformed
    
    private void frontTxtHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_frontTxtHyperlinkUpdate

        if (evt.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(evt.getURL().toURI());
                } catch (URISyntaxException ex) {
                    Logger.getLogger(RedMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(RedMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_frontTxtHyperlinkUpdate

    private void removeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtActionPerformed
        try{
            desktop.open(new File("res/batch/Remove Directory.bat"));
        }catch(IOException e){};
        //frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br>rmdir {dirrectory} /s /q</p>");
    }//GEN-LAST:event_removeButtActionPerformed

    private void pwButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwButtActionPerformed
        try{
            desktop.open(new File("res/batch/Remove PW Expiry.bat"));
        }catch(IOException e){};
        //        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br>wmic useraccount where Name='username' SET PasswordExpires=FALSE</p>");
    }//GEN-LAST:event_pwButtActionPerformed

    private void copyButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtActionPerformed
        try{
            desktop.open(new File("res/batch/XCopy.bat"));
        }catch(IOException e){};
        //frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br>cmd /c \\Xcopy {source} {destination} /s /i /y /e /h /c  >Report.txt 2>ErrorReport.err</p>");

    }//GEN-LAST:event_copyButtActionPerformed

    private void restoreButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreButtActionPerformed
        try{
            desktop.open(new File("res/batch/System Restore.bat"));
        }catch(IOException e){};
        //        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br>net start vss"
            //                + "<br><br>rstrui.exe /offline:C:\\windows=active</p>");
    }//GEN-LAST:event_restoreButtActionPerformed

    private void userButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtActionPerformed
        try{
            desktop.open(new File("res/batch/Add User.bat"));
        }catch(IOException e){};
        //frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br> net user {username} {password} /add</p>");
    }//GEN-LAST:event_userButtActionPerformed

    private void safeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_safeButtActionPerformed
        try{
            desktop.open(new File("res/batch/Safe Mode.bat"));
        }catch(IOException e){};
        //        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br> bcdedit /set {default} safeboot network</p>");
    }//GEN-LAST:event_safeButtActionPerformed

    private void bcdButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcdButtActionPerformed
        try{
            desktop.open(new File("res/batch/Rebuild BCD.bat"));
        }catch(IOException e){};
        //        String buildMsg = "<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command ***<br>"
        //                + "<br> - diskpart"
        //                + "<br> - list vol"
        //                + "<br> - sel vol <hidden efi volume>"
        //                + "<br> - assign letter T"
        //                + "<br> - exit"
        //                + "<br> - T:"
        //                + "<br> - cd efi/microsoft/boot"
        //                + "<br> - ren BCD BCD.old"
        //                + "<br> - bcdboot C:\\windows /l en-us /s T:all</p>";
        //        frontTxt.setText(buildMsg);
    }//GEN-LAST:event_bcdButtActionPerformed

    private void dismButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismButtActionPerformed
        try{
            desktop.open(new File("res/batch/DISM.bat"));
        }catch(IOException e){};
        //        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command ***<br><br> dism /online /cleanup-image /restorehealth</p>");
    }//GEN-LAST:event_dismButtActionPerformed

    private void chkButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkButtActionPerformed
        try{
            desktop.open(new File("res/batch/Check Disk.bat"));
        }catch(IOException e){};
        //        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command ***<br><br> chkdsk C: /f /r</p>");
    }//GEN-LAST:event_chkButtActionPerformed

    private void sfcButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfcButtActionPerformed
        try{
            desktop.open(new File("res/batch/System File Check.bat"));
        }catch(IOException e){};
        //        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command ***<br><br>for online:<br><br> sfc /scannow"
            //                + "<br><br>for offline:<br><br> sfc /scannow /offwindir=C:\\windows /offbootdir=C:\\<p/>");
    }//GEN-LAST:event_sfcButtActionPerformed
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
            java.util.logging.Logger.getLogger(RedMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcdButt;
    private javax.swing.JButton chkButt;
    private javax.swing.JButton copyButt;
    private javax.swing.JButton dismButt;
    private javax.swing.JTextPane frontTxt;
    private javax.swing.JButton gitEsansButt;
    private javax.swing.JButton gitKraftButt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pwButt;
    private javax.swing.JButton removeButt;
    private javax.swing.JButton restoreButt;
    private javax.swing.JButton safeButt;
    private javax.swing.JButton sfcButt;
    private javax.swing.JButton userButt;
    // End of variables declaration//GEN-END:variables
}
