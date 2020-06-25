package ec.edu.espe.purchaseandsalesrecord.controller;

import java.util.List;
import ec.edu.espe.purchaseandsalesrecord.model.Client;
import ec.edu.espe.purchaseandsalesrecord.model.Invoice;

/**
 *
 * @author Duke's Children
 */
public class ClientManagement {

    Validations validation = new Validations();

    public Client createClient(final List<Client> clients) {
        System.out.println();
        System.out.println("--- 1. Create Client ---");
        int cedulaNumber;
        int phoneNumber;
        String cedula = "";
        Client client;

        do {
            cedulaNumber = validation.catchInteger("Enter the cedula of the new client ");

            if (cedulaNumber <= 0) {
                validation.showMessage("The ID must be a positive integer!");
                cedulaNumber = 0;
                validation.next();
                continue;
            }

            cedula = String.valueOf(cedulaNumber);

            client = searchClientByCedula(clients, cedula);

            if (client != null) {
                validation.showMessage(String.format("There is already another with the cédula number: %s.\n", cedula));
                cedulaNumber = 0;
            }
        } while (cedulaNumber <= 0);

        final String names = validation.catchStringCharacters("Enter the names of the new client ");
        final String surnames = validation.catchStringCharacters("Enter the surnames of the new client ");

        do {
            phoneNumber = validation.catchInteger("Enter the phone number of the new client ");

            if (phoneNumber <= 0) {
                validation.showMessage("The phone number must be a positive value!");
                validation.next();
            }
        } while (phoneNumber <= 0);

        final String address = validation.catchStringCharacters("Enter the address of the new client ");
        String email;

        while (true) {
            email = validation.catchStringCharacters("Enter the email of the new client ");

            if (!validation.validEmail(email)) {
                validation.showMessage("You have entered a value that does not correspond to an email!");
                validation.next();
                continue;
            }

            break;
        }

        return new Client(cedula, names, surnames, String.valueOf(phoneNumber), address, email);
    }

    public Client searchClient(final List<Client> clients) {
        System.out.println();
        System.out.println("--- 2. Search Client ---");

        int cedulaNumber;
        String cedula;

        do {
            cedulaNumber = validation.catchInteger("Enter the client's cedula ");

            if (cedulaNumber <= 0) {
                validation.showMessage("The cédula must be a positive integer!");
                cedulaNumber = 0;
                validation.next();
                continue;
            }
        } while (cedulaNumber <= 0);

        cedula = String.valueOf(cedulaNumber);

        return searchClientByCedula(clients, cedula);
    }

    public void updateClient(final Client client) {
        System.out.println("--- 3. Update Client ---");

        final String names = validation.catchStringCharacters("Enter the new client names ");
        final String surnames = validation.catchStringCharacters("Type the client's new last names ");

        int phoneNumber;

        do {
            phoneNumber = validation.catchInteger("Enter the new phone number of the client ");

            if (phoneNumber <= 0) {
                validation.showMessage("The phone number must be a positive value!");
                validation.next();
            }
        } while (phoneNumber <= 0);

        final String address = validation.catchStringCharacters("Enter the new client address ");
        String email;

        while (true) {
            email = validation.catchStringCharacters("Enter the new client email ");

            if (validation.validEmail(email)) {
            } else {
                validation.showMessage("You have entered a value that does not correspond to an email!");
                validation.next();
                continue;
            }

            break;
        }

        client.setNames(names);
        client.setLastName(surnames);
        client.setPhone(String.valueOf(phoneNumber));
        client.setDirection(address);
        client.setEmail(email);
    }

    public void deleteClient(final List<Client> clients, final List<Invoice> invoices) {
        int numeroCedula;
        String cedula;
        InvoiceManagement invoiceManagement = new InvoiceManagement();

        do {
            numeroCedula = validation.catchInteger("Enter the client's cédula ");

            if (numeroCedula <= 0) {
                validation.showMessage("The cédula must be a positive integer!");
                numeroCedula = 0;
                validation.next();
                continue;
            }
        } while (numeroCedula <= 0);

        cedula = String.valueOf(numeroCedula);

        final Client client = searchClientByCedula(clients, cedula);

        if (client != null) {
            final Invoice invoice = invoiceManagement.searchInvoiceByCedula(invoices, cedula);

            if (invoice == null) {

                clients.remove(client);

                validation.showMessage(String.format("The client with cédula has been removed: %s\n", cedula));

            } else {
                validation.showMessage("The client cannot be removed. You have one or more invoices assigned!");
                validation.next();
            }
        } else {
            validation.showMessage("No client was found with the specified cédula number!");
            validation.next();
        }
    }

    public Client searchClientByCedula(final List<Client> clients, final String cedula) {
        for (final Client client : clients) {
            if (client.getCedula().equals(cedula)) {
                return client;
            }
        }
        return null;
    }

    public void showClientData(final Client client) {
        System.out.println("Client Data: ");
        System.out.println("Cédula: " + client.getCedula());
        System.out.println("Names: " + client.getNames());
        System.out.println("Surnames: " + client.getLastName());
        System.out.println("Phone number: " + client.getPhone());
        System.out.println("Address: " + client.getDirection());
        System.out.println("Email: " + client.getEmail());
    }
}
