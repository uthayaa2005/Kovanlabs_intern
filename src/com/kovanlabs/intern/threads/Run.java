package com.kovanlabs.intern.threads;


class MyThread implements Runnable{

    public void run(){
        System.out.println("MyThread");

        for(int i=20;i<=25;i++){
            try{
                System.out.println(i);
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Interrupted");
            }
        }
    }

    public void add(int a , int b){
        for(int i=0;i<10;i++){
            a++;
            b++;
        }
        System.out.println(a+b);
    }
}

public class Run {
    public static void main(String[] args){

        Runnable r = new MyThread();
          MyThread t1 = new MyThread();
        Thread t = new Thread(r);
        t.start();

    t1.add(1,2);

    }
}
