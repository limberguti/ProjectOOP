/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.projectoop.controller;

import ec.edu.espe.projectoop.model.Invoice;
import ec.edu.espe.projectoop.utils.FileManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Duke's Children
 */
public class Controller {
                  
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
          
    public void Menu(){ 
        int op = 0;
        Scanner scanner = new Scanner(System.in);
        Invoice invoice = new Invoice();
        AdminMenu adminMenu = new AdminMenu();
        
        System.out.println("*********Welcome again!*********");
        System.out.println("1.Login");
        System.out.println("2.Exit");
        System.out.print("Write your option: ");
        op = scanner.nextInt();
            
        switch(op){           
            case 1:
                if(adminMenu.Login() == true){
                    adminMenu.LoginAsAdmin();
                } else{
                    break;
                }
                break;
            case 2:                 
                break;
            default:
                System.err.println("Try again");
                break;
            }
    }

    
    public void Validation(){ 
        int bugs = 0; 
        do{
            bugs=0;                         
            try{    
                Menu();
            }catch(InputMismatchException e){               
                System.err.println("Warning! You can only insert numbers.");
                bugs++;
            }           
        }while(bugs>0);        
    }
}
