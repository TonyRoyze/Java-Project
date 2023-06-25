/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.FormPackage;
import app.ClassPackage.Constants;

import java.util.ArrayList;

import app.ClassPackage.Product;
import app.ClassPackage.CommonFunctions;

/**
 *
 * @author Vidura
 */
public class HomePage extends javax.swing.JFrame {

    private String role, name;

    /**
     * Creates new form HomePage
     *
     * @param role
     * @param name
     */
    public HomePage(String role, String name) {
        initComponents();
        this.role = role;
        this.name = name;
        
        if (role.equals(Constants.MANAGER)){
            btnAddProduct.setVisible(true);
            btnAddUser.setVisible(true);
        }
        else {
            btnAddProduct.setVisible(false);
            btnAddUser.setVisible(false);
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

        btnSearch = new javax.swing.JButton();
        tfProductName = new javax.swing.JTextField();
        labelProductName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taProductsTable = new javax.swing.JTextArea();
        labelCategory = new javax.swing.JLabel();
        tfCategory = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        labelPrice = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        labelProductName.setText("Product Name");

        taProductsTable.setColumns(20);
        taProductsTable.setRows(5);
        jScrollPane2.setViewportView(taProductsTable);

        labelCategory.setText("Category");

        labelPrice.setText("Below");

        btnAddProduct.setText("Add Product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(29, 29, 29)
                .addComponent(btnAddProduct)
                .addGap(18, 18, 18)
                .addComponent(btnAddUser)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelProductName)
                        .addGap(18, 18, 18)
                        .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCategory)
                        .addGap(18, 18, 18)
                        .addComponent(tfCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelProductName)
                    .addComponent(labelCategory)
                    .addComponent(tfCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPrice)
                    .addComponent(btnLogout))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnAddProduct)
                    .addComponent(btnAddUser))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String productName = tfProductName.getText().toString();
        String category = tfCategory.getText().toString();
        String price = tfPrice.getText().toString();
        ArrayList<Product> productList;
        
        if (productName.isEmpty() && category.isEmpty() && price.isEmpty())
            productList = CommonFunctions.filter();
        else
            productList = CommonFunctions.filter(productName, category, price);
        
        
        String text = CommonFunctions.setTextArea(productList);
        taProductsTable.setText(text);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        AddProductForm addProductForm = new AddProductForm(role, name);
        addProductForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        AddUserForm addUserForm = new AddUserForm(role, name);
        addUserForm.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddUserActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelProductName;
    private javax.swing.JTextArea taProductsTable;
    private javax.swing.JTextField tfCategory;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfProductName;
    // End of variables declaration//GEN-END:variables
}
