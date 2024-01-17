package com.practice.customArrList.demo1;

public class CusArrListString {
    private String[] nameList;
    private static int DEFAULT_SIZE;
    private int size=0;

    public CusArrListString(){
        this.nameList=new String[DEFAULT_SIZE];
    }

    public void add(String name){
        if(isFull()){
            resize();
        }
        nameList[size++]=name;
    }
    private boolean isFull(){
        return size==nameList.length;
    }

    private void resize(){
        String[] temp=new String[nameList.length*2];
        for(int i=0;i< nameList.length;i++){
            temp[i]=nameList[i];
        }

    }




    public static void main(String[] args){

    }

}
