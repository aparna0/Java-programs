package com.comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparator{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	public int compare(Object O1, Object O2) {
		Student s1 = (Student)O1;
		Student s2 = (Student)O2;
		
		return s1.name.compareTo(s2.name);
	}
}

class RollNoComparator implements Comparator{
	public int compare(Object O1, Object O2) {
		Student s1 = (Student)O1;
		Student s2 = (Student)O2;
		
		//return s1.rollNo.compareTo(s2.rollNo); can't invoke compareTo on  primitive types
		if(s1.rollNo > s2.rollNo)	return 1;
		else if(s1.rollNo < s2.rollNo)	return -1;
		else return 0;
	}
}
public class ComparatorDemo {
	public static void main(String args[]) {
		Student s4 = new Student(1,"Aparna");
		Student s3 = new Student(2,"shreya");
		Student s2 = new Student(3,"Aparna");
		Student s1 = new Student(4,"shreya");
		
		if(s1==s3) {
			System.out.println("okay");
		}
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		Collections.sort(slist, new RollNoComparator());
		for(Student s:slist) {
			System.out.println(s);
		}
	}

}
