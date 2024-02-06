package org.comparator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    int id;
    String name;
    Double salary;

    Employee(int id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return ("id: "+id+", name: "+name+", salary: "+salary);
    }
}

class Student implements Comparable{
    int rollNo;
    String name;
    Student(int no, String name){
        this.rollNo = no;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if(this.rollNo > s.rollNo) return 1;
        else return -1;
    }

    public String toString(){
        return ("id: "+rollNo+", name: "+name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args){
        ArrayList<Integer> i = new ArrayList<>();
        i.add(10);
        i.add(22);
        i.add(31);
        i.add(25);
        Collections.sort(i);
        System.out.println(i);

        //output will be :
//        > Task :ComparatorDemo.main()
//                [10, 22, 25, 31]
//        by default it is sorted in ascending order and sorting is done by swapping
//        for example: 3,1,2,4
//                1st round: 1,3,2,4  //swapped 3 & 1
//                2nd round: 1.2,3,4  //swapped 3 & 2
//
//        Compartor:
//        Compartor is an inteface which allows us to write our own logic for sorting
//        using compare which,
//        we can pass two values and swap
//        if you want to swap then return 1 or return -1

//        Lets sort in descending order
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if(i2>i1) return 1;
                else return -1;
            }
        };

        Collections.sort(i,comp);
        System.out.println(i);

        //output:
//        [31, 25, 22, 10]


//        Lets sort Employee objects using salary
        ArrayList<Employee> e = new ArrayList<>();
        e.add(new Employee(1,"aparna", 1000.0));
        e.add(new Employee(2,"ankita", 21000.0));
        e.add(new Employee(3,"rupa", 2000.0));

        Comparator<Employee> employeeComparator = new Comparator<Employee>(){
            public int compare(Employee e1, Employee e2){
                if(e1.salary > e2.salary) return 1;
                else return -1;
            }
        };

        Collections.sort(e,employeeComparator);
        System.out.println(e);
//        output:
//        [id: 1, name: aparna, salary: 1000.0, id: 3, name: rupa, salary: 2000.0, id: 2, name: ankita, salary: 21000.0]


        //    we can write own sorting method inside own class itself by implementing Comparable interafce
//        refer Student class
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student(1,"aparna"));
        s.add(new Student(2,"ankita"));
        s.add(new Student(3,"rupa"));
        Collections.sort(s);
        System.out.println(s);
//        output:
//        [id: 1, name: aparna, id: 2, name: ankita, id: 3, name: rupa]
    }

}

