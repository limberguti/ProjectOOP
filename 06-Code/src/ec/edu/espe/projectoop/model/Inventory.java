package ec.edu.espe.projectoop.model;

/**
 */


/**
 *
 * @author Duke's Children
 */
public class Inventory {

    private Clothing clothing;
    
    public Inventory(Clothing clothing) {
        this.clothing = clothing;
    }

    public Clothing getClothing() {
        return clothing;
    }

    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }
    
    
    
    
}
    

    
    

    /*public void addClothes(Inventory inventory) {
        inventory = new Inventory();
        int size = 0;
        String SEPARADOR = ";";
        String option = "";
        String auxProductID = "";
        
        do {
            boolean find = false;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Product ID to add to inventory: ");
            auxProductID = scanner.nextLine();
            
            try {
                BufferedReader bufferLectura = new BufferedReader(new FileReader("Inventory.csv"));
                String linea = bufferLectura.readLine();
              
                while (linea != null) {
                    String[] inventories = linea.split(SEPARADOR);
                    linea = bufferLectura.readLine();
                    size = inventories.length;
                    for (int i = 0; i < size; i++) {
                        if (inventories[i].equals(auxProductID)) {
                            find = true;
                            inventory.addQuantity();
                        }
                        else{
                            i++;
                            i++;
                            i++;
                            i++; 
                            i++; 
                        }
                    }
                    
                }
                
                if (find == true) {
                    System.out.print("Do you want to search again (Y/N)?: ");
                    option = scanner.nextLine();

                    if ("Y".equals(option) || "y".equals(option)) {
                        option = "";
                    }
                    if ("N".equals(option) || "n".equals(option)) {
                        option = "N";
                    }
                }
                               
                if (find == false) {
                    System.err.println("Product ID was not found!");
                    System.out.println("Do you want to search again (Y/N)?: ");
                    option = scanner.nextLine();

                    if ("Y".equals(option) || "y".equals(option)) {
                        option = "";
                    }
                    if ("N".equals(option) || "n".equals(option)) {
                        option = "N";
                    }
                }

            } catch (IOException e) {

            }

        } while ("".equals(option));

    }*/
    
   /*public void addQuantity() throws IOException{
        Scanner scanner = new Scanner(System.in);
        int quantity;

        Inventory aux;
        aux = new Inventory();

        ArrayList<Inventory> inventories = new ArrayList();

        try (FileWriter writer = new FileWriter(new File("Inventory.csv"), true)) {

            System.out.print("Enter the quantity to add: ");
            quantity = scanner.nextInt();
            aux.setQuantity(quantity);
            
            inventories.add(aux);

            StringBuilder sb = new StringBuilder();

            sb.append(';');
            sb.append(';');
            //sb.replace(2, 3, quantity);
            //sb.insert(3, quantity);
            sb.append(aux.getQuantity());
            sb.append(';');
            sb.append('\n');

            writer.write(sb.toString());
            writer.close();
            writer.flush();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void removeFromInventory(Clothing chothes) {
        
    }*/
    

