package com.collections;

import java.util.ArrayList;
import java.util.List;

public class QueueArrayMain {
    public static void main(String args[]){
        QueueArray queue=new QueueArray(4);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();
        //queue.display();



       // System.out.println(queue);






    }
}
