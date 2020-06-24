package ec.edu.espe.purchaseandsalesrecord.view;

import java.io.IOException;
import java.io.Reader; 
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap; 
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Duke's Children
 */
public class Main {
    
    private static final String CLIENTS_CSV = "./clients.csv";
    private static final String PROVIDERS_CSV = "./providers.csv";
    private static final String CLOTHING_CSV = "./clothing.csv";
    private static final String INVOICE_CSV = "./invoices.csv";

    private static final char DELIMITER = ';';

    public static Scanner scanner;
    public static Validations validation = new Validations();

    public static void main(final String[] args) {

        scanner = new Scanner(System.in);

        List<Client> clients = new ArrayList<>();
        List<Provider> providers = new ArrayList<>();
        List<Clothing> clothings = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>();

        
        final Map<String, Object> inventory = loadData();

        Cover cover = new Cover();
        
        cover.ESPE();
        
        if (inventory.get(CLIENTS) != null) {
            clients = (List<Client>) inventory.get(CLIENTS);
        }

        if (inventory.get(PROVIDERS) != null) {
            providers = (List<Provider>) inventory.get(PROVIDERS);
        }

        if (inventory.get(PRODUCTS) != null) {
            clothings = (List<Clothing>) inventory.get(PRODUCTS);
        }

        if (inventory.get(INVOICES) != null) {
            invoices = (List<Invoice>) inventory.get(INVOICES);
        }

        int option=0;
        int optionSubmenu=0;

        Client client;
        Provider provider;
        Clothing clothing;
        Invoice invoice;

        AdminMenu adminMenu = new AdminMenu();
        Validations validation = new Validations();
        adminMenu.ComprobationFirstLogin();
        adminMenu.Login();

        do {
            
            do {
                adminMenu.showMainMenu();
                option = validation.catchInteger("Write your option ");

                if (option < EXIT || option > BILLING_MANAGEMENT) {
                    validation.showMessage("ERROR: You must type a value between 0 and 4!");
                }
            } while (option < EXIT || option > BILLING_MANAGEMENT);

            if (option == EXIT) {
                break;
            }

            System.out.println();

            switch (option) {
                case CUSTOMER_MANAGEMENT:
                
                    do {
                        ClientManagement clientManagement = new ClientManagement();
                        do {
                            
                            adminMenu.showSubmenu("Clients");
                            optionSubmenu = validation.catchInteger("Write your option ");

                            if (optionSubmenu < EXIT || optionSubmenu > DELETE) {
                                validation.showMessage("ERROR: You must type a value between 0 and 4!");
                                validation.next();
                            }
                        } while (optionSubmenu < EXIT || optionSubmenu > DELETE);

                        if (optionSubmenu == EXIT) {
                            break;
                        }

                        switch (optionSubmenu) {
                            
                            case CREATE:
                                
                                client = clientManagement.createClient(clients);

                                clients.add(client);

                                break;
                            case SEARCH:
                                if (!clients.isEmpty()) {
                                    
                                    client = clientManagement.searchClient(clients);

                                    if (client != null) {
                                        clientManagement.showClientData(client);
                                    } else {
                                        validation.showMessage("The client with the specified cédula number was not found!");
                                    }
                                } else {
                                    validation.showMessage(
                                            "The client has not been created yet. The search can not be performed!");
                                }

                                break;
                            
                    break;
                case PRODUCTS_MANAGEMENT:
                    do {
                        ClothingManagement clothingManagement = new ClothingManagement();
                        do {
                            adminMenu.showSubmenu("Clothing");
                            optionSubmenu = validation.catchInteger("Write your option: ");

                            if (optionSubmenu < EXIT || optionSubmenu > DELETE) {
                                validation.showMessage("ERROR: You must type a value between 0 and 4!");
                                validation.next();
                            }
                        } while (optionSubmenu < EXIT || optionSubmenu > DELETE);

                        if (optionSubmenu == EXIT) {
                            break;
                        }

                        switch (optionSubmenu) {
                            case CREATE:
                                if (!providers.isEmpty()) {
                                    clothing = clothingManagement.createClothing(clothings, providers);

                                    clothings.add(clothing);

                                    validation.showMessage("The clothing was added successfully");
                                } else {
                                    validation.showMessage("Before you add clothing, you must create a provider!");
                                }

                                break;
                            case SEARCH:
                                if (!clothings.isEmpty()) {
                                    clothing = clothingManagement.searchClothing(clothings);

                                    if (clothing != null) {
                                        clothingManagement.showClothingData(clothing);
                                    } else {
                                        validation.showMessage("Clothing with the specified ID was not found!");
                                    }
                                } else {
                                    validation.showMessage(
                                            "Clothing has not been created yet. The search cannot be done!");
                                }

                                break;
                            case UPDATE:
                                if (!clothings.isEmpty()) {
                                    clothing = clothingManagement.searchClothing(clothings);

                                    if (clothing != null) {
                                        clothingManagement.updateClothing(clothing, providers);
                                        clothingManagement.showClothingData(clothing);
                                    } else {
                                        validation.showMessage("There is no provider with the specified ID.");
                                    }
                                } else {
                                    validation.showMessage(
                                            "Clothing has not been created yet. The update can not be done");
                                }
                                break;
                            case DELETE:
                                if (!clothings.isEmpty()) {
                                    clothingManagement.deleteClothing(clothings, invoices);
                                } else {
                                    validation.showMessage(
                                            "Clothing has not been created yet. Delete can not be done");
                                }
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != EXIT);
                    break;
                

            validation.next();

        } while (option != EXIT);

        System.out.println();

        validation.showMessage("The program has ended");

        validation.next();

        if (!clients.isEmpty()) {
            do {
                System.out.println("Save data?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                option = validation.catchInteger("Do you want to save the inventory data ?");

                if (option == YES || option == NO) {
                    break;
                } else {
                    validation.showMessage("You must answer Yes (1) or No (2)");
                    validation.next();
                }
            } while (true);

            if (option == YES) {
                saveInventoryData(clients, providers, clothings, invoices);
                System.out.println();
                System.out.println("All inventory data has been saved successfully");
                System.out.println();
            }
        }

    }//Fin main 
    
}