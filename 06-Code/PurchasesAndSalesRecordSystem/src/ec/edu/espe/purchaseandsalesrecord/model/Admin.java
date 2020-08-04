package ec.edu.espe.purchaseandsalesrecord.model;
/**
 *
 * @author Duke's Children
 */
public class Admin {
    private String user;
    private String password;
    
    public Admin(String user, String password){
        this.user=user;
        this.password=password;
        
    }

    public Admin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}