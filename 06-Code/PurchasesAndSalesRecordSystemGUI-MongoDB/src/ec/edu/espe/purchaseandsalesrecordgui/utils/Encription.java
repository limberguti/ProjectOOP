/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.utils;

/**
 *
 * @author Christopher Loachami
 */
public class Encription {
    
    public String encrypt(String password) {

        char[] passwords;
        passwords = password.toCharArray();
        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = (char) (passwords[i] + (char) 1);
        }
        String encryptedPassword = String.valueOf(passwords);
        return encryptedPassword;
    }

    public String decipher(String encryptPassword) {
        char[] passwords;
        passwords = encryptPassword.toCharArray();
        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = (char) (passwords[i] - (char) 1);
        }
        String decryptedPassword = String.valueOf(passwords);
        return decryptedPassword;
    }
    
}
