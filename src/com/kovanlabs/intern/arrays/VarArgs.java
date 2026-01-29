package com.kovanlabs.intern.arrays;

public class VarArgs {

    static void change(int... num){
        for (int x : num) {
            System.out.print(x+" ");
        }
       System.out.println();
    }

    public static void main(String[] args) {

        change(2,3,1,30);
        change(3,5,2,6);
        change(5,2);
        change(1);

    }
}
