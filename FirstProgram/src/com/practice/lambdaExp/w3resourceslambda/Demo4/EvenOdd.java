package com.practice.lambdaExp.w3resourceslambda.Demo4;
/*
Write a java program to implement a lambda Expression to filter
out even and odd numbers from a list of integers.
 */
import java.util.ArrayList;
public class EvenOdd {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);;
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(15);
        System.out.println(list);
        EvenOddNum evenOddNum=()->{
            for(int l:list){
                if(l%2==0){
                    System.out.println("The even number :"+l);
                }
                else{
                    System.out.println("The odd number :"+l);
                }
            }
        };
        evenOddNum.filter();

    }
}
interface EvenOddNum{
    public void filter();
}
