/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.ClassPackage;

import app.FileHandling.FileReader;
import app.FormPackage.LoginForm;

/**
 *
 * @author Vidura
 */
public class Start {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        
    }
}
