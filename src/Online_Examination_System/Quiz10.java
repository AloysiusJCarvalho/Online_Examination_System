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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author somdu
 */
public class Quiz10 extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst1, pst2, pst, pst3 = null;
    ResultSet rs = null;
    String total;
    String msg;
    
    

     /**
     * Creates new form 
     */
    public Quiz10() {
        initComponents();
                
    }
    
     public Quiz10(String msg,String msg1, String msg2)
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
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        stream = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(java.awt.Color.white);
        jRadioButton1.setText("stack pointer.");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(100, 180, 140, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(java.awt.Color.white);
        jRadioButton2.setText(" program counter.");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(330, 180, 139, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setForeground(java.awt.Color.white);
        jRadioButton3.setText(" both A and B.");
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(100, 230, 140, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setForeground(java.awt.Color.white);
        jRadioButton4.setText("none of these.");
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(330, 230, 140, 25);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("10. In 8085 name/names of the 16 bit registers is/are");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 90, 380, 19);

        jButton1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 11)); // NOI18N
        jButton1.setText("Submit Form");
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
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 330, 120, 40);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 310, 280, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Online_Examination_System/no_watermark.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 30, 560, 380);

        jPanel2.setBackground(new java.awt.Color(23, 35, 51));
        jPanel2.setLayout(null);

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Online Examinaion System");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(200, 10, 160, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Online_Examination_System/close (1).png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(520, 0, 24, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 560, 30);

        name.setText("jLabel6");
        jPanel1.add(name);
        name.setBounds(30, 190, 34, 14);

        rollno.setText("jLabel7");
        jPanel1.add(rollno);
        rollno.setBounds(30, 240, 34, 14);

        stream.setText("jLabel8");
        jPanel1.add(stream);
        stream.setBounds(30, 340, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:        
        try
        { 
            int marks10=0;
            if(jRadioButton2.isSelected())
            {
                marks10++;
            }
            con=DriverManager.getConnection("jdbc:mysql://localhost/java_project","root","");
            String sql ="INSERT INTO `points`(`marks`) VALUES(?)";
            pst=con.prepareStatement(sql);
            pst.setInt(1,marks10);
            pst.executeUpdate();
            String sql1 ="SELECT SUM(marks) FROM `points`";
            pst1=con.prepareStatement(sql1);
            rs=pst1.executeQuery();
            if(rs.next())
            {
                total = rs.getString("SUM(marks)");
                
            }
            String sql3 ="DELETE FROM `points`";
            pst3=con.prepareStatement(sql3);
            pst3.executeUpdate();
            ImageIcon suces = new ImageIcon("success.gif");
            ImageIcon score = new ImageIcon("score.png");
            String sql2 ="INSERT INTO `score`(`Name`, `RollNo`, `Stream`, `Score`) VALUES(? , ? , ? , ?)";
            pst2=con.prepareStatement(sql2);
            pst2.setString(1,name.getText() );
            pst2.setString(2,rollno.getText() );
            pst2.setString(3,stream.getText() );
            pst2.setString(4,total);
            pst2.executeUpdate();
            JOptionPane.showMessageDialog(this,"Your Response Has Been Recorded.","SUBMITTED",JOptionPane.INFORMATION_MESSAGE,suces);
            JOptionPane.showMessageDialog(null,"your score is " + total , "RESULT" ,JOptionPane.INFORMATION_MESSAGE,score);
            Instructions i = new Instructions();
            i.setVisible(true);
            dispose();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
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
            java.util.logging.Logger.getLogger(Quiz10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quiz10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quiz10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quiz10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quiz10().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel name;
    private javax.swing.JLabel rollno;
    private javax.swing.JLabel stream;
    // End of variables declaration//GEN-END:variables
}
