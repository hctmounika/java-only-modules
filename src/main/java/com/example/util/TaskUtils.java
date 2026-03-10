package com.example.util;

import com.example.model.Task;

import java.util.List;
import java.util.stream.Collectors;

public class TaskUtils {

    public static List<Task> completedTasks(List<Task> tasks) {

        return tasks.stream()
                .filter(Task::isCompleted)
                .collect(Collectors.toList());
    }

}