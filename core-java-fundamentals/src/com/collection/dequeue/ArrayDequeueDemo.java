package org.dequeue;

import java.util.ArrayDeque;
import java.util.List;

public class ArrayDequeueDemo {
    public static void main(String[] args){
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(1);
        arrayDeque.addFirst(2);
        arrayDeque.addLast(3);
        List<Integer> l = List.of(4,5);
        arrayDeque.addAll(l);
        System.out.println(arrayDeque);
    }
}

//Output:
//        > Task :ArrayDequeueDemo.main()
//        [2, 1, 3, 4, 5]