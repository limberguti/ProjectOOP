package ec.edu.espe.purchaseandsalesrecord.model;

/**
 *
 * @author Duke's Children
 */
public class Provider {
    private int id;
	private String name;
	private String phone;
	private String direction;
	
	public Provider() {
	}

	public Provider(int id, String name, String phone, String direction) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.direction = direction;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
    
}
