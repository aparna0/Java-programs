abstract class A {
     abstract void method1();
     abstract void method2();
     void method3() {
          System.out.println(" this is normal method1 of abstract class");
    }
}
abstract class B extends A {    // class must be abstract beacuse it dose not implementing all abstrac methods of class A
     void method1() {
       System.out.println(" abstract method1 implemented by class B class");
   }
  }

public class AbstractDemo extends A {    
   void method1() {
       System.out.println(" abstract method1 implemented by class AbstractDemo class");
   }
    void method2() {
       System.out.println(" abstract method2 implemented by class AbstractDemo class");
   }
   public static void main(String args[]) {
        AbstractDemo obj = new AbstractDemo();
        obj.method1();
        obj.method2();
        obj.method3();  
       
   }
}