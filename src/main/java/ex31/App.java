package ex31;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        //prompt for age and heart rate
        int pulse = myApp.input("Resting Pulse: ");
        int age = myApp.input("Age: ");

        //generate table
        KarvonenCalc calc = new KarvonenCalc(pulse, age);

        //print table
        calc.printTable();


    }

    public int input(String prompt){
        System.out.print(prompt);
        boolean valid = false;
        int value = 0;
        while(!valid){
            try{
                value = in.nextInt();
                valid = true;
            }
            catch (Exception e)
            {
                System.out.println("Please enter an integer...");
                //clear buffer
                in.nextLine();
            }
        }
        return value;
    }
}