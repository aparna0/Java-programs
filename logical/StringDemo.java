import java.lang.String;
public class StringDemo {
public static void main(String args[]) {
String str1 = "aparna";
String str2 = "aparna";
String str3 = new String("aparna");
String str4 = new String("APARNA");
System.out.println("str1 :"+str1.hashCode()+"\nstr2 :"+str2.hashCode()+"\nstr3 :"+str3.hashCode()+"\nstr4 :"+str4.hashCode());
System.out.println("char at index 2"+str1.charAt(2));
System.out.println("equals of string :"+str1.equals(str4));
System.out.println("equals of string ignoring the case :"+str1.equalsIgnoreCase(str4));
System.out.println("compare 2 str : "+str1.compareTo(str4));
System.out.println("check presence of letters :"+str1.contains("apa"));
System.out.println("subString :"+str1.substring(2));
System.out.println("substring :"+str1.substring(0,2));
System.out.println("index of perticular char a : "+str1.indexOf('a'));
System.out.println("last index of perticular char : "+str1.lastIndexOf('a'));
System.out.println("check wether string is empty or not : "+str1.isEmpty());
System.out.println("replace a with $ : "+str1.replace('a','$'));
System.out.println("length : "+str1.length());
System.out.println("to upper case : "+str1.toUpperCase());
System.out.println("to lower  : "+str4.toLowerCase());
}
}