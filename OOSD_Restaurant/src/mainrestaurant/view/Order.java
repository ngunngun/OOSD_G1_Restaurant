/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainrestaurant.view;

import mainrestaurant.view.Reservation;
import mainrestaurant.view.Revenue;
import edu.sit.cs.db.CSDbDelegate;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import mainrestaurant.control.OrderController;
import mainrestaurant.model.TableModel;

/**
 *
 * @author ngunngun
 */
public class Order extends javax.swing.JFrame {

    JFrame test;
    DefaultTableModel model;
    
    private OrderController controller = new OrderController();

    /**
     * Creates new form Main
     */
    public Order() {
        initComponents();
        setTableSize();
        model = (DefaultTableModel) tblOrder.getModel();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnBill = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        btnRevenue = new javax.swing.JButton();
        cbbMenu = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        spnAmount = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbbTable = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnPop = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel1.setText("ORDER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        tblOrder.setFont(new java.awt.Font("Thonburi", 0, 12)); // NOI18N
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Order", "Amount", "TableNum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 450, 177));

        btnBill.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnBill.setForeground(java.awt.Color.red);
        btnBill.setText("BILLING");
        btnBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBillMouseClicked(evt);
            }
        });
        getContentPane().add(btnBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 325, -1, -1));

        btnReserve.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnReserve.setForeground(java.awt.Color.red);
        btnReserve.setText("RESERVATION");
        btnReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReserveMouseClicked(evt);
            }
        });
        getContentPane().add(btnReserve, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 412, -1, -1));

        btnRevenue.setFont(new java.awt.Font("Impact", 0, 40)); // NOI18N
        btnRevenue.setForeground(java.awt.Color.red);
        btnRevenue.setText("REVENUE");
        btnRevenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRevenueMouseClicked(evt);
            }
        });
        getContentPane().add(btnRevenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 501, -1, -1));

        cbbMenu.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        cbbMenu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fried_rice(with egg,pork,chicken)", "Fried_rice(with squid,shrimp)", "Macaroni_Soup(creamy/tomato/chicken soup)", "Pizza(L)", "Pizza(M)", "Rice_with_fried_pork_with_pepper_and_garlic", "Spaghetti_Bolognese", "Spaghetti_Carbonara", "Tom_Yum" }));
        getContentPane().add(cbbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 335, -1, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setText("Menu :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 336, -1, -1));

        spnAmount.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        spnAmount.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        getContentPane().add(spnAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 383, -1, -1));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel3.setText("Amount :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 389, -1, -1));

        btnSubmit.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });
        getContentPane().add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel4.setText("TableNum :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 438, -1, -1));

        cbbTable.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        cbbTable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        getContentPane().add(cbbTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 437, -1, -1));

        jButton1.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        jButton1.setText("Undo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/waiter-icon-50096.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 100, 110));

        btnPop.setBackground(new java.awt.Color(255, 255, 51));
        btnPop.setFont(new java.awt.Font("Thonburi", 0, 18)); // NOI18N
        btnPop.setLabel("The most popular menu~!!!");
        btnPop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPopMouseClicked(evt);
            }
        });
        btnPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopActionPerformed(evt);
            }
        });
        getContentPane().add(btnPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/4chef.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 320, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/NN.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 120, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mainrestaurant/view/pastel-teal-canvas-fabric-texture.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 840, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnRevenueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRevenueMouseClicked
        btnRevenue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Revenue rn = new Revenue();
                rn.setJFrame(rn);
                rn.getJFrame().setVisible(true);
                getJFrame().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnRevenueMouseClicked
    int line = 1; // this line is for run row
    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        int i = model.getRowCount() - 1;
        ArrayList<TableModel> total = controller.getUseTable(cbbTable);
        int u = 0;
        for (TableModel t : total) {
            u = Integer.parseInt((String) t.getIsUsing());
        }
       line = controller.orderMenu(u, i, line, cbbMenu, model, cbbTable, spnAmount);
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        line = controller.doUndo(model, cbbMenu, cbbTable, spnAmount, line);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPopMouseClicked
        controller.showPopularMenu();
    }//GEN-LAST:event_btnPopMouseClicked

    private void btnPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPopActionPerformed

    

    private void setTableSize() {
        tblOrder.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblOrder.getColumnModel().getColumn(1).setPreferredWidth(200);
        tblOrder.getColumnModel().getColumn(2).setPreferredWidth(35);
        tblOrder.getColumnModel().getColumn(3).setPreferredWidth(45);
        tblOrder.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        tblOrder.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblOrder.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblOrder.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblOrder.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnPop;
    private javax.swing.JButton btnReserve;
    private javax.swing.JButton btnRevenue;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbbMenu;
    private javax.swing.JComboBox cbbTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnAmount;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}
