package com.Map;
import java.util.Map;
import java.util.HashMap;

public class IterationDemo {
    public static void main(String[] args){
        Map<String,String> itr=new HashMap<String,String>();
        itr.put("Name","Kavya");
        itr.put("age","21");
        for (Map.Entry<String,String> entry:itr.entrySet()) {
            System.out.println(("key="+entry.getKey()) + ""+"Value=" + entry.getValue());

        }


    }
}
