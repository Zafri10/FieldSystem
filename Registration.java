/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fieldSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lightness kabajunes
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form registration
     */
    public Registration() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        district = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        RegNo = new javax.swing.JTextField();
        org = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        region = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        password1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 0, 466);

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setForeground(new java.awt.Color(255, 204, 204));

        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setText("HELLO STUDENT! WELCOME IN FIELD MANAGEMENT SYSTEM. HERE YOU CAN MAKE REGISRTATION");

        jLabel2.setForeground(new java.awt.Color(255, 204, 204));
        jLabel2.setText("REGISTER NOW");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 10, 640, 120);

        jPanel3.setBackground(new java.awt.Color(255, 153, 255));
        jPanel3.setLayout(null);

        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("FULL NAME                    :");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 20, 160, 49);

        district.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtActionPerformed(evt);
            }
        });
        jPanel3.add(district);
        district.setBounds(190, 300, 152, 49);

        jLabel4.setText("PHONE NO                      :");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(20, 380, 128, 44);

        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });
        jPanel3.add(FullName);
        FullName.setBounds(190, 10, 152, 49);

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel3.add(phone);
        phone.setBounds(190, 370, 152, 49);

        jLabel5.setText("DISTRICT                         :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 290, 128, 44);

        btnRegister.setBackground(new java.awt.Color(51, 0, 51));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel3.add(btnRegister);
        btnRegister.setBounds(500, 470, 120, 50);

        jLabel6.setText("REG NO                           :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 90, 128, 44);

        RegNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegNoActionPerformed(evt);
            }
        });
        jPanel3.add(RegNo);
        RegNo.setBounds(190, 90, 152, 49);

        org.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgActionPerformed(evt);
            }
        });
        jPanel3.add(org);
        org.setBounds(190, 160, 152, 49);

        jLabel7.setText("ORGANISATION/COMPANY:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 160, 140, 44);

        jLabel8.setText("REGION                          :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(20, 230, 128, 44);

        region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionActionPerformed(evt);
            }
        });
        jPanel3.add(region);
        region.setBounds(190, 230, 152, 49);

        jLabel9.setText("PASSWORD                    :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 450, 128, 44);

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        jPanel3.add(password1);
        password1.setBounds(190, 450, 152, 49);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 130, 640, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void districtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_districtActionPerformed

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        Connection con;
        PreparedStatement pst;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/fieldsystem","root","");
            String sql="INSERT INTO Student(RegNo,FullName,Password,Organization,Region,District,phone) VALUES(?,?,?,?,?,?,?)";
            pst=con.prepareStatement(sql);
            pst.setString(1,RegNo.getText() );
            pst.setString(2,FullName.getText() );
            pst.setString(3,password1.getText() );
            pst.setString(4,org.getText() );
            pst.setString(5,region.getText() );
            pst.setString(6,district.getText() );
             pst.setString(7,phone.getText() );
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"REGISTERED SUCESSFULLY");
            Loginpage lgn=new Loginpage();
            lgn.setVisible(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void RegNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegNoActionPerformed

    private void orgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgActionPerformed

    private void regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField RegNo;
    private javax.swing.JButton btnRegister;
    private javax.swing.JTextField district;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField org;
    private javax.swing.JTextField password1;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField region;
    // End of variables declaration//GEN-END:variables
}
