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
    private String quantity;
    private String price;
    private String total;

    public Inventory( String provider, String clothing, String brand, String quantity, String price,String total) {
        this.provider = provider;
        this.clothing = clothing;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.total= total;
    }

    @Override
    public String toString() {
        return "Inventory{"+ "provider=" + provider + ", clothing=" + clothing + ", brand=" + brand + ", quantity=" + quantity + ", price=" + price + ", total=" + total + '}';
    }

   
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

   

    
    

    
}
