/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dbmanager.MongoDB;
import ec.edu.espe.purchaseandsalesrecordgui.model.Invoice;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Jhonatan Lituma
 */
public class FrmSearchInvoice extends javax.swing.JFrame {

    private DefaultComboBoxModel modelInvoicesbyId = new DefaultComboBoxModel();
    private DefaultTableModel modelTable = new DefaultTableModel();

    /**
     * Creates new form FRMInvoiceSearch
     */
    public FrmSearchInvoice() throws ParseException {
        completeModelComboBox2();
        loadTableModel();
        initComponents();
        setLocationRelativeTo(null);
    }

    private void completeModelComboBox2() throws ParseException {
        // TODO add your handling code here:
        ArrayList<Invoice> invoices = new ArrayList<>();
        Gson gson = new Gson();
        String json = MongoDB.completeModel("Invoices", FrmDatabaseSetup.database);

        java.lang.reflect.Type invoiceType = new TypeToken<ArrayList<Invoice>>() {
        }.getType();
        invoices = gson.fromJson(json, invoiceType);

        for (Invoice invoice : invoices) {
            modelInvoicesbyId.addElement(invoice);
        }

    }

    private void loadTableModel() {
        modelTable.addColumn("ID");
        modelTable.addColumn("Date");
        modelTable.addColumn("Cedula");
        modelTable.addColumn("Tax");
        modelTable.addColumn("Total");
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
        cmbInvoicesById = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnSeacrh = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Invoice");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/cedula.png"))); // NOI18N
        jLabel1.setText("Invoice by ID:");

        cmbInvoicesById.setModel(modelInvoicesbyId);

        jTable1.setModel(modelTable);
        jScrollPane1.setViewportView(jTable1);

        btnSeacrh.setText("Search");
        btnSeacrh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeacrhActionPerformed(evt);
            }
        });

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(cmbInvoicesById, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeacrh)
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReturn)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbInvoicesById, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeacrh))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnReturn)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeacrhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeacrhActionPerformed

        Invoice invoice = (Invoice) modelInvoicesbyId.getSelectedItem();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dateAsString = simpleDateFormat.format(date);

        String[] rowInvoices = {invoice.getIdInvoice(), dateAsString,
            invoice.getCedula(), invoice.getTax(), invoice.getTotal()};

        modelTable.addRow(rowInvoices);
    }//GEN-LAST:event_btnSeacrhActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        FrmInvoiceManagement frmInvoiceManagement = new FrmInvoiceManagement();
        frmInvoiceManagement.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSearchInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSearchInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSearchInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSearchInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmSearchInvoice().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(FrmSearchInvoice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSeacrh;
    private javax.swing.JComboBox<String> cmbInvoicesById;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}