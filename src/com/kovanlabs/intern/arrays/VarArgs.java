package com.kovanlabs.intern.arrays;

public class VarArgs {

    public static String s = "uthysss";

    static void change(String name,int... num){

        System.out.println(name);
        for (int x : num) {
            System.out.print(x+" ");
        }
       System.out.println();
    }

    public static void main(String[] args) {


     VarArgs v1 = new VarArgs();

     System.out.println(v1.s);
//        change("vrvrvr",3,1,30);
//        change("evv",5,2,6);
//        change("gbtbt",2);
//        change("rvrv");

    }
}
