package com.collection;

//constructors :
//1)ArrayList() : empty array list
//2)ArrayList(Collection<? extends E> c) 

import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(2);
		l.add(0,1);
		
		LinkedList lst = new LinkedList(l);
		System.out.println(lst);
		
		//All methods of ArrayList is applicable to Linked list
		
		//extra methods
		lst.addFirst(0);
		lst.addLast(3);
		
		System.out.println("1st lement : "+lst.getFirst());	//1st element
		System.out.println("last lement : "+lst.getLast());	//last element
		
		if(lst.offer(4)) {									//Element is inserted as a last element
			System.out.println("Element is inserted as a last element");
		}
		if(lst.offerFirst(10)) {							//Element is inserted at front
			System.out.println("Element is inserted at front");
		}
		if(lst.offerLast(100)) {							//Element is inserted at end
			System.out.println("Element is inserted at end");
		}
		
		System.out.println(lst.peek());						//Retrieves 1st element of list
		System.out.println(lst.peekFirst());				//Retrieves 1st element of list or null if list is empty
		System.out.println(lst.peekLast());					//Retrieves last element of list or null if list is empty
		
		System.out.println(lst.poll());						//Retrieves and delete 1st element of list
		System.out.println(lst.pollFirst());				//Retrieves and delete 1st element of list or null if list is empty
		System.out.println(lst.pollLast());					//Retrieves and delete last element of list or null if list is empty
		
		lst.push(50);  										//push element onto the stack represented by a list(i.e at front)
		System.out.println(lst);
		lst.pop();											//pop element onto the stack represented by a list
		System.out.println(lst);
		
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(1);
		
		System.out.println(lst.removeFirst());
		System.out.println(lst.removeLast());
		System.out.println(lst);
		
		if(lst.removeFirstOccurrence(2)) {
			System.out.println("deleted");
		}
		if(lst.removeLastOccurrence(2)) {
			System.out.println("deleted");
		}
		System.out.println(lst);
	}

}
