package com.collections;

public class QueueMain {
    public static void main(String[] args) {
        CustomizedQueue<String> cqueue=new CustomizedQueue<String>();
        cqueue.enqueue("kavya");
        cqueue.enqueue("Keerthi");
        cqueue.enqueue("Abi");
        System.out.println(cqueue);

        cqueue.dequeue();
        System.out.println(cqueue);
    }
}
