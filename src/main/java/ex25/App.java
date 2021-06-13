package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
import java.util.Scanner;

public class App{
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String password = myApp.input();
        PasswordComplexity validator = new PasswordComplexity(password);

        myApp.output(validator);
    }
    public String input(){
        System.out.print("Enter Password: ");
        return in.nextLine();
    }

    public void output(PasswordComplexity validator){
        StringBuilder b = new StringBuilder("The password '" + validator.getPassword() + "' ");

        //takes flag and appends complexity of password
        if (validator.getFlag() == 1)
            b.append("is a very weak password.");

        else if(validator.getFlag() == 2)
            b.append("is a weak password.");

        else if(validator.getFlag() == 3)
            b.append("is a strong password.");

        else if(validator.getFlag() == 4)
            b.append("is a very strong password.");

        else
            b.append("is not recognized under this criteria...");

        System.out.println(b);
    }
}
