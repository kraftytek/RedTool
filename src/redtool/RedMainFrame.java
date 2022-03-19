/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redtool;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.HyperlinkEvent;

/**
 *
 * @author kraft
 */
public class RedMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form RedMainFrame
     */
    public RedMainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sfcButt = new javax.swing.JButton();
        chkButt = new javax.swing.JButton();
        dismButt = new javax.swing.JButton();
        bcdButt = new javax.swing.JButton();
        clrButt = new javax.swing.JButton();
        safeButt = new javax.swing.JButton();
        userButt = new javax.swing.JButton();
        restoreButt = new javax.swing.JButton();
        copyButt = new javax.swing.JButton();
        pwButt = new javax.swing.JButton();
        removeButt = new javax.swing.JButton();
        linksButt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        frontTxt = new javax.swing.JTextPane();

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
        chkButt.setText("Check Disc");
        chkButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        chkButt.setFocusable(false);
        chkButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkButtActionPerformed(evt);
            }
        });

        dismButt.setBackground(new java.awt.Color(0, 0, 0));
        dismButt.setForeground(new java.awt.Color(51, 255, 0));
        dismButt.setText("DISM");
        dismButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dismButt.setFocusable(false);
        dismButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismButtActionPerformed(evt);
            }
        });

        bcdButt.setBackground(new java.awt.Color(0, 0, 0));
        bcdButt.setForeground(new java.awt.Color(51, 255, 0));
        bcdButt.setText("Rebuild BCD");
        bcdButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bcdButt.setFocusable(false);
        bcdButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcdButtActionPerformed(evt);
            }
        });

        clrButt.setBackground(new java.awt.Color(0, 0, 0));
        clrButt.setForeground(new java.awt.Color(51, 255, 0));
        clrButt.setText("Clear");
        clrButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clrButt.setFocusable(false);
        clrButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrButtActionPerformed(evt);
            }
        });

        safeButt.setBackground(new java.awt.Color(0, 0, 0));
        safeButt.setForeground(new java.awt.Color(51, 255, 0));
        safeButt.setText("Safe Mode");
        safeButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        safeButt.setFocusable(false);
        safeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                safeButtActionPerformed(evt);
            }
        });

        userButt.setBackground(new java.awt.Color(0, 0, 0));
        userButt.setForeground(new java.awt.Color(51, 255, 0));
        userButt.setText("Add User");
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
        copyButt.setText("XCopy");
        copyButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        copyButt.setFocusable(false);
        copyButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtActionPerformed(evt);
            }
        });

        pwButt.setBackground(new java.awt.Color(0, 0, 0));
        pwButt.setForeground(new java.awt.Color(51, 255, 0));
        pwButt.setText("Remove PW expiry");
        pwButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pwButt.setFocusable(false);
        pwButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwButtActionPerformed(evt);
            }
        });

        removeButt.setBackground(new java.awt.Color(0, 0, 0));
        removeButt.setForeground(new java.awt.Color(51, 255, 0));
        removeButt.setText("Remove Dirrectory");
        removeButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeButt.setFocusable(false);
        removeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtActionPerformed(evt);
            }
        });

        linksButt.setBackground(new java.awt.Color(0, 0, 0));
        linksButt.setForeground(new java.awt.Color(51, 255, 0));
        linksButt.setText("Useful Links");
        linksButt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        linksButt.setFocusable(false);
        linksButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linksButtActionPerformed(evt);
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
        frontTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        frontTxt.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                frontTxtHyperlinkUpdate(evt);
            }
        });
        jScrollPane2.setViewportView(frontTxt);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bcdButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dismButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sfcButt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(safeButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restoreButt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(copyButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clrButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linksButt, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sfcButt)
                    .addComponent(clrButt)
                    .addComponent(safeButt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkButt)
                    .addComponent(userButt)
                    .addComponent(pwButt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dismButt)
                    .addComponent(restoreButt)
                    .addComponent(removeButt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcdButt)
                    .addComponent(copyButt)
                    .addComponent(linksButt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void sfcButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfcButtActionPerformed
        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command ***<br><br>for online:<br><br> sfc /scannow"
                + "<br><br>for offline:<br><br> sfc /scannow /offwindir=C:\\windows /offbootdir=C:\\<p/>");
    }//GEN-LAST:event_sfcButtActionPerformed

    private void chkButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkButtActionPerformed

        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command ***<br><br> chkdsk C: /f /r</p>");
    }//GEN-LAST:event_chkButtActionPerformed

    private void dismButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismButtActionPerformed

        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command ***<br><br> dism /online /cleanup-image /restorehealth</p>");
    }//GEN-LAST:event_dismButtActionPerformed

    private void bcdButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcdButtActionPerformed

        String buildMsg = "<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command ***<br>"
                + "<br> - diskpart"
                + "<br> - list vol"
                + "<br> - sel vol <hidden efi volume>"
                + "<br> - assign letter T"
                + "<br> - exit"
                + "<br> - T:"
                + "<br> - cd efi/microsoft/boot"
                + "<br> - ren BCD BCD.old"
                + "<br> - bcdboot C:\\windows /l en-us /s T:all</p>";

        frontTxt.setText(buildMsg);
    }//GEN-LAST:event_bcdButtActionPerformed

    private void clrButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrButtActionPerformed
        frontTxt.setText("");
    }//GEN-LAST:event_clrButtActionPerformed

    private void safeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_safeButtActionPerformed

        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br> bcdedit /set {default} safeboot network</p>");
    }//GEN-LAST:event_safeButtActionPerformed

    private void userButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userButtActionPerformed

        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br> net user {username} {password} /add</p>");
    }//GEN-LAST:event_userButtActionPerformed

    private void linksButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linksButtActionPerformed

        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** Useful Links ***<br>"
                + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.malwarebytes.com/mwb-download/thankyou\">MalwareBytes</a>"
                + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.guru3d.com/files-details/display-driver-uninstaller-download.html\">DDU</a>"
                + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.adlice.com/roguekiller/#alt_download\">RogueKiller</a>"
                + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.hdsentinel.com/download.php\">HDD Sentinel</a>"
                + "<br><a  style=color:rgb(51,255,0);font-family:verdana; href=\"https://www.magicaljellybean.com/keyfinder/\">Magic Jellybean Key Finder</a></p>");
    }//GEN-LAST:event_linksButtActionPerformed

    private void restoreButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreButtActionPerformed
        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br>net start vss"
                + "<br><br>rstrui.exe /offline:C:\\windows=active</p>");
    }//GEN-LAST:event_restoreButtActionPerformed

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

    private void copyButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtActionPerformed
        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br>cmd /c \\Xcopy {source} {destination} /s /i /y /e /h /c  >Report.txt 2>ErrorReport.err</p>");
        
               
    }//GEN-LAST:event_copyButtActionPerformed

    private void pwButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwButtActionPerformed
        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br>wmic useraccount where Name='username' SET PasswordExpires=FALSE</p>");
    }//GEN-LAST:event_pwButtActionPerformed

    private void removeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtActionPerformed
        frontTxt.setText("<p style=color:rgb(51,255,0);font-family:verdana;>*** The requested command is ***<br><br>rmdir {dirrectory} /s /q</p>");        
    }//GEN-LAST:event_removeButtActionPerformed

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
    private javax.swing.JButton clrButt;
    private javax.swing.JButton copyButt;
    private javax.swing.JButton dismButt;
    private javax.swing.JTextPane frontTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton linksButt;
    private javax.swing.JButton pwButt;
    private javax.swing.JButton removeButt;
    private javax.swing.JButton restoreButt;
    private javax.swing.JButton safeButt;
    private javax.swing.JButton sfcButt;
    private javax.swing.JButton userButt;
    // End of variables declaration//GEN-END:variables
}
