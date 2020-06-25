package ec.edu.espe.purchaseandsalesrecord.controller;

import java.util.*;
import java.util.stream.Collectors;
import ec.edu.espe.purchaseandsalesrecord.model.Clothing;
import ec.edu.espe.purchaseandsalesrecord.model.Invoice;
import ec.edu.espe.purchaseandsalesrecord.model.Provider;

/**
 *
 * @author Duke's Children
 */
public class ClothingManagement {

    Validations validation = new Validations();

    public Clothing createClothing(final List<Clothing> clothings, final List<Provider> providers) {
        System.out.println("--- 1. Create Clothing ---");
        ProviderManagement providerManagement = new ProviderManagement();
        int id;
        String name;
        String description;
        Clothing clothing;
        double purchasePrice;
        double salePrice;
        int quantity;
        int quantityMinimumStock;
        int idProvider;

        do {
            id = validation.catchInteger("Enter the ID number of the new clothing");

            if (id <= 0) {
                validation.showMessage("You must type a positive ID number!");
                validation.next();
                continue;
            }

            clothing = searchClothingById(clothings, id);

            if (clothing != null) {
                validation.showMessage("There is already a clothing with the specified ID!");
                validation.next();
                id = 0;
            }
        } while (id <= 0);

        name = validation.catchStringCharacters("Enter the name for the new clothing ");
        description = validation.catchStringCharacters("Type the description of the new clothes ");

        do {
            purchasePrice = validation.catchRealNumber("Enter the purchase price for the new clothes ");

            if (purchasePrice <= 0) {
                validation.showMessage("The purchase price cannot be less than or equal to 0!");
                validation.next();
            }
        } while (purchasePrice <= 0);

        do {
            salePrice = validation.catchRealNumber("Enter the sale price for the new clothing");

            if (salePrice <= 0) {
                validation.showMessage("The sale price can not be less than or equal to 0!");
                validation.next();
                continue;
            }

            if (salePrice <= purchasePrice) {
                validation.showMessage("The sale price can not be less than or equal to the purchase price!");
                validation.next();
                salePrice = 0;
            }
        } while (salePrice <= 0);

        do {
            quantity = validation.catchInteger("Type the quantity for the new clothing ");

            if (quantity <= 0) {
                validation.showMessage("You must write a positive quantity!");
                validation.next();
            }
        } while (quantity <= 0);

        do {
            quantityMinimumStock = validation.catchInteger("Enter the minimum quantity of stock for the new clothes ");

            if (quantityMinimumStock <= 0) {
                validation.showMessage("You must write a minimum positive stock quantity!");
                validation.next();
            }
        } while (quantityMinimumStock <= 0);

        do {
            System.out.println("List of available Providers");
            for (final Provider provider : providers) {
                System.out.printf("%d. %s\n", provider.getId(), provider.getName());
            }
            idProvider = validation.catchInteger("Enter the provider ID ");

            if (idProvider <= 0) {
                validation.showMessage("The clothing ID can not be a negative number or equal to 0!");
                validation.next();
                continue;
            }

            if (providerManagement.searchProviderById(providers, idProvider) != null) {
                break;
            } else {
                validation.showMessage(
                        String.format("There is no provider with the specified ID %d\n", idProvider));
                validation.next();
            }

        } while (true);

        return new Clothing(id, name, description, purchasePrice, salePrice, quantity, quantityMinimumStock,
                idProvider);
    }

    public Clothing searchClothing(final List<Clothing> clothings) {
        System.out.println("--- 2. search Clothing ---");

        int id;

        do {
            id = validation.catchInteger("Enter the clothing ID number");

            if (id <= 0) {
                validation.showMessage("You must type a positive ID number!");
                validation.next();
                continue;
            }
        } while (id <= 0);

        return searchClothingById(clothings, id);
    }

