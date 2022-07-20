package com.enumeration;

//creating enumeration using enum
enum family{
	father, mother, son, daughter
}
enum familybylaw{
	//motherinlaw, fatherinlaw, soninlaw, daughterinlaw, brotherinlaw, sisterinlaw
	 father, mother, son, daughter
}
public class SimpleEnumerationDemo {
	
	public static void main(String[] args) {
		//creating variable of family
		family fam;
		//assigning value but value must be typa of enumeration of that type
		fam = family.father;
		System.out.println(fam);
		System.out.println(familybylaw.mother);
		if(fam == family.father) {
			System.out.println("father");
		}
		else {
			System.out.println("mother");
		}
		switch(fam) {
		case mother : System.out.println("mother case block");
		break;
		case father : System.out.println("father case block");
		break;
		case son : System.out.println("son case block");
		break;
		case daughter : System.out.println("daughter case block");
		break;
		}
	}

}
