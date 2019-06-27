package com.stackroute;

import java.util.*;
public class R everse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        reverse_soln(str);
    }
    public static void reverse_soln(String str)
    {
        int len=str.length();
        String rev="";
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("reverse is:"+rev);
    }
}
