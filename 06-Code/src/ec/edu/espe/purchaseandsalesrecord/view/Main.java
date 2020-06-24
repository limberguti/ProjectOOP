package ec.edu.espe.purchaseandsalesrecord.view;

<<<<<<< HEAD
import ec.edu.espe.purchaseandsalesrecord.model.Client;
import ec.edu.espe.purchaseandsalesrecord.model.Invoice;
import ec.edu.espe.purchaseandsalesrecord.model.Clothing;
import ec.edu.espe.purchaseandsalesrecord.model.Cover;
import ec.edu.espe.purchaseandsalesrecord.model.Provider;
import ec.edu.espe.purchaseandsalesrecord.controller.AdminMenu;
import ec.edu.espe.purchaseandsalesrecord.controller.Validations;
import ec.edu.espe.purchaseandsalesrecord.controller.ClientManagement;
import ec.edu.espe.purchaseandsalesrecord.controller.ProviderManagement;
import ec.edu.espe.purchaseandsalesrecord.controller.ClothingManagement;
import ec.edu.espe.purchaseandsalesrecord.controller.InvoiceManagement;
import java.io.BufferedWriter;
=======
>>>>>>> 216a56719290ecff89ec58659cc6566a62c7049e
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
<<<<<<< HEAD
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
=======
>>>>>>> 216a56719290ecff89ec58659cc6566a62c7049e

/**
 *
 * @author Duke's Children
 */
public class Main {
    
<<<<<<< HEAD
    private static final String INVOICES = "invoices";
    private static final String PRODUCTS = "clothing";
    private static final String PROVIDERS = "providers";
    private static final String CLIENTS = "clients";
    
    private static final int CUSTOMER_MANAGEMENT = 1;
    private static final int PROVIDERS_MANAGEMENT = 2;
    private static final int PRODUCTS_MANAGEMENT = 3;
    private static final int BILLING_MANAGEMENT = 4;

    private static final int CREATE = 1;
    private static final int SEARCH = 2;
    private static final int UPDATE = 3;
    private static final int DELETE = 4;
    private static final int EXIT = 0;

    private static final int YES = 1;
    private static final int NO = 2;

=======
>>>>>>> 216a56719290ecff89ec58659cc6566a62c7049e
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
<<<<<<< HEAD
                            case UPDATE:
                                if (!clients.isEmpty()) {
                                    client = clientManagement.searchClient(clients);

                                    if (client != null) {
                                        clientManagement.updateClient(client);
                                        clientManagement.showClientData(client);
                                    } else {
                                        validation.showMessage("The client with the specified cédula number was not found!");
                                    }
                                } else {
                                    validation.showMessage(
                                            "The client has not been created yet. The update can not be performed!");
                                }
                                break;
                            case DELETE:
                                if (!clients.isEmpty()) {
                                    clientManagement.deleteClient(clients, invoices);
                                } else {
                                    validation.showMessage(
                                            "The client has not been created yet. The delete can not be performed!");
                                }
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != EXIT);

                    break;
                case PROVIDERS_MANAGEMENT:
                    do {
                        ProviderManagement providerManagement = new ProviderManagement(); 
                        do {
                            adminMenu.showSubmenu("Provideres");
                            optionSubmenu = validation.catchInteger("Write your option");

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
                                provider = providerManagement.createProvider(providers);

                                providers.add(provider);

                                break;
                            case SEARCH:
                                if (!providers.isEmpty()) {
                                    provider = providerManagement.searchProvider(providers);

                                    if (provider != null) {
                                        providerManagement.showProviderData(provider);
                                    } else {
                                        validation.showMessage("A provider with the specified ID was not found!");
                                    }
                                } else {
                                    validation.showMessage(
                                            "A provider has not been created yet. The search can not be performed!");
                                }

                                break;
                            case UPDATE:
                                if (!providers.isEmpty()) {
                                    provider = providerManagement.searchProvider(providers);

                                    if (provider != null) {
                                        providerManagement.updateProvider(provider);
                                        providerManagement.showProviderData(provider);
                                    } else {
                                        validation.showMessage("There is no provider with the ID entered!");
                                    }
                                } else {
                                    validation.showMessage(
                                            "A provider has not been created yet. The update can not be performed!");
                                }
                                break;
                            case DELETE:
                                if (!providers.isEmpty()) {
                                    providerManagement.deleteProvider(providers, clothings);
                                } else {
                                    validation.showMessage(
                                            "A provider has not been created yet. The delete can not be performed!");
                                }
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != EXIT);
=======
                            
>>>>>>> 216a56719290ecff89ec58659cc6566a62c7049e
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
<<<<<<< HEAD
                case BILLING_MANAGEMENT:
                    do {
                        InvoiceManagement invoiceManagement = new InvoiceManagement();
                        do {
                            adminMenu.showSubmenuInvoice();
                            optionSubmenu = validation.catchInteger("Write your option: ");

                            if (optionSubmenu < EXIT || optionSubmenu > DELETE) {
                                validation.showMessage("You must type a value between 0 and 2!");
                                validation.next();
                            }
                        } while (optionSubmenu < EXIT || optionSubmenu > SEARCH);

                        if (optionSubmenu == EXIT) {
                            break;
                        }

                        switch (optionSubmenu) {
                            case CREATE:
                                if (!clients.isEmpty()) {
                                    if (!clothings.isEmpty()) {
                                        invoice = invoiceManagement.createInvoice(clients, clothings, invoices);

                                        invoices.add(invoice);

                                        invoiceManagement.showInvoiceData(invoice, clients, clothings);
                                    } else {
                                        validation.showMessage(
                                                "Invoice can not be created while there are no clothes!");
                                    }
                                } else {
                                    validation.showMessage("Invoice can not be created while there are no clients!");
                                }

                                break;
                            case SEARCH:
                                if (!invoices.isEmpty()) {
                                    invoice = invoiceManagement.searchInvoice(invoices);

                                    if (invoice != null) {
                                        invoiceManagement.showInvoiceData(invoice, clients, clothings);
                                    } else {
                                        validation.showMessage("Invoice with the specified ID was not found!");
                                    }
                                } else {
                                    validation.showMessage("Invoices have not been created yet!");
                                }

                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != EXIT);
                    break;
            }
=======
                
>>>>>>> 216a56719290ecff89ec58659cc6566a62c7049e

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