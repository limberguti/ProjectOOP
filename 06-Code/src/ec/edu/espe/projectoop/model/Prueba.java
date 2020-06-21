package ec.edu.espe.projectoop.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrés López
 */
public class Prueba {
    public void create() throws IOException {
        int day=0;
        int month=0;
        int year=0;
        Date date = new Date(day, month, year);
        
        Invoice aux;
        aux = new Invoice();
        
        ArrayList<Invoice> invoices = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(new File("SalesInvoice.csv"), true)) {
            
            System.out.println("\t\t\nINVOICE");
            System.out.println("\nEnter the date ");
            System.out.println("Enter the day: ");            
            //day = scanner.nextInt();
            date.setDay(scanner.nextInt());
            System.out.println(date.getDay());
            System.out.println("Enter the month: ");
            
            date.setMonth(scanner.nextInt());
            System.out.println("Enter the year: ");
            date.setYear(scanner.nextInt());
            aux.setDate(date);
            
            /*System.out.print("\nEnter the National Identity Document: ");
            nationalIdentityDocument = scanner.nextLong();            
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
            aux.setDescription(description);*/
            
            invoices.add(aux);

            StringBuilder sb = new StringBuilder();

            sb.append(aux.getDate());
            sb.append(';');
            /*sb.append(aux.getNationalIdentityDocument());
            sb.append(';');
            sb.append(aux.getBillNumber());
            sb.append(';');
            sb.append(aux.getPrice());
            sb.append(';');
            sb.append(aux.getQuantity());
            sb.append(';');
            sb.append(aux.getDescription());
            sb.append(';');*/
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
}
