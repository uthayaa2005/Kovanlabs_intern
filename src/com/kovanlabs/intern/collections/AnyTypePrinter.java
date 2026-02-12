package com.kovanlabs.intern.collections;


class Printer <T>{
    T printer;

    public Printer ( T printer){
        this.printer = printer;
    }

    void print(){
        System.out.println(printer);
    }
}

public class AnyTypePrinter {
    public static void main(String[] args) {

        Printer<Integer> p1 = new Printer<>(300);
        Printer<String> printer = new Printer<String>("Hello");
        printer.print();
        p1.print();
    }
}
