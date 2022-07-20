abstract class A {
  abstract void callme();
  void callmetoo() {
      System.out.println("\n class A's callmetoo ");
  }
}
 
class B extends A {
  void callme() {
    System.out.println("\n class A's abstract callme");
  }
}

public class C {
 static int a = 10;
static void callme() {
System.out.println(a);
}
public static void main(String args[]) {
  callme();
  B b = new B();
  b.callme();
  b.callmetoo();
}
}