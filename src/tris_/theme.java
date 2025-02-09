/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tris_;


import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author andrea
 */
public class theme extends javax.swing.JFrame {

    /**
     * Creates new form theme
     */
    public theme() {
        initComponents();
        setLocationRelativeTo(null);
        
        jPanel1.setBackground(new Color(0, 204, 255));
        try (FileWriter scrivi = new FileWriter("theme.txt")) {
                            scrivi.write("light");
                           // this.setVisible(false);
                            //new Verify().setVisible(true);
                            
                        } catch (IOException e) {

                        } 
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        light = new javax.swing.JButton();
        auto = new javax.swing.JButton();
        dark = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Tic Tac Toe Setup");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setText("3. Choose your app theme");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/next.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Your Email has been verified, now you");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 440, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("can choose an app theme");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 440, -1));

        light.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/lightselected.png"))); // NOI18N
        light.setContentAreaFilled(false);
        light.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightActionPerformed(evt);
            }
        });
        jPanel1.add(light, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 180));

        auto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/auto3.png"))); // NOI18N
        auto.setContentAreaFilled(false);
        auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoActionPerformed(evt);
            }
        });
        jPanel1.add(auto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 190, 180));

        dark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tris_/dark2.png"))); // NOI18N
        dark.setContentAreaFilled(false);
        dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darkActionPerformed(evt);
            }
        });
        jPanel1.add(dark, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 190, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new setupcomplete().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightActionPerformed
        // TODO add your handling code here:
        light.setIcon(new ImageIcon(getClass().getResource("lightselected.png")));
        dark.setIcon(new ImageIcon(getClass().getResource("dark2.png")));
        auto.setIcon(new ImageIcon(getClass().getResource("auto3.png")));
        jPanel1.setBackground(new Color(0, 204, 255));
        try (FileWriter scrivi = new FileWriter("theme.txt")) {
                            scrivi.write("light");
                           // this.setVisible(false);
                            //new Verify().setVisible(true);
                            
                        } catch (IOException e) {

                        } 
    }//GEN-LAST:event_lightActionPerformed

    private void darkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darkActionPerformed
        // TODO add your handling code here:
        light.setIcon(new ImageIcon(getClass().getResource("light2.png")));
        dark.setIcon(new ImageIcon(getClass().getResource("darkselected.png")));
        auto.setIcon(new ImageIcon(getClass().getResource("auto3.png")));
        jPanel1.setBackground(new Color(0, 153, 255 ));
        try (FileWriter scrivi = new FileWriter("theme.txt")) {
                            scrivi.write("dark");
                           // this.setVisible(false);
                            //new Verify().setVisible(true);
                            
                        } catch (IOException e) {

                        } 
    }//GEN-LAST:event_darkActionPerformed

    private void autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoActionPerformed
        // TODO add your handling code here:
        light.setIcon(new ImageIcon(getClass().getResource("light2.png")));
        dark.setIcon(new ImageIcon(getClass().getResource("dark2.png")));
        auto.setIcon(new ImageIcon(getClass().getResource("autoselected.png")));
        System.out.println("DEBUG: DARK MODE: " + Detector.isDarkMode());
        if (Detector.isDarkMode()==true) {
            jPanel1.setBackground(new Color(0, 153, 255 ));
        } else {
             jPanel1.setBackground(new Color(0, 204, 255));
        }
        try (FileWriter scrivi = new FileWriter("theme.txt")) {
                            scrivi.write("auto");
                           // this.setVisible(false);
                            //new Verify().setVisible(true);
                            
                        } catch (IOException e) {

                        } 
    }//GEN-LAST:event_autoActionPerformed

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
            java.util.logging.Logger.getLogger(theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(theme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new theme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton auto;
    private javax.swing.JButton dark;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton light;
    // End of variables declaration//GEN-END:variables
}
