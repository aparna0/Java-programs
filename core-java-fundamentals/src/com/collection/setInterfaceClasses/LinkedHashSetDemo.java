package org.setInterfaceClasses;

//same as a HashSet but it uses doubly linked list, so it retains insertion order

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet hashSet = new LinkedHashSet();

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

//output: aparna null 100 Mangalaram
