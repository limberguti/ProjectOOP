package ec.edu.espe.projectoop.model;

/**
 *
 * @author Duke's Children
 */
public class Clothing {
    
    private int ID;
    private int quantity;
    private String description;
    private String size;
    private String color;
    private String brand;

    public Clothing(int ID, int quantity, String description, String size, String color, String brand) {
        this.ID = ID;
        this.quantity= quantity;
        this.description = description;
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    

    
}
