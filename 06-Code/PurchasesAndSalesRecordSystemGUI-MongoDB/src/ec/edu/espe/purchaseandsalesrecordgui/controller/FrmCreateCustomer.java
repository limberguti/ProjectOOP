/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template fileReader, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.controller;

import ec.edu.espe.dbmanager.MongoDB;
import ec.edu.espe.purchaseandsalesrecordgui.utils.ValidationEmptyFields;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Andrés López
 */
public class FrmCreateCustomer extends javax.swing.JFrame {

    MongoDB mongoDbManager = new MongoDB();

    /**
     * Creates new form FrmClient
     */
    public FrmCreateCustomer() {
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

        pnl = new javax.swing.JPanel();
        jlbName = new javax.swing.JLabel();
        jlbLastName = new javax.swing.JLabel();
        jlbCellphone = new javax.swing.JLabel();
        jlbAddress = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtCellphone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        btnEmptyFields = new javax.swing.JButton();
        jlbCedula = new javax.swing.JLabel();
        jlbCreateCustomerTitle = new javax.swing.JLabel();
        jlbOnlyNumbersCedula = new javax.swing.JLabel();
        jlbOnlyNumbersCellphone = new javax.swing.JLabel();
        jlbValidateEmail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Client");

        pnl.setPreferredSize(new java.awt.Dimension(705, 465));

        jlbName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/name.png"))); // NOI18N
        jlbName.setText("Name: ");

        jlbLastName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/name.png"))); // NOI18N
        jlbLastName.setText("Last name:");

        jlbCellphone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/phoneNumber.png"))); // NOI18N
        jlbCellphone.setText("Cellphone: ");

        jlbAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/address.png"))); // NOI18N
        jlbAddress.setText("Address: ");

        jlbEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/email.png"))); // NOI18N
        jlbEmail.setText("Email: ");

        txtCedula.setToolTipText("Enter only 10 numbers");
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });

        txtName.setToolTipText("Don't use special characteres");

        txtLastName.setToolTipText("Don't use special characteres");

        txtCellphone.setToolTipText("Enter only 10 numbers");
        txtCellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCellphoneKeyPressed(evt);
            }
        });

        txtAddress.setToolTipText("Don't use special characteres");

        txtEmail.setToolTipText("The email must have a local part, then an @, and then a domain name\n");

        btnSave.setText("Save");
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

        btnEmptyFields.setText("Empty Fields");
        btnEmptyFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmptyFieldsActionPerformed(evt);
            }
        });

        jlbCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/cedula.png"))); // NOI18N
        jlbCedula.setText("Cédula: ");

        jlbCreateCustomerTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/purchaseandsalesrecordgui/images/CreateClientTitle.png"))); // NOI18N
        jlbCreateCustomerTitle.setText("Create Customer");

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLayout.createSequentialGroup()
                .addContainerGap(205, Short.MAX_VALUE)
                .addComponent(jlbCreateCustomerTitle)
                .addGap(174, 174, 174))
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave)
                    .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlbLastName)
                        .addComponent(jlbCellphone)
                        .addComponent(jlbAddress)
                        .addComponent(jlbEmail)
                        .addComponent(jlbName)
                        .addComponent(jlbCedula)))
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCellphone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtLastName)
                            .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(btnEmptyFields)
                        .addGap(100, 100, 100)
                        .addComponent(btnReturn)
                        .addGap(34, 34, 34))))
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jlbCreateCustomerTitle)
                .addGap(39, 39, 39)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCedula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCellphone)
                    .addComponent(txtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnEmptyFields)
                    .addComponent(btnSave))
                .addGap(30, 30, 30))
        );

        jlbOnlyNumbersCedula.setForeground(new java.awt.Color(255, 0, 0));

        jlbOnlyNumbersCellphone.setForeground(new java.awt.Color(255, 0, 0));

        jlbValidateEmail.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbOnlyNumbersCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(jlbOnlyNumbersCellphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbValidateEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jlbOnlyNumbersCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jlbOnlyNumbersCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jlbValidateEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmCustomerManagement frmClientMenu = new FrmCustomerManagement();
        frmClientMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnEmptyFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmptyFieldsActionPerformed
        ValidationEmptyFields validation = new ValidationEmptyFields();
        validation.emptyFields(evt, pnl, jlbOnlyNumbersCedula, jlbOnlyNumbersCellphone, jlbValidateEmail);
    }//GEN-LAST:event_btnEmptyFieldsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        ValidationEmptyFields validation = new ValidationEmptyFields();
        Document document = new Document();

        document.put("cedula", txtCedula.getText());
        document.put("name", txtName.getText());
        document.put("lastName", txtLastName.getText());
        document.put("cellphone", txtCellphone.getText());
        document.put("address", txtAddress.getText());

        if (validation.validateCedula(txtCedula.getText()) == true) {
            if (validation.validateEmail(txtEmail.getText()) == true) {
                document.put("email", txtEmail.getText());

                jlbOnlyNumbersCedula.setText("");
                jlbOnlyNumbersCellphone.setText("");
                jlbValidateEmail.setText("");
            } else {
                jlbValidateEmail.setText("Invalid Email!");
                JOptionPane.showMessageDialog(null, "Invalid Email!");
            }

            int saveOption = JOptionPane.showConfirmDialog(rootPane, "Are you sure to print this information.?");

            if (saveOption == 0) {
                mongoDbManager.save(document, "Customers");
                JOptionPane.showMessageDialog(rootPane, "Saved!");
            } else if (saveOption == 1) {
                JOptionPane.showMessageDialog(rootPane, "Ok, try again.");
            }
        } else {
            jlbOnlyNumbersCedula.setText("Invalid Cedula!");
            JOptionPane.showMessageDialog(null, "Invalid Cedula!");
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        ValidationEmptyFields validation = new ValidationEmptyFields();
        validation.validateOnlyNumbers(evt, txtCedula, jlbOnlyNumbersCedula);
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtCellphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellphoneKeyPressed
        ValidationEmptyFields validation = new ValidationEmptyFields();
        validation.validateOnlyNumbers(evt, txtCellphone, jlbOnlyNumbersCellphone);
    }//GEN-LAST:event_txtCellphoneKeyPressed

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
            java.util.logging.Logger.getLogger(FrmCreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmCreateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmptyFields;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jlbAddress;
    private javax.swing.JLabel jlbCedula;
    private javax.swing.JLabel jlbCellphone;
    private javax.swing.JLabel jlbCreateCustomerTitle;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbLastName;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbOnlyNumbersCedula;
    private javax.swing.JLabel jlbOnlyNumbersCellphone;
    private javax.swing.JLabel jlbValidateEmail;
    private javax.swing.JPanel pnl;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCellphone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
