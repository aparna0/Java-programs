package practical;
import java.util.*;
public class Source {
	public static void main(String args[])
	 {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		String out;
		if(a == 1)	out = "FirstClass";
		else if(a == 2)	out = "Ladies";
		else if(a == 3)	out = "General";
		else	out = "Luggage";
		for(int i=0; i<10; i++) {
			System.out.println(out);
		}
	 }
}
