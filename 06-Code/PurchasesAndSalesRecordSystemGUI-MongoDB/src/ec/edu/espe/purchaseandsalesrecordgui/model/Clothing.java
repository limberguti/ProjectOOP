/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.model;

/**
 *
 * @author Jhonatan Lituma
 */
public class Clothing {

    private String id;
    private String typeOfClothing;
    private String size;
    private String idProvider;
    private String brand;
    private double purchasePrice;
    private double salePrice;
    private int quantity;

    public Clothing() {
    }

    public Clothing(String id, String typeOfClothing, String size, String idProvider, String brand, double purchasePrice, double salePrice, int quantity) {
        this.id = id;
        this.typeOfClothing = typeOfClothing;
        this.size = size;
        this.idProvider = idProvider;
        this.brand = brand;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.quantity = quantity;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the typeOfClothing
     */
    public String getTypeOfClothing() {
        return typeOfClothing;
    }

    /**
     * @param typeOfClothing the typeOfClothing to set
     */
    public void setTypeOfClothing(String typeOfClothing) {
        this.typeOfClothing = typeOfClothing;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the idProvider
     */
    public String getIdProvider() {
        return idProvider;
    }

    /**
     * @param idProvider the idProvider to set
     */
    public void setIdProvider(String idProvider) {
        this.idProvider = idProvider;
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
     * @return the purchasePrice
     */
    public double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * @param purchasePrice the purchasePrice to set
     */
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * @return the salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
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

    @Override
    public String toString() {
        return this.id;
    }

}
