/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.FormPackage;

import app.ClassPackage.Category;
import app.ClassPackage.Constants;
import app.ClassPackage.Product;
import app.FileHandling.FileWriter;
import app.FileHandling.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Vidura
 */
public class AddProductForm extends javax.swing.JFrame {
    
    private String role;
    private String firstName;

    /**
     * Creates new form AddProductForm
     */
    public AddProductForm(String role, String firstName) {
        this.role = role;
        this.firstName = firstName;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelProductCode = new javax.swing.JLabel();
        tfProductCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfProcessor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfCategory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfPrice = new javax.swing.JTextField();
        tfReleaseYear = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfStock = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfProductName = new javax.swing.JTextField();
        btnAddCategory = new javax.swing.JButton();
        labelBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelProductCode.setText("Product Code");

        jLabel2.setText("Category");

        jLabel3.setText("Processor");

        tfCategory.setToolTipText("");

        jLabel4.setText("Price");

        jLabel5.setText("Release Year");

        jLabel6.setText("Stock");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel7.setText("Product Name");

        btnAddCategory.setText("+");
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });

        labelBack.setText("Back");
        labelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCategory)
                                    .addComponent(tfProcessor)
                                    .addComponent(tfPrice)
                                    .addComponent(tfReleaseYear)
                                    .addComponent(tfStock)
                                    .addComponent(tfProductName)
                                    .addComponent(tfProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddCategory))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(labelBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(labelBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProductCode)
                    .addComponent(tfProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnAddCategory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProcessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfReleaseYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        boolean categoryExcists = false;

        String productCode = tfProductCode.getText().toString();
        String productName = tfProductName.getText().toString();
        String category = tfCategory.getText().toString();
        String processor = tfProcessor.getText().toString();
        String releaseYear = tfReleaseYear.getText().toString();
        int stock = 0;
        double price = 0;
        for (Category cat : Category.allCategories) {
            if (category.equals(cat.getCategoryName())) {
                categoryExcists = true;
            }
        }

        if (productCode.isEmpty() || productName.isEmpty() || category.isEmpty() || processor.isEmpty() || releaseYear.isEmpty() || tfStock.getText().isEmpty() || tfPrice.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, Constants.FIELDEMPTY, "Add Category", JOptionPane.WARNING_MESSAGE);
        } else if (categoryExcists) {
            stock = Integer.parseInt(tfStock.getText());
            price = Double.parseDouble(tfPrice.getText());
            Product product = new Product();
            product.setProductCode(productCode);
            product.setProductName(productName);
            product.setCategory(category);
            product.setProcessor(processor);
            product.setReleaseYear(releaseYear);
            product.setPrice(price);
            Product.allProducts.add(product);
            FileWriter.writeOnProductsFile();
            product.updateInventory(productCode, stock);
            FileWriter.writeOnInventoryFile();
            JOptionPane.showMessageDialog(null, Constants.PRODUCTADDED, "Add Product", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, Constants.INEXCISTANTCATEGORY, "Add Product", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
        boolean categoryExcists = false;
        String category = tfCategory.getText().toString();
        for (Category cat : Category.allCategories) {
            if (category.equals(cat.getCategoryName())) {
                categoryExcists = true;
            }
        }

        if (category.isEmpty()) {
            JOptionPane.showMessageDialog(null, Constants.FIELDEMPTY, "Add Category", JOptionPane.WARNING_MESSAGE);
        } else if (!categoryExcists) {
            Category cat = new Category();
            cat.setCategoryName(category);
            Category.allCategories.add(cat);
            FileWriter.writeOnCategoryFile();
            FileReader.readCategoryDataFile();
            JOptionPane.showMessageDialog(null, Constants.CATEGORYADDED, "Add Category", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, Constants.EXCISTANTCATEGORY, "Add Category", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnAddCategoryActionPerformed

    private void labelBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBackMouseClicked
        HomePage homePage = new HomePage(role, firstName);
        homePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_labelBackMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelBack;
    private javax.swing.JLabel labelProductCode;
    private javax.swing.JTextField tfCategory;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfProcessor;
    private javax.swing.JTextField tfProductCode;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfReleaseYear;
    private javax.swing.JTextField tfStock;
    // End of variables declaration//GEN-END:variables
}
