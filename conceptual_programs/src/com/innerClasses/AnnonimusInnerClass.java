package com.innerClasses;

class OuterClass{
	void display() {
		System.out.print("hi");
	}
}
public class AnnonimusInnerClass {

	public static void main(String[] args) {
		OuterClass out = new OuterClass(){
			void display() {
				super.display();
				System.out.println(" Aparna");
			}
		};
		out.display();
	}

}
