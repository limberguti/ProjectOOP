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
public class Clothing {

 
    private String category;
    private String brand;

    @Override
    public String toString() {
        return "Clothing{" + "category=" + category + ", brand=" + brand + '}';
    }

    
    
    public Clothing(String category, String brand) {
        this.category = category;
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
 

  