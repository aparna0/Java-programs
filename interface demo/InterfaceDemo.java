interface Owner {
void aquier(int a);
void dispose(int a);
}

class Person implements Owner {
 public static int real = 10;
 public static int tangible = 15;
 public static int intangible = 20;

 public void aquier(int a){
    if( a == real )                      real++;
    if( a == tangible )                tangible ++;
    else                                    intangible++;
}
public void dispose(int a) {
   if( a == real )                      real--;
   if( a == tangible )                tangible --;
   else                                    intangible--;
}
}

public class InterfaceDemo {
 public static void main(String args[]) {
      Person p = new Person();
      p.aquier(Person.real);
      System.out.println(Person.real);
      p.aquier(Person.tangible);
      System.out.println(Person.tangible);
      p.aquier(Person.intangible);
      System.out.println(Person.intangible);
      p.dispose(Person.real);
      System.out.println(Person.real);
      p.dispose(Person.tangible);
      System.out.println(Person.tangible);
      p.dispose(Person.intangible);
      System.out.println(Person.intangible);
}
}