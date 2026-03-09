package com.kovanlabs.intern.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

       for(int i = 0; i < 10; i++) {
           final int taskId = i;
           executor.submit(() -> {
               System.out.println("Task " + taskId + " " + Thread.currentThread().getName());


               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   Thread.currentThread().interrupt();
               }

               System.out.println(Thread.currentThread().getName() + " is running");
           });
       }
           executor.shutdown();
       }
    }

