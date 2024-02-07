package org.StreamAPI;

//Stream API:
//    -Stream API is the consept introduced in java 1.8
//    -Stream API used to process collection of objects
//    -Stream API have some methods which allows us to process sequesnce of object to produce desigired output
//    -Strea API is interface belongs to belongs to java.lang packge
//    -Stream is not data structure, it takes inout from collection like array, list
//    - Normal for loop iterates over the elements one by one whereas enhanced for loop array itself give a value and that value goes into a variable say n.
//    - We can also print all the values present in an array by using the forEach method().
//    - forEach method gives one value at a time and we can save that value in a variable say n and print it.
//     nums.forEach( n- System.out.println(n));
//     - forEach method is part of a list interface, that gives one value at a time and then you can perform operations on it.


import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6);
        lst.forEach(l->System.out.println(l));

//        print 2 table from given list
        System.out.println("table of 2 from given list");
        Stream<Integer> s1 = lst.stream();
        Stream<Integer> s2 = s1.filter(n-> n%2==0);
        s2.forEach(s ->System.out.println(s));

//        Print 2's table in descending order
        System.out.println("2's table in descending");
//        Here we can't use previous stream s1 or s2 beacuse s1 ans s2 are already proceeded in forEach() method
        Stream s3 = lst.stream().filter(n-> n%2==0).sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return 1;
                else return -1;
            }
        });
        s3.forEach(s ->System.out.println(s));

        //2's table with adding of 2 for each element and print in descending order
        System.out.println("2's table with adding of 2 for each element and print in descending order");
        Stream s4 = lst.stream().filter(n-> n%2==0).map(n->n+2).sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) return 1;
                else return -1;
            }
        });
        s4.forEach(s ->System.out.println(s));
    }
}

//output:
//        > Task :StreamAPI.main()
//        1
//        2
//        3
//        4
//        5
//        6
//        table of 2 from given list
//        2
//        4
//        6
//        2's table in descending
//        6
//        4
//        2
//        2's table with adding of 2 for each element and print in descending order
//        8
//        6
//        4
