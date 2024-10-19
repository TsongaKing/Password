# Password Strength Checker

This project contains two Java classes that demonstrate different approaches to checking password strength and characteristics.

## Password Class

The `Password` class is a simple console application that checks if a password contains a special character.

### Features:
- Prompts the user to enter a password via console input.
- Checks if the entered password contains at least one special character.
- Displays the result to the user in the console.

### Usage:
1. Run the `Password` class.
2. Enter a password when prompted.
3. The program will inform you whether the password contains a special character or not.

## PasswordStrengthChecker Class

The `PasswordStrengthChecker` class is a GUI application that evaluates password strength based on multiple criteria.

### Features:
- Uses a dialog box to prompt the user for a password.
- Evaluates the password based on the following criteria:
  - Minimum length of 8 characters
  - Contains at least one uppercase letter
  - Contains at least one digit
- Displays the result (strong or weak) in a dialog box.

### Usage:
1. Run the `PasswordStrengthChecker` class.
2. Enter a password in the dialog box that appears.
3. The program will evaluate the password and display whether it's strong or weak.

## Requirements
- Java Development Kit (JDK) 8 or higher
- For `PasswordStrengthChecker`: A graphical environment that supports Swing (for the GUI components)

## How to Run
1. Compile the Java files:
   ```
   javac Password.java
   javac PasswordStrengthChecker.java
   ```
2. Run either class:
   ```
   java Password
   ```
   or
   ```
   java PasswordStrengthChecker
   ```

## Note
These programs are for educational purposes and demonstrate basic password checking techniques. 
For real-world applications, consider using more robust password strength algorithms and secure password handling practices.

Author
P. Muhlaba

