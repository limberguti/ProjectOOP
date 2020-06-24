package ec.edu.espe.purchaseandsalesrecord.view;


/**
 *
 * @author Duke's Children
 */
public class Main {
    
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
                
                            }
                        } while (optionSubmenu < EXIT || optionSubmenu > DELETE);

                        if (optionSubmenu == EXIT) {
                            break;
                        }

                        switch (optionSubmenu) {
                            
                            case CREATE:
                                
                                
                                break;
                            case SEARCH:
                                if (!clients.isEmpty()) {
                              

                                break;
                            case UPDATE:
                               
                                break;
                            case DELETE:
                             
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != EXIT);

                    break;
                case PROVIDERS_MANAGEMENT:
                    do {
                        

                                break;
                            case UPDATE:
                                
                                break;
                            case DELETE:
                              
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != EXIT);
                    break;
                case PRODUCTS_MANAGEMENT:
                    do {
                      
                        }

                        switch (optionSubmenu) {
                            case CREATE:
                              

                                break;
                            case SEARCH:
                                

                                break;
                            case UPDATE:
                               
                                break;
                            case DELETE:
                                
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != EXIT);
                    break;
                case BILLING_MANAGEMENT:
                    do {
                        
                        } while (optionSubmenu < EXIT || optionSubmenu > SEARCH);

                        if (optionSubmenu == EXIT) {
                            break;
                        }

                        switch (optionSubmenu) {
                            case CREATE:                                
                             
                                break;
                            case SEARCH:
                               
                                break;
                        }

                        validation.next();
                    } while (optionSubmenu != EXIT);
                    break;
            }

            validation.next();

        } while (option != EXIT);

        System.out.println();

        validation.showMessage("The program has ended");

        validation.next();

        if (!clients.isEmpty()) {
          
            } while (true);

           
        }

    }//Fin main 
    
}