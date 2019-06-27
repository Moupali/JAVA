package com.stackroute;

import java.util.*;
public class MultipleLoop{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        iteration(num);
    }
    public static void iteration(int num)
    {
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}

