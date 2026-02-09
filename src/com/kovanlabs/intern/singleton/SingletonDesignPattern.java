package com.kovanlabs.intern.singleton;



class Singleton{

    private static Singleton Instance;

    static int count =0;



    public static  Singleton getInstance(){
        if(Instance == null){
            Instance = new Singleton();
            count++;
        }
        return Instance;
    }



    public static int getCount(){
        return count;
    }

}

public class SingletonDesignPattern {
    public static void main(String[] args) {


        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();


        System.out.println(obj1 == obj2);
        System.out.println(obj1 == obj3);
        System.out.println("number of object created : "+ Singleton.getCount());
    }
}
