package com.kovanlabs.intern.string;

import java.util.Scanner;

public class Palindrome {

    static boolean isPal(String s){

        if(s.length() == 0 || s.length() == 1)
            return true;

        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length() - 1));


        return false;
        }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("give a String : ");
        String x = sc.nextLine();

        if(isPal(x)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}
