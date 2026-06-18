/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.app.lostandfoundmanagementsystems.dashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import com.spring.app.lostandfoundmanagementsystems.DBConnection;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 *
 * @author ruth_
 */
public class Viewlostitem extends javax.swing.JFrame {
           public Viewlostitem() {
            initComponents();
           
       
    }
 private void loadLostItems() {

    try {

        Connection con = DBConnection.getConnection();

        String sql = "SELECT * FROM lost_items";

        PreparedStatement pst = con.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        DefaultTableModel model =
            (DefaultTableModel) tblLostItems.getModel();

        model.setRowCount(0);

        while(rs.next()) {

            model.addRow(new Object[]{
               
                rs.getString("item_name"),
                rs.getString("description"),
                rs.getString("location"),
                rs.getString("date_lost"),
                rs.getString("contact")
            });

        }

    } catch(Exception e) {

        System.out.println(e);

    }
 }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLostItems = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        tblLostItems.setBackground(new java.awt.Color(0, 153, 153));
        tblLostItems.setForeground(new java.awt.Color(255, 255, 255));
        tblLostItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Name", "Description", "Location", "Date Lost", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblLostItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLostItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLostItems);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 1250, 240));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 102, 102));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 90, -1, -1));
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 50, 150, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Search Item:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 150, 40));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("VIEW LOST ITEMS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ruth_\\OneDrive\\Desktop\\Project images\\images4.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Dashboard d = new Dashboard();
d.setVisible(true);

this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
try {

    Connection con = DBConnection.getConnection();
JOptionPane.showMessageDialog(this, txtSearch.getText());
    String sql = "SELECT * FROM lost_items WHERE item_name LIKE ?";

    PreparedStatement pst = con.prepareStatement(sql);

    pst.setString(1, "%" + txtSearch.getText() + "%");

    ResultSet rs = pst.executeQuery();

    DefaultTableModel model =
        (DefaultTableModel) tblLostItems.getModel();

    model.setRowCount(0);

    while(rs.next()) {
        System.out.println(rs.getString("item_name"));

        model.addRow(new Object[]{
           
            rs.getString("item_name"),
            rs.getString("description"),
            rs.getString("location"),
            rs.getString("date_lost"),
            rs.getString("contact"),
           
        });

    }

}
catch(Exception e) {

    JOptionPane.showMessageDialog(this, e.getMessage());

}        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblLostItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLostItemsMouseClicked
      
    }//GEN-LAST:event_tblLostItemsMouseClicked

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
            java.util.logging.Logger.getLogger(Viewlostitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewlostitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewlostitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewlostitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewlostitem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLostItems;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
