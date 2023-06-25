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
public class User {
    
    public static ArrayList<User> allUsers = new ArrayList<>();
    
    protected String username;
    protected String password;

    protected String firstName;
    protected String lastName;
    protected String role;
    private String contact;
    private String email;

    public static String[] login(String un, String pass) {
        for(User user : allUsers){
            if (un.equals(user.getUsername()) && pass.equals(user.getPassword()))
            {
                String[] data = {user.getRole(), user.getFirstname()};
                return data;
            }
        }
        String[] data = {"null", "null"};
        return data;

    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String fname) {
        this.firstName = fname;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lname) {
        this.lastName = lname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String type) {
        this.role = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
