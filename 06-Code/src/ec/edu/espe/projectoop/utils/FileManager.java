package ec.edu.espe.projectoop.utils;

import ec.edu.espe.projectoop.model.Admin;
import ec.edu.espe.projectoop.model.Invoice;
import ec.edu.espe.projectoop.model.Prueba;
import ec.edu.espe.projectoop.model.Record;
import ec.edu.espe.projectoop.model.SalesRecord;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duke's Children
 */
public class FileManager {

    public void CreateAdmin() throws IOException {
        Admin aux;
        String user;
        String password;

        ArrayList<Admin> admins = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        aux = new Admin();

        try (FileWriter writer = new FileWriter(new File("Users.csv"), true)) {

            System.out.println("Create your user: ");
            user = scanner.nextLine();
            aux.setUser(user);

            System.out.println("Create your password: ");
            password = scanner.nextLine();
            aux.setPassword(password);

            admins.add(aux);

            StringBuilder sb = new StringBuilder();

            sb.append(aux.getPassword());
            sb.append(';');
            sb.append(aux.getPassword());
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            writer.flush();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean Login() {
        String auxuser = "";
        String auxpassword = "";
        int attemps = 1;
        int size = 0;
        String SEPARADOR = ";";
        boolean find = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Attemps (" + attemps + "/3)");
            System.out.print("Enter your user: ");
            auxuser = scanner.nextLine();
            System.out.print("Enter your password: ");
            auxpassword = scanner.nextLine();

            try {
                BufferedReader bufferLectura = new BufferedReader(new FileReader("Users.csv"));
                String linea = bufferLectura.readLine();

                while (linea != null) {
                    String[] users = linea.split(SEPARADOR);
                    linea = bufferLectura.readLine();
                    size = users.length;
                    for (int i = 0; i < size; i++) {
                        if (users[i].equals(auxuser) && users[i + 1].equals(auxpassword)) {
                            find = true;
                        } else {
                            i++;
                        }
                    }

                }

                if (find == true) {
                    System.out.println("Welcome!");
                    attemps = 5;
                }
                if (find == false) {
                    attemps++;
                    System.err.println("User or password incorrect, try again.");
                }

            } catch (IOException e) {
            }

        } while (attemps < 4);

        if (attemps == 4) {
            System.err.println("*************BLOCKED**************");
            return false;
        } else {
            return true;
        }
    }

    public void menuLogin() {
        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice();
        FileManager fileManager = new FileManager();

        System.out.println("1.Enter to Sales Record");
        System.out.println("2.Enter to Purchase Record");
        System.out.println("3.Log Out");
        System.out.print("Write your option: ");
        int op = scanner.nextInt();

        switch (op) {
            case 1: 
                menuSalesRecord();
                break;
            case 2:
                menuPurchaseRecord();
                break;
            case 3:
                fileManager.Login();
            default:
                System.out.println("Enter a valid option!");
                break;
        }
    }
    
    
    public void menuSalesRecord(){
        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice();
        FileManager fileManager = new FileManager();

        System.out.println("1.Invoices");//
        System.out.println("2.Inevotory");
        System.out.println("3.Coupons");
        System.out.print("Write your option: ");
        int op = scanner.nextInt();
        
        switch (op) {
            case 1: 
                menuInvoices();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Enter a valid option!");
                break;
        }
        
        
        
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
                    invoice.create();
                } catch (IOException ex) {
                }
                break;
            case 2:
                invoice.show(invoice);
                break;
            case 3:
                fileManager.Login();
            default:
                System.out.println("Enter a valid option!");
                break;
        }
        
        
        
        
    }
    public void menuPurchaseRecord(){
        Scanner scanner = new Scanner(System.in);
        Record record = new Record();
        FileManager fileManager = new FileManager();

        System.out.println("1.New Purchase Record");
        System.out.println("2.");
        System.out.println("3.");
        System.out.print("Write your option: ");
        int op = scanner.nextInt();
        
        switch (op) {
            case 1: 
                menuRecords();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Enter a valid option!");
                break;
        }
        }
        
        
            public void menuRecords(){
        Scanner scanner = new Scanner(System.in);
        Record record = new Record();
        FileManager fileManager = new FileManager();

        System.out.println("1.Create an Register");//
        System.out.println("2.Show an Register");
        System.out.println("3....................");
        System.out.print("Write your option: ");
        int op = scanner.nextInt();
        switch (op) {
            case 1: 
                try {
                    record.create();
                } catch (IOException ex) {
                }
                break;
            case 2:
                record.show(record);
                break;
            case 3:
                fileManager.Login();
            default:
                System.out.println("Enter a valid option!");
                break;
        }
        

}

}
