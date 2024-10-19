/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phang
 */
import javax.swing.JOptionPane;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        // Get password input from user
        String password = promptForPassword();
        
        // Evaluate password strength
        boolean isStrong = evaluatePasswordStrength(password);
        
        // Display the result to the user
        displayResult(isStrong);
    }

    /**
     * Prompts the user to enter a password using a dialog box.
     * @return The password entered by the user.
     */
    public static String promptForPassword() {
        return JOptionPane.showInputDialog(null, "Enter a password:", "Password Strength Checker", JOptionPane.QUESTION_MESSAGE);
    }

    /**
     * Evaluates the strength of the password based on defined criteria.
     * @param password The password to evaluate.
     * @return true if the password is strong, false otherwise.
     */
    public static boolean evaluatePasswordStrength(String password) {
        boolean hasMinimumLength = checkMinimumLength(password);
        boolean hasUppercase = checkForUppercase(password);
        boolean hasDigit = checkForDigit(password);

        // Password is strong if it meets all criteria
        return hasMinimumLength && hasUppercase && hasDigit;
    }

    /**
     * Checks if the password meets the minimum length requirement.
     * @param password The password to check.
     * @return true if the password is at least 8 characters long, false otherwise.
     */
    public static boolean checkMinimumLength(String password) {
        return password.length() >= 8;
    }

    /**
     * Checks if the password contains at least one uppercase letter.
     * @param password The password to check.
     * @return true if the password contains an uppercase letter, false otherwise.
     */
    public static boolean checkForUppercase(String password) {
        return password.matches(".*[A-Z].*");
    }

    /**
     * Checks if the password contains at least one numeric digit.
     * @param password The password to check.
     * @return true if the password contains a digit, false otherwise.
     */
    public static boolean checkForDigit(String password) {
        return password.matches(".*\\d.*");
    }

    /**
     * Displays the result of the password strength check to the user.
     * @param isStrong Whether the password is considered strong.
     */
    public static void displayResult(boolean isStrong) {
        // Prepare the message and dialog properties based on password strength
        String message = isStrong ? "Strong password! It meets all criteria." : 
                                    "Weak password. Please ensure it has at least 8 characters, one uppercase letter, and one digit.";
        String title = isStrong ? "Password Strength: Strong" : "Password Strength: Weak";
        int messageType = isStrong ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.WARNING_MESSAGE;

        // Display the result dialog
        JOptionPane.showMessageDialog(null, message, title, messageType);
    }
}