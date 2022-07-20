import java.util.*; 
class Person {
        int personId;
        String name;
        Person(int id , String name) {
              this.name = name;
              this.personId = id;
       }
    void display()
      {
	System.out.println("Person details:");
	
	System.out.println("Person id:"+personId);

	System.out.println("Person name:"+name);
       }
}
 class Emp extends Person{
        
        Emp(int id, string name, int empno) {
	super(id,name);
 	this.empno=empno;
       }
 
     void display()
      {
	super.display();
             System.out.println("\nEmp details:");

             System.out.println("\nEmp no:"+empno);
       }
}
 class Author extends Person{
        String biography;
        Author(int id, String name, int emp_no, String bio ) {
	super(id,name,emp_no);
 	biography=bio;
       }
void display()
  { 
	super.display();     
             System.out.println("\nAuthor details:");

             System.out.println("Author biography:"+biography);
  }
}
 class Manager extends Emp{
        String department;
        Manager(int id, String name, int emp_no, String dept) {
          
	super(id,name,emp_no);
 	department=dept;
       }
	
      void display()
    {
	super.display();	
             System.out.println("\nManager details:");
   
             System.out.println("\nManager departent:"); 
   }
}
public class InheritanceDemo
{
 public static void main(String args[])
   {    Scanner sc = new Scanner(System.in);
         int id, empno;
          String name, dept, bio;
                    System.out.println("\n Enter person id, name, emp_no, department for manager");
                    id = sc.nextInt();
                    name = sc.next();
                    empno = sc.nextInt();
                    dept = sc.next();
         Manager m=new Manager(id,name,empno,dept);
          System.out.println("\n Enter person id, name, emp_no, biography for Author");
                    id = sc.nextInt();
                    name = sc.next();
                    empno = sc.nextInt();
                    bio = sc.next();
         Author B=new Author(id,name,empno,bio);
	m.display();
	B.display();
    }
}