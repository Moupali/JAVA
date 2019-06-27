package com.stackroute;

import java.util.*;
public class Prog2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        long num=sc.nextLong();
         OddEven(num);
    }
    public static String OddEven(long num)
   {

        if(num%2!=0 && (num>20 && num<30))
        {
            return "Tom";
        }
        else if(num%2==0 && (num>20 && num<30))
        {
            return "Jerry";

        }
        else
            return "Number is not in 20-30 range";
    }
}
