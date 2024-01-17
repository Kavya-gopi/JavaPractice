package com.LinearSearch;
import java.util.Arrays;

public class StringListSearch{

    public static void main(String[] args){
        String[] nameList={"KAVYA","abinaya","keerthi","Suchismathi","abirami"};
        String target="Kavi";
        boolean result=search(nameList,target);
        System.out.println("Is the name Found in the list ? "+result);
    }

    static boolean search(String[] arr,String target) {

        if (arr.length == 0) {
            //System.out.println("Array length");
            return false;
        }
        String[] arr1 =new String[arr.length];
        //System.out.println(arr1.length);
        for(int i=0;i<arr.length;i++){
            String lowerCase=arr[i].toLowerCase();
            arr1[i]=lowerCase;
        }
        //System.out.println(arr1);
        String tar = target.toLowerCase();
        //System.out.println(tar);


        for (String s : arr1) {
            //System.out.println(s);
            if (tar.equals(s)) {
                return true;
            }
        }
        return false;
    }
}
