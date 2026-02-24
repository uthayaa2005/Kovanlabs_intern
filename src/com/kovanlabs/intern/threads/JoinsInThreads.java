package com.kovanlabs.intern.threads;

class MyThread1 extends Thread {
    int m;

    public void run() {
        for ( m = 0; m <= 10; m++) {
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(m);
        }
    }
}
    class  MyThread2 extends Thread {
        int j;
        public void run(){
            for( j = 20; j <= 30; j++){
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(j);
            }
        }
    }



public class JoinsInThreads {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();

        MyThread2 t2 = new MyThread2();

        t1.start();
        try {
            t1.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        t2.start();



    }
}
