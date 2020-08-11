/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.filemanagerlibrary.FileManager;
import ec.edu.espe.purchaseandsalesrecordgui.model.Clothing;
import ec.edu.espe.purchaseandsalesrecordgui.model.Provider;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Christopher Loachami
 */
public class FrmAddInventory extends javax.swing.JFrame {

    String filePathSizeOfClothing = "data/sizeOfClothing.json";
    String filePathProviders = "data/providers.json";
    String filePathClothing = "data/clothing.json";

    private DefaultComboBoxModel modelSize = new DefaultComboBoxModel();
    private DefaultComboBoxModel<Provider> modelProvider = new DefaultComboBoxModel <>();
    private DefaultComboBoxModel modelBrand = new DefaultComboBoxModel();

    /**
     * Creates new form Aplication
     */
    public FrmAddInventory() {
        completeModelComboBox();
        completeModelComboBox2();
        initComponents();
        setLocationRelativeTo(null);
        txtBrand.setEditable(false);
    }

    private void completeModelComboBox() {
        ArrayList<Clothing> clothes = new ArrayList<>();
        Gson gson = new Gson();
        String json = "";
        try {
            json = FileManager.read(filePathSizeOfClothing);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File not found, we are creating the file.");
        }
        java.lang.reflect.Type clothingType = new TypeToken<ArrayList<Clothing>>() {
        }.getType();
        clothes = gson.fromJson(json, clothingType);
        for (Clothing clothing : clothes) {
            modelSize.addElement(clothing.getSize());
        }

    }

    private void completeModelComboBox2() {
        ArrayList<Provider> providers = new ArrayList<>();
        Gson gson = new Gson();
        String json = "";
        try {
            json = FileManager.read(filePathProviders);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File not found, we are creating the file.");
        }
        java.lang.reflect.Type providerType = new TypeToken<ArrayList<Provider>>() {
        }.getType();
        providers = gson.fromJson(json, providerType);
        for (Provider provider : providers) {
            modelProvider.addElement(provider);
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

        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPurchasePrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        cmbIdProvider = new javax.swing.JComboBox<>();
        txtTypeOfClothing = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdClothing = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSalePrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbSize = new javax.swing.JComboBox<>();
        txtBrand = new javax.swing.JTextField();
        btmSave = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel8.setText("jLabel8");

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Type Of Clothing");

        jLabel2.setText("Brand");

        jLabel3.setText("Purchase price per unit");

        jLabel4.setText("Quantity");

        jLabel5.setText("Provider");

        cmbIdProvider.setModel(modelProvider);
        cmbIdProvider.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbIdProviderItemStateChanged(evt);
            }
        });

        jLabel6.setText("Clothing ID:");

        jLabel9.setText("Sale price  price per unit");

        jLabel11.setText("Size");

        cmbSize.setModel(modelSize);
        cmbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTypeOfClothing)
                            .addComponent(txtIdClothing)
                            .addComponent(txtSalePrice)
                            .addComponent(cmbSize, 0, 139, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(txtPurchasePrice, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(cmbIdProvider, 0, 139, Short.MAX_VALUE)
                            .addComponent(txtBrand))))
                .addGap(37, 37, 37))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTypeOfClothing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbIdProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btmSave.setText("Save");
        btmSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmSaveActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/espalda.png"))); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/controller/ropa_opt.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btmSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btmSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmSaveActionPerformed
        // TODO add your handling code here:
        JSONObject jsonNewObject = new JSONObject();
        JSONObject jsonOldObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        JSONParser jsonParser = new JSONParser();
        try {
            jsonArray = (JSONArray) jsonParser.parse(FileManager.readRecord(filePathClothing));
        } catch (IOException | ParseException e) {
            JOptionPane.showMessageDialog(null, "File not found, we are creating the file.");
        }

        jsonNewObject.put("id", txtIdClothing.getText());
        jsonNewObject.put("typeOfClothing", txtTypeOfClothing.getText());
        jsonNewObject.put("size", cmbSize.getSelectedItem());
        jsonNewObject.put("idProvider", String.valueOf(cmbIdProvider.getSelectedItem()));
        jsonNewObject.put("brand", txtBrand.getText());
        jsonNewObject.put("purchasePrice", txtPurchasePrice.getText());
        jsonNewObject.put("salePrice", txtSalePrice.getText());
        jsonNewObject.put("quantity", txtQuantity.getText());
        
        int quantity = Integer.parseInt(txtQuantity.getText());
        float price = Float.parseFloat(txtPurchasePrice.getText());
        float total = quantity * price;
        jsonNewObject.put("total", total);
        
        for (int i = 0; i < jsonArray.size(); i++) {
            jsonOldObject = (JSONObject) jsonArray.get(i);
            if (jsonOldObject.get("id").equals(jsonNewObject.get("id")) && jsonOldObject.get("typeOfClothing").equals(jsonNewObject.get("typeOfClothing")) && jsonOldObject.get("size").equals(jsonNewObject.get("size")) && jsonOldObject.get("idProvider").equals(jsonNewObject.get("idProvider")) &&jsonOldObject.get("brand").equals(jsonNewObject.get("brand"))) {
                System.out.println("AAAAAAAA");
                long newQuantity = Long.parseLong(txtQuantity.getText());
                long currentlyQuantity = Long.parseLong((String.valueOf(jsonOldObject.get("quantity"))));
                long totalQuantity = newQuantity + currentlyQuantity;
                jsonNewObject.put("quantity", totalQuantity);
                jsonArray.remove(i);
            }
        }

        jsonArray.add(jsonNewObject);

        int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to save this information.?");
        if (saveOption == 0) {
            try {
                FileManager.writeRecord(filePathClothing, jsonArray.toJSONString());
                JOptionPane.showMessageDialog(rootPane, "Saved!");
            } catch (HeadlessException | IOException ex) {
                JOptionPane.showMessageDialog(null, "Something is wrong, an unexpected error has occurred, try again.");
            }

        } else if (saveOption == 1) {
            JOptionPane.showMessageDialog(rootPane, "Ok, try again.");
            //TODO Actions taken when the users selects NO
        }
    }//GEN-LAST:event_btmSaveActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmInventoryManagement inventoryMangement = new FrmInventoryManagement();
        inventoryMangement.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnReturnActionPerformed

    private void cmbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSizeActionPerformed

    private void cmbIdProviderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbIdProviderItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Provider provider = (Provider) cmbIdProvider.getSelectedItem();
            txtBrand.setText(provider.getBrand());
        }
    }//GEN-LAST:event_cmbIdProviderItemStateChanged

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
            java.util.logging.Logger.getLogger(FrmAddInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmSave;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<Provider> cmbIdProvider;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtIdClothing;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSalePrice;
    private javax.swing.JTextField txtTypeOfClothing;
    // End of variables declaration//GEN-END:variables
}
