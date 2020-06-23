package ec.edu.espe.projectoop.controller;
import ec.edu.espe.projectoop.model.Date;
import ec.edu.espe.projectoop.model.Invoice;
import ec.edu.espe.projectoop.utils.FileManager;
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
 * @author Jhonatan Lituma
 */
public class InvoiceMenu {

    public void createInvoice()throws IOException{
        int day = 0;
        int month = 0;
        int year = 0;
        Date auxdate = new Date(day, month, year);

        Invoice aux;
        aux = new Invoice();

        ArrayList<Invoice> invoices = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(new File("SalesInvoice.csv"), true)) {

            System.out.println("\t\t\nINVOICE");
            
            System.out.print("Enter the bill number: ");
            int billNumber = scanner.nextInt();
            aux.setBillNumber(billNumber);
            
            System.out.print("Enter the National Identity Document: ");
            int nationalIdentityDocument = scanner.nextInt();
            aux.setNationalIdentityDocument(nationalIdentityDocument);
            
            System.out.println("Please enter the date data by data. ");
            System.out.print("Enter the day: ");
            auxdate.setDay(scanner.nextInt());
            System.out.print("Enter the month: ");
            auxdate.setMonth(scanner.nextInt());            
            System.out.print("Enter the year: ");
            auxdate.setYear(scanner.nextInt());  
            
            aux.setDate(auxdate);
   
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            aux.setQuantity(quantity);
            
            System.out.print("Enter the price: ");
            float price = scanner.nextFloat();
            aux.setPrice(price);

            System.out.print("Enter description: ");
            scanner.nextLine();
            String description = scanner.nextLine();
            aux.setDescription(description);

            invoices.add(aux);

            StringBuilder sb = new StringBuilder();

            sb.append(aux.getBillNumber());
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
    }
    
    public void deleteInvoice(int billNumber) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the invoice to delete: ");
        billNumber = scanner.nextInt();

    }

    public void showInvoice(Invoice invoice) {
        invoice = new Invoice();
        int size = 0;
        String SEPARADOR = ";";
        String option = "";
        String auxBillNumber = "";
        do {
            boolean find = false;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the bill number to show: ");
            auxBillNumber = scanner.nextLine();

            try {
                BufferedReader bufferLectura = new BufferedReader(new FileReader("SalesInvoice.csv"));
                String linea = bufferLectura.readLine();

                while (linea != null) {
                    String[] invoices = linea.split(SEPARADOR);
                    linea = bufferLectura.readLine();
                    size = invoices.length;
                    for (int i = 0; i < size; i++) {
                        if (invoices[i].equals(auxBillNumber)) {
                            find = true;
                            System.out.println(Arrays.toString(invoices));
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
                    System.err.println("Bill number was not found!");
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
    
    public void menuInvoices(){
        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice();
        FileManager fileManager = new FileManager();

        System.out.println("1.Create an invoice");//
        System.out.println("2.Search an invoice");
        System.out.println("3....................");
        System.out.print("Write your option: ");
        int op = scanner.nextInt();
        switch (op) {
            case 1: 
                try {
                    createInvoice();
                } catch (IOException ex) {
                }
                break;
            case 2:
                showInvoice(invoice);
                break;
            case 3:
                break;
            default:
                System.out.println("Enter a valid option!");
                break;
        }

    }
}

