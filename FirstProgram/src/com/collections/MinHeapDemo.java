package com.collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Comparator;

public class MinHeapDemo {
    public static Comparator<Integer> DecreasingOrder=new Comparator<Integer>() {
        ;

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    };

    public static void main(String args[]){
        PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>(DecreasingOrder);
        for(int i=0;i<10;i++){
            int value=new Random().nextInt(100)+1;
            //to get numbers randomly in the range 1 to 100;
            minHeap.add(value);
        }
        System.out.println(minHeap);//always minimumvalue will be at the head
        minHeap.add(0);
        System.out.println("After adding minimum value 0");
        System.out.println(minHeap);
        //Collections.reverseOrder();
        //System.out.println(minHeap);
        /*
         while(!pQueue.isEmpty()){
            Todo todo=pQueue.poll();
            System.out.println(todo);
        }
         */
        while(!minHeap.isEmpty()){
            Integer min=minHeap.poll();
            System.out.println("Poll: "+min);


        }

    }
}
