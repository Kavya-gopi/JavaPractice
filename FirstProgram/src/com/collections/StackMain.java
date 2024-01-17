package com.collections;

public class StackMain {
    public static void main(String[] args) {
        CustomizedStack<String> cStack=new CustomizedStack<String>();
        cStack.push("One");
        cStack.push("Two");
        cStack.push("Three");
        cStack.pop();
        System.out.println(cStack);
        System.out.println("Top Element: "+cStack.peek());
        System.out.println("Pop: "+cStack.pop());
        System.out.println(cStack);
        System.out.println("Top Element: "+cStack.peek());
        CustomizedStack<Integer> c1=new CustomizedStack<Integer>();
        c1.push(23);
        c1.push(2);
        c1.push(21);
        c1.pop();
        System.out.println("Pop: "+c1.pop());
        System.out.println(c1);
        System.out.println("Top Element :"+c1.peek());
    }
}
