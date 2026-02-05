package com.kovanlabs.intern.oops;

final class Student {   // we use the final class for not to be inherited in any way
    void register() {
        System.out.println("Student registered");
    }
}

class Computer{
    final void login(){       // we use the final methods for not to be over ride in the any classes
        System.out.println("Computer login");
    }
class Mouse extends Computer{

        void register(){
        System.out.println("Mouse registered");
        }
}

}

public class FinalClassAndMethods {
    public static void main(String[] args) {
        Student s;
        Computer c;

        s = new Student();
        c = new Computer();

        s.register();
        c.login();
    }
}
