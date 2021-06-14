package ex32;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        GuessingGame playGame = new GuessingGame();

        playGame.game();
    }
}

