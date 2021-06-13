package ex28;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */

public class App {
    private final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        Calculator calc = new Calculator();

        myApp.input(calc);

        int total = calc.calctotal();

        myApp.output(total);
    }

    public void input(Calculator instance){
        int[] arr = {0,0,0,0,0};
        for(int i = 0; i < 5; i ++) {
            System.out.print("Enter a number: ");
            arr[i] = in.nextInt();
        }
        instance.setNumbers(arr);
    }

    public void output(int output){
        System.out.println("The total is " + output + ".");
    }
}
