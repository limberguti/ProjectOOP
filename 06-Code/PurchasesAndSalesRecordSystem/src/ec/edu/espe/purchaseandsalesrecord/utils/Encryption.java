/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecord.utils;

/**
 *
 * @author Jhonatan Lituma
 */
public class Encryption {
    
    public String codePassword(String password){
        String code = "";
        String finalPassword = "";
        for (int i = 0; i < password.length(); i++) {
            char a = password.charAt(i);
            int ascii = a;
            ascii += i;
            char b = (char) ascii;
            code += b;
        }
        finalPassword=code;
        return finalPassword;
    }
    
    public String decipherCode(String password){
        String code = "";
        String finalPassword = "";
        for (int i = 0; i < password.length(); i++) {
            char a = password.charAt(i);
            int ascii = a;
            ascii -= i;//p-0
            char b = (char) ascii;
            code += b;
        }
        finalPassword=code;
        return finalPassword;
    }
    
}
