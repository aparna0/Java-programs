public class ObjAsPara {
   int a, b;
   void demo(int a, int b) {
        this.a = a;
        this.b = b;
   }
    void demo(ObjAsPara o) {
        this.a = o.a;
        this.b = o.b;
        o.a = 10;
   }
   public static void main(String args[]) {
      ObjAsPara obj1 = new ObjAsPara();
      ObjAsPara obj2 = new ObjAsPara();
     obj1.demo(1,2);
     obj2.demo(obj1);
     System.out.println("\n obj1 a :" + obj1.a+" b :"+obj1.b+"\n obj2 a : "+obj2.a+" b : "+obj2.b);  
   }
}