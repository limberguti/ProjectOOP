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
public class PriceCalculation extends TotalCalculation {

    /**
     *
     * @param quantity The quantity of the product do you have.
     * @param pricePerUnit The price per unit of the product do you have.
     * @return total price.
     */
    @Override
    public double priceWithoutIva(int quantity, double pricePerUnit) {
        double total = pricePerUnit * quantity;
        return total;
    }

    /**
     *
     * @param tax The tax dou yo want
     * @param price The price without iva
     * @return total with iva.
     */

    @Override
    public double priceWithIva(double tax, double price) {
        double total = price + (price * (tax / 100));
        return total;
    }

}
