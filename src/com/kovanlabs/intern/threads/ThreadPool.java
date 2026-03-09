package com.kovanlabs.intern.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);


        Runnable task = () -> {

            System.out.println("task is :"+ Thread.currentThread().getName()
            );
        };

        executorService.execute(task);
        executorService.execute(task);
        executorService.execute(task);
        executorService.shutdown();
    }
}
