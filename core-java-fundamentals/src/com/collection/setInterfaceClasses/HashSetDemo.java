package org.setInterfaceClasses;

//No insertion order maintained
//No duplicate elements are inserted
//null values are allowed to be inserted

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();

        hashSet.add("aparna");
        hashSet.add("aparna");
        hashSet.add(null);
        hashSet.add(100);
        hashSet.add("Mangalaram");

        Iterator itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}

//output: null 100 Mangalaram aparna
