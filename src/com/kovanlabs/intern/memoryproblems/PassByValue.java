package com.kovanlabs.intern.memoryproblems;

public class PassByValue {

    static void change(int x){
        x = 50;
    }

    public static void main(String[] args) {

        int a = 20;

        change(a);
        System.out.println(a);
    }
}
