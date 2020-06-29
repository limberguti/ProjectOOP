package ec.edu.espe.purchaseandsalesrecord.controller;
import java.util.ArrayList;
import java.util.List;
import ec.edu.espe.purchaseandsalesrecord.model.Client;
import ec.edu.espe.purchaseandsalesrecord.model.Clothing;
import ec.edu.espe.purchaseandsalesrecord.model.Invoice;
/**
 *
 * @author Duke's Children, Jhonatan Lituma
 */
public class InvoiceManagement {

    Validations validation = new Validations(); 
    private static final int exit = 0;
    private Invoice invoice;
    
    public Invoice createInvoice(final List<Client> clients, final List<Clothing> clothings, final List<Invoice> invoices) {
        System.out.println();
        System.out.println("--- 1. Create Invoice ---");

        String cedula;
        int cedulaNumber;
        Client client;
        final List<Integer> idsClothing = new ArrayList<>();
        int idClothing;
        double total = 0;
        Clothing clothing;
        int quantity;
        int tax;
        ClientManagement clientManagement = new ClientManagement();

        do {
            System.out.println("List of clients");
            for (final Client c : clients) {
                System.out.printf("%s. %s %s\n", c.getCedula(), c.getNames(), c.getLastName());
            }
            cedulaNumber = validation.catchInteger("Enter the client cédula number");

            if (cedulaNumber <= 0) {
                validation.showMessage("The cédula number can not be negative!");
                validation.next();
                continue;
            }

            cedula = String.valueOf(cedulaNumber);
            client = clientManagement.searchClientByCedula(clients, cedula);

            if (client != null) {
                break;
            } else {
                validation.showMessage("There is no client with the specified cédula number!");
                validation.next();
            }

        } while (true);

        System.out.println();

        do {
            System.out.println("List of clothes:");
            for (final Clothing p : clothings) {
                System.out.printf("%d. %s - $%.2f - %d units\n", p.getId(), p.getName(), p.getSalePrice(),
                        p.getQuantity());
            }
            System.out.println("0. Exit");
            idClothing = validation.catchInteger("Enter the clothing ID");

            if (idClothing == exit && !idsClothing.isEmpty()) {
                break;
            }

            if (idClothing <= 0) {
                validation.showMessage("Clothing ID must be a positive number");
                continue;
            }
            ClothingManagement clothingManagement = new ClothingManagement();

            clothing = clothingManagement.searchClothingById(clothings, idClothing);

            if (clothing != null) {
                if (clothing.getQuantity() > 0) {
                    do {
                        quantity = validation.catchInteger("Write the quantity to buy of this clothing");

                        if (quantity <= 0) {
                            validation.showMessage("You must write a positive quantity!");
                            validation.next();
                            continue;
                        }

                        if (quantity > clothing.getQuantity()) {
                            validation.showMessage("There is not enough quantity of this clothing. Quantity available:"
                                    + clothing.getQuantity());
                            validation.next();
                            continue;
                        }

                        break;
                    } while (true);

                    clothing.setQuantity(clothing.getQuantity() - quantity);

                    total += clothing.getSalePrice() * quantity;

                    idsClothing.add(idClothing);
                } else {
                    validation.showMessage("This clothing is out of stock");
                    validation.next();
                }
            } else {
                validation.showMessage("There is no clothing with the specified ID");
                validation.next();
            }

        } while (true);

        do {
            tax = validation.catchInteger("Enter the tax for this invoice: ");

            if (tax <= 0) {
                validation.showMessage("Tax must be a positive number!");
                validation.next();
                continue;
            }

            if (tax > 100) {
                validation.showMessage("The specified tax is not a valid value! Must be between 1 and 100");
                validation.next();
                continue;
            }

            break;
        } while (true);

        final Invoice newInvoice = new Invoice(cedula, tax / 100.0);
        idsClothing.forEach(id -> newInvoice.addIdClothings(id));
        newInvoice.setTotal(total);

        return newInvoice;
    }

    public void showInvoiceData(final Invoice invoice, final List<Client> clients, final List<Clothing> clothings) {
        ClientManagement clientManagement = new ClientManagement();
        System.out.println();
        System.out.println("Invoice data: ");

        System.out.println("ID: " + invoice.getId());
        System.out.println("Date: " + invoice.getDate().toString());
        System.out.println("Total invoice: $" + invoice.getTotal());

        final Client client = clientManagement.searchClientByCedula(clients, invoice.getCedulaClient());

        System.out.println("Client data:");
        System.out.println("Cédula: " + client.getCedula());
        System.out.printf("Full Name : %s %s\n", client.getNames(), client.getLastName());

        System.out.println();

        System.out.println("Clothing purchased:");

                    

        for (final Integer id : invoice.getIdsClothings()) {
            ClothingManagement clothingManagement = new ClothingManagement();
            Clothing clothing;
            clothing = clothingManagement.searchClothingById(clothings, id);

            System.out.println("ID: " + id);
            System.out.println("Name: " + clothing.getName());
            System.out.println("Price: $" + clothing.getSalePrice());         
            System.out.println();
        }
    }

    //
    public Invoice searchInvoice(final List<Invoice> invoices) {
        System.out.println();
        System.out.println("--- 2. Search Invoice ---");

        int idInvoice;
        
        Invoice invoice;
        

        do {
            System.out.println("List of invoices");

            for (final Invoice f : invoices) {
                System.out.printf("%d. %s - %s\n", f.getId(), f.getCedulaClient(), f.getDate().toString());
            }

            idInvoice = validation.catchInteger("Write the invoice ID ");

            if (idInvoice <= 0) {
                validation.showMessage("The invoice ID must be a positive number!");
                validation.next();
                continue;
            }

            invoice = SearchInvoiceById(invoices, idInvoice);

            if (invoice != null) {
                break;
            } else {
                validation.showMessage("An invoice with the specified ID was not found!");
                validation.next();
            }
        } while (true);

        return invoice;
    }

    public Invoice SearchInvoiceById(final List<Invoice> invoices, final int idInvoice) {
        return invoices.stream().filter(f -> f.getId() == idInvoice).findFirst().orElse(null);
    }

    public Invoice searchInvoiceByCedula(final List<Invoice> invoices, final String cedula) {
        for (final Invoice invoice : invoices) {
            if (invoice.getCedulaClient().equals(cedula)) {
                return invoice;
            }
        }
        return null;
    }
}