package ec.edu.espe.projectoop.controller;
import ec.edu.espe.projectoop.model.Clothing;
import ec.edu.espe.projectoop.model.Inventory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jhonatan Lituma
 */
public class InventoryMenu {
    
    public void addToInventory() throws IOException{
        int ID=0;
        int quantity=0;
        String description="";
        String size="";
        String color="";
        String brand="";
        Clothing clothing = new Clothing(ID,quantity,description,size,color,brand);
        
        Inventory aux;
        aux= new Inventory(clothing);
                
        ArrayList<Inventory> inventory = new ArrayList();        
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter(new File("SalesInventory.csv"), true)) {

            System.out.println("-------Inventory-------");
            System.out.print("Enter the ID of the product you want to add: ");
            int id = scanner.nextInt();
            clothing.setID(id);
            
            System.out.print("Enter the quantity: ");
            int auxquantity = scanner.nextInt();
            clothing.setQuantity(auxquantity);
                        
            System.out.print("Enter the description of the product: ");
            scanner.nextLine();
            String auxdescription = scanner.nextLine();
            clothing.setDescription(auxdescription);            
            
            System.out.print("Enter the size: ");
            String auxsize = scanner.nextLine();
            clothing.setSize(auxsize);
            
            System.out.print("Enter the color: ");
            String auxcolor = scanner.nextLine();
            clothing.setColor(auxcolor);
            
            System.out.print("Enter the brand: ");
            String auxbrand = scanner.nextLine();
            clothing.setBrand(auxbrand);
            
            aux.setClothing(clothing);
            inventory.add(aux);

            StringBuilder sb = new StringBuilder();

            sb.append(clothing.getID());
            sb.append(';');
            sb.append(clothing.getQuantity());
            sb.append(';');
            sb.append(clothing.getDescription());
            sb.append(';'); 
            sb.append(clothing.getSize());
            sb.append(';');
            sb.append(clothing.getColor());
            sb.append(';');
            sb.append(clothing.getBrand());
            sb.append(';');            
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            writer.flush();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    
    
    public void OptionsInvetory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add to inventory");
        System.out.println("2.Remove from the inventory");
        System.out.println("3.View the inventory");
        System.out.print("Write your option: ");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                try {
                    addToInventory();                
                } catch (IOException e) {
                }                
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
    
}
