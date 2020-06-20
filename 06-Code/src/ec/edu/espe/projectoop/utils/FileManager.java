package ec.edu.espe.projectoop.utils;

import ec.edu.espe.projectoop.model.Admin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
            
            System.out.println("Create your user: ");
            user = scanner.nextLine();            
            aux.setUser(user);

            System.out.println("Create your password: ");
            password = scanner.nextLine();            
            aux.setPassword(password);
            
            admins.add(aux);

            StringBuilder sb = new StringBuilder();
            
            sb.append(aux.getPassword());
            sb.append(';');
            sb.append(aux.getPassword());
            sb.append('\n');
           
            writer.write(sb.toString());
            writer.close();
            writer.flush();
            
      } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
      }
      
    }
    
    public void Login(){
        String auxuser = "";
        String auxpassword="";
        int attemps=0;
        int size=0;
        String SEPARADOR = ";";
        boolean find=false;
        
                
        
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your user: ");
            auxuser=scanner.nextLine();            
            System.out.println("Enter your password: ");
            auxpassword=scanner.nextLine();

            try {            
                BufferedReader bufferLectura = new BufferedReader(new FileReader("Users.csv"));
                String linea = bufferLectura.readLine();
                
                while (linea != null) {
                    String[] users = linea.split(SEPARADOR);
                    linea = bufferLectura.readLine();
                    size=users.length;
                    for (int i=0;i<size;i++){
                        if(users[i].equals(auxuser)&&users[i+1].equals(auxpassword)){
                            find=true;
                        }
                        else{
                            i++;
                        }
                    }
                    
                }
                  
                if(find==true){
                    System.out.println("Welcome!");
                    attemps=4;
                }
                if(find==false){
                    attemps++;
                    System.err.println("User or password incorrect, try again.");
                }
                
            }catch (IOException e) {
            }
        
            
        }while(attemps<3);
        
        if (attemps==3){
            System.err.println("*************BLOCKED**************");
        }
        
    }

}

