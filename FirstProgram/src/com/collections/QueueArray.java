package com.collections;

public class QueueArray {
    private static int values[];
    private static int front,rear;
    private static int capacity;

    public QueueArray(int size){
        capacity=size;
        front=rear=-1;
        values=new int[size];

    }
    public boolean isEmpty(){
        if(front==rear){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        if(rear==capacity){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(int value){
        //if queue is empty, increment both front and rear
        //else increment only rear
        if(isEmpty()){
            front++;
            rear++;
            values[rear]=value;
        }
                else
        if(!isFull()){
            rear++;
            values[rear]=value;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=0;i<rear;i++){
                values[i]=values[i+1];
                values[rear]=0;
                rear--;
            }
        }

    }
    public void display(){
        for(int i=0;i<=rear;i++){
            System.out.println(values[i]);
        }
    }

}
