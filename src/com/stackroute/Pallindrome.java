package com.stackroute;

import java.util.*;

 class Prog1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextLong();
        long n1=n;
        long n2=n;
        long r,r1,s=0,s1=0;
        while(n1>0)
        {
            r=n1%10;
            n1=n1/10;
            s=s*10+r;
        }
        if(s!=n)
        {
           res="is not pallindrome";
        }
        else
        {
            while(n2>0)
            {
                r1 = n2 % 10;
                if (r1 % 2 == 0)
                {
                    s1 = s1 + r1;
                }
                n2 = n2 / 10;

            }
            if(s1>25)
                res="is pallindrome and sum of even numbers is greater than 25";
            else
                res="is pallindrome and sum of even numbers is less than 25";




        }
    }
}



