/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.FileHandling;

import app.ClassPackage.Category;
import app.ClassPackage.Inventory;
import app.ClassPackage.Product;
import app.ClassPackage.User;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/**
 *
 * @author Vidura
 */
public class FileWriter {

    public static void writeOnUserDataFile() {

        try {
            Path path = Paths.get("Userdata.txt");
            String line = "";
            for (User user : User.allUsers) {
                line += user.getFirstname() + "," + user.getLastname() + "," + user.getRole() + "," + user.getContact() + "," + user.getEmail() + "," + user.getUsername() + "," + user.getPassword() + "\n";
            }

            Files.write(path, line.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeOnCategoryFile() {

        try {
            Path path = Paths.get("Category.txt");
            String line = "";
            for (Category category : Category.allCategories) {
                line += category.getCategoryName() + "\n";
            }

            Files.write(path, line.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void writeOnInventoryFile(){

        try {
            Path path = Paths.get("Inventory.txt");
            String line ="";
            for (Map.Entry<String, Integer> record : Inventory.data.entrySet()) {
                String key = record.getKey();
                int value = record.getValue();

                line += key + "," + value + "\n";
            }

            Files.write(path, line.getBytes());




        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    
    public static void writeOnProductsFile() {

        try {
            Path path = Paths.get("Products.txt");
            String line = "";
            for (Product product : Product.allProducts) {
                line += product.getProductCode() + "," + product.getProductName() + "," + product.getCategory() + "," + product.getProcessor() + "," + product.getPrice() + "," + product.getReleaseYear() + "\n";
            }

            Files.write(path, line.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    } 
}
