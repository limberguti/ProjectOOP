/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.projectoop.controller;

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
    int op = 0;  
    int bugs = 0;          
        
    public void FirstLogin() {
        File file;
        FileWriter write;
        FileManager fileManager = new FileManager(); 

        try {
            file = new File ("firstlogin.txt");
            write = new FileWriter(file);            
            write.write("1");
            write.close();           
            System.out.println("Welcome to the system!\n" +
            "This is the first time you enter the system, so we need you to create your username and password.\n" +
            "This message will only appear once.");
            fileManager.CreateAdmin();
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
            String first = "1";
            line = bf.readLine();
            if (line.equals(first)){
                FirstLogin();
            }
        } catch (IOException e) {
            
        }
    }
            
    
    
    @SuppressWarnings("empty-statement")
    public void Login(){
        Scanner scanner = new Scanner(System.in);
        FileReader fr;
        BufferedReader bf;
        String users[] = new String[5];
        String passwords[] = new String[5];
        String user,password;
        
        try {
            fr = new FileReader("users.txt");
            bf = new BufferedReader(fr);            
            
            for(int i=0;i<5;i++){
                while(scanner.hasNextLine()){
                    users[i]=scanner.nextLine();
                    passwords[i]=scanner.nextLine();
                }
                scanner.close();
            }
            
            System.out.println("Enter your user: ");
            user=scanner.nextLine();
            
            System.out.println("Enter your password: ");
            password=scanner.nextLine();
            
            for(int i=0;i<5;i++){
                if (users[i].equals(user)&&passwords[i].equals(password)){
                    System.out.println("Welcome!");
                }
                else{
                    System.out.println("Try Again!!!");
                }
            }
            
            
            
        } catch (IOException e) {
            
        }       
    }
    
    
    public void Menu(){ 
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("*********Welcome again!*********");
            System.out.println("1.Login");
            System.out.println("2.Exit");
            System.out.print("Write your option: ");
            op = scanner.nextInt();
            
            switch(op){           
                case 1:
                    //Login();
                    break;
                case 2:
                    
                    break;
                case 3:                  
                    
                    break;
                default:                            
                    System.err.println("Try again");
                    break;
            }
    }

    
    public void Validation(){        
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
