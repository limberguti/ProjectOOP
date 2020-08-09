package ec.edu.espe.purchaseandsalesrecordgui.model;

/**
 *
 * @author Andrés López
 */
public class Client {

    private int cedula;
    private String name;
    private String lastName;
    private int cellphone;
    private String address;
    private String email;

    public Client() {
        
    }

    public Client(int cedula, String name, String lastName, int cellphone, String address, String email) {
        this.cedula = cedula;
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.address = address;
        this.email = email;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
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
    
    @Override
    public String toString() {
        return "Client{" + "cedula=" + cedula + ", name=" + name + ", lastName=" + lastName + ", cellphone=" + cellphone + ", address=" + address + ", email=" + email + '}';
    }
    
    /*@Override
    public String toString() {
        return this.cedula;
    }*/
}
