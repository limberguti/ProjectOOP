/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.utils;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Jhonatan Lituma
 */
public class CalculationTest {

    public CalculationTest() {
    }

    /**
     * Test of priceWithoutIva method, of class PriceCalculation.
     */
    @Test
    public void testPriceWithOutIva() {
        int quantity = 5;
        double pricePerUnit = 15.23;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 76.15;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva1() {
        int quantity = 7;
        double pricePerUnit = 5.0;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 35.0;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva2() {
        System.out.println("PriceWithOutIva");
        int quantity = 10;
        double pricePerUnit = 12.12;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 121.2;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result,0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva3() {
        System.out.println("PriceWithOutIva");
        int quantity = 3;
        double pricePerUnit = 2.1;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 6.3;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva4() {
        System.out.println("PriceWithOutIva");
        int quantity = 10;
        double pricePerUnit = 5.99;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 59.9;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva5() {
        System.out.println("PriceWithOutIva");
        int quantity = 7;
        double pricePerUnit = 3.49;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 24.43;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva6() {
        System.out.println("PriceWithOutIva");
        int quantity = 11;
        double pricePerUnit = 9.99;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 109.89;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva7() {
        System.out.println("PriceWithOutIva");
        int quantity = 6;
        double pricePerUnit = 5.59;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 33.54;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva8() {
        System.out.println("PriceWithOutIva");
        int quantity = 20;
        double pricePerUnit = 4.50;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 90.00;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva9() {
        System.out.println("PriceWithOutIva");
        int quantity = 1;
        double pricePerUnit = 3.33;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 3.33;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithOutIva10() {
        System.out.println("PriceWithOutIva");
        int quantity = 5;
        double pricePerUnit = 0.99;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 4.95;
        double result = instance.priceWithoutIva(quantity, pricePerUnit);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of priceWithIva method, of class PriceCalculation.
     */
    @Test
    public void testPriceWithIva() {
        System.out.println("PriceWithIva");
        double tax = 10.5;
        double price = 4.99;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 5.51;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithIva2() {
        System.out.println("PriceWithIva");
        double tax = 12.0;
        double price = 33.33;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 37.32;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithIva3() {
        System.out.println("PriceWithIva");
        double tax = 10.0;
        double price = 7.99;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 8.78;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithIva4() {
        System.out.println("PriceWithIva");
        double tax = 15.5;
        double price = 33.99;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 39.25;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testPriceWithIva5() {
        System.out.println("PriceWithIva");
        double tax = 13.3;
        double price = 50.0;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 56.65;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testPriceWithIva6() {
        System.out.println("PriceWithIva");
        double tax = 14.65;
        double price = 5.99;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 6.86;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testPriceWithIva7() {
        System.out.println("PriceWithIva");
        double tax = 0.5;
        double price = 12.39;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 12.45;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testPriceWithIva8() {
        System.out.println("PriceWithIva");
        double tax = 22.99;
        double price = 33.33;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 40.99;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testPriceWithIva9() {
        System.out.println("PriceWithIva");
        double tax = 12.29;
        double price = 45.45;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 51.03;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testPriceWithIva10() {
        System.out.println("PriceWithIva");
        double tax = 12.66;
        double price = 55.99;
        PriceCalculation instance = new PriceCalculation();
        double expResult = 63.07;
        double result = instance.priceWithIva(tax, price);
        assertEquals(expResult, result, 0.1);
        // TODO review the generated test code and remove the default call to fail.

    }

}