    public void updateClothing(final Clothing clothing, final List<Provider> providers) {
        System.out.println("--- 3. Update Clothing ---");
        ProviderManagement providerManagement = new ProviderManagement();
        String name;
        String description;
        double purchasePrice;
        double salePrice;
        int quantity;
        int quantityMinimumStock;
        int idProvider;

        name = validation.catchStringCharacters("Type the new name for the clothing");
        description = validation.catchStringCharacters("Type the new clothing description");

        do {
            purchasePrice = validation.catchRealNumber("Enter the new purchase price for the clothing ");

            if (purchasePrice <= 0) {
                validation.showMessage("The purchase price cannot be less than or equal to 0!");
                validation.next();
            }
        } while (purchasePrice <= 0);

        do {
            salePrice = validation.catchRealNumber("Type the new sale price for the clothing");

            if (salePrice <= 0) {
                validation.showMessage("The sale price can not be less than or equal to 0!");
                validation.next();
                continue;
            }

            if (salePrice <= purchasePrice) {
                validation.showMessage("The sale price cannot be less than or equal to the purchase price!");
                salePrice = 0;
            }
        } while (salePrice <= 0);

        do {
            quantity = validation.catchInteger("Enter the new quantity for the clothing ");

            if (quantity <= 0) {
                validation.showMessage("You must write a positive quantity!");
                validation.next();
            }
        } while (quantity <= 0);

        do {
            quantityMinimumStock = validation.catchInteger("Enter the new minimum quantity of stock for clothing ");

            if (quantityMinimumStock <= 0) {
                validation.showMessage("You must write a minimum positive stock quantity!");
                validation.next();
            }
        } while (quantityMinimumStock <= 0);

        do {
            System.out.println("List of Available Providers");
            for (final Provider provider : providers) {
                System.out.printf("%d. %s\n", provider.getId(), provider.getName());
            }
            idProvider = validation.catchInteger("Enter the provider ID ");

            if (providerManagement.searchProviderById(providers, idProvider) != null) {
                break;
            } else {
                validation.showMessage(String.format("There is no provider with the specified %d.\n", idProvider));

            }

        } while (true);

        clothing.setName(name);
        clothing.setDescription(description);
        clothing.setPurchasePrice(purchasePrice);
        clothing.setSalePrice(salePrice);
        clothing.setQuantity(quantity);
        clothing.setQuantityMinimumStock(quantityMinimumStock);
        clothing.setIdProvider(idProvider);
    }

    public void deleteClothing(final List<Clothing> clothings, final List<Invoice> invoices) {
        System.out.println("--- 4. Delete Clothing ---");

        int id;
        Clothing clothing;

        do {
            id = validation.catchInteger("Enter the clothing ID number ");

            if (id <= 0) {
                validation.showMessage("You must type a positive ID number!");
                validation.next();
                continue;
            }
        } while (id <= 0);

        clothing = searchClothingById(clothings, id);

        if (clothing != null) {

            if (!clothingInSomeInvoice(id, invoices)) {

                clothings.remove(clothing);

                validation.showMessage(String.format("Clothing with ID has been removed %d.\n", id));

            } else {
                validation.showMessage("Clothing can not be removed because it is associated with some invoice!");
                validation.next();
            }

        } else {
            validation.showMessage("Clothing with the specified ID was not found!");
            validation.next();
        }
    }

    public boolean clothingInSomeInvoice(final int id, final List<Invoice> invoices) {
        Integer[] idsClothing;

        for (final Invoice invoice : invoices) {
            idsClothing = invoice.getIdsClothings();

            Arrays.sort(idsClothing);
            if (Arrays.binarySearch(idsClothing, id) != -1) {
                return true;
            }
        }

        return false;
    }

    public void showClothingData(final Clothing clothing) {
        System.out.println();
        System.out.println("Clothing Data: ");
        System.out.println("ID: " + clothing.getId());
        System.out.println("Name: " + clothing.getName());
        System.out.println("Description: " + clothing.getDescription());
        System.out.println("Purchase price: " + clothing.getPurchasePrice());
        System.out.println("Sale price: " + clothing.getSalePrice());
        System.out.println("Quantity: " + clothing.getQuantity());
        System.out.println("Minimum quantity of stock: " + clothing.getQuantityMinimaStock());
        System.out.println("Provider ID : " + clothing.getIdProvider());
    }

    public Clothing searchClothingById(final List<Clothing> clothings, final int id) {
        return clothings.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public List<Clothing> searchClothingByIdProvider(final List<Clothing> clothings, final int idProvider) {
        return clothings.stream().filter(p -> p.getIdProvider() == idProvider).collect(Collectors.toList());
    }

}
