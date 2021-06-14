package ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */
import java.util.Scanner;

public class App {
    private final static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        Winner myList = new Winner();

        myApp.input(myList);

        myApp.output(myList);
    }
    public void input(Winner instance){
        String[] arr = new String[]{};
        int i = 0;
        while(!arr[i].equals("")){
            System.out.print("Enter a name: ");
            arr[i] = in.nextLine();
        }

        //set the newly inputted array as the list of possible winners
        instance.setList(arr);
    }

    public void output(Winner instance) {
        String out = instance.generateWinner();
        System.out.println("The winner is..." + out);
    }
}

