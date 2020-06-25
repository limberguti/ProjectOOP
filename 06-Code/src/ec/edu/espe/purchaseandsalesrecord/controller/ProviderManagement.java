package ec.edu.espe.purchaseandsalesrecord.controller;

import java.util.List;

import ec.edu.espe.purchaseandsalesrecord.model.Clothing;
import ec.edu.espe.purchaseandsalesrecord.model.Provider;

public class ProviderManagement {

    Validations validation = new Validations();

    public Provider createProvider(final List<Provider> providers) {
        System.out.println();
        System.out.println("--- 1. Create Provider ---");

        int id;
        Provider provider;
        String name;
        int phoneNumber;
        String address;

        do {
            id = validation.catchInteger("Enter the ID number of the new provider ");

            if (id <= 0) {
                validation.showMessage("You must type a positive ID number!");
                validation.next();
                continue;
            }

            provider = searchProviderById(providers, id);

            if (provider != null) {
                validation.showMessage("A provider with the specified ID already exists!");
                validation.next();
                id = 0;
            }
        } while (id <= 0);

        name = validation.catchStringCharacters("Enter the name for the new provider ");

        do {
            phoneNumber = validation.catchInteger("Enter the phone number of the new provider ");

            if (phoneNumber <= 0) {
                validation.showMessage("The phone number must be a positive value!");
                validation.next();
            }
        } while (phoneNumber <= 0);

        address = validation.catchStringCharacters("Type the address of the new provider ");

        return new Provider(id, name, String.valueOf(phoneNumber), address);
    }


    public Provider searchProvider(final List<Provider> providers) {
        System.out.println("--- 2. Search Provider ---");

        int id;

        do {
            id = validation.catchInteger("Enter the provider ID number ");

            if (id <= 0) {
                validation.showMessage("You must type a positive ID number!");
                validation.next();
                continue;
            }
        } while (id <= 0);

        return searchProviderById(providers, id);
    }

    public void updateProvider(final Provider provider) {
        System.out.println("--- 3. Update Provider ---");

        String name;
        int phone;
        String address;

        name = validation.catchStringCharacters("Enter the new provider name ");

        do {
            phone = validation.catchInteger("Enter the new provider phone number ");

            if (phone <= 0) {
                validation.showMessage("The phone number must be a positive value!");
                validation.next();
            }
        } while (phone <= 0);

        address = validation.catchStringCharacters("Enter the provider's new address ");

        provider.setName(name);
        provider.setPhone(String.valueOf(phone));
        provider.setDirection(address);
    }

    public void deleteProvider(final List<Provider> providers, final List<Clothing> clothings) {
        ClothingManagement clothingManagement = new ClothingManagement();
        int id;
        Provider provider;

        do {
            id = validation.catchInteger("Enter the provider ID number ");

            if (id <= 0) {
                validation.showMessage("You must type a positive ID number!");
                validation.next();
                continue;
            }
        } while (id <= 0);

        provider = searchProviderById(providers, id);

        if (provider != null) {
            final List<Clothing> clothingsProvider = clothingManagement.searchClothingByIdProvider(clothings, id);

            if (clothingsProvider.isEmpty()) {
                providers.remove(provider);

                validation.showMessage(String.format("Provider with ID %d has been removed!\n", id));
            } else {
                validation.showMessage("You can not remove this provider. Has one or more clothings associated!");
                validation.next();
            }
        } else {
            validation.showMessage("There is no provider with the specified ID number!");
            validation.next();
        }
    }

    public Provider searchProviderById(final List<Provider> providers, final int id) {
        return providers.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void showProviderData(final Provider provider) {
        System.out.println("Provider Data: ");
        System.out.println("ID: " + provider.getId());
        System.out.println("Name: " + provider.getName());
        System.out.println("Phone number: " + provider.getPhone());
        System.out.println("Address: " + provider.getDirection());
    }
    
}