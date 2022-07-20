package overriding;


class Base{
	public static void show() {
		System.out.println("base show method");
	}
}
class Child extends Base{
	public static void show() {
		System.out.println("child show method");
	}
}
public class StaticMethodOverriding {
	public static void main(String args[]) {
		System.out.println("ok");
		Base c = new Child();
		Base b = new Base();
		c.show();
		
		main(10);
	}
	public static void main(int no) {
		System.out.println(no);
	}
	
}
