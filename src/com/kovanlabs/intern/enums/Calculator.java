package com.kovanlabs.intern.enums;

enum Operation{
    ADD {
        public double apply(double a, double b) {
            return a + b;
        }
    },
    SUB{
            public double apply( double a, double b){
                return a - b;
        }
    },
    MUL{
        public double apply(double a, double b){
            return a * b;
        }
    };

    public abstract double apply(double a, double b);
    }


public class Calculator {

    public static void main(String[] args) {

        Operation operation = Operation.ADD;
        Operation operation2 = Operation.SUB;
        Operation operation3 = Operation.MUL;

        System.out.println(operation.apply(10,20.4));
        System.out.println(operation2.apply(30,20.4));
        System.out.println(operation3.apply(10,20.4));
    }
}
