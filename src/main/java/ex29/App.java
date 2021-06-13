package ex29;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
public class App {
    private final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        QuickCalculator calc = new QuickCalculator();

        double rate = myApp.input();

        double output = calc.calc(rate);
        myApp.output(output);
    }

    public double input(){
        boolean valid = false;
        double rate = 0;
        while(!valid){
            System.out.print("What is the rate of return? ");
            try{
                rate = in.nextDouble();
                valid = true;
            }
            catch (Exception e){
                //catch will find any exception and print output
                System.out.println("Sorry. That's not a valid input.");
                //clear buffer
                in.nextLine();
            }
        }
        return rate;
    }
    public void output(double total){
        //round up to account for excess years and to keep equal to output format
        int Roundtotal = (int) Math.ceil(total);
        DecimalFormat nf = new DecimalFormat("0");
        System.out.print("It will take " + nf.format(total) + " years to double your initial investment.");
    }
}
