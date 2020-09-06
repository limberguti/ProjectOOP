/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.dbmanager.MongoDB;
import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.purchaseandsalesrecordgui.model.Customer;
import ec.edu.espe.purchaseandsalesrecordgui.utils.ValidationEmptyFields;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Andrés López
 */
public class FrmSearchCustomer extends javax.swing.JFrame {


    String filePathCustomer = "data/customers.json";
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel tableModel = new DefaultTableModel();

    /**
     * Creates new form FrmSearch
     */
    public FrmSearchCustomer() {
        loadComboBoxModel();
        loadTableModel();
        initComponents();
        setLocationRelativeTo(null);
    }

    private void loadComboBoxModel() {
        ArrayList<Customer> clients = new ArrayList<>();
        Gson gson = new Gson();
        String json = "";
        try {
            json = FileManager.read(filePathCustomer);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }
        java.lang.reflect.Type clientType = new TypeToken<ArrayList<Customer>>() {
        }.getType();
        clients = gson.fromJson(json, clientType);

        for (Customer client : clients) {
            comboBoxModel.addElement(client);
        }
    }

    private void loadTableModel() {
        tableModel.addColumn("cedula");
        tableModel.addColumn("name");
        tableModel.addColumn("last Name");
        tableModel.addColumn("cellphone");
        tableModel.addColumn("address");
        tableModel.addColumn("email");
        tableModel.addRow((Vector) MongoDB.llenar("Customers", "cedula"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl = new javax.swing.JPanel();
        jlbSearchCustomerTitle = new javax.swing.JLabel();
        jlbCedula = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        cmbCedula = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDeleteClient = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jlbUpdateName = new javax.swing.JLabel();
        jlbUpdateLastName = new javax.swing.JLabel();
        txtUpdateName = new javax.swing.JTextField();
        txtUpdateLastName = new javax.swing.JTextField();
        jlbUpdateCellphone = new javax.swing.JLabel();
        jlbUpdateAddress = new javax.swing.JLabel();
        jlbUpdateEmail = new javax.swing.JLabel();
        txtUpdateCellphone = new javax.swing.JTextField();
        txtUpdateAddress = new javax.swing.JTextField();
        txtUpdateEmail = new javax.swing.JTextField();
        jlbUpdateFields = new javax.swing.JLabel();
        jlbValidateEmail = new javax.swing.JLabel();
        btnEmptyFields = new javax.swing.JButton();
        jlbOnlyNumbersCellphone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Client");

        jlbSearchCustomerTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/searchClientTitle.png"))); // NOI18N
        jlbSearchCustomerTitle.setText("Search Customer");

        jlbCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/cedula.png"))); // NOI18N
        jlbCedula.setText("Cedula: ");

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        cmbCedula.setModel(comboBoxModel);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jTable1.setModel(tableModel);
        jScrollPane1.setViewportView(jTable1);

        btnDeleteClient.setText("Delete");
        btnDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClientActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jlbUpdateName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/name.png"))); // NOI18N
        jlbUpdateName.setText("Name: ");

        jlbUpdateLastName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/name.png"))); // NOI18N
        jlbUpdateLastName.setText("Last Name: ");

        jlbUpdateCellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/phoneNumber.png"))); // NOI18N
        jlbUpdateCellphone.setText("Cellphone: ");

        jlbUpdateAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/address.png"))); // NOI18N
        jlbUpdateAddress.setText("Address: ");

        jlbUpdateEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/email.png"))); // NOI18N
        jlbUpdateEmail.setText("Email: ");

        txtUpdateCellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpdateCellphoneKeyPressed(evt);
            }
        });

        jlbUpdateFields.setText("Enter the new values in each field:");

        jlbValidateEmail.setForeground(new java.awt.Color(255, 0, 0));

