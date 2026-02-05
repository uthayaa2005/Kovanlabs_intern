package com.kovanlabs.intern.singleton;



class Singleton{

    private static Singleton Instance;



    public static  Singleton getInstance(){
        if(Instance == null){
            Instance = new Singleton();
        }
        return Instance;
    }

}

public class SingletonDesignPattern {
    public static void main(String[] args) {


        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();


        System.out.println(obj1 == obj2);
    }
}
