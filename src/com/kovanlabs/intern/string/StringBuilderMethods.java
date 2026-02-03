package com.kovanlabs.intern.string;

public class StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("uthayaa");

        s.append(" ").append(" developer");
        s.insert(7," java");


        System.out.print(s);
    }
}
