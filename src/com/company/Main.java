package com.company;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

class Game {
    // player function contain complete game .....
    public void player() {
        // genrate randoom number...
        Random a = new Random();
        int b = a.nextInt(1000);
        System.out.println(b);
        System.out.println("guess the number between the given range ie 1000");
        // scanner object cerated....
        Scanner sc = new Scanner(System.in);


        int x = 0;
        // while loop ie 10 chances are given...
        while (x <= 10) {
            // int value below 1000 gets from user...
            int num = sc.nextInt();
            if (num > 1000) {
                System.out.println("you are going out of range ");
                x += 1;
            } else if ((num - b) < 0) {
                if ((num - b) < -200) {
                    x += 1;
                    System.out.println("try more bigger one");
                } else if ((num - b) < -150 && (num - b) < -51) {
                    x += 1;
                    System.out.println("try little biggerr one");
                } else if ((num - b) <= -1) {
                    x += 1;
                    System.out.println("nearby bigger");
                }


            } else if ((num - b) > 0) {
                if ((num - b) > 200) {
                    x += 1;
                    System.out.println("try more lower  one");
                } else if ((num - b) > 150 && (num - b) > 51) {
                    x += 1;
                    System.out.println("try little lower  one");
                } else if ((num - b) >= 1) {
                    x += 1;
                    System.out.println("nearby  lower");
                }
            } else {
                System.out.println("you found it ");

                x += 1;
                // more than 1 chance is taken called chances and one chance is called chance...
                if (x == 1) {
                    System.out.println("you took " + x + " chance");
                } else {
                    System.out.println("you took " + x + " chances");
                }

               // player post given according to their chances....
                if (x == 10) {
                    System.out.println("poor guesser");
                } else if (x < 5 && x > 1) {
                    System.out.println("quite good ");
                } else if (x == 1) {
                    System.out.println("genius player");
                } else if (x > 5 && x < 8) {
                    System.out.println("can imporove");
                } else if (x > 8 && x < 10) {
                    System.out.println("try try but dont cry");
                }
                //if user wants to play again press y = yess and n= no...
                System.out.println("\n want to play again  y or n \n ");
                char st = sc.next().charAt(0);
                // 121 ascii value of y and 110 of n.....
                if (st == 121) {

                   // function called again
                    player();


                } else if (st == 110) {
                   // game exit....
                    System.exit(0);
                }
            }


        }

    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        // game hass player1 object to play game ....
        Game playerr1 = new Game();
        // player function called by player1......
        playerr1.player();
    }

}