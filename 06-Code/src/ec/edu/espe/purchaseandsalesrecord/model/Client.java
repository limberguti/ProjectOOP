package ec.edu.espe.purchaseandsalesrecord.model;
/**
 *
 * @author Duke's Children
 */
public class Client {
    
	private String cedula;
	private String names;
	private String lastName;
	private String phoneNumber;
	private String address;
	private String email;
	
	public Client() {
	}

	public Client(String cedula, String names, String lastName, String phone, String direction,String email) {
		super();
		this.cedula = cedula;
		this.names = names;
		this.lastName = lastName;
		this.phoneNumber = phone;
		this.address = direction;
		this.email = email;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
}
