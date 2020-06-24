package ec.edu.espe.purchaseandsalesrecord.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Duke's Children
 */
public class Invoice {
    private static int counterIds = 1;
	private int id;
	private Date date;
	private String cedulaClient;
	private double tax;
	private double total;
	private List<Integer> idsClothings;
	
	public Invoice() {
		id = counterIds;
		++counterIds;
		idsClothings = new ArrayList<>();
	}

	public Invoice(String cedulaClient, double tax) {
		this();
		date = new Date();
		this.cedulaClient = cedulaClient;
		this.tax = tax;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCedulaClient() {
		return cedulaClient;
	}

	public void setCedulaClient(String cedulaClient) {
		this.cedulaClient = cedulaClient;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void addIdClothings(int idClothings) {
		idsClothings.add(idClothings);
	}

	public Integer[] getIdsClothings() {
		Integer[] idsProductsCopy = new Integer[idsClothings.size()];
		idsClothings.toArray(idsProductsCopy);
		
		return idsProductsCopy;
	}

	public void setIdsClothingsFromArrayStrings(String[] idsProductsStrings) {
		for (String idProduct : idsProductsStrings) {
			idsClothings.add(Integer.parseInt(idProduct));
		}
	}
    
}
