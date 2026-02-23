package com.kovanlabs.intern.threads;


import java.util.concurrent.atomic.AtomicInteger;

class Counter{
    int count;
    void add(){
        count++;
    }
//    AtomicInteger count = new AtomicInteger(0);
//
//    void add(){
//        count.incrementAndGet();
//    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.add();
                }
            });

        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }

System.out.println(counter.count);
    }


}





