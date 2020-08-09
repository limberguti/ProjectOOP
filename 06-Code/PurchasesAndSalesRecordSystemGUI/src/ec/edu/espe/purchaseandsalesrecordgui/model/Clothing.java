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

    public Clothing() {

    }

    public Clothing(String category, String brand) {
        this.category = category;
        this.brand = brand;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
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

    @Override
    public String toString() {
        return "Clothing{" + "category=" + category + ", brand=" + brand + '}';
    }

}
