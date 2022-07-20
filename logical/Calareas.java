import java.util.*;
class Calareas
{
   double CirArea,RectArea,SquArea;
	double side;
    double area(double s)
       {
	side=s;
	SquArea=side*side;
	return SquArea;
        }

    double area(int rad)
       {
	CirArea=3.14*(rad*rad);
	return CirArea;
        }
    double area(int l,int b)
       {
	RectArea=l*b;
	return RectArea;
        }
 public static void main(String[] args)
 {
 	 Calareas c=new  Calareas();
	
	Scanner sc=new Scanner(System.in);
	double a1,a2,a3;
	int c_radius,r_l,r_b;
	double s_s;int ch;
	do
           {
	System.out.println("\n1.Square \n 2.Circle \n 3.Rectangle \n4.exit \nEnter your choice:");
	ch=sc.nextInt();
	switch(ch)
	{
	    case 1:
		System.out.println("\n# Square:");
		System.out.println("Enter the value of side=");
		 s_s=sc.nextDouble();
		a1=c.area(s_s);
		System.out.println("Area of Square ="+a1);
		break;
	    case 2:
		System.out.println("\n# Circle:");
		System.out.println("Enter the value of radius=");
		c_radius=sc.nextInt();
		a2=c.area(c_radius);
		System.out.println("Area of Circle ="+a2);
		break;
	case 3:
		System.out.println("\n# Rectangle:");
		System.out.println("Enter the value of l and b=");
		r_l=sc.nextInt();
		r_b=sc.nextInt();	
		a3=c.area(r_l,r_b);
		System.out.println("Area of Rectangle ="+a3);
	
		break;
	}
       }while(ch!=4);
	
		
  }
}