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
    
    private static final String INVOICES = "invoices";
    private static final String PRODUCTS = "clothing";
    private static final String PROVIDERS = "providers";
    private static final String CLIENTS = "clients";   

    private static final String CLIENTS_CSV = "./clients.csv";
    private static final String PROVIDERS_CSV = "./providers.csv";
    private static final String CLOTHING_CSV = "./clothing.csv";
    private static final String INVOICE_CSV = "./invoices.csv";

    private static final char DELIMITER = ';';
      
    public Map<String, Object> loadData() {
        List<Client> clients = null;
        List<Provider> providers = null;
        List<Clothing> clothings = null;
        List<Invoice> invoices = null;

        Path filePath = Paths.get(CLIENTS_CSV);

        if (Files.exists(filePath)) {
            clients = new ArrayList<>();

            try {
                final Reader reader = Files.newBufferedReader(filePath);
                final CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT
                                .withHeader("cedula", "names", "surnames", "phoneNumber", "address", "email")
                                .withDelimiter(DELIMITER));

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

        filePath = Paths.get(PROVIDERS_CSV);

        if (Files.exists(filePath)) {
            providers = new ArrayList<>();

            try {
                final Reader reader = Files.newBufferedReader(filePath);
                final CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT.withHeader("id", "names", "phoneNumber", "address").withDelimiter(DELIMITER));

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

        filePath = Paths.get(CLOTHING_CSV);

        if (Files.exists(filePath)) {
            clothings = new ArrayList<>();

            try {
                final Reader reader = Files.newBufferedReader(filePath);
                final CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT.withHeader("id", "name", "description", "purchasePrice", "salePrice",
                                "quantity", "quantityMinimumStock", "idProvider").withDelimiter(DELIMITER));

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

        filePath = Paths.get(INVOICE_CSV);

        if (Files.exists(filePath)) {
            invoices = new ArrayList<>();

            try {
                final Reader reader = Files.newBufferedReader(filePath);
                final CSVParser csvParser = new CSVParser(reader,
                        CSVFormat.DEFAULT
                                .withHeader("id", "date", "cedulaClient", "tax", "total", "idsClothing")
                                .withDelimiter(DELIMITER));

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

        final Map<String, Object> inventario = new HashMap<>();
        inventario.put(CLIENTS, clients);
        inventario.put(PROVIDERS, providers);
        inventario.put(PRODUCTS, clothings);
        inventario.put(INVOICES, invoices);

        return inventario;
    }

    public void saveInventoryData(final List<Client> clients, final List<Provider> providers,
            final List<Clothing> clothings, final List<Invoice> invoices) {

        try {
            final BufferedWriter writer = Files.newBufferedWriter(Paths.get(CLIENTS_CSV));

            final CSVPrinter csvPrinter = new CSVPrinter(writer,
                    CSVFormat.DEFAULT.withHeader("cedula", "names", "surnames", "phoneNumber", "address", "email")
                            .withDelimiter(DELIMITER));

            for (final Client c : clients) {
                csvPrinter.printRecord(c.getCedula(), c.getNames(), c.getLastName(), c.getPhone(),
                        c.getDirection(), c.getEmail());
            }

            csvPrinter.flush();
            csvPrinter.close();

        } catch (final IOException e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        if (!providers.isEmpty()) {
            try {
                final BufferedWriter writer = Files.newBufferedWriter(Paths.get(PROVIDERS_CSV));

                final CSVPrinter csvPrinter = new CSVPrinter(writer,
                        CSVFormat.DEFAULT.withHeader("id", "name", "phoneNumber", "address").withDelimiter(DELIMITER));

                for (final Provider p : providers) {
                    csvPrinter.printRecord(p.getId(), p.getName(), p.getPhone(), p.getDirection());
                }

                csvPrinter.flush();
                csvPrinter.close();

            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }

        if (!clothings.isEmpty()) {
            try {
                final BufferedWriter writer = Files.newBufferedWriter(Paths.get(CLOTHING_CSV));

                final CSVPrinter csvPrinter = new CSVPrinter(writer,
                        CSVFormat.DEFAULT.withHeader("id", "name", "description", "purchasePrice", "salePrice",
                                "quantity", "quantityMinimumStock", "idProvider").withDelimiter(DELIMITER));

                for (final Clothing p : clothings) {
                    csvPrinter.printRecord(p.getId(), p.getName(), p.getDescription(), p.getPurchasePrice(),
                            p.getSalePrice(), p.getQuantity(), p.getQuantityMinimaStock(), p.getIdProvider());
                }

                csvPrinter.flush();
                csvPrinter.close();

            } catch (final IOException e) {
                System.err.println("ERROR: " + e.getMessage());
            }
        }

        if (!invoices.isEmpty()) {
            try {
                final BufferedWriter writer = Files.newBufferedWriter(Paths.get(INVOICE_CSV));

                final CSVPrinter csvPrinter = new CSVPrinter(writer,
                        CSVFormat.DEFAULT
                                .withHeader("id", "date", "cedulaClient", "tax", "total", "idsClothing")
                                .withDelimiter(DELIMITER));

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
