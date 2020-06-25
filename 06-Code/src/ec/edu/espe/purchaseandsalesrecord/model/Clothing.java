package ec.edu.espe.purchaseandsalesrecord.model;

/**
 *
 * @author Duke's Children
 */
public class Clothing {

    private int id;
    private String name;
    private String description;
    private double purchasePrice;
    private double salePrice;
    private int quantity;
    private int quantityMinimaStock;
    private int idProvider;

    public Clothing() {
    }

    public Clothing(int id, String name, String description, double purchasePrice, double salePrice, int quantity, int quantityMinimaStock, int idProvider) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
        this.quantity = quantity;
        this.quantityMinimaStock = quantityMinimaStock;
        this.idProvider = idProvider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantityMinimaStock() {
        return quantityMinimaStock;
    }

    public void setQuantityMinimumStock(int quantityMinimaStock) {
        this.quantityMinimaStock = quantityMinimaStock;
    }

    public int getIdProvider() {
        return idProvider;
    }

    public void setIdProvider(int idProvider) {
        this.idProvider = idProvider;
    }

}
