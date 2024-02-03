package com.collection;
import java.util.*;
//	Dynamic array
//	it is not synchronized
//	we can add or remove elements any time therefore it is more flexible than array
//	present in java.uitl package
//	can have duplicate values
//	maintains insertion order
//	dynamic access using index
// 	manipulation is slower than linkedList because a lot of shifting needs
// constructors :
//					1)ArrayList() : empty array list
//					2)ArrayList(Collection<? extends E> c) 
//					3)ArrayList(int capacity)
public class ArrayListDemo {

	public static void main(String[] args) {
		
		//creating arraylist
		ArrayList a = new ArrayList(); // old non-generic arraylist
		ArrayList<Integer> al = new ArrayList<Integer>(); //new generic arraylist
		ArrayList<String> s = new ArrayList<String>();
		
		//insertion
		a.add(1);
		a.add("app");
		a.add(10.5);
		System.out.println(a);
		
		s.add("Chakrapani");  //append
		s.add(0,"Aparna");	//insertion at specified index
		List ts = new ArrayList();
		ts.add("ab");
		ts.add("ab");
		ts.add("ab");
		s.addAll(ts);		//appending entire collection
		s.addAll(1,ts);		//adding entire collection at specified index
		System.out.println(s);
		
		System.out.println(a.size());	//number of elements 
		
		a.ensureCapacity(10); 		//specifying minimum capacity  
		
		s.set(1, "Mangalaram");		//to update value at specified index
		
		String cs = s.get(1);       //to get value at specified index
		System.out.println(cs);
		
		if(al.isEmpty()) {			//to check list is empty or not
			System.out.println("no elements present in al");
		}
		
		if(s.contains(cs)) {			//to given value is present or not
			System.out.println(cs+ " is present");
		}
		
		System.out.println(s.indexOf("ab"));   //return 1st index of given value
		System.out.println(s.lastIndexOf("ab"));	//return last index of given value
		
		System.out.println(s);
		//deleting
		s.remove(4);
		s.remove("ab");
		al.clear();
		//s.removeRange(2,5);
		System.out.println(s);
		
		//using Iterator
		Iterator itr = a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// in reverse order
		ListIterator<String> ritr = s.listIterator(s.size());
		while(ritr.hasPrevious()) {
			System.out.println(ritr.previous());
		}
		//sorting
		Collections.sort(s);
		
		//using for-each
		for(String i : s) {
			System.out.println(i);
		}
		
		List<String> l = new ArrayList<String>();
		l.addAll(s);
		System.out.println(l);
		
		//sorting
		Collections.sort(l);
		
		//using for-each
		l.forEach(i -> System.out.println(i));
		l = s.subList(2, 5);	//sub list
		Collections.sort(l);
		
		//using for-each
		for(String i : l) {
			System.out.println(i);
		}
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		Object[] o = ls.toArray();
		for(int i=0; i<o.length; i++) {
			System.out.println(o[i]);
		}
	} 
}
