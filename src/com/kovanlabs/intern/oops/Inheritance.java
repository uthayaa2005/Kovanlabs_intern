package com.kovanlabs.intern.oops;


class Vehicle{
    final String x ="uthayaa";
    void move(){
        System.out.println(x);
        System.out.println("Vehicles moving");
    }
}
class Car extends Vehicle{

    String x = "sanjai";
    @Override
    void move(){

        System.out.println(x);

        System.out.println("Cars moving");
    }
}

class Bike extends Vehicle{
    @Override
    void move(){
        super.move();
        System.out.println("Bikes moving");
    }
    void race(){

        System.out.println("top speed is 200km per hour");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        Bike bike1 = new Bike();

        car1.move();



    }
}
