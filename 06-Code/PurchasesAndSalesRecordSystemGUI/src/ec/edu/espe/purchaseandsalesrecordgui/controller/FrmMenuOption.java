/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import ec.edu.espe.purchaseandsalesrecordgui.view.PurchaseAndSalesRecordSystem;

/**
 *
 * @author Jhonatan Lituma
 */
public class FrmMenuOption extends javax.swing.JFrame {

    /**
     * Creates new form FRMMenuOption
     */
    public FrmMenuOption() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCustomer = new javax.swing.JMenu();
        jmProvider = new javax.swing.JMenu();
        jmInventory = new javax.swing.JMenu();
        jmInvoices = new javax.swing.JMenu();
        jmUsers = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchase and Sales Record");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/dukes.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel2.setText("Welcome Again!");

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/logOut.png"))); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jmCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/clientInformation.png"))); // NOI18N
        jmCustomer.setText("Customer");
        jmCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCustomerMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmCustomer);

        jmProvider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/proveedor_opt_opt.png"))); // NOI18N
        jmProvider.setText("Providers");
        jmProvider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmProviderMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmProvider);

        jmInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/inventario_opt_opt.png"))); // NOI18N
        jmInventory.setText("Inventory");
        jmInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmInventoryMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmInventory);

        jmInvoices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/factura_opt_opt.png"))); // NOI18N
        jmInvoices.setText("Invoices");
        jmInvoices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmInvoicesMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmInvoices);

        jmUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/usuario_opt_menuBar.png"))); // NOI18N
        jmUsers.setText("Users");
        jmUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmUsersMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmUsers);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmInvoicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmInvoicesMouseClicked
        // TODO add your handling code here:
        FrmInvoiceManagement frmInvoiceManagement = new FrmInvoiceManagement();
        frmInvoiceManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmInvoicesMouseClicked

    private void jmCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCustomerMouseClicked
        this.setVisible(false);
        new FrmCustomerManagement().setVisible(true);
    }//GEN-LAST:event_jmCustomerMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        PurchaseAndSalesRecordSystem frmSystem = new PurchaseAndSalesRecordSystem();
        frmSystem.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jmProviderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmProviderMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new FrmProviderManagement().setVisible(true);
    }//GEN-LAST:event_jmProviderMouseClicked

    private void jmInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmInventoryMouseClicked
        this.setVisible(false);
        new FrmInventoryManagement().setVisible(true);
    }//GEN-LAST:event_jmInventoryMouseClicked

    private void jmUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmUsersMouseClicked
        this.setVisible(false);
        new FrmUser().setVisible(true);
    }//GEN-LAST:event_jmUsersMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMenuOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuOption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuOption().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmCustomer;
    private javax.swing.JMenu jmInventory;
    private javax.swing.JMenu jmInvoices;
    private javax.swing.JMenu jmProvider;
    private javax.swing.JMenu jmUsers;
    // End of variables declaration//GEN-END:variables
}
