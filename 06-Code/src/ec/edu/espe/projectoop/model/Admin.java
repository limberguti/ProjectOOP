/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.projectoop.model;

import java.util.ArrayList;

/**
 *
 * @author Jhonatan Lituma
 */
public class Admin {
    
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    
    /*
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("User");
        sb.append(';');
        sb.append("Password");
        sb.append('\n');
        return sb.toString();
    }
    */
}
