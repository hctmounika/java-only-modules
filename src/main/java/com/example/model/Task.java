package com.example.model;

public class Task {

    private int id;
    private String name;
    private boolean completed;

    public Task(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public boolean isCompleted() { return completed; }

}