package app.ClassPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Vidura
 */

import java.util.HashMap;

public interface Inventory {
    HashMap<String, Integer> data = new HashMap<>();
    
    void updateInventory(String productCode, int quantity );
}
