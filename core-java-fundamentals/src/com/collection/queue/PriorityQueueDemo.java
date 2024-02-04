package org.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(10);
        pq.add(1);
        pq.add(5);
        pq.add(25);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}

//Output:
//        > Task :PriorityQueueDemo.main()
//        [1, 10, 5, 25]
//        1
//        1
//        [5, 10, 25]