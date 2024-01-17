package com.collections;

import java.util.LinkedList;

public class CustomizedQueue<T> {
    private LinkedList<T> queue;
    public CustomizedQueue(){
        queue = new LinkedList<T>();
    }
    public void enqueue(T data){
        queue.addLast(data);
    }
    public T dequeue(){
        if(queue.isEmpty())
            return null;
        else{
            return queue.removeFirst();
        }

    }
    @Override
    public String toString(){
        return queue.toString();

    }
}
