package com.logical;
class ObjectCreation{
	private int num;
	private static int objectCount;
	private ObjectCreation(int no) {
		num = no;
		System.out.println("object creaded");
	}
	public static ObjectCreation createObject(int no) {
		ObjectCreation obj=null;
		if(objectCount == 0) {
			
			obj = new ObjectCreation(no);
			objectCount++;
		}
		else {
			System.out.println("Not allowed!");
		}
		return obj;
	}
}
public class Only1ObjectForClass {
	
	public static void main(String[] args) {
		ObjectCreation obj1 = ObjectCreation.createObject(10);
		ObjectCreation obj2 = ObjectCreation.createObject(20);
		//ObjectCreation obj3 = new ObjectCreation(30);         Not accessible
	}
}
