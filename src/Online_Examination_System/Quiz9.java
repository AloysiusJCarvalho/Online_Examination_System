/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Online_Examination_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author somdu
 */
public class Quiz9 extends javax.swing.JFrame {
        
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    /**
     * Creates new form questions
     */
    public Quiz9() {
        initComponents();
    }
    
     public Quiz9(String msg,String msg1,String msg2)
     {
        initComponents();

          name.setText(msg); 
          rollno.setText(msg1); 
          stream.setText(msg2); 
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
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        stream = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(562, 408));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("9. What is SIM?");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 90, 120, 19);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(java.awt.Color.white);
        jRadioButton1.setText("Select interrupt mask.");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(70, 170, 170, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(java.awt.Color.white);
        jRadioButton2.setText(" Sorting interrupt mask.");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(320, 170, 170, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setForeground(java.awt.Color.white);
        jRadioButton3.setText("Set interrupt mask.");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(70, 250, 160, 25);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setForeground(java.awt.Color.white);
        jRadioButton4.setText(" None of these. ");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(330, 250, 160, 25);

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 11)); // NOI18N
        jButton1.setText("Next>>");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 340, 110, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Online_Examination_System/no_watermark.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 40, 580, 370);

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));
        jPanel1.setLayout(null);

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Online Examnination System");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 10, 170, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Online_Examination_System/close (1).png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(530, 0, 30, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 40);

        name.setText("jLabel5");
        getContentPane().add(name);
        name.setBounds(30, 140, 34, 14);

        rollno.setText("jLabel5");
        getContentPane().add(rollno);
        rollno.setBounds(20, 270, 34, 14);

        stream.setText("jLabel5");
        getContentPane().add(stream);
        stream.setBounds(20, 340, 34, 14);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
                int marks9=0;
                String msg = name.getText();
                String msg1 = rollno.getText();
                String msg2 = stream.getText();
                if(jRadioButton3.isSelected())
                {
                    marks9++;
                    
                }
                String sql ="INSERT INTO `points`(`marks`) VALUES(?)";
                con=DriverManager.getConnection("jdbc:mysql://localhost/java_project","root","");
                pst=con.prepareStatement(sql);
                pst.setInt(1,marks9);
                pst.executeUpdate();
                new Quiz10(msg,msg1,msg2).setVisible(true);
                setVisible(false);
                dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
                
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel rollno;
    private javax.swing.JLabel stream;
    // End of variables declaration//GEN-END:variables
}
