package com.practice.lambdaExp.w3resourceslambda.Demo5;
import java.util.TreeSet;
import java.util.Arrays;

public class AlphabeticalOrder {

    public static void main(String args[]){
        TreeSet<String> nameList=new TreeSet<String>();
        nameList.add("Kavya");
        nameList.add("Abinaya");
        nameList.add("Keerthika");
        nameList.add("Suchismathi");
        System.out.println(nameList);

        String[] str={"Kavya","Abinaya","Keerthika","Suchismathi"};

        OrderList list=()->{
             Arrays.sort(str);
        };
        System.out.println("Listing the order");
        list.order();


    }
}
interface OrderList{
    public void order();
}
