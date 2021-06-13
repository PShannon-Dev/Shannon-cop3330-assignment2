package ex25;

import java.util.Scanner;

/*
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:

A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
 */
public class App    {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String password = myApp.input();
        PasswordComplexity validator = new PasswordComplexity(password);

        myApp.output(validator);

    }
    public String input(){
        return in.nextLine();
    }
    public void output(PasswordComplexity validator){
        StringBuilder b = new StringBuilder("The password '" + validator.getPassword() + "' ");

        //takes flag and appends complexity of password
        if (validator.getFlag().equals("weak")){
            b.append("is a very weak password.");
        }

        System.out.println(b);
    }
}
