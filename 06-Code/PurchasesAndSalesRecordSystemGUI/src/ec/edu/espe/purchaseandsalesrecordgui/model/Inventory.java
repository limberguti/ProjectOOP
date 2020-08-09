/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.model;

/**
 *
 * @author Christopher Loachami
 */
public class Inventory {

    private String provider;
    private String clothing;
    private String brand;
    private int quantity;
    private float price;
    private float total;

    public Inventory() {

    }

    public Inventory(String provider, String clothing, String brand, int quantity, float price, float total) {
        this.provider = provider;
        this.clothing = clothing;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
    }

    /**
     * @return the provider
     */
    public String getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * @return the clothing
     */
    public String getClothing() {
        return clothing;
    }

    /**
     * @param clothing the clothing to set
     */
    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Inventory{" + "provider=" + provider + ", clothing=" + clothing + ", brand=" + brand + ", quantity=" + quantity + ", price=" + price + ", total=" + total + '}';
    }

}
