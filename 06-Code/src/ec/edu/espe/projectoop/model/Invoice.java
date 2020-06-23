package ec.edu.espe.projectoop.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Duke's Children
 */
public class Invoice {

    private Date date;
    private int nationalIdentityDocument;
    private int billNumber;
    private float price;
    private int quantity;
    private String description;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getNationalIdentityDocument() {
        return nationalIdentityDocument;
    }

    public void setNationalIdentityDocument(int nationalIdentityDocument) {
        this.nationalIdentityDocument = nationalIdentityDocument;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\t\tINVOICE "
                + "------------------------------------------------------------"
                + "\nDate: " + getDate()
                + "\nNational Identity Document: " + getNationalIdentityDocument()
                + "\nBill Number: " + getBillNumber()
                + "\nPrice: " + getPrice()
                + "\nQuantity: " + getQuantity()
                + "\nDescription:" + getDescription()
                + "------------------------------------------------------------";
    }

}
