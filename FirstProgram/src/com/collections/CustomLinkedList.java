package com.collections;

class Node{
   int data;
   Node next;
   Node(int data,Node next){
      this.data=data;
      this.next=next;
   }
}

public class CustomLinkedList{
   static Node head;
   public static void displayList(Node head){
      while(head!=null){
         System.out.println(head.data);
         head=head.next;
     }
   }
   public static void  addNodeLast(Node node){
     Node currentNode=head;
     while(currentNode.next!=null)
       currentNode=currentNode.next;
     currentNode.next=node;
   }
   public static void addNodeFirst(Node node){
      node.next=head;
      head=node;
   }
   public static void addNodeAfter(Node newNode,Node afterNode){
      newNode.next=afterNode;
      afterNode.next=newNode;
   }
   public static void addNodeBefore(Node newNode,Node beforeNode){

   }
   public static void main(String[] args){
      Node node1=new Node(10,null);
      Node node2=new Node(20,node1);
      head=node2;
      displayList(head);
      addNodeFirst(new Node(15,null));
      addNodeLast(new Node(11,null));
      displayList(head);

   }


}
