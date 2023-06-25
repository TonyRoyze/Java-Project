/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.ClassPackage;
import app.ClassPackage.Constants;
/**
 *
 * @author Vidura
 */
public class Manager extends User{

    public static User createUser(final Object role) {
        User user = null;
        if (role.toString().equals(Constants.MANAGER)) {
            user = new Manager();
        } else if (role.toString().equals(Constants.CASHIER)) {
            user = new Cashier();
        }
        return user;
    }
    
/*
    public static User createUser(final Object role) {
        User user = null;
        if (role.toString().equals(MANAGER) || role.toString().equals("Manager")) {
            user = new Manager();
        } else if (role.toString().equals(CASHIER) || role.toString().equals("Cashier")) {
            user = new Cashier();
        }
        return user;
    }
*/
}
