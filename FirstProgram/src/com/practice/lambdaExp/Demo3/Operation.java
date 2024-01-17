package com.practice.lambdaExp.Demo3;

public class Operation{

    public static void main(String args[]){
        InterAdd ad=(int x,int y)->x+y;
        System.out.println(ad.operation(12,10));
    }

    }
