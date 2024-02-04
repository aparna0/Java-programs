package org.mapInterface;

import java.util.Map;
import java.util.TreeMap;

// key value pair with sorting using key
public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2,"two");
        treeMap.put(1,"one");
        for(Map.Entry<Integer, String> e : treeMap.entrySet()){
            System.out.println(e);
        }
    }
}

//output:
//        > Task :TreeMapDemo.main()
//        1=one
//        2=two

