/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainrestaurant.view;

import edu.sit.cs.db.CSDbDelegate;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import mainrestaurant.control.RevenueController;
import mainrestaurant.model.DBMethod;
import mainrestaurant.model.RevenueModel;

/**
 *
 * @author ngunngun
 */
public class Revenue extends javax.swing.JFrame {

    JFrame test;
    DefaultTableModel model;
    
    private RevenueController controler = new RevenueController();
    /**
     * Creates new form Revenue
     */
    public Revenue() {
        initComponents();
        setTableSize();
        model = (DefaultTableModel) tblRevenue.getModel();
    }

    public void setJFrame(JFrame f) {
        test = f;
    }

    public JFrame getJFrame() {
        return this.test;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRevenue = new javax.swing.JTable();
        btnShowAll = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel1.setText("REVENUE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        btnOrder.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnOrder.setForeground(java.awt.Color.red);
        btnOrder.setText("ORDER");
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderMouseClicked(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        btnBill.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnBill.setForeground(java.awt.Color.red);
        btnBill.setText("BILLING");
        btnBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBillMouseClicked(evt);
            }
        });
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });
        getContentPane().add(btnBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        btnReserve.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnReserve.setForeground(java.awt.Color.red);
        btnReserve.setText("RESERVATION");
        btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReserveMouseClicked(evt);
            }
        });
        getContentPane().add(btnReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        tblRevenue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Date&Time", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRevenue);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 98, -1, -1));

        btnShowAll.setFont(new java.awt.Font("Thonburi", 0, 13)); // NOI18N
        btnShowAll.setText("Show an income");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel3.setText("Total :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, -1, -1));

        lbTotal.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        lbTotal.setText("...........");
        getContentPane().add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, -1, -1));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel5.setText("Baht");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));

        btnReset.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        btnReset.setText("RESET!!!");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/increase-revenue-icon-increase-revenue.jpg.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 120, 110));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/4chef.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 320, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/BackgroundCookingFoodRevenue.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 790, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseClicked
        btnOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Order od = new Order();
                od.setJFrame(od);
                od.getJFrame().setVisible(true);
                getJFrame().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnOrderMouseClicked

    private void btnBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillMouseClicked
        btnBill.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Billing b1 = new Billing();
                b1.setJFrame(b1);
                b1.getJFrame().setVisible(true);
                getJFrame().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnBillMouseClicked

    private void btnReserveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReserveMouseClicked
        btnReserve.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Reservation rs = new Reservation();
                rs.setJFrame(rs);
                rs.getJFrame().setVisible(true);
                getJFrame().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnReserveMouseClicked

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        controler.showDefaultTotal(model, lbTotal);
        ArrayList<RevenueModel> total = controler.getAllBill();
        controler.showRevenueList(model, lbTotal, total);

    }//GEN-LAST:event_btnShowAllActionPerformed
    
    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        controler.setNewRevenue(model, lbTotal);
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBillActionPerformed
    
    private void setTableSize() {
        tblRevenue.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblRevenue.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblRevenue.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblRevenue.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        tblRevenue.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblRevenue.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblRevenue.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
    }

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
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Revenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Revenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tblRevenue;
    // End of variables declaration//GEN-END:variables

}
