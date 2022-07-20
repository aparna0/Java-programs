import java.util.*;
class member{
  String name;
  int age;
  double number;
  String address;
  double salary;
  Scanner sc=new Scanner(System.in);
    void printsalary()
   {
    System.out.println("Salary of member is:-"+salary);
   }
   void input()
   {
    System.out.println("Enter te following details:-");
    System.out.println("ENTER NAME:-");
    name=sc.next();
    System.out.println("ENTER AGE:-");
    age=sc.nextInt();
    System.out.println("ENTER NUMBER:-");
    number=sc.nextDouble();
    System.out.println("ENTER ADDRESS:-");
    address=sc.next();
    System.out.println("ENTER SALARY:-");
    salary=sc.nextDouble();
   }
   void display()
   {
     System.out.println("***Details***");
     System.out.println("NAME:"+name);
     System.out.println("AGE:"+age);
     System.out.println("NUMBER:"+number);
     System.out.println("ADDRESS:"+address);
     System.out.println("SALARY:"+salary);

   }
}
class Employee extends  member
{
String specialization, department;
void input()
   {
    
    System.out.println("ENTER SPECIALIZATION:-");
    specialization=sc.next();
    System.out.println("ENTER DEPARTMENT:-");
    department=sc.next();
     }
   void display()
   {
 
     System.out.println("SPECIALIZATION:"+specialization);
     System.out.println("DEPARTMENT:"+department);
     
   }
}
class Manager extends  member
{
String specialization, department;
void input()
   {
    
    System.out.println("ENTER SPECIALIZATION:-");
    specialization=sc.next();
    System.out.println("ENTER DEPARTMENT:-");
    department=sc.next();
     }
   void display()
   {
     Super.display();
     System.out.println("SPECIALIZATION:"+specialization);
     System.out.println("DEPARTMENT:"+department);
     
   }
}
class Exp4
{
 public static void main(String args[])
 {
 Employee e=new Employee();
 Manager m=new Manager();
 e.input();
 m.input();
 e.display();
 e.printsalary();
 m.display();
 m.printsalary();
 }
}


