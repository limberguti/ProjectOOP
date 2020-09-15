/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.utils;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christopher Loachami
 */
public class EncriptionTest {
    
    public EncriptionTest() {
    }

    /**
     * Test of encrypt method, of class Encription.
     */
    @Test
    public void testEncrypt1() {
        System.out.println("encrypt");
        String password = "chris";
        Encription instance = new Encription();
        String expResult = "disjt";
        String result = instance.encrypt(password);
        assertEquals(expResult, result);
        System.out.println("password encrypt->  "+result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of decipher method, of class Encription.
     */
    @Test
    public void testDecipher2() {
        System.out.println("decipher");
        String encryptPassword = "2";
        Encription instance = new Encription();
        String expResult = "1";
        String result = instance.decipher(encryptPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         System.out.println("password decipher->  "+result);   
    }
    
      @Test
    public void testEncrypt3() {
        System.out.println("encrypt");
        String password = "jona";
        Encription instance = new Encription();
        String expResult = "kpob";
        String result = instance.encrypt(password);
        assertEquals(expResult, result);
        System.out.println("password encrypt->  "+result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of decipher method, of class Encription.
     */
    @Test
    public void testDecipher4() {
        System.out.println("decipher");
        String encryptPassword = "kpob";
        Encription instance = new Encription();
        String expResult = "jona";
        String result = instance.decipher(encryptPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         System.out.println("password decipher->  "+result);   
    }
    
      @Test
    public void testEncrypt5() {
        System.out.println("encrypt");
        String password = "1234";
        Encription instance = new Encription();
        String expResult = "2345";
        String result = instance.encrypt(password);
        assertEquals(expResult, result);
        System.out.println("password encrypt->  "+result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of decipher method, of class Encription.
     */
    @Test
    public void testDecipher6() {
        System.out.println("decipher");
        String encryptPassword = "863";
        Encription instance = new Encription();
        String expResult = "752";
        String result = instance.decipher(encryptPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         System.out.println("password decipher->  "+result);   
    }
    
      @Test
    public void testEncrypt7() {
        System.out.println("encrypt");
        String password = "limber";
        Encription instance = new Encription();
        String expResult = "mjncfs";
        String result = instance.encrypt(password);
        assertEquals(expResult, result);
        System.out.println("password encrypt->  "+result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of decipher method, of class Encription.
     */
    @Test
    public void testDecipher8() {
        System.out.println("decipher");
        String encryptPassword = "mjncfs";
        Encription instance = new Encription();
        String expResult = "limber";
        String result = instance.decipher(encryptPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         System.out.println("password decipher->  "+result);   
    }
    
      @Test
    public void testEncrypt9() {
        System.out.println("encrypt");
        String password = "andres";
        Encription instance = new Encription();
        String expResult = "boesft";
        String result = instance.encrypt(password);
        assertEquals(expResult, result);
        System.out.println("password encrypt->  "+result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of decipher method, of class Encription.
     */
    @Test
    public void testDecipher10() {
        System.out.println("decipher");
        String encryptPassword = "boesft";
        Encription instance = new Encription();
        String expResult = "andres";
        String result = instance.decipher(encryptPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
         System.out.println("password decipher->  "+result);   
    }
    
}
