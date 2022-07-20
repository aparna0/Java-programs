package com.collection;

import java.util.*;

class CamparatorDemo implements Comparator<Integer>{
	public int compare(Integer no1, Integer no2) {
		return no2.compareTo(no1);
	}
}

public class SortedSet_TreeSet_Demo {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(50);
		ts.add(40);
		System.out.println(ts);
		
		int x;
		x = ts.higher(20);									//greate than 20 is	
		System.out.println("greate than 20 is " + x);
		
		x = ts.lower(20);									//smaller than 20 is 
		System.out.println("smaller than 20 is " + x);
	
		x = ts.ceiling(20);									//greate than or equal to 20 is
		System.out.println("greate than or equal to 20 is " + x);
	
		x = ts.floor(35);									//smaller or equal to 35 is
		System.out.println("smaller or equal to 35 is " + x);
		
		TreeSet<Integer> tail_set = new TreeSet<Integer>();	//from 20
		tail_set = (TreeSet<Integer>)ts.tailSet(20);
		Iterator itr = tail_set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		TreeSet<Integer> head_set = new TreeSet<Integer>();	
		head_set = (TreeSet<Integer>)ts.headSet(30);		//upto 20
		System.out.println(head_set);
		
		Iterator ditr = ts.descendingIterator();			//iterating in reverse order
		while(ditr.hasNext()) {
			System.out.println(ditr.next());
		}
		
		NavigableSet<Integer> revSet = ts.descendingSet();	//reverse the set
		System.out.println(revSet);
		
		Comparator com = ts.comparator();					//comparator()
		System.out.println("default is natural order therefore comparitor is "+com);
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(new CamparatorDemo());
		ts2.add(10);
		ts2.add(30);
		ts2.add(20);
		ts2.add(50);
		ts2.add(40);
		System.out.println(ts2);
	}

}

