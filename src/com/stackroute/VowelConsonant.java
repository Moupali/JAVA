package com.stackroute;

import java.util.*;
public class VowelConsonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int len=0;
        System.out.println("enter a word");
        String word =sc.next();
        len=word.length();
     public static String checkVowelConsonant(String word,int len)
      {
         for(int i=0;i<len;i++)
          {
             char ch=word.charAt(i);

                if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
                   return "Vowel";

               else if(ch>=48 && ch<=57)
                   return "Error";
               else
                   return"Consonant";
        }



    }
}

