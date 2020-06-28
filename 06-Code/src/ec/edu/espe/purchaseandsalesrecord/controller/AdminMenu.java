package ec.edu.espe.purchaseandsalesrecord.controller;

import ec.edu.espe.purchaseandsalesrecord.model.Admin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminMenu {

    public Scanner scanner;
    public Admin admin;

    public void CreateAdmin() throws IOException {
        Admin aux;
        String user;
        String password;

        ArrayList<Admin> admins = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        aux = new Admin();

        try (FileWriter writer = new FileWriter(new File("data/Users.csv"), true)) {

            System.out.println("Create your user: ");
            user = scanner.nextLine();
            aux.setUser(user);

            System.out.println("Create your password: ");
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

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean Login() {        
        String auxuser = "";
        String auxpassword = "";
        int attemps = 1;
        int size = 0;
        String SEPARADOR = ";";
        boolean find = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Attemps (" + attemps + "/3)");
            System.out.print("Enter your user: ");
            auxuser = scanner.nextLine();
            System.out.print("Enter your password: ");
            auxpassword = scanner.nextLine();

            try {
                BufferedReader bufferLectura = new BufferedReader(new FileReader("data/Users.csv"));
                String linea = bufferLectura.readLine();

                while (linea != null) {
                    String[] users = linea.split(SEPARADOR);
                    linea = bufferLectura.readLine();
                    size = users.length;
                    for (int i = 0; i < size; i++) {
                        if (users[i].equals(auxuser) && users[i + 1].equals(auxpassword)) {
                            find = true;
                        } else {
                            i++;
                        }
                    }

                }

                if (find == true) {
                    System.out.println("Welcome!");
                    attemps = 5;
                }
                if (find == false) {
                    attemps++;
                    System.err.println("User or password incorrect, try again.");
                }

            } catch (IOException e) {
                
            }

        } while (attemps < 4);

        if (attemps == 4) {
            System.err.println("*************BLOCKED**************");
            return false;
        } else {
            return true;
        }
    }



    public void FirstLogin() {
        File file;
        FileWriter write;
        AdminMenu adminMenu = new AdminMenu(); 

        try {
            file = new File ("firstlogin.txt");
            write = new FileWriter(file);            
            write.write("1");
            write.close();           
            System.out.println("Welcome to the system!\n" +
            "This is the first time you enter the system, so we need you to create your username and password.\n" +
            "This message will only appear once.");
            adminMenu.CreateAdmin();
        }
        catch(IOException e){
            
        }
    }

    public void ComprobationFirstLogin(){
        FileReader fr;
        BufferedReader bf;
        
        try {
            fr = new FileReader("firstlogin.txt");
            bf = new BufferedReader(fr);
            String line;  
            String first = "0";
            line = bf.readLine();
            if (line.equals(first)){
                FirstLogin();
            }
        } catch (IOException e) {
            
        }
    }

    public static void showMainMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Client Management ");
        System.out.println("2. Providers Management ");
        System.out.println("3. Clothing Management ");
        System.out.println("4. Invoice Management ");
        System.out.println("0. Exit");
    }

    public static void showSubmenu(final String tipoMenu) {
        System.out.printf("*** Management Menu of %s***\n", tipoMenu);
        System.out.println("1. Create");
        System.out.println("2. Search");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("0. Exit");
    }

    public static void showSubmenuInvoice() {
        System.out.println("*** Invoice Management Menu ***");
        System.out.println("1. Create");
        System.out.println("2. Search");
        System.out.println("0. Exit");
    }    
}