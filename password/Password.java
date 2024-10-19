/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password;

import java.util.Scanner;

/**
 * This class checks if a password contains a special character.
 * @author phang
 */
public class Password {

    /**
     * The main method that runs the password check.
     * @param args the command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if the password contains a special character
        boolean hasSpecialCharacter = checkForSpecialCharacter(password);

        // Display the result
        if (hasSpecialCharacter) {
            System.out.println("Password accepted! It contains a special character.");
        } else {
            System.out.println("Password does not have a special character!");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
    /**
     * Checks if the given password contains a special character.
     * @param password the password to check
     * @return true if the password contains a special character, false otherwise
     */
    private static boolean checkForSpecialCharacter(String password) {
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return true; // Found a special character
            }
        }
        return false; // No special character found
    }
}
