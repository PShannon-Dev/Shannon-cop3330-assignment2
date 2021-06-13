package ex28;

import java.util.Scanner;

/*
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.
Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.
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
