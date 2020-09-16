/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dbmanager.MongoDB;
import ec.edu.espe.purchaseandsalesrecordgui.model.Provider;
import ec.edu.espe.purchaseandsalesrecordgui.utils.ValidationEmptyFields;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.json.simple.parser.ParseException;

/**
 *
 * @author Christopher Loachamin
 */
public class FrmSearchProvider extends javax.swing.JFrame {

    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form FrmSearch
     *
     * @throws org.json.simple.parser.ParseException
     */
    public FrmSearchProvider() throws ParseException {
        loadComboBoxModel();
        loadTableModel();
        initComponents();
        setLocationRelativeTo(null);
    }

    private void loadComboBoxModel() throws ParseException {
        ArrayList<Provider> providers = new ArrayList<>();
        Gson gson = new Gson();
        String json = MongoDB.completeModel("Providers", FrmDatabaseSetup.database);
        java.lang.reflect.Type providerType = new TypeToken<ArrayList<Provider>>() {
        }.getType();
        providers = gson.fromJson(json, providerType);
        for (Provider provider : providers) {
            comboBoxModel.addElement(provider);
        }
    }

    private void loadTableModel() {
        tableModel.addColumn("Provider ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Brand");
        tableModel.addColumn("Phone Number");
        tableModel.addColumn("Address");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        jlbSearchTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbProviderInformation = new javax.swing.JTable();
        jlbIdProvider = new javax.swing.JLabel();
        cmbProviderId = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jlbUpdateIdProvider = new javax.swing.JLabel();
        jlbUpdateBrand = new javax.swing.JLabel();
        jlbUpdatePhoneNumber = new javax.swing.JLabel();
        txtUpdateIdProvider = new javax.swing.JTextField();
        txtUpdateBrand = new javax.swing.JTextField();
        txtUpdatePhoneNumber = new javax.swing.JTextField();
        jlbUpdateAddress = new javax.swing.JLabel();
        txtUpdateAddress = new javax.swing.JTextField();
        jlbUpdate = new javax.swing.JLabel();
        jlbUpdateName = new javax.swing.JLabel();
        txtUpdateName = new javax.swing.JTextField();
        jlbUpdateLastName = new javax.swing.JLabel();
        txtUpdateLastName = new javax.swing.JTextField();
        jlbOnlyNumbersPhoneNumber = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEmptyFields = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Provider");

        jlbSearchTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/searchProviderTitle.png"))); // NOI18N
        jlbSearchTitle.setText("Search Provider");

        jtbProviderInformation.setModel(tableModel);
        jScrollPane1.setViewportView(jtbProviderInformation);

        jlbIdProvider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/name.png"))); // NOI18N
        jlbIdProvider.setText("Provider ID:");

        cmbProviderId.setModel(comboBoxModel);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jlbUpdateIdProvider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/cedula.png"))); // NOI18N
        jlbUpdateIdProvider.setText("Provider ID:");

        jlbUpdateBrand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/brand.png"))); // NOI18N
        jlbUpdateBrand.setText("Brand: ");

        jlbUpdatePhoneNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/phoneNumber.png"))); // NOI18N
        jlbUpdatePhoneNumber.setText("Phone Number:");

        txtUpdateIdProvider.setToolTipText("Enter only numbers");

        txtUpdateBrand.setToolTipText("Don't use special characteres");

        txtUpdatePhoneNumber.setToolTipText("Enter only 10 numbers");
        txtUpdatePhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdatePhoneNumberKeyPressed(evt);
            }
        });

        jlbUpdateAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/address.png"))); // NOI18N
        jlbUpdateAddress.setText("Address:");

        txtUpdateAddress.setToolTipText("Don't use special characteres");

        jlbUpdate.setText("Enter the new values in each field:");

        jlbUpdateName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/name.png"))); // NOI18N
        jlbUpdateName.setText("Name:");

        txtUpdateName.setToolTipText("Don't use special characteres");

        jlbUpdateLastName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/name.png"))); // NOI18N
        jlbUpdateLastName.setText("Last Name:");

        txtUpdateLastName.setToolTipText("Don't use special characteresDon't use special characteres");

        jlbOnlyNumbersPhoneNumber.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl1Layout.createSequentialGroup()
                                .addComponent(jlbIdProvider)
                                .addGap(75, 75, 75)
                                .addComponent(cmbProviderId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlbSearchTitle))
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                        .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnl1Layout.createSequentialGroup()
                                    .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlbUpdatePhoneNumber)
                                        .addComponent(jlbUpdateAddress))
                                    .addGap(33, 33, 33)
                                    .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtUpdatePhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnl1Layout.createSequentialGroup()
                                    .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlbUpdateIdProvider)
                                        .addComponent(jlbUpdateName)
                                        .addComponent(jlbUpdateLastName))
                                    .addGap(47, 47, 47)
                                    .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUpdateIdProvider)
                                        .addComponent(txtUpdateName)
                                        .addComponent(txtUpdateLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnl1Layout.createSequentialGroup()
                                    .addComponent(jlbUpdateBrand)
                                    .addGap(80, 80, 80)
                                    .addComponent(txtUpdateBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnl1Layout.createSequentialGroup()
                                .addComponent(jlbUpdate)
                                .addGap(463, 463, 463)))
                        .addComponent(jlbOnlyNumbersPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE))
                    .addGroup(pnl1Layout.createSequentialGroup()
                        .addGap(601, 601, 601)
                        .addComponent(btnSearch)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlbSearchTitle)
                .addGap(18, 18, 18)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIdProvider)
                    .addComponent(cmbProviderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUpdateIdProvider)
                    .addComponent(txtUpdateIdProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUpdateName))
                .addGap(18, 18, 18)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUpdateLastName)
                    .addComponent(txtUpdateLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUpdateBrand)
                    .addComponent(txtUpdateBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbOnlyNumbersPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbUpdatePhoneNumber)
                        .addComponent(txtUpdatePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUpdateAddress)
                    .addComponent(txtUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEmptyFields.setText("Empty Fields");
        btnEmptyFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyFieldsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2Layout = new javax.swing.GroupLayout(pnl2);
        pnl2.setLayout(pnl2Layout);
        pnl2Layout.setHorizontalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate)
                .addGap(59, 59, 59)
                .addComponent(btnDelete)
                .addGap(64, 64, 64)
                .addComponent(btnEmptyFields)
                .addGap(65, 65, 65)
                .addComponent(btnReturn)
                .addGap(173, 173, 173))
        );
        pnl2Layout.setVerticalGroup(
            pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnl2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnEmptyFields)
                    .addComponent(btnReturn))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmProviderManagement frmProviderMenu = new FrmProviderManagement();
        frmProviderMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ArrayList<Provider> providers = new ArrayList<>();
        Gson gson = new Gson();
        String json = "";

        try {
            json = MongoDB.completeModel("Providers", FrmDatabaseSetup.database);
        } catch (ParseException ex) {
            Logger.getLogger(FrmSearchProvider.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.lang.reflect.Type providerType = new TypeToken<ArrayList<Provider>>() {
        }.getType();
        providers = gson.fromJson(json, providerType);
        Provider provider = (Provider) comboBoxModel.getSelectedItem();

        String[] rowProviders = {provider.getIdProvider(), provider.getName(),
            provider.getLastName(), provider.getBrand(), provider.getPhoneNumber(),
            provider.getAddress()};

        tableModel.addRow(rowProviders);

        providers = gson.fromJson(json, providerType);

        txtUpdateIdProvider.setText(provider.getIdProvider());
        txtUpdateName.setText(provider.getName());
        txtUpdateLastName.setText(provider.getLastName());
        txtUpdateBrand.setText(provider.getBrand());
        txtUpdatePhoneNumber.setText(provider.getPhoneNumber());
        txtUpdateAddress.setText(provider.getAddress());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to update this information.?");

        if (saveOption == 0) {
            Provider provider = (Provider) comboBoxModel.getSelectedItem();

            MongoDB.update("Providers", "idProvider", provider.getIdProvider(), txtUpdateIdProvider.getText(), FrmDatabaseSetup.database);
            MongoDB.update("Providers", "name", provider.getName(), txtUpdateIdProvider.getText(), FrmDatabaseSetup.database);
            MongoDB.update("Providers", "lastName", provider.getLastName(), txtUpdateIdProvider.getText(), FrmDatabaseSetup.database);
            MongoDB.update("Providers", "brand", provider.getBrand(), txtUpdateIdProvider.getText(), FrmDatabaseSetup.database);
            MongoDB.update("Providers", "phoneNumber", provider.getPhoneNumber(), txtUpdateIdProvider.getText(), FrmDatabaseSetup.database);
            MongoDB.update("Providers", "address", provider.getAddress(), txtUpdateIdProvider.getText(), FrmDatabaseSetup.database);

            JOptionPane.showMessageDialog(rootPane, "Updated!");

        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, try again.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to delete this information.?");

        if (saveOption == 0) {
            Provider provider = (Provider) comboBoxModel.getSelectedItem();

            MongoDB.delete("Providers", "idProvider", provider.getIdProvider(), FrmDatabaseSetup.database);
            MongoDB.delete("Providers", "name", provider.getName(), FrmDatabaseSetup.database);
            MongoDB.delete("Providers", "lastName", provider.getLastName(), FrmDatabaseSetup.database);
            MongoDB.delete("Providers", "brand", provider.getBrand(), FrmDatabaseSetup.database);
            MongoDB.delete("Providers", "phoneNumber", provider.getPhoneNumber(), FrmDatabaseSetup.database);
            MongoDB.delete("Providers", "address", provider.getAddress(), FrmDatabaseSetup.database);

            JOptionPane.showMessageDialog(rootPane, "Deleted!");

        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, try again.");
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEmptyFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyFieldsActionPerformed
        ValidationEmptyFields validation = new ValidationEmptyFields();
        validation.emptyFields(pnl1);
        jlbOnlyNumbersPhoneNumber.setText("");
    }//GEN-LAST:event_btnEmptyFieldsActionPerformed

    private void txtUpdatePhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdatePhoneNumberKeyPressed
        ValidationEmptyFields validation = new ValidationEmptyFields();
        validation.validateOnlyNumbers(evt, txtUpdatePhoneNumber, jlbOnlyNumbersPhoneNumber);
    }//GEN-LAST:event_txtUpdatePhoneNumberKeyPressed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSearchProvider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmSearchProvider().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(FrmSearchProvider.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEmptyFields;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbProviderId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbIdProvider;
    private javax.swing.JLabel jlbOnlyNumbersPhoneNumber;
    private javax.swing.JLabel jlbSearchTitle;
    private javax.swing.JLabel jlbUpdate;
    private javax.swing.JLabel jlbUpdateAddress;
    private javax.swing.JLabel jlbUpdateBrand;
    private javax.swing.JLabel jlbUpdateIdProvider;
    private javax.swing.JLabel jlbUpdateLastName;
    private javax.swing.JLabel jlbUpdateName;
    private javax.swing.JLabel jlbUpdatePhoneNumber;
    private javax.swing.JTable jtbProviderInformation;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JTextField txtUpdateAddress;
    private javax.swing.JTextField txtUpdateBrand;
    private javax.swing.JTextField txtUpdateIdProvider;
    private javax.swing.JTextField txtUpdateLastName;
    private javax.swing.JTextField txtUpdateName;
    private javax.swing.JTextField txtUpdatePhoneNumber;
    // End of variables declaration//GEN-END:variables
}
