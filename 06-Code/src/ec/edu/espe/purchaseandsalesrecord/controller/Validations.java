package ec.edu.espe.purchaseandsalesrecord.controller;

import java.util.Scanner;

/**
 *
 * @author Duke's Children
 */
public class Validations {

    public static Scanner scanner;

    public String catchStringCharacters(String message) {
        scanner = new Scanner(System.in);
        String result;
        while (true) {
            System.out.printf("%s: ", message);
            result = scanner.nextLine().strip();

            if (!result.isEmpty()) {
                return result;
            }

            System.out.println("\nYou have entered an empty string. Specify a specific value!");

            next();
        }
    }

    public int catchInteger(String message) {
        scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("%s: ", message);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nType a value that corresponds to an integer!");
            }
            next();
        }
    }

    public double catchRealNumber(String message) {
        scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("%s: ", message);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nEnter a value that corresponds to a real number!");
            }
            next();
        }
    }

    public boolean validEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public void next() {
        scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Press enter to continue...");
        scanner.nextLine();
        System.out.println();
    }

    public void showMessage(String message) {
        System.out.println();
        System.out.printf(message);
        System.out.println();
    }
}
