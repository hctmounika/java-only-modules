package com.example;

import com.example.concurrency.AsyncTaskRunner;

public class Main {

    public static void main(String[] args) {

        AsyncTaskRunner runner = new AsyncTaskRunner();
        runner.runTasks();

    }

}