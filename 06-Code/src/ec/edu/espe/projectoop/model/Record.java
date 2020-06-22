/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Jonathan
 */
public class Record {
    private int registerNumber;
    private Date date;
    private int nationalIdentityDocument;
    private String provider;
    private String description;
    private int quantity;
    private float price;
    
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

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
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
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
     @Override
    public String toString() {
        return "\t\tRegisterProvider "
                + "------------------------------------------------------------"
                + "\nBill Number: " + getRegisterNumber()
                + "\nDate: " + getDate()
                + "\nNational Identity Document: " + getNationalIdentityDocument()
                + "\nProvider: " + getProvider()
                + "\nPrice: " + getPrice()
                + "\nQuantity: " + getQuantity()
                + "\nDescription:" + getDescription()
                + "------------------------------------------------------------";
    }
    public void create() throws IOException {
        int day = 0;
        int month = 0;
        int year = 0;
        Date auxdate = new Date(day, month, year);

        Record aux;
        aux = new Record();

        ArrayList<Record> records = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(new File("PurchaseRegister.csv"), true)) {

            System.out.println("\t\t\nProvider Record");
            
            System.out.print("Enter the Register number: ");
            registerNumber = scanner.nextInt();
            aux.setRegisterNumber(registerNumber);
            
            System.out.print("Enter the National Identity Document: ");
            nationalIdentityDocument = scanner.nextInt();
            aux.setNationalIdentityDocument(nationalIdentityDocument);
            
            System.out.println("Please enter the date data by data. ");
            System.out.print("Enter the day: ");
            auxdate.setDay(scanner.nextInt());
            System.out.print("Enter the month: ");
            auxdate.setMonth(scanner.nextInt());            
            System.out.print("Enter the year: ");
            auxdate.setYear(scanner.nextInt());            
            aux.setDate(auxdate);
            
            
            System.out.print("Enter description: ");
            scanner.nextLine();
            description = scanner.nextLine();
            aux.setDescription(description);
   
            System.out.print("Enter the quantity: ");
            quantity = scanner.nextInt();
            aux.setQuantity(quantity);
            
            System.out.print("Enter the price: ");
            price = scanner.nextFloat();
            aux.setPrice(price);

            records.add(aux);

            StringBuilder sb = new StringBuilder();

            sb.append(aux.getRegisterNumber());
            sb.append(';');
            sb.append(aux.getNationalIdentityDocument());
            sb.append(';'); 
            sb.append(auxdate.getDay());
            sb.append("/");
            sb.append(auxdate.getMonth());
            sb.append("/");
            sb.append(auxdate.getYear());
            sb.append(';');  
            sb.append(aux.getQuantity());
            sb.append(';');
            sb.append(aux.getPrice());
            sb.append(';');            
            sb.append(aux.getDescription());
            sb.append(';');
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            writer.flush();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        //return billNumber;        //Polimorfismo
    }
     public void delete(int registerNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the invoice to delete: ");
        registerNumber = scanner.nextInt();

    }
      public void show(Record record) {
        record = new Record();
        int size = 0;
        String SEPARADOR = ";";
        String option = "";
        String auxRegisterNumber = "";
        do {
            boolean find = false;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the register number to show: ");
            auxRegisterNumber = scanner.nextLine();

            try {
                BufferedReader bufferLectura = new BufferedReader(new FileReader("PurchaseRegister.csv"));
                String linea = bufferLectura.readLine();

                while (linea != null) {
                    String[] records = linea.split(SEPARADOR);
                    linea = bufferLectura.readLine();
                    size = records.length;
                    for (int i = 0; i < size; i++) {
                        if (records[i].equals(auxRegisterNumber)) {
                            find = true;
                            System.out.println(Arrays.toString(records));
                            //System.out.println(invoice.toString());
                        }
                        else{
                            i++;
                            i++;
                            i++;
                            i++; 
                            i++; 
                        }
                    }
                    
                }
                
                if (find == true) {
                    System.out.print("Do you want to search again (Y/N)?: ");
                    option = scanner.nextLine();

                    if ("Y".equals(option) || "y".equals(option)) {
                        option = "";
                    }
                    if ("N".equals(option) || "n".equals(option)) {
                        option = "N";
                    }
                }
                               
                if (find == false) {
                    System.err.println("Register number was not found!");
                    System.out.println("Do you want to search again (Y/N)?: ");
                    option = scanner.nextLine();

                    if ("Y".equals(option) || "y".equals(option)) {
                        option = "";
                    }
                    if ("N".equals(option) || "n".equals(option)) {
                        option = "N";
                    }
                }

            } catch (IOException e) {

            }

        } while ("".equals(option));

    }

}



