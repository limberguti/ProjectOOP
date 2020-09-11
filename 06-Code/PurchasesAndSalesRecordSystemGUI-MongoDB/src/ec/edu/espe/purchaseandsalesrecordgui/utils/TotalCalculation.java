/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.utils;

/**
 *
 * @author JONATHAN MAIGUA
 */
public abstract class TotalCalculation {

    /**
     *
     * @param quantity The quantity of the product do you have.
     * @param pricePerUnit The price per unit of the product do you have.
     * @return total price.
     */
    public double priceTotal(int quantity, double pricePerUnit) {
        double total = pricePerUnit * quantity;
        return total;

    }

    public abstract double priceWithoutIva(int quantity, double pricePerUnit);

    public abstract double priceWithIva(double tax, double price);

}
