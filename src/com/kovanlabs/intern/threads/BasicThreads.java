package com.kovanlabs.intern.threads;


class A extends Thread{
    public void run(){
        try{
        Thread.sleep(10);
        for(int i=0;i<20;i++){
        System.out.println("uthayaa");
    }
        }catch (InterruptedException e){
        e.printStackTrace();
        }
    }
    }



class B extends Thread{
    public void run() {
     try {

         Thread.sleep(10);

         for (int i = 0; i < 20; i++) {
             System.out.println("rohith");
         }
     }catch (InterruptedException e){
         e.printStackTrace();
     }
    }
}

public class BasicThreads {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();


        a.setPriority(10);
        b.setPriority(2);
        a.start();
        b.start();
    }

}
