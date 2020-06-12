/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.projectoop.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jhonatan Lituma
 */
public class Controller {
    int op = 0;
    int bugs=0;
    
    public void Menu(){   
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome again!.");
            System.out.println("1.Login");
            System.out.println("2.Exit");
            op = scanner.nextInt();
            
            switch(op){           
                case 1:
                    System.out.println("In Process");
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
