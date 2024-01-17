package com.collections;
import java.util.PriorityQueue;
public class TodoMain {
    public static void main(String[] args) {
        PriorityQueue<Todo> pQueue=new PriorityQueue<Todo>();
        pQueue.offer(new Todo("Task1",2));
        pQueue.offer(new Todo("Task2",1));
        pQueue.offer(new Todo("Task3",4));
        pQueue.offer(new Todo("Task4",3));
        while(!pQueue.isEmpty()){
            Todo todo=pQueue.poll();
            System.out.println(todo);
        }




    }
}
