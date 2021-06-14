package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
import java.util.Scanner;

public class App {
    private final static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();

        String FirstName = myApp.input("Enter the first name: ");
        String LastName = myApp.input("Enter the last name: ");
        String zip = myApp.input("Enter the ZIP code: ");
        String id = myApp.input("Enter the employee ID: ");

        Validator profile = new Validator(FirstName, LastName, zip, id);

        //validating all inputs
        myApp.validateInput(profile);
    }
    public String input(String prompt){
        System.out.print(prompt);
        return in.nextLine();
    }
    public void validateInput(Validator instance){
        StringBuilder b = new StringBuilder();

        if(instance.isErrorFound())
            b.append("There were no errors found.");
        else {
            //append each possible error
            b.append(instance.validateFirstName());
            b.append(instance.validateLastName());
            b.append(instance.validateZIP());
            b.append(instance.validateID());
        }
        System.out.println(b);
    }
}
