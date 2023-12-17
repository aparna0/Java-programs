-Inner can access outer class members directly without outer class object.
-Outer class can't access Inner class members directly but can only access by using inner class object (as usual)
-Inner class can be static and accessible to outer class by class name (as usual).
-we can't access inner class members through outer class object
-inner class object can't access outer class members outside a outer class

package com.innerClasses;

class Outer{
	
	String outerVal = "Outer class";
	
	class Inner{
		String innerVal = "Inner class";
		void innerMethod() {
			System.out.println("\tInside inner class method ");
			System.out.println("\tOuter class val : "+outerVal);    //inner class can access outer class variables
			//outerMethod();										//inner class can access outer class methods
		}
	}
	
	//static inner class
	static class StaticInner{
		static void innerMethod2() {
			System.out.println("\tInside static inner class method ");
		}
	}
	void outerMethod() {
		System.out.println("Inside outer class method");
		//System.out.println("\tInner class val : " +innerVal); //outer class can't access inner class variables
		//innerMethod();										//outer class can't access inner class methods
		
		System.out.println("\tinner class object is created inside outer class method");
		Inner obj = new Inner();
		System.out.println("\t"+obj.innerVal+"\n\t"); //we can access inner class variable through inner class object
		obj.innerMethod(); 				//we can call inner method through inner class object
		
		StaticInner.innerMethod2();    //accessing static class members
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer = new Outer();
		System.out.println(outer.outerVal); //we can access outer class variable through outer class object
		outer.outerMethod(); 				//we can call outer method through outer class object
		
		//System.out.println(outer.innerVal); //we can't access inner class variable through outer class object
		//outer.innerMethod(); 				//we can't call inner method through outer class object
		
		System.out.println("inner class object is created outside the inner and outer class");
		Outer.Inner in = outer.new Inner();
		System.out.println(in.innerVal); //we can access inner class variable through inner class object
		in.innerMethod(); 				//we can call inner method through inner class object
		
		//outerMethod();										//inner class object can't access outer class methods outside a class
		//System.out.println("\tOuter class val : "+in.outerVal); //inner class object can't access outer class value outside a class
		
		Outer.StaticInner.innerMethod2();	//calling static inner
	}

}
