package ec.edu.espe.projectoop.utils;

import ec.edu.espe.projectoop.model.Admin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Duke's Children
 */
public class FileManager {
    
    public void CreateAdmin() throws IOException{        
        Admin aux;
        String user;
        String password;
        
        ArrayList<Admin> admins = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        aux = new Admin();        
                
        try (FileWriter writer = new FileWriter(new File("Users.csv"),true)) {
            
            System.out.println("\nCreate your user: ");
            user = scanner.nextLine();            
            aux.setUser(user);

            System.out.println("\nCreate your password: ");
            password = scanner.nextLine();            
            aux.setPassword(password);
            
            admins.add(aux);
            
            StringBuilder sb = new StringBuilder();
            
            sb.append(aux.getUser());
            sb.append(';');
            sb.append(aux.getPassword());
            sb.append('\n');
           
            writer.write(sb.toString());
            writer.close();
            writer.flush();
                    
            System.out.println("done!");

      } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
      }
      
    }

}

