/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.purchaseandsalesrecordgui.model;

import java.util.Date;

/**
 *
 * @author Jhonatan Lituma
 */
public class Invoice {

    private int id;
    private Date date;
    private String cedulaClient;
    private double tax;
    private double total;

    public Invoice() {

    }

    public Invoice(int id, Date date, String cedulaClient, double tax, double total) {
        this.id = id;
        this.date = date;
        this.cedulaClient = cedulaClient;
        this.tax = tax;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCedulaClient() {
        return cedulaClient;
    }

    public void setCedulaClient(String cedulaClient) {
        this.cedulaClient = cedulaClient;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Invoice{" + "id=" + id + ", date=" + date + ", cedulaClient=" + cedulaClient + ", tax=" + tax + ", total=" + total + '}';
    }

}
