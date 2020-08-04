package ec.edu.espe.purchaseandsalesrecord.model;
/**
 *
 * @author Duke's Children
 */
public class Provider {
    private int id;
	private String name;
	private String phoneNumber;
	private String address;
	
	public Provider() {
		
	}

	public Provider(int id, String name, String phone, String direction) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phone;
		this.address = direction;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
}
