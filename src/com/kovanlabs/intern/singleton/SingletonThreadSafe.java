package com.kovanlabs.intern.singleton;

class Singleton1{

    private static Singleton1 Instance;

    public  static synchronized Singleton1 getInstance(){
        if(Instance == null){
            Instance = new Singleton1();
        }
        return Instance;
    }
}

public class SingletonThreadSafe {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton Instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> "+ Instance.hashCode());
        };

        Thread thread1 = new Thread(task , "Thread-1");
        Thread thread2 = new Thread(task ,  "Thread-2");

        thread2.start();
        thread1.start();
    }


}
