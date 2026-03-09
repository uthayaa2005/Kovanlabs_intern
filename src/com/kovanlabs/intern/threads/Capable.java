package com.kovanlabs.intern.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Capable {

    public static void main(String[] args) {

        ExecutorService ececutor = Executors.newFixedThreadPool(2);

        Callable<Integer> callable = () -> {
            System.out.println(" Task is running on "+Thread.currentThread().getName());
        return 10+20;
        };

        Future<Integer> future = ececutor.submit(callable);

        try {

            Integer result = future.get();
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
        }



        ececutor.shutdown();

    }
}
