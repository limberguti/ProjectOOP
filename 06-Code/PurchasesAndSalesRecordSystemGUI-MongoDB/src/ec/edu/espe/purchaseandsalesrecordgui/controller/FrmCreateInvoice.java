/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import ec.edu.espe.dbmanager.MongoDB;
import ec.edu.espe.purchaseandsalesrecordgui.model.Clothing;
import ec.edu.espe.purchaseandsalesrecordgui.model.Customer;
import ec.edu.espe.purchaseandsalesrecordgui.utils.Calculation;
import java.awt.event.ItemEvent;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
 * @author Jhonatan Lituma
 */
public class FrmCreateInvoice extends javax.swing.JFrame {

    private String filePathSizeOfClothing = "data/sizeOfClothing.json";
    private DefaultComboBoxModel model = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel modelClothing = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelSize = new DefaultComboBoxModel();
    private DefaultComboBoxModel modelQuantity = new DefaultComboBoxModel();
    private DefaultTableModel modelTable = new DefaultTableModel();

    /**
     * Creates new form Aplication
     *
     * @throws java.net.UnknownHostException
     * @throws org.json.simple.parser.ParseException
     */
    public FrmCreateInvoice() throws UnknownHostException, ParseException {
        completeModelComboBoxCustomer();
        completeModelComboBoxClothing();
        initComponents();
        setLocationRelativeTo(null);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        txtDate.setEditable(false);
        txtDate.setText(simpleDateFormat.format(date));
        txtQuantity.setText("0");
        txtTotal.setText("0.0");
    }

    private void completeModelComboBoxCustomer() throws ParseException {

        ArrayList<Customer> customers = new ArrayList<>();
        Gson gson = new Gson();
        String json = MongoDB.completeModel("Customers", FrmDatabaseSetup.database);

        java.lang.reflect.Type customerType = new TypeToken<ArrayList<Customer>>() {
        }.getType();
        customers = gson.fromJson(json, customerType);
        for (Customer customer : customers) {
            model.addElement(customer);
        }
    }

