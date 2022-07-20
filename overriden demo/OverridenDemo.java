// only class which having main()  should public while other must not be public 
class A {
  void callme() {
     System.out.println(" class A callme"); 
 }
}
 class B extends A{
  void callme() {
     System.out.println(" class B callme"); 
 }
}
 class C extends B {
  void callme() {
     System.out.println(" class C callme"); 
 }
}

public class OverridenDemo {
public static void main(String args[]) {
     A a = new A();
     B b = new B();
     C c = new C();
     c.callme(); //it calls class C callme() and hides class A callme() method
   /* do unhide super class methods by sub class methods by using Dynamic Method Dispath  :   i.e super class reference can refer base class objects*/
     A t;
     t = a;
     t.callme();
     t = b;
     t.callme();
}
}