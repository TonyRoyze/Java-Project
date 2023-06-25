/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//Class Imports
import app.ClassPackage.User;
import app.ClassPackage.Manager;
import app.ClassPackage.Category;
import app.ClassPackage.Product;
import app.ClassPackage.Constants;
import app.ClassPackage.Inventory;
import java.util.Map;

/**
 *
 * @author Vidura
 */
public final class FileReader {

    public FileReader() {
        readUserDataFile();
        readCategoryDataFile();
        readProductDataFile();
        readInventoryFile();
    }

    public void readUserDataFile() {
        Path Userdata = Paths.get("Userdata.txt");
        try {
            List<String> dataLines = Files.readAllLines(Userdata);
            for (String data : dataLines) {
                String[] dataArray = data.split(",");
                if (dataArray.length >= 7) {
                    String fName = dataArray[0];
                    String lName = dataArray[1];
                    String role = dataArray[2];
                    String contact = dataArray[3];
                    String email = dataArray[4];
                    String username = dataArray[5];
                    String password = dataArray[6];
                    User user = Manager.createUser(role);
                    user.setFirstname(fName);
                    user.setLastname(lName);
                    user.setRole(role);
                    user.setContact(contact);
                    user.setEmail(email);
                    user.setUsername(username);
                    user.setPassword(password);
                    User.allUsers.add(user);
                }

            }

        } catch (IOException e) {
            System.out.println(Constants.READERROR);
            e.printStackTrace();
        }

        /*
        //Testing Reading Function
        for (User user : User.allUsers) {
            System.out.println(user.getFirstname() + user.getRole());
        }
         */
    }

    public static void readCategoryDataFile() {
        Path Categories = Paths.get("Category.txt");
        try {
            List<String> dataLines = Files.readAllLines(Categories);
            for (String cat : dataLines) {
                Category category = new Category();
                category.setCategoryName(cat);
                Category.allCategories.add(category);
            }
        } catch (IOException e) {
            System.out.println(Constants.READERROR);
            e.printStackTrace();
        }

        /*
        //Testing Reading Function
        for (Category category : Category.allCategories) {
            System.out.println(category.getCategoryName());
        }
         */
    }

    public void readProductDataFile() {
        Path Products = Paths.get("Products.txt");
        try {
            List<String> dataLines = Files.readAllLines(Products);
            for (String data : dataLines) {
                String[] dataArray = data.split(",");
                if (dataArray.length >= 6) {
                    String productCode = dataArray[0];
                    String productName = dataArray[1];
                    String category = dataArray[2];
                    String processor = dataArray[3];
                    String releaseYear = dataArray[5];
                    double price = Double.parseDouble(dataArray[4]);

                    Product product = new Product();
                    product.setProductCode(productCode);
                    product.setProductName(productName);
                    product.setCategory(category);
                    product.setProcessor(processor);
                    product.setReleaseYear(releaseYear);
                    product.setPrice(price);
                    Product.allProducts.add(product);
                }
            }
        } catch (IOException e) {
            System.out.println(Constants.READERROR);
            e.printStackTrace();
        }
        /*
        //Testing Reading Function
        for (Product product : Product.allProducts) {
            System.out.println(product.getProductName());
        }
         */

    }

    public void readInventoryFile() {
        Path Products = Paths.get("Inventory.txt");
        try {
            List<String> dataLines = Files.readAllLines(Products);
            for (String data : dataLines) {
                String[] dataArray = data.split(",");
                if (dataArray.length >= 2) {
                    String productCode = dataArray[0];
                    int quantity = Integer.parseInt(dataArray[1]);
                    Inventory.data.put(productCode, quantity);
                }
            }
        } catch (IOException e) {
            System.out.println(Constants.READERROR);
            e.printStackTrace();
        }

        //Testing Reading Function
        for (Map.Entry<String, Integer> ee : Inventory.data.entrySet()) {
            String key = ee.getKey();
            int value = ee.getValue();
            System.out.println(key);
            System.out.println(value);
        }
//        for (Product product : Inventory.allProducts) {
//            System.out.println(product.getProductName());
//        }

    }
}
