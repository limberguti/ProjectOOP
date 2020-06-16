package ec.edu.espe.projectoop.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Duke's Children
 */
public class FileManager {
    File file;
    private static Scanner sc;
    private static int intent;
    
    Scanner scanner = new Scanner(System.in);
        String user;
        String password;
        String res;
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
    public void login(){
    try {
            System.out.println("\nEnter your user: ");
            user  = scanner.next();
            System.out.println("\nEnter your password: ");
            password  = scanner.next();
            int numberLines=0;
            int count=0;
            String [] users=null;
            String line;
            sc= new Scanner(new File("E:/users.txt"));
            File f= new File("E:/users.txt");
            FileReader fr =new FileReader(f);
            BufferedReader br= new BufferedReader(fr);
            
            try {
                while((line=br.readLine())!=null){
                    numberLines++;
                }
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            users= new String[numberLines]; //tamaño del arreglo
            
            while(sc.hasNextLine()){
                users[count++]=sc.nextLine();//
            }
            intent++;
  
            
            FileManager s = new FileManager();
            s.validedUser(users, user, password, intent);
        
            
            
   
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void validedUser(String users[],String user,String password,int intent){
        
        boolean encontrado=false;
        
        for(int i=0;i<users.length;i++){
            if((users[i].equalsIgnoreCase(user)&&users[i+1].equals(password))){
                res="Welcome"+user;
                encontrado=true;
                System.out.println("Inicio de secion");
                
                break;
                
            }
        }
if(encontrado==false){
    res="Password or User invalided"+intent+"Intent falled";
    System.out.println("Inicio de secion");
    
}
if(intent>2){
    System.out.println("Intentos fallidos");
    System.exit(0);
}
            
        }
}
   

