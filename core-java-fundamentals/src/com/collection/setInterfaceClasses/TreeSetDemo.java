package org.setInterfaceClasses;

//same as a hashSet but sorts the element, so doesn't allow null values
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet();
        treeSet.add("mangalaram");
        treeSet.add("aparna");
        Iterator itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}

//output: aparna mangalaram