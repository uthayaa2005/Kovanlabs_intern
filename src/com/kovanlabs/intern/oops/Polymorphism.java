package com.kovanlabs.intern.oops;

class Animal {
    void sound() {
    }

    void eat() {
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("food");
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

        a.sound();
        a.eat();

    }
}
