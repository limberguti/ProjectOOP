/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecord.controller;

/**
 *
 * @author Christopher Loachami
 */
public class Clothing {

    private int id;
    private int date;
    private String category;
    private String fabric;
    private String color;
    private int price;
    private int total;

    public Clothing(int id, int date, String category, String fabric, String color, int price, int total) {
        this.id = id;
        this.date = date;
        this.category = category;
        this.fabric = fabric;
        this.color = color;
        this.price = price;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Clothing{" + "id=" + id + ", date=" + date + ", category=" + category + 
                ", fabric=" + fabric + ", color=" + color + ", price=" + price + ", total=" + total + '}';
    }
    
    

}
