public class  InnerClassDemo {
   int a = 10; 
   static int c = 50;
   static public class Inner {      // inner class is declared as static because to create its object in main class and as main class can access static data
       int a = 20 ;
       int b = 30;
   }
   void demo(){
    System.out.println(" c : "+c);      // static data can be accessed by non static data
    }
public static void main(String args[]) {
     InnerClassDemo obj = new InnerClassDemo();
     Inner obj2 = new Inner();
     System.out.println(" outer class a : "+ obj.a);
     System.out.println(" inner class a : "+ obj2.a);
     //System.out.println(" a : "+ obj2.a); not accessible (inner class does not acquire the properties outer class)
     //System.out.println(" a : "+ obj.b);  not accessible (outer class does not acquire the properties inner class)
     obj.demo();
}
}
