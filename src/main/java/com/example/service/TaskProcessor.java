package com.example.service;

import com.example.model.Task;

import java.util.List;
import java.util.stream.Collectors;

public class TaskProcessor {

    public List<String> getTaskNames(List<Task> tasks) {

        return tasks.stream()
                .map(Task::getName)
                .collect(Collectors.toList());
    }

}