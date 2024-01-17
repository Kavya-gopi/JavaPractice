package com.collections;

import java.util.ArrayList;

public class CustomizedStack<T> {
    private ArrayList<T> stack;
    public CustomizedStack(){
        stack=new ArrayList<T>();
    }
    public void push(T data){
        stack.add(data);
    }
    public T pop(){
        if(stack.isEmpty())
            return null;
        return stack.remove(stack.size()-1);
    }
    public T peek(){
        if(stack.isEmpty())
            return null;
        return stack.get(stack.size()-1);
    }
    @Override
    public String toString(){
        return stack.toString();
    }
}
