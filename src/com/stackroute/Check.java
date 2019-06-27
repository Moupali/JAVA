package com.stackroute;

import java.util.*;
public class Check {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character");
        ch = sc.next().charAt(0);
        checking(ch);
    }
    public static String checking(char ch)
    {
        if(ch>='A' && ch<='Z')
            return "Capital Letter";
        else if(ch>='a'  && ch<='z')
            return "Small Letter";
        else if(ch>='0' && ch<='9')
            return "Digits";
        else
            return "Special Characters";
    }
}
