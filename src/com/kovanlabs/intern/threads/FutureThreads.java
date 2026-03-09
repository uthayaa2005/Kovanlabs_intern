package com.kovanlabs.intern.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureThreads {

    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(1000);

            return 10+30;
        });
        Integer result = future.get();
        System.out.println(result);
        System.out.println("the main is doing some work");






        executor.shutdown();


    }
}
