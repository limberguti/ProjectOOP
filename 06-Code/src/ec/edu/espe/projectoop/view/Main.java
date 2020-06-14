/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.projectoop.view;
import ec.edu.espe.projectoop.controller.Controller;
import ec.edu.espe.projectoop.utils.FileManager;

/**
 *
 * @author Duke's Children
 */
public class Main {
    
    public static void main(String[] args) {
        Controller menu = new Controller();
        menu.Validation();
    }
}
