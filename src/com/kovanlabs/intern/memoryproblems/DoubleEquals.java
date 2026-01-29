package com.kovanlabs.intern.memoryproblems;

public class DoubleEquals {
    public static void main(String[] args) {
        String s1 = "uthayaa";
        String s2 = "uthayaa";

        String s3 = new String("uthayaa");


        System.out.println("S1 hash code = " + System.identityHashCode(s1));
        System.out.println("S2 hash code = " + System.identityHashCode(s2));
        System.out.println("S3 hash code = " + System.identityHashCode(s3));

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
