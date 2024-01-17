package com.collections;

public class CircularQueue {
    private int size;
    private int front,rear;
    private int queue[];
    public CircularQueue(int size){
        this.size=size;
        front=rear=0;
        queue=new int[size];
    }
    public boolean isEmpty(){
        return (front==0 && rear==0);
    }
    public boolean isFull(){
        System.out.println("rear "+(rear+1)%size);
        System.out.println("front "+front);
        return (rear+1)%size==front;
    }
    public void enqueue(int value){
        if(isFull())
            System.out.println("Queue is full");
        else{
            queue[rear]=value;
            rear=(rear+1)%size;
            System.out.println("added "+value);
        }
    }
    public int dequeue() {
        int item = -1;
        if (isEmpty())
            System.out.println("Queue is empty");
        else {
            item = queue[front];
            front = (front + 1) % size;
        }
        return item;
    }
    public void display(){
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            int i=front;
            do{
                System.out.println(queue[i]+" ");
                i=(i+1)%size;
            }while(i!=rear);
        }
        System.out.println();
    }
    public static void main(String args[]){
        CircularQueue q=new CircularQueue(4);
        System.out.println("is Queue empty: "+q.isEmpty());
        q.enqueue(20);
        q.display();
        q.enqueue(30);
        q.dequeue();
        System.out.println("delete "+q.dequeue());
        q.display();
        System.out.println("delete "+q.dequeue());
        q.display();
    }
}

