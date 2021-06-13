package ex30;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Paul Shannon
 */

public class App {
    public static void main(String[] args) {
        App myApp = new App();

        myApp.generate();
    }
    public void generate(){
        int[][] arr = new int[12 + 1][12 + 1];
        //using a 2d array, generate the table using
        for(int i = 1; i <= 12; i ++){
            for(int j = 1; j <= 12; j ++){
                arr[i][j] = i * j;
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.print("\n");
        }

    }
}
