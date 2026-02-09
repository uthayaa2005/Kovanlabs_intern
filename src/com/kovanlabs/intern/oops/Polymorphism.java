package com.kovanlabs.intern.oops;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Animal eat");
    }

    void timeOfClean(int clean ) {
        System.out.println("Animal timeOfClean"+clean);
    }

    void timeOfClean(double clean ) {
        System.out.println("Animal timeOfClean"+clean);
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("meat , nonveg");
    }
    @Override
            void sound() {
        System.out.println("barking");
    }

}

public class Polymorphism {
    public static void main(String[] args) {


        Animal a;

        a = new Dog();

        a.timeOfClean(1);
        a.timeOfClean(10.33);

        a.sound();
        a.eat();

    }
}
