/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ClassPackage;

import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class CommonFunctions {

    
    public static ArrayList<Product> filter() {
        return Product.allProducts;
    }

    
    public static ArrayList<Product> filter(String productName, String category, String price) {
        ArrayList<Product> filteredList = new ArrayList<>();

        for (Product product : Product.allProducts) {
            String line = product.getProductName() + product.getCategory();
            line = line.replaceAll("\\s", "").toLowerCase();
            double priceValue = !price.isEmpty() ? Double.parseDouble(price) : 0;

            if (priceValue != 0 && !productName.isEmpty() && !category.isEmpty()) {
                if (product.getPrice() < priceValue && line.contains(productName.toLowerCase()) && line.contains(category.toLowerCase())) {
                    filteredList.add(product);
                }
            }
            else if (priceValue != 0 && !productName.isEmpty()){
                if (product.getPrice() < priceValue && line.contains(productName.toLowerCase())) {
                    filteredList.add(product);
                }
            }
            else if (priceValue != 0 && !category.isEmpty()){
                if (product.getPrice() < priceValue && line.contains(category.toLowerCase())) {
                    filteredList.add(product);
                }
            }
            else if (!category.isEmpty() && !productName.isEmpty()){
                if (line.contains(productName.toLowerCase()) && line.contains(category.toLowerCase())) {
                    filteredList.add(product);
                } 
            }
            else if (priceValue != 0) {
                if (product.getPrice() < priceValue) {
                    filteredList.add(product);
                }
            }
            else if (!productName.isEmpty()) {
                if (line.contains(productName.toLowerCase())) {
                    filteredList.add(product);
                }
            }
            else if (!category.isEmpty()){
                if (line.contains(category .toLowerCase())) {
                    filteredList.add(product);
                }
            }
        }

        return filteredList;
    }

    public static String setTextArea(ArrayList<Product> productList) {
        String textArea = "CODE\tNAME\t\tPRICE\tSTOCK\tCHIP\tCATEGORY\tYEAR\n";
        String space;
        
        for (Product product : productList) {
            int stock = getStockLevel(product.getProductCode());
            space = product.getProductName().length() > 14 ? "\t" : "\t\t";
            textArea += product.getProductCode() + "\t" + product.getProductName() + space + product.getPrice() + "\t" + stock + "\t"
                    + product.getProcessor() + "\t" + product.getCategory() + "\t" + product.getReleaseYear() + "\n";
        }
        return textArea;
    }
    
    public static int getStockLevel(String productCode){
        return Inventory.data.get(productCode);
    }
}
