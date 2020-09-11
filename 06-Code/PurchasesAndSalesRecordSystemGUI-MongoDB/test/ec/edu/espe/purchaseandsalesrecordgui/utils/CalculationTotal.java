/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.utils;

import ec.edu.espe.purchaseandsalesrecordgui.utils.Calculater;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author JONATHAN MAIGUA
 */
public class CalculationTotal {

    public CalculationTotal() {
    }

    /**
     * Test of PriceWithOutIva method, of class Calculation.
     */
    @Test
    public void testPriceTotal() {
        int quantity = 20;
        double pricePerUnit = 15.23;
        Calculater calculater = new Calculater();
        double expResult = 304.6;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal2() {
        int quantity = 19;
        double pricePerUnit = 5.0;
        Calculater calculater = new Calculater();
        double expResult = 95.0;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal3() {
        int quantity = 18;
        double pricePerUnit = 12.2;
        Calculater calculater = new Calculater();
        double expResult = 219.6;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal4() {
        int quantity = 17;
        double pricePerUnit = 2.1;
        Calculater calculater = new Calculater();
        double expResult = 35.7 ;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal5() {
        int quantity = 16;
        double pricePerUnit = 5.99;
        Calculater calculater = new Calculater();
        double expResult = 95.84;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal6() {
        int quantity = 15;
        double pricePerUnit =  3.49;
        Calculater calculater = new Calculater();
        double expResult = 52.35;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal7() {
        int quantity = 14;
        double pricePerUnit = 9.99;
        Calculater calculater = new Calculater();
        double expResult = 139.86;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal8() {
        int quantity = 13;
        double pricePerUnit = 5.59;
        Calculater calculater = new Calculater();
        double expResult = 72.67;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal9() {
        int quantity = 12;
        double pricePerUnit = 4.50 ;
        Calculater calculater = new Calculater();
        double expResult = 54;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal10() {
        int quantity = 11;
        double pricePerUnit = 3.33;
        Calculater calculater = new Calculater();
        double expResult = 36.63;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal11() {
        int quantity = 10;
        double pricePerUnit = 0.99 ;
        Calculater calculater = new Calculater();
        double expResult = 9.9;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal12() {
        int quantity = 1;
        double pricePerUnit = 4.99;
        Calculater calculater = new Calculater();
        double expResult = 4.99;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal13() {
        int quantity = 2;
        double pricePerUnit = 7.99;
        Calculater calculater = new Calculater();
        double expResult = 15.98;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal14() {
        int quantity = 3;
        double pricePerUnit = 33.39;
        Calculater calculater = new Calculater();
        double expResult = 100.17 ;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal15() {
        int quantity = 4;
        double pricePerUnit = 50.0;
        Calculater calculater = new Calculater();
        double expResult = 200.0;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal16() {
        int quantity = 5;
        double pricePerUnit = 5.99;
        Calculater calculater = new Calculater();
        double expResult = 29.95 ;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal17() {
        int quantity = 6;
        double pricePerUnit = 12.39;
        Calculater calculater = new Calculater();
        double expResult = 74.34 ;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal18() {
        int quantity = 7;
        double pricePerUnit = 33.33;
        Calculater calculater = new Calculater();
        double expResult = 233.31 ;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal19() {
        int quantity = 0;
        double pricePerUnit = 45.45;
        Calculater calculater = new Calculater();
        double expResult = 0;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal20() {
        int quantity = 01;
        double pricePerUnit = 55.99;
        Calculater calculater = new Calculater();
        double expResult = 55.99 ;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
      @Test
    public void testPriceTotal21() {
        int quantity = -6;
        double pricePerUnit = 0.4;
        Calculater calculater = new Calculater();
        double expResult = -2.4 ;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPriceTotal22() {
        int quantity = -25;
        double pricePerUnit = 1.9;
        Calculater calculater = new Calculater();
        double expResult = -47.5;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testPriceTotal23() {
        int quantity = -3;
        double pricePerUnit = -1.3;
        Calculater calculater = new Calculater();
        double expResult = 3.9 ;
        double result = calculater.PriceTotal(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}