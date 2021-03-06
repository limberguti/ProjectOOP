/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import ec.edu.espe.purchaseandsalesrecordgui.view.PurchaseAndSalesRecordSystem;
import javax.swing.JOptionPane;

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
        menuDatabase = new javax.swing.JMenu();
        menuClient = new javax.swing.JMenu();
        menuProvider = new javax.swing.JMenu();
        menuInventory = new javax.swing.JMenu();
        menuInvoice = new javax.swing.JMenu();
        menuUser = new javax.swing.JMenu();

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

        menuDatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/database_opt_menuBar.png"))); // NOI18N
        menuDatabase.setText("Database");
        menuDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDatabaseMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuDatabase);

        menuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/clientInformation.png"))); // NOI18N
        menuClient.setText("Client");
        menuClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClientMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuClient);

        menuProvider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/proveedor_opt_opt.png"))); // NOI18N
        menuProvider.setText("Providers");
        menuProvider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProviderMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuProvider);

        menuInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/inventario_opt_opt.png"))); // NOI18N
        menuInventory.setText("Inventory");
        menuInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInventoryMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInventory);

        menuInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/factura_opt_opt.png"))); // NOI18N
        menuInvoice.setText("Invoices");
        menuInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInvoiceMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuInvoice);

        menuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/usuario_opt_menuBar.png"))); // NOI18N
        menuUser.setText("Users");
        menuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUserMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuUser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInvoiceMouseClicked
        // TODO add your handling code here:
        if (FrmDatabaseSetup.database == null) {
            JOptionPane.showMessageDialog(rootPane, "First enter your database credentials.");
        } else {
            FrmInvoiceManagement frmInvoiceManagement = new FrmInvoiceManagement();
            frmInvoiceManagement.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_menuInvoiceMouseClicked

    private void menuClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientMouseClicked
        if (FrmDatabaseSetup.database == null) {
            JOptionPane.showMessageDialog(rootPane, "First enter your database credentials.");
        } else {
            this.setVisible(false);
            new FrmCustomerManagement().setVisible(true);
        }

    }//GEN-LAST:event_menuClientMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        PurchaseAndSalesRecordSystem frmSystem = new PurchaseAndSalesRecordSystem();
        frmSystem.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void menuProviderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProviderMouseClicked
        // TODO add your handling code here:
        if (FrmDatabaseSetup.database == null) {
            JOptionPane.showMessageDialog(rootPane, "First enter your database credentials.");
        } else {
            this.setVisible(false);
            new FrmProviderManagement().setVisible(true);
        }

    }//GEN-LAST:event_menuProviderMouseClicked

    private void menuInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInventoryMouseClicked
        if (FrmDatabaseSetup.database == null) {
            JOptionPane.showMessageDialog(rootPane, "First enter your database credentials.");
        } else {
            this.setVisible(false);
            new FrmInventoryManagement().setVisible(true);
        }

    }//GEN-LAST:event_menuInventoryMouseClicked

    private void menuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUserMouseClicked
        this.setVisible(false);
        new FrmUser().setVisible(true);
    }//GEN-LAST:event_menuUserMouseClicked

    private void menuDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDatabaseMouseClicked
        this.setVisible(false);
        new FrmDatabaseSetup().setVisible(true);
    }//GEN-LAST:event_menuDatabaseMouseClicked

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
    private javax.swing.JMenu menuClient;
    private javax.swing.JMenu menuDatabase;
    private javax.swing.JMenu menuInventory;
    private javax.swing.JMenu menuInvoice;
    private javax.swing.JMenu menuProvider;
    private javax.swing.JMenu menuUser;
    // End of variables declaration//GEN-END:variables
}
