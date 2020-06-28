package ec.edu.espe.purchaseandsalesrecord.controller;
import ec.edu.espe.purchaseandsalesrecord.model.*;
import java.io.*;
import java.nio.file.*;
import java.text.*;
import java.util.*;
import java.util.stream.Collectors;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author Duke's Children
 */
public class InventoryManagement {    
    
    private static final String invoices = "invoices";
    private static final String products = "clothing";
    private static final String providers = "providers";
    private static final String clients = "clients";   

    private static final String clientsCsv = "data/clients.csv";
    private static final String providersCsv = "data/providers.csv";
    private static final String clothingCsv = "data/clothing.csv";
    private static final String invoiceCsv = "data/invoices.csv";

    private static final char delimiter = ';';
      
    public Map<String, Object> loadData() {
        List<Client> clients = null;
        List<Provider> providers = null;
        List<Clothing> clothings = null;
        List<Invoice> invoices = null;

        Path filePath = Paths.get(clientsCsv);

        if (Files.exists(filePath)) {
            clients = new ArrayList<>();

            try {
                final Reader reader = Files.newBufferedReader(filePath);
                final CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT
                                .withHeader("cedula", "names", "surnames", "phoneNumber", "address", "email")
                                .withDelimiter(delimiter));

                Client client;

                final List<CSVRecord> records = csvParser.getRecords().stream().filter(r -> r.getRecordNumber() != 1)
                        .collect(Collectors.toList());

                for (final CSVRecord r : records) {
                    client = new Client(r.get("cedula"), r.get("names"), r.get("surnames"), r.get("phoneNumber"),
                            r.get("address"), r.get("email"));

                    clients.add(client);
                }

                csvParser.close();
            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }

        filePath = Paths.get(providersCsv);

        if (Files.exists(filePath)) {
            providers = new ArrayList<>();

            try {
                final Reader reader = Files.newBufferedReader(filePath);
                final CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT.withHeader("id", "names", "phoneNumber", "address").withDelimiter(delimiter));

                Provider provider;

                final List<CSVRecord> registros = csvParser.getRecords().stream().filter(r -> r.getRecordNumber() != 1)
                        .collect(Collectors.toList());

                for (final CSVRecord r : registros) {
                    provider = new Provider(Integer.parseInt(r.get("id")), r.get("names"), r.get("phoneNumber"),
                            r.get("address"));

                    providers.add(provider);
                }

                csvParser.close();
            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }

        filePath = Paths.get(clothingCsv);

        if (Files.exists(filePath)) {
            clothings = new ArrayList<>();

            try {
                final Reader reader = Files.newBufferedReader(filePath);
                final CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT.withHeader("id", "name", "description", "purchasePrice", "salePrice",
                                "quantity", "quantityMinimumStock", "idProvider").withDelimiter(delimiter));
                                
                Clothing producto;

                final List<CSVRecord> registros = csvParser.getRecords().stream().filter(r -> r.getRecordNumber() != 1)
                        .collect(Collectors.toList());

                for (final CSVRecord r : registros) {
                    producto = new Clothing();

                    producto.setId(Integer.parseInt(r.get("id")));
                    producto.setName(r.get("name"));
                    producto.setDescription(r.get("description"));
                    producto.setPurchasePrice(Double.parseDouble(r.get("purchasePrice")));
                    producto.setSalePrice(Double.parseDouble(r.get("salePrice")));
                    producto.setQuantity(Integer.parseInt(r.get("quantity")));
                    producto.setQuantityMinimumStock(Integer.parseInt(r.get("quantityMinimumStock")));
                    producto.setIdProvider(Integer.parseInt(r.get("idProvider")));

                    clothings.add(producto);
                }

                csvParser.close();
            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }

        filePath = Paths.get(invoiceCsv);

        if (Files.exists(filePath)) {
            invoices = new ArrayList<>();

            try {
                final Reader reader = Files.newBufferedReader(filePath);
                final CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT
                                .withHeader("id", "date", "cedulaClient", "tax", "total", "idsClothing")
                                .withDelimiter(delimiter));

                Invoice invoice;

                final List<CSVRecord> registros = csvParser.getRecords().stream().filter(r -> r.getRecordNumber() != 1)
                        .collect(Collectors.toList());

                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                for (final CSVRecord r : registros) {
                    invoice = new Invoice();
                    invoice.setId(Integer.parseInt(r.get("id")));
                    try {
                        invoice.setDate(simpleDateFormat.parse(r.get("date")));
                    } catch (final ParseException e) {

                    }
                    invoice.setCedulaClient(r.get("cedulaClient"));
                    invoice.setTax(Double.parseDouble(r.get("tax")));
                    invoice.setTotal(Double.parseDouble(r.get("total")));

                    final String[] idsClothings = StringUtils.split(r.get("idsClothing"), ",");
                    invoice.setIdsClothingsFromArrayStrings(idsClothings);

                    invoices.add(invoice);
                }

                csvParser.close();
            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }

        final Map<String, Object> inventory = new HashMap<>();
        inventory.put(InventoryManagement.clients, clients);
        inventory.put(InventoryManagement.providers, providers);
        inventory.put(products, clothings);
        inventory.put(InventoryManagement.invoices, invoices);

        return inventory;
    }

