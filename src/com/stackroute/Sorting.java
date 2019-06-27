package com.stackroute;

import java.util.*;
public class Sorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int temp = 0, sum = 0, num1 = num, count = 0, i = 0;
        int arr[] = new int[10];
        while (num1 != 0) {
            arr[count] = num1 % 10;
            num1 = num1 / 10;
            count++;

        }
        sort(arr,count);
    }

    public static void sort(int arr[],int count) {
        int temp=0;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < (count - 1) - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("sum is:" + sum);
        if (sum > 15)
            System.out.println("True");
        else
            System.out.println("False");

    }
}

