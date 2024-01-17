package com.collections;

public class Todo implements Comparable<Todo> {
    private String task;
    private int priority;
    public void setTask(String task){
        this.task=task;
    }
    public String getTask(){
        return task;
    }

    public void setPriority(int priority){
        this.priority=priority;
    }

    public int getPriority(){
        return priority;
    }

    public Todo(String task,int priority){
        super();
        this.task=task;
        this.priority=priority;
    }

    @Override
    public int compareTo(Todo ob){
        return this.priority-ob.priority;
    }

    @Override
    public String toString(){
        return "Task= "+this.task+" Priority= "+this.priority;
    }
}