    public void saveInventoryData(final List<Client> clients, final List<Provider> providers,
            final List<Clothing> clothings, final List<Invoice> invoices) {

        try {
            final BufferedWriter writer = Files.newBufferedWriter(Paths.get(clientsCsv));

            final CSVPrinter csvPrinter = new CSVPrinter(writer,
                    CSVFormat.DEFAULT.withHeader("cedula", "names", "surnames", "phoneNumber", "address", "email")
                            .withDelimiter(delimiter));

            for (final Client c : clients) {
                csvPrinter.printRecord(c.getCedula(), c.getNames(), c.getLastName(), c.getPhoneNumber(),
                        c.getAddress(), c.getEmail());
            }

            csvPrinter.flush();
            csvPrinter.close();

        } catch (final IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        if (!providers.isEmpty()) {
            try {
                final BufferedWriter writer = Files.newBufferedWriter(Paths.get(providersCsv));

                final CSVPrinter csvPrinter = new CSVPrinter(writer,
                        CSVFormat.DEFAULT.withHeader("id", "name", "phoneNumber", "address").withDelimiter(delimiter));

                for (final Provider p : providers) {
                    csvPrinter.printRecord(p.getId(), p.getName(), p.getPhoneNumber(), p.getAddress());
                }

                csvPrinter.flush();
                csvPrinter.close();

            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }

        if (!clothings.isEmpty()) {
            try {
                final BufferedWriter writer = Files.newBufferedWriter(Paths.get(clothingCsv));

                final CSVPrinter csvPrinter = new CSVPrinter(writer,
                        CSVFormat.DEFAULT.withHeader("id", "name", "description", "purchasePrice", "salePrice",
                                "quantity", "quantityMinimumStock", "idProvider").withDelimiter(delimiter));

                for (final Clothing p : clothings) {
                    csvPrinter.printRecord(p.getId(), p.getName(), p.getDescription(), p.getPurchasePrice(),
                            p.getSalePrice(), p.getQuantity(), p.getQuantityMinimumStock(), p.getIdProvider());
                }

                csvPrinter.flush();
                csvPrinter.close();

            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }

        if (!invoices.isEmpty()) {
            try {
                final BufferedWriter writer = Files.newBufferedWriter(Paths.get(invoiceCsv));

                final CSVPrinter csvPrinter = new CSVPrinter(writer,
                        CSVFormat.DEFAULT
                                .withHeader("id", "date", "cedulaClient", "tax", "total", "idsClothing")
                                .withDelimiter(delimiter));

                final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                for (final Invoice f : invoices) {
                    csvPrinter.printRecord(f.getId(), simpleDateFormat.format(f.getDate()), f.getCedulaClient(), f.getTax(), f.getTotal(),
                            StringUtils.join(f.getIdsClothings(), ","));
                }

                csvPrinter.flush();
                csvPrinter.close();

            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }
    }
    
}
