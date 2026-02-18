package com.kovanlabs.intern.lambda;

@java.lang.FunctionalInterface
interface A{
    void add();
}

public class FunctionalInterface {
    public static void main(String[] args) {

        A obj = () ->
        {
              System.out.println("add");

        };

//        A obj = new A() {
//            @Override
//            public void add() {
//                System.out.println("normal");
//            }
//        };

        obj.add();
    }
}
