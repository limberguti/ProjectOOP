package ec.edu.espe.purchaseandsalesrecord.view;
import ec.edu.espe.purchaseandsalesrecord.model.*;
import ec.edu.espe.purchaseandsalesrecord.controller.*;
import java.util.*;
/**
 *
 * @author Duke's Children
 */
public class Main {
    private static final String invoices = "invoices";
    private static final String products = "clothing";
    private static final String providers = "providers";
    private static final String clients = "clients";   
    
    private static final int customerManagement = 1;
    private static final int providersManagement = 2;
    private static final int productsManagement = 3;
    private static final int billingManagement = 4;

    private static final int create = 1;
    private static final int search = 2;
    private static final int update = 3;
    private static final int delete = 4;
    private static final int exit = 0;

    private static final int yes = 1;
    private static final int no = 2;

    public static Scanner scanner;
    public static Validations validation = new Validations();

    
    public static void main(final String[] args) {
        scanner = new Scanner(System.in);
        InventoryManagement inventoryManagement = new InventoryManagement(); 
        List<Client> clients = new ArrayList<>();
        List<Provider> providers = new ArrayList<>();
        List<Clothing> clothings = new ArrayList<>();
        List<Invoice> invoices = new ArrayList<>(); 

        final Map<String, Object> inventory = inventoryManagement.loadData();
        
        if (inventory.get(Main.clients) != null) {
            clients = (List<Client>) inventory.get(Main.clients);
        }

        if (inventory.get(Main.providers) != null) {
            providers = (List<Provider>) inventory.get(Main.providers);
        }

        if (inventory.get(products) != null) {
            clothings = (List<Clothing>) inventory.get(products);
        }

        if (inventory.get(Main.invoices) != null) {
            invoices = (List<Invoice>) inventory.get(Main.invoices);
        }
        
        Cover cover = new Cover();
        cover.ESPE();
        
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

                if (option < exit || option > billingManagement) {
                    validation.showMessage("ERROR: You must type a value between 0 and 4!");
                }
            } while (option < exit || option > billingManagement);

            if (option == exit) {
                break;
            }

            System.out.println();

            switch (option) {
                case customerManagement:
                
                    do {
                        ClientManagement clientManagement = new ClientManagement();
                        do {
                            
                            adminMenu.showSubmenu("Clients");
                            optionSubmenu = validation.catchInteger("Write your option ");

                            if (optionSubmenu < exit || optionSubmenu > delete) {
                                validation.showMessage("ERROR: You must type a value between 0 and 4!");
                                validation.next();
                            }
                        } while (optionSubmenu < exit || optionSubmenu > delete);

                        if (optionSubmenu == exit) {
                            break;
                        }

                        switch (optionSubmenu) {
                            
                            case create:
                                
                                client = clientManagement.createClient(clients);

                                clients.add(client);

                                break;
                            case search:
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
                            case update:
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
                            case delete:
                                if (!clients.isEmpty()) {
                                    clientManagement.deleteClient(clients, invoices);
                                } else {
                                    validation.showMessage(
                                            "The client has not been created yet. The delete can not be performed!");
                                }
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != exit);

                    break;
                case providersManagement:
                    do {
                        ProviderManagement providerManagement = new ProviderManagement(); 
                        do {
                            adminMenu.showSubmenu("Provideres");
                            optionSubmenu = validation.catchInteger("Write your option");

                            if (optionSubmenu < exit || optionSubmenu > delete) {
                                validation.showMessage("ERROR: You must type a value between 0 and 4!");
                                validation.next();
                            }
                        } while (optionSubmenu < exit || optionSubmenu > delete);

                        if (optionSubmenu == exit) {
                            break;
                        }

                        switch (optionSubmenu) {
                            case create:
                                provider = providerManagement.createProvider(providers);

                                providers.add(provider);

                                break;
                            case search:
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
                            case update:
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
                            case delete:
                                if (!providers.isEmpty()) {
                                    providerManagement.deleteProvider(providers, clothings);
                                } else {
                                    validation.showMessage(
                                            "A provider has not been created yet. The delete can not be performed!");
                                }
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != exit);
                    break;
                case productsManagement:
                    do {
                        ClothingManagement clothingManagement = new ClothingManagement();
                        do {
                            adminMenu.showSubmenu("Clothing");
                            optionSubmenu = validation.catchInteger("Write your option: ");

                            if (optionSubmenu < exit || optionSubmenu > delete) {
                                validation.showMessage("ERROR: You must type a value between 0 and 4!");
                                validation.next();
                            }
                        } while (optionSubmenu < exit || optionSubmenu > delete);

                        if (optionSubmenu == exit) {
                            break;
                        }

                        switch (optionSubmenu) {
                            case create:
                                if (!providers.isEmpty()) {
                                    clothing = clothingManagement.createClothing(clothings, providers);

                                    clothings.add(clothing);

                                    validation.showMessage("The clothing was added successfully");
                                } else {
                                    validation.showMessage("Before you add clothing, you must create a provider!");
                                }

                                break;
                            case search:
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
                            case update:
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
                            case delete:
                                if (!clothings.isEmpty()) {
                                    clothingManagement.deleteClothing(clothings, invoices);
                                } else {
                                    validation.showMessage(
                                            "Clothing has not been created yet. Delete can not be done");
                                }
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != exit);
                    break;
                case billingManagement:
                    do {
                        InvoiceManagement invoiceManagement = new InvoiceManagement();
                        do {
                            adminMenu.showSubmenuInvoice();
                            optionSubmenu = validation.catchInteger("Write your option: ");

                            if (optionSubmenu < exit || optionSubmenu > delete) {
                                validation.showMessage("You must type a value between 0 and 2!");
                                validation.next();
                            }
                        } while (optionSubmenu < exit || optionSubmenu > search);

                        if (optionSubmenu == exit) {
                            break;
                        }

                        switch (optionSubmenu) {
                            case create:
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
                            case search:
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
                    } while (optionSubmenu != exit);
                    break;
            }

            validation.next();

        } while (option != exit);

        System.out.println();

        validation.showMessage("The program has ended");

        validation.next();

        if (!clients.isEmpty()) {
            do {
                System.out.println("Save data?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                option = validation.catchInteger("Do you want to save the inventory data ?");

                if (option == yes || option == no) {
                    break;
                } else {
                    validation.showMessage("You must answer Yes (1) or No (2)");
                    validation.next();
                }
            } while (true);

            if (option == yes) {
                inventoryManagement.saveInventoryData(clients, providers, clothings, invoices);
                System.out.println();
                System.out.println("All inventory data has been saved successfully");
                System.out.println();
            }
        }

    }
    
}