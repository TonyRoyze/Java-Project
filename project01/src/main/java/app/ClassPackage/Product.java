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
public class Product implements Inventory {
    
    public static ArrayList<Product> allProducts = new ArrayList<>();
    private String productCode;
    private String productName;
    private String category;
    private String processor;
    private String releaseYear;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }
    
    
    @Override
    public void updateInventory(String productCode, int quantity) {
        if (Inventory.data.containsKey(productCode)){
            quantity += Inventory.data.get(productCode);
        }
        Inventory.data.put(productCode, quantity);
    }
    
}