    private void completeModelComboBoxClothing() throws ParseException {
        ArrayList<Clothing> clothes = new ArrayList<>();
        Gson gson = new Gson();
        String json = MongoDB.completeModel("Clothing", FrmDatabaseSetup.database);
        java.lang.reflect.Type clothesType = new TypeToken<ArrayList<Clothing>>() {
        }.getType();
        clothes = gson.fromJson(json, clothesType);

        for (Clothing clothing : clothes) {
            modelClothing.addElement(clothing);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbPersons = new javax.swing.JComboBox<>();
        btnShowData = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCellphone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        cmbClothing = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbSizeOfClothing = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoice Managment");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/persona_opt.png"))); // NOI18N
        jLabel1.setText("Cedula:");

        cmbPersons.setModel(model);

        btnShowData.setText("Show Data");
        btnShowData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDataActionPerformed(evt);
            }
        });

        btnSave.setText("Print");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name:");

        jLabel5.setText("Cedula:");

        jLabel6.setText("Cellphone: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Date of the Invoice:");

        jLabel3.setText("Name:");

        jLabel10.setText("Address:");

        jLabel12.setText("Email:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(23, 23, 23)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtAddress))
                        .addGap(46, 46, 46)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCellphone, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(txtCedula))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Products to buy:");

        labelID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelID.setText("Invoice ID:");

        labelDate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelDate.setText("Date:");

        jLabel13.setText("Tax:");

        jLabel14.setText("Total:");

        cmbClothing.setModel(modelClothing);
        cmbClothing.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClothingItemStateChanged(evt);
            }
        });

        jLabel15.setText("Clothing");

        jLabel7.setText("Size");

        cmbSizeOfClothing.setModel(modelSize);

        jLabel8.setText("Quantity");

        btnTotal.setText("Add to the total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate)))
                        .addGap(48, 48, 48)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReturn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbClothing, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTotal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbSizeOfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(labelDate)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowData, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cmbSizeOfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnTotal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReturn))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDataActionPerformed

        // TODO add your handling code here:
        Customer client = (Customer) model.getSelectedItem();

        String cedula = Integer.toString(client.getCedula());
        String cellphone = Integer.toString(client.getCellphone());

        txtName.setText(client.getName());
        txtName.setEditable(false);
        txtLastName.setText(client.getLastName());
        txtLastName.setEditable(false);
        txtCedula.setText(cedula);
        txtCedula.setEditable(false);
        txtCellphone.setText(cellphone);
        txtCellphone.setEditable(false);
        txtAddress.setText(client.getAddress());
        txtAddress.setEditable(false);
        txtEmail.setText(client.getEmail());
        txtEmail.setEditable(false);

    }//GEN-LAST:event_btnShowDataActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        FrmInvoiceManagement frmInvoices = new FrmInvoiceManagement();
        frmInvoices.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Document document = new Document();
        document.put("idInvoice", txtId.getText());
        document.put("date", txtDate.getText());
        document.put("cedula", txtCedula.getText());
        document.put("name", txtName.getText());
        document.put("lastName", txtLastName.getText());
        document.put("address", txtAddress.getText());
        document.put("cellphone", txtCellphone.getText());
        document.put("email", txtEmail.getText());
        document.put("clothing", String.valueOf(cmbClothing.getSelectedItem()));
        document.put("descrption", cmbSizeOfClothing.getSelectedItem());
        document.put("quantity", txtQuantity.getText());
        document.put("tax", txtTax.getText());
        document.put("total", txtTotal.getText());

        int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to print this information.?");

        if (saveOption == 0) {
            MongoDB.save(document, "Invoices", FrmDatabaseSetup.database);
            JOptionPane.showMessageDialog(rootPane, "Saved!");
        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, try again.");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        
        JSONObject jsonOldObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONParser jSONParser = new JSONParser();
        double tax;
        double pricePerUnit;
        double totalWithoutIva = 0;
        double totalWithIva = Double.parseDouble(txtTotal.getText());
        double quantity;
        long totalQuantity = Long.parseLong(txtQuantity.getText());
        Calculation calculation = new Calculation();
        

        try {
            jsonArray = MongoDB.toJSONArray("Clothing", FrmDatabaseSetup.database);
        } catch (ParseException ex) {
            Logger.getLogger(FrmCreateInvoice.class.getName()).log(Level.SEVERE, null, ex);
        }

        Clothing clothing = (Clothing) modelClothing.getSelectedItem();
        long quantityOfClothing = Long.valueOf(txtQuantity.getText());

        jsonOldObject = (JSONObject) jsonArray.get(cmbClothing.getSelectedIndex());

        if (jsonOldObject.get("id").equals(clothing.getId()) && jsonOldObject.get("typeOfClothing").equals(clothing.getTypeOfClothing()) && jsonOldObject.get("size").equals(clothing.getSize()) && jsonOldObject.get("idProvider").equals(clothing.getIdProvider()) && jsonOldObject.get("brand").equals(clothing.getBrand()) && quantityOfClothing > Long.parseLong(String.valueOf(jsonOldObject.get("quantity")))) {
            JOptionPane.showMessageDialog(null, "Exceeds the quantity available.");
        } else {
            tax = Integer.parseInt(txtTax.getText());
            pricePerUnit = clothing.getSalePrice();
            quantity = Double.parseDouble(txtQuantity.getText());

            totalWithoutIva = calculation.PriceWithOutIva((int) quantity, pricePerUnit);
            totalWithIva = calculation.PriceWithIva(tax, totalWithoutIva);

            txtTotal.setText(String.valueOf(totalWithIva));

            long currentlyQuantity = Long.parseLong((String.valueOf(jsonOldObject.get("quantity"))));
            currentlyQuantity -= totalQuantity;
            jsonOldObject.put("quantity", currentlyQuantity);
            jsonArray.remove(cmbClothing.getSelectedIndex());

            jsonArray.add(cmbClothing.getSelectedIndex(), jsonOldObject);
            jSONParser.parse(jsonArray.);
            
            
            //MongoDB.updateCollection("Clothing" , "" , FrmDatabaseSetup.database);
        }
        /*
        JSONObject jsonOldObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONParser jsonParser = new JSONParser();
        double tax;
        double pricePerUnit;
        double totalWithoutIva = 0;
        double totalWithIva = Double.parseDouble(txtTotal.getText());
        double quantity;
        long totalQuantity = Long.parseLong(txtQuantity.getText());
        Calculation calculation = new Calculation();

        try {
            jsonArray = (JSONArray) jsonParser.parse(FileManager.readRecord(filePathClothing));
        } catch (IOException | ParseException e) {
            JOptionPane.showMessageDialog(null, "File not found, we are creating the file.");
        }

        Clothing clothing = (Clothing) modelClothing.getSelectedItem();
        long quantityOfClothing = Long.valueOf(txtQuantity.getText());

        jsonOldObject = (JSONObject) jsonArray.get(cmbClothing.getSelectedIndex());

        if (jsonOldObject.get("id").equals(clothing.getId()) && jsonOldObject.get("typeOfClothing").equals(clothing.getTypeOfClothing()) && jsonOldObject.get("size").equals(clothing.getSize()) && jsonOldObject.get("idProvider").equals(clothing.getIdProvider()) && jsonOldObject.get("brand").equals(clothing.getBrand()) && quantityOfClothing > Long.parseLong(String.valueOf(jsonOldObject.get("quantity")))) {
            JOptionPane.showMessageDialog(null, "Exceeds the quantity available.");
        } else {
            tax = Integer.parseInt(txtTax.getText());
            pricePerUnit = clothing.getSalePrice();
            quantity = Double.parseDouble(txtQuantity.getText());

            totalWithoutIva = calculation.PriceWithOutIva(quantity, pricePerUnit);
            totalWithIva = calculation.PriceWithIva(tax, totalWithoutIva);

            txtTotal.setText(String.valueOf(totalWithIva));

            long currentlyQuantity = Long.parseLong((String.valueOf(jsonOldObject.get("quantity"))));
            currentlyQuantity -= totalQuantity;
            jsonOldObject.put("quantity", currentlyQuantity);
            jsonArray.remove(cmbClothing.getSelectedIndex());

            jsonArray.add(cmbClothing.getSelectedIndex(), jsonOldObject);
            try {
                FileManager.writeRecord(filePathClothing, jsonArray.toJSONString());
            } catch (HeadlessException | IOException ex) {
                JOptionPane.showMessageDialog(null, "Something is wrong, an unexpected error has occurred, try again.");
            }
        }*/

    }//GEN-LAST:event_btnTotalActionPerformed

    private void cmbClothingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClothingItemStateChanged
        // TODO add your handling code here
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Clothing clothing = (Clothing) modelClothing.getSelectedItem();
            modelSize.setSelectedItem(clothing.getSize());

        }
    }//GEN-LAST:event_cmbClothingItemStateChanged

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
            java.util.logging.Logger.getLogger(FrmCreateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new FrmCreateInvoice().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(FrmCreateInvoice.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(FrmCreateInvoice.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowData;
    private javax.swing.JButton btnTotal;
    private javax.swing.JComboBox<String> cmbClothing;
    private javax.swing.JComboBox<String> cmbPersons;
    private javax.swing.JComboBox<String> cmbSizeOfClothing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelID;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCellphone;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}