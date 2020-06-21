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
                + "\nDate: " + date
                + "\nNational Identity Document: " + nationalIdentityDocument
                + "\nBill Number: " + billNumber
                + "\nPrice: " + price
                + "\nQuantity: " + quantity
                + "\nDescription:" + description
                + "------------------------------------------------------------";
    }

    public void create() throws IOException {
        int day = 0;
        int month = 0;
        int year = 0;
        Date date = new Date(day, month, year);

        Invoice aux;
        aux = new Invoice();

        ArrayList<Invoice> invoices = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(new File("SalesInvoice.csv"), true)) {

            System.out.println("\t\t\nINVOICE");
            System.out.println("\nEnter the date ");
            System.out.println("Enter the day: ");
            date.setDay(scanner.nextInt());
            //System.out.println(date.getDay());
            System.out.println("Enter the month: ");
            date.setMonth(scanner.nextInt());
            System.out.println("Enter the year: ");
            date.setYear(scanner.nextInt());
            aux.setDate(date);

            System.out.print("\nEnter the National Identity Document: ");
            nationalIdentityDocument = scanner.nextInt();
            aux.setNationalIdentityDocument(nationalIdentityDocument);

            System.out.print("Enter the bill number: ");
            billNumber = scanner.nextInt();
            aux.setBillNumber(billNumber);

            System.out.print("Enter the price: ");
            price = scanner.nextFloat();
            aux.setPrice(price);

            System.out.print("Enter the quantity: ");
            quantity = scanner.nextInt();
            aux.setQuantity(quantity);

            System.out.print("Enter description: ");
            scanner.nextLine();
            description = scanner.nextLine();
            aux.setDescription(description);

            invoices.add(aux);

            StringBuilder sb = new StringBuilder();

            sb.append(date.getDay());
            sb.append("-");
            sb.append(date.getMonth());
            sb.append("-");
            sb.append(date.getYear());
            sb.append(';');
            sb.append(aux.getNationalIdentityDocument());
            sb.append(';');
            sb.append(aux.getBillNumber());
            sb.append(';');
            sb.append(aux.getPrice());
            sb.append(';');
            sb.append(aux.getQuantity());
            sb.append(';');
            sb.append(aux.getDescription());
            sb.append(';');
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            writer.flush();

            System.out.println("Done!");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        //return billNumber;        //Polimorfismo
    }

    public void delete(int billNumber) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the invoice to delete: ");
        billNumber = scanner.nextInt();
        /*
        if () {
            //codigo para borrar la factura
        } else {
            System.out.println("Enter a correct bill number!");
        }*/
    }

    public void show(Invoice invoice) {
        invoice = new Invoice();
        int size = 0;
        String SEPARADOR = ";";
        boolean find = false;
        int attemps = 0;
        String[] auxInvoice = new String[10];
        String option = "";
        String auxBillNumber = "";
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the bill number to show: ");
            auxBillNumber = scanner.nextLine();

            try {
                BufferedReader bufferLectura = new BufferedReader(new FileReader("SalesInvoice.csv"));
                String linea = bufferLectura.readLine();

                while (linea != null) {
                    String[] invoices = linea.split(SEPARADOR);
                    linea = bufferLectura.readLine();
                    size = invoices.length;
                    //System.out.println(Arrays.toString(invoices));
                    for (int i = 0; i < size; i++) {
                        if (invoices[2].equals(auxBillNumber)) {
                            find = true;
                            auxInvoice[i] = invoices[i];
                        } else {
                            i++;
                        }
                    }
                    if (find == true) {
                        for (int i = 0; i < size; i++) {
                            System.out.println(auxInvoice[i]);
                        }
                        
                    }
                }

                /*if (find == true) {
                    //System.out.println(Arrays.toString(invoices));
                    System.out.println("verdad");
                }*/
                if (find == false) {
                    System.err.println("Bill number was not found!");
                    System.out.println("Do you want to search again?(Y/N)");
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

        } while (attemps < 5);

    }

}
