package ec.edu.espe.projectoop.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Duke's Children
 */
public class FileManager {

    File file;    

    public void createFile() {

        try {
            file = new File("users.txt");

            try {
                if (file.createNewFile()) {
                    System.out.println("The file was created correctly");
                }
            } catch (IOException ex) {
                System.err.println("The file was not created!");
            }

        } catch (Exception ex) {

        }
    }

    public void createUser() {
        Scanner scanner = new Scanner(System.in);
        String user;
        try {
            FileWriter fileWrite = new FileWriter(file, true);
            System.out.println("\nEnter your user name: ");
            user = scanner.nextLine();
        

            fileWrite.write(user);       
            fileWrite.close();
        } catch (IOException ex) {
            System.err.println("Error!, The file was not written!");
        }
    }

    




public void createPassword() {
        Scanner scanner = new Scanner(System.in);
        String password ;
        try {
            

           FileWriter fileWrite = new FileWriter(file,true);
         
            System.out.println("\nEnter your password: ");
            password  = scanner.next();
            fileWrite.write(" "+password);
            fileWrite.write("\r\n");
            fileWrite.close();
        } catch (IOException ex) {
            System.err.println("Error!, The file was not written!");
        }
    }
public void changePassword(){
        Scanner scanner = new Scanner(System.in);
        String user;
        String pass;
        String password;
        
        try {
            
            FileReader lector=new FileReader("users.txt");
            BufferedReader contenido=new BufferedReader(lector);
            
         
            System.out.println("\nEnter your user: ");
            user  = scanner.next();
            System.out.println("\nEnter your password: ");
            pass  = scanner.next();
            while((pass=contenido.readLine())!=null){
                
                
            }
            
            
            if(user==user&&pass==password){
            FileWriter fileWrite = new FileWriter(file,false);
            fileWrite.write(" "+password);
            fileWrite.write("\r\n");
            fileWrite.close();
        } else{
                System.out.println("\n Incorrect password: ");
                
            }
        }catch (IOException ex) {
            System.err.println("Error!, The file was not written!");
        }
    
     
}
}

