package com.kovanlabs.intern.oops;




abstract class AbstractClass {

    abstract void execute();

}
class MyClass extends AbstractClass {
    void execute(){
        System.out.println("Executing");
    }
}

public class Abstract{
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.execute();
    }
}
