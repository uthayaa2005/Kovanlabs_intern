package com.kovanlabs.intern.memoryproblems;

class Box{
    int value;
}

public class PassByReference {

    public static void main(String[] args) {

        Box b1 = new Box();

        b1.value =20;

        Box b2 = b1;

        b2.value = 100;

        System.out.print(b1.value);



    }
}
