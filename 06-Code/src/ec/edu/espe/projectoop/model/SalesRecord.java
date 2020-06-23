package ec.edu.espe.projectoop.model;

import ec.edu.espe.projectoop.controller.InventoryMenu;
import ec.edu.espe.projectoop.controller.InvoiceMenu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Duke's Children
 */
public class SalesRecord {

    

    public void removeFromInventory(int ID) throws IOException {

        String auxID;
        int size = 0;
        String SEPARADOR = ";";
        String option = "";
        String auxstock="";
        int stock=0;
        String exit="s";
                

        do {
            boolean find = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("SALES RECORD SYSTEM");
            System.out.print("Enter the ID of the product to sell: ");
            auxID = scanner.nextLine();

            try {
                BufferedReader bufferLectura = new BufferedReader(new FileReader("SalesInventory.csv"));
                String linea = bufferLectura.readLine();

                while (linea != null) {
                    String[] inventory = linea.split(SEPARADOR);
                    linea = bufferLectura.readLine();
                    size = inventory.length;
                    for (int i = 0; i < size; i++) {
                        if (inventory[i].equals(auxID)) {
                            find = true;
                            auxstock = inventory[i+1];
                            //System.out.println(invoice.toString());
                        } else {
                            i++;
                            i++;
                            i++;
                            i++;
                            i++;
                        }
                    }
                }
                if(find==true){
                    stock=Integer.parseInt(auxstock);
                    stock--;
                    auxstock= String.valueOf(stock);
                    StringBuilder sb = new StringBuilder();
                    //inventory[i+1]=sb.append(auxstock);
                }
                if(find=false){
                    System.out.println("This product does not exist in inventory, add it to inventory or try again.");
                    System.out.println("Press" + "s" + "to exit or press any key to continue another search.");
                }
            } catch (Exception e) {
            }

        } while (!"S".equals(exit));

    }

    public void registerDescription(Clothing clothes) {
        
    }

    public void registerInvoice(Invoice invoice) {
        invoice = new Invoice();
        invoice.toString();
    }
    
    public void menuSalesRecord(){
        Scanner scanner = new Scanner(System.in);
        InvoiceMenu invoiceMenu = new InvoiceMenu();
        Invoice invoice = new Invoice();
        InventoryMenu inventoryMenu = new InventoryMenu();

        System.out.println("1.Invoices");
        System.out.println("2.Inventory");
        System.out.println("3.Coupons");
        System.out.print("Write your option: ");
        int op = scanner.nextInt();
        
        switch (op) {
            case 1:
                invoiceMenu.menuInvoices();
                break;
            case 2:
                inventoryMenu.OptionsInvetory();
                break;
            case 3:
                break;
            default:
                System.out.println("Enter a valid option!");
                break;
        }
        
        
        
    }
    

}
