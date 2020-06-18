package ec.edu.espe.projectoop.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Duke's Children
 */
public class FileManager {
    /*
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

    public void createSuperUser() {
        Scanner scanner = new Scanner(System.in);
        String user[] = new String [5];
        
        try {
            try (FileWriter fileWrite = new FileWriter(file, true)) {
                System.out.println("\nCreate your user name: ");
                user[0] = scanner.nextLine();
                fileWrite.write(user[0]);
            }
        } catch (IOException ex) {
            System.err.println("Error!, The file was not written!");
        }
    }

    public void createPassword() {
        Scanner scanner = new Scanner(System.in);
        String password[] = new String[5] ;
        
        try {
            try (FileWriter fileWrite = new FileWriter(file,true)) {
                System.out.println("\nCreate your password: ");
                password[0]  = scanner.nextLine();
                fileWrite.write(" " + password[0]);
                //fileWrite.write("\r\n");
            }
        } catch (IOException ex) {
                System.err.println("Error!, The file was not written!");
        }
    }
    */

    public void CreateSuper(){
        String user;
        String password;
        ArrayList<String> users = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        
        try (PrintWriter writer = new PrintWriter(new File("Users.csv"))) {
 
            System.out.println("\nCreate your user: ");
            user = scanner.nextLine();
            users.add(user);
            
            System.out.println("\nCreate your password: ");
            password = scanner.nextLine();
            passwords.add(password);

            int positionUser = users.indexOf(user);
            int positionPassword = passwords.indexOf(password);

            
            StringBuilder sb = new StringBuilder();
            
            sb.append("User");
            sb.append(',');
            sb.append("Password");
            sb.append('\n');

            sb.append(users.get(positionUser));
            sb.append(',');
            sb.append(passwords.get(positionPassword));
            sb.append('\n');
            
            writer.write(sb.toString());
            writer.close();
           
            System.out.println("done!");

      } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
      }

    }
}

