package ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Shannon Paul
 */

import java.util.Scanner;

public class App {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        AnagramChecker ac = new AnagramChecker();

        myApp.input(ac);

        //determine if the two strings are anagrams
        boolean result = ac.isAnagram();

        myApp.AnagramResult(result, ac);

    }

    public void input(AnagramChecker instance)
    {
        for(int i = 0; i < 2; i ++){
            if(i == 0) {
                System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
                System.out.print("Enter your first string: ");
                instance.setAnagram1(in.nextLine().toUpperCase());
                i ++;
            }
            if(i == 1){
                System.out.print("Enter your second string: ");
                instance.setAnagram2(in.nextLine().toUpperCase());
            }
        }
    }

    public void AnagramResult(Boolean result, AnagramChecker instance)
    {
        if(result)
            System.out.printf("\"%s\" and \"%s\" are anagrams.", instance.
                    getAnagram1(), instance.getAnagram2());
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", instance.getAnagram1(), instance.getAnagram2());
    }
}

