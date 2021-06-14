package ex32;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int difficulty;
    private int guesses;
    public Random randomNumber = new Random();
    private final static Scanner in = new Scanner(System.in);

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getGuesses() {
        return guesses;
    }

    public void game(){
        boolean done = false;
        String playAgain;
        System.out.println("Let's play Guess the Number!\n");
        //do while to allow for easily replay
        do {
            System.out.println("Enter the difficulty level (1, 2, or 3):");
            difficulty = in.nextInt();

                if(difficulty == 1)
                    guesses = difficulty1();
                else if(difficulty == 2)
                    guesses = difficulty2();
                else
                    guesses = difficulty3();

            output();
            playAgain = in.next().toUpperCase();

        }while(playAgain.equals("Y"));
    }
    public int difficulty1(){
        //1-10
        int rand = randomNumber.nextInt(11);
        int guesses = guessing(rand);
        return guesses;
    }
    public int difficulty2(){
        //1-100
        int rand = randomNumber.nextInt(101);
        int guesses = guessing(rand);
        return guesses;
    }
    public int difficulty3(){
        //1-1000
        int rand = randomNumber.nextInt(1001);
        int guesses = guessing(rand);
        return guesses;
    }

    public int guessing(int randomNumber){
        int guess = 1002;
        int counter = 0;
        boolean playing = true;
        System.out.print("I have my number. What's your guess? ");
        while(playing){
            try{
                guess = in.nextInt();
                counter ++;
            }catch (Exception e){
                System.out.print("Please enter a valid input: ");
                in.nextLine();//clear buffer
                counter ++;
            }
            //too low
            if(guess < randomNumber){
                System.out.print("Too low. Guess again: ");
            }
            //too high
            else if(guess > randomNumber){
                System.out.print("Too high. Guess again: ");
            }
            else
                playing = false;
        }
        return counter;
    }

    public void output(){
        System.out.println("You got it in " + guesses + " guesses!\n");
        System.out.print("Do you wish to play again (Y/N)? ");
    }
}
