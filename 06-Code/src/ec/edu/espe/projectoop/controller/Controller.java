/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.projectoop.controller;

import ec.edu.espe.projectoop.utils.FileManager;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Duke's Children
 */
public class Controller {
    int op = 0;
    int bugs = 0;
    
    public void Menu(){   
            Scanner scanner = new Scanner(System.in);
            FileManager fileManager = new FileManager();

            System.out.println("Welcome again!.");
            System.out.println("1.Login");
            System.out.println("2.Exit");
            System.out.print("Write your option: ");
            op = scanner.nextInt();
            
            switch(op){           
                case 1:
                    fileManager.createFile();
                    fileManager.createUser();
                    break;
                case 2:                  
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
