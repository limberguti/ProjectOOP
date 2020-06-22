package ec.edu.espe.projectoop.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Duke's Children
 */
public class PurchaseRecord {

    private String provider;
    private int codePurchaseNumber;
    
    public void registerCode() throws IOException {
        CodeNumber aux;
        int codeNumber;
                
        ArrayList<CodeNumber> codesNumber = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        aux = new CodeNumber();

        try (FileWriter writer = new FileWriter(new File("codePurchaseNumber.csv"), true)) {
            System.out.println("\t\t\nPURCHASE RECORD SYSTEM");
            System.out.println("\nEnter code number: ");
            codeNumber = scanner.nextInt();
            aux.setCodeNumber(codeNumber);

            codesNumber.add(aux);

            StringBuilder sb = new StringBuilder();

            sb.append(aux.getCodeNumber());
            sb.append(';');
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            writer.flush();

            System.out.println("Done!");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void registerInvoice(Invoice invoice) {

    }

    public void registerProvider() {

    }

    public void registerFabric(Fabric fabric) {

    }
}
