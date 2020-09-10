/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.utils;

/**
 *
 * @author Jhonatan Lituma
 */
public class Calculation {
    /**
     * 
     * @param quantity The quantity of the product do you have.
     * @param pricePerUnit The price per unit of the product do you have.
     * @return total price.
     */
    public double PriceWithOutIva(int quantity, double pricePerUnit){
        double total = pricePerUnit*quantity;    
        return total;
    }
    /**
     * 
     * @param tax The tax dou yo want
     * @param price The price without iva
     * @return total with iva.
     */
    public double PriceWithIva(double tax, double price){
        double total = price + (price * (tax / 100));    
        return total;
    }

}