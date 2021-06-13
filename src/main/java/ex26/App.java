package ex26;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
public class App {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();

        double balance = myApp.input("What is your balance? ");
        double apr = myApp.input("What is the APR on the card (as a percent)? ");
        double payment = myApp.input("What is the monthly payment you can make? ");

        PaymentCalculator myCalc = new PaymentCalculator(balance, payment, apr);

        myApp.output(myCalc);
    }

    public double input(String prompt){
        System.out.print(prompt);
        return in.nextDouble();
    }
    public void output(PaymentCalculator calculator){
        System.out.println(calculator.getMonths());
    }
}
