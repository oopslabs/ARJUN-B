import java.util.*;
import java.io.*;

public class menu {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c;
		do {
			System.out.println("1.Find area of circle\n2.Find area of rectangle\n3.Exit");
			c=s.nextInt();
			switch(c) {
			case 1: System.out.println("----Circle----");
					circle obj1= new circle();
					obj1.area();
					obj1.perimeter();
					break;
			case 2: System.out.println("----Rectangle----");
					rectangle obj2=new rectangle();
					obj2.area();
					obj2.perimeter();
			case 3: System.out.println("Exiting....");
					break;
			default: System.out.println("Invalid");
			}
		}while(c!=3);		
		
	}
}




interface Shape{
	void area();
	void perimeter();

}

class circle implements Shape{
	int r;
	circle(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=s.nextInt();
	}
	public void area(){
		System.out.println("Area of Circle= "+(3.14*r*r));
		
	}
	public void perimeter(){
		System.out.println("Perimeter of Circle= "+(2*3.14*r));
	}
}

class rectangle implements Shape{
	int l,b;
	rectangle(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the l and b");
		l=s.nextInt();
		b=s.nextInt();
	}
	public void area(){
		System.out.println("Area of Rectangle= "+(l*b));
	}
	
	public void perimeter(){
		System.out.println("Perimeter of Rectangle= "+(2*(l+b)));
	}
}
