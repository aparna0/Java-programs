package org.mapInterface;

import java.util.HashMap;
import java.util.Map;

// key value pair
public class HashMapDemo {
    public static void main(String[] args){
        HashMap hashMap = new HashMap();
        hashMap.put(1,"apple");
        hashMap.put(2,"orange");
        hashMap.put("fruit", "banana");

        for(Object e : hashMap.entrySet()){
            System.out.println(e);
        }

        System.out.println();
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1,"black");
        colors.put(2,"white");
        colors.put(3,"blue");
        colors.put(4,"red");

        for( Map.Entry<Integer, String> e: colors.entrySet()){
            System.out.println(e);
        }
        System.out.println(hashMap);
    }
}

//output:
//        > Task :HashMapDemo.main()
//        1=apple
//        2=orange
//        fruit=banana
//
//        1=black
//        2=white
//        3=blue
//        4=red
//        {1=apple, 2=orange, fruit=banana}
