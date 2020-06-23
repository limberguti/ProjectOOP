package ec.edu.espe.projectoop.model;
/**
 *
 * @author Jhonatan Lituma
 */
public class Admin {    
    private String user;
    private String password;

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
 
    /*
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("User");
        sb.append(';');
        sb.append("Password");
        sb.append('\n');
        return sb.toString();
    }
    */
}
