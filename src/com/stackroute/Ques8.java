package com.stackroute;

import java.util.*;
public class Ques8 {
    public static void main(String args[]) {
  System.out.println("Guess a number");
        int num = sc.nextInt();
        int target = 34;
      
        guessno(num,target);
    }

    public static String guessNo()
    {
        Scanner sc = new Scanner(System.in);
        int target = 34;
        System.out.println("Guess a number");
        int guess = sc.nextInt();
        while (true)
        {
            if (guess == target) {
                System.out.println("FOUND");
                break;
            } else if (guess < target) {
                System.out.println("The guess no is less than target!! guess again");
                guess = sc.nextInt();
            } else {
                System.out.println("The guess no is greater than target!! guess again");
                guess = sc.nextInt();
            }
        }
    }
}
