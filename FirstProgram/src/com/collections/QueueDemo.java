package com.collections;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String args[]){
        Queue<Integer> values=new LinkedList<Integer>();
        values.offer(12);
        values.offer(20);
        values.offer(40);

        System.out.println("Queue "+values);
        System.out.println("front element "+values.peek());
        System.out.println("poll "+values.poll());
        System.out.println("queue "+values);
        System.out.println("adding "+values.offer(34));
        System.out.println("queue "+values);
    }
}
