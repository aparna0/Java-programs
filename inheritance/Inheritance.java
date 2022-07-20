import java.util.*;
class Person {
  int personId;
  String name;  
  Person(int id, String n) {  
       personId = id;
       name = n;
  }
  void display() {
     System.out.println(" Person name : "+name+"\n Person id : "+personId);
 }
}

class Employee extends Person{
  int emp_no;  
  Employee(int id, String n, int no) {  
      super(id,n);
      emp_no = no;
  }
  void display() {
     super.display();
     System.out.println(" Person emp_no : "+ emp_no);
 }
}

class Author extends Employee{
  String bio;  
  Author(int id, String n, int no, String b) {  
       super(id,n,no);
      bio = b;
  }
  void display() {
    super.display();
     System.out.println(" Person Biography : "+bio);
 }
}

class Manager extends Employee{
  String dept;  
  Manager(int id, String n, int no, String d) {  
       super(id,n,no);
      dept = d;
  }
  void display() {
    super.display();
     System.out.println(" Person department : "+dept);
 }
}

public class Inheritance {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int id,no;
String n,b,d;
System.out.println("\n Enter id,name,emp no, department for manager");
 id = sc.nextInt();
 n = sc.next();
 no = sc.nextInt();
 d= sc.next();
Manager m = new Manager(id,n,no,d);
m.display();

System.out.println("\n Enter id,name,emp no, biography for author");
id = sc.nextInt();
 n = sc.next();
 no = sc.nextInt();
 d= sc.next();
Author a = new Author(id,n,no,d);
a.display();
}
}