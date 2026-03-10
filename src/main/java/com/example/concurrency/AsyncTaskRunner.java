package com.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsyncTaskRunner {

    public void runTasks() {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> {
            System.out.println("Task 1 running");
        });

        executor.submit(() -> {
            System.out.println("Task 2 running");
        });

        executor.shutdown();
    }

}