package com.markerInterface;
import java.io.*;

class Demo implements Serializable{
	int no;
}
public class SerializableDemo {
	public static void main(String args[]) throws Exception {
		Demo obj = new Demo();
		obj.no = 10;
		File f = new File("F:\\java_programs\\obectstate.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);								//Object state is stored in file
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Demo obj2 = (Demo)ois.readObject();
		System.out.println("value of object is " + obj2.no);
	}
}

