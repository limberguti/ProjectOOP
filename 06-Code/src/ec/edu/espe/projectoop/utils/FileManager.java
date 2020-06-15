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
            try (FileWriter fileWrite = new FileWriter(file,true)) {
                System.out.println("\nEnter your password: ");
                password  = scanner.nextLine();
                fileWrite.write(" "+password);
                fileWrite.write("\r\n");
            }
        } catch (IOException ex) {
                System.err.println("Error!, The file was not written!");
        }
    }    
}