        btnEmptyFields.setText("Empty Fields");
        btnEmptyFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyFieldsActionPerformed(evt);
            }
        });

        jlbOnlyNumbersCellphone.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlbSearchCustomerTitle)
                                    .addGroup(pnlLayout.createSequentialGroup()
                                        .addComponent(jlbCedula)
                                        .addGap(48, 48, 48)
                                        .addComponent(cmbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 78, 78)
                                .addComponent(btnSearch))
                            .addGroup(pnlLayout.createSequentialGroup()
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jlbUpdateFields)
                                        .addGap(55, 55, 55))
                                    .addGroup(pnlLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnDeleteClient)
                                            .addGroup(pnlLayout.createSequentialGroup()
                                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlbUpdateName)
                                                    .addComponent(jlbUpdateLastName))
                                                .addGap(18, 18, 18)
                                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtUpdateName, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                                    .addComponent(txtUpdateLastName))))
                                        .addGap(26, 26, 26)))
                                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlLayout.createSequentialGroup()
                                        .addComponent(jlbUpdateCellphone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtUpdateCellphone, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbUpdateAddress)
                                            .addComponent(jlbUpdateEmail))
                                        .addGap(20, 20, 20)
                                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUpdateAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                            .addComponent(txtUpdateEmail)))
                                    .addComponent(jlbValidateEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlbOnlyNumbersCellphone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                                .addComponent(btnEmptyFields)
                                .addGap(66, 66, 66)
                                .addComponent(btnReturn)
                                .addGap(59, 59, 59)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jlbSearchCustomerTitle)
                .addGap(18, 18, 18)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCedula)
                    .addComponent(btnSearch)
                    .addComponent(cmbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbUpdateFields)
                            .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlbUpdateCellphone)
                                .addComponent(txtUpdateCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbUpdateName)
                            .addComponent(txtUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbUpdateLastName)
                            .addComponent(txtUpdateLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jlbOnlyNumbersCellphone, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbUpdateAddress)
                            .addComponent(txtUpdateAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbUpdateEmail)
                            .addComponent(txtUpdateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbValidateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDeleteClient)
                    .addComponent(btnReturn)
                    .addComponent(btnEmptyFields))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmCustomerManagement frmClientMenu = new FrmCustomerManagement();
        frmClientMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        
        /*
        ArrayList<Client> clients = new ArrayList<>();
        Gson gson = new Gson();
        String json = "";
        try {
            json = FileManager.read(filePathClients);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }
        java.lang.reflect.Type clientType = new TypeToken<ArrayList<Client>>() {
        }.getType();
        clients = gson.fromJson(json, clientType);
        Customer customer = (Customer) comboBoxModel.getSelectedItem();

        String cedula = Integer.toString(customer.getCedula());
        String cellphone = Integer.toString(customer.getCellphone());

        String[] rowClients = {cedula, customer.getName(),
            customer.getLastName(), cellphone, customer.getAddress(),
            customer.getEmail()};

        tableModel.addRow(rowClients);

        try {
            json = FileManager.read(filePathClients);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }

        clients = gson.fromJson(json, clientType);
        
        txtUpdateName.setText(customer.getName());
        txtUpdateLastName.setText(customer.getLastName());
        txtUpdateCellphone.setText(cellphone);
        txtUpdateAddress.setText(customer.getAddress());
        txtUpdateEmail.setText(customer.getEmail());
         */
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClientActionPerformed
        Customer customer = (Customer) comboBoxModel.getSelectedItem();
        Document document = new Document();
        mongoDbManager.delete("cedula", customer.getCedula(), "Customers");

    }//GEN-LAST:event_btnDeleteClientActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        JSONObject jsonObject = new JSONObject();
        Customer client = (Customer) comboBoxModel.getSelectedItem();
        JSONArray jsonArray = new JSONArray();
        Object object = null;
        JSONParser jsonParser = new JSONParser();
        ValidationEmptyFields validation = new ValidationEmptyFields();

        try {
            object = jsonParser.parse(FileManager.readRecord(filePathCustomer));
            jsonArray = (JSONArray) object;
        } catch (IOException | ParseException ex) {
            JOptionPane.showMessageDialog(null, "Something is wrong, an unexpected error has occurred, try again.");
        }

        jsonObject.put("cedula", client.getCedula());
        jsonObject.put("name", client.getName());
        jsonObject.put("lastName", client.getLastName());
        jsonObject.put("cellphone", client.getCellphone());
        jsonObject.put("address", client.getAddress());
        jsonObject.put("email", client.getEmail());

        int size = jsonArray.size();
        String email = txtUpdateEmail.getText();

        if (validation.validateEmail(email) == true) {
            for (int i = 0; i < size; i++) {
                jsonObject = (JSONObject) jsonArray.get(i);
                if (String.valueOf(client.getCedula()).equals(String.valueOf(jsonObject.get("cedula")))) {
                    try {
                        jsonArray.remove(i);
                        FileManager.writeRecord(filePathCustomer, jsonArray.toJSONString());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Something is wrong, an unexpected error has occurred, try again.");
                    }
                    tableModel.removeRow(0);
                    break;
                } else if (i == size - 1) {
                    JOptionPane.showMessageDialog(null, "Cedula was not found!");
                }
            }

            try {
                jsonArray = (JSONArray) jsonParser.parse(FileManager.readRecord(filePathCustomer));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ocurred");
            }

            jsonObject.put("cedula", client.getCedula());
            jsonObject.put("name", txtUpdateName.getText());
            jsonObject.put("lastName", txtUpdateLastName.getText());
            jsonObject.put("cellphone", txtUpdateCellphone.getText());
            jsonObject.put("address", txtUpdateAddress.getText());
            jsonObject.put("email", txtUpdateEmail.getText());

            jsonArray.add(jsonObject);

            try {
                FileManager.writeRecord(filePathCustomer, jsonArray.toJSONString());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error ocurred!");
            }
            JOptionPane.showMessageDialog(null, "Client updated");
        } else {
            jlbValidateEmail.setText("Invalid Email!");
            JOptionPane.showMessageDialog(null, "Invalid Email!");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnEmptyFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyFieldsActionPerformed
        ValidationEmptyFields validation = new ValidationEmptyFields();
        validation.emptyFields(pnl);
    }//GEN-LAST:event_btnEmptyFieldsActionPerformed

    private void txtUpdateCellphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpdateCellphoneKeyPressed
        ValidationEmptyFields validation = new ValidationEmptyFields();
        validation.validateOnlyNumbers(evt, txtUpdateCellphone, jlbOnlyNumbersCellphone);
    }//GEN-LAST:event_txtUpdateCellphoneKeyPressed

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
            java.util.logging.Logger.getLogger(FrmSearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSearchCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteClient;
    private javax.swing.JButton btnEmptyFields;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCedula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlbCedula;
    private javax.swing.JLabel jlbOnlyNumbersCellphone;
    private javax.swing.JLabel jlbSearchCustomerTitle;
    private javax.swing.JLabel jlbUpdateAddress;
    private javax.swing.JLabel jlbUpdateCellphone;
    private javax.swing.JLabel jlbUpdateEmail;
    private javax.swing.JLabel jlbUpdateFields;
    private javax.swing.JLabel jlbUpdateLastName;
    private javax.swing.JLabel jlbUpdateName;
    private javax.swing.JLabel jlbValidateEmail;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtUpdateAddress;
    private javax.swing.JTextField txtUpdateCellphone;
    private javax.swing.JTextField txtUpdateEmail;
    private javax.swing.JTextField txtUpdateLastName;
    private javax.swing.JTextField txtUpdateName;
    // End of variables declaration//GEN-END:variables
}
