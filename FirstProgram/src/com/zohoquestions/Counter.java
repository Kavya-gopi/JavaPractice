package com.zohoquestions;

public class Counter {
    public static void main(String[] args) {
        int num=10;
        for(int counter=0;counter<5;counter++){
            switch(counter){
                case 0:
                    num+=3;
                    break;
                case 2:
                    num-=5;
                case 4:
                    num*=2;
                default:
                    num+=1;
                    break;
            }
            System.out.print(num);
        }
    }
}
