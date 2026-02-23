package com.kovanlabs.intern.threads;

//public class ThreadsClass extends Thread {
//        public void run(){
//            System.out.println("the threads is created by the  normal methods");
//        }
//
//        public static void main(String[] args){
//            ThreadsClass t1 = new ThreadsClass();
//            t1.start();
//        }
//}

 class ThreadsClass implements Runnable {

    @Override
    public void run() {
        System.out.println("the thread can create by the runnable");
    }

     public static void main(String[] args) {
         ThreadsClass threadsClass = new ThreadsClass();
         threadsClass.run();
     }
}