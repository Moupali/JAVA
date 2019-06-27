package com.stackroute;

import java.util.*;
public class AddNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LIMIT");
        int sum = 0;
        int limit = sc.nextInt();
        int arr[] = new int[limit];
        System.out.println("Enter a no");

        for (int i = 0; i < limit; i++) {
             arr[i] =sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println(sum);

    }
}