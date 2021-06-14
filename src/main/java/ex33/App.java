package ex33;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
import java.util.Scanner;


public class App {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        MagicBall ball = new MagicBall();
        String question = myApp.input();

        myApp.output(ball);

    }

    public String input(){
        System.out.print("What's your question? ");
        return in.nextLine();
    }

    public void output(MagicBall instance){
        String output = instance.randomResponse();
        System.out.println(output);
    }
}
