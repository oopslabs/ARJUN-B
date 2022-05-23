import java.util.*;
import java.io.*;

public class menu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		inter i;
		circle c=new circle();
		rectangle re=new rectangle();
		do{
		System.out.println("1.Area of Circle\n2.Perimeter of Circle\n3.Area of Rectangle\n4.Perimeter of Rectangle\nenter your choice\n");
		ch=sc.nextInt();
		switch(ch){
		case 1:i=c;
		i.area();
		break;
		case 2:i=c;
		i.peri();
		break;
		case 3:i=re;
		i.area();
		break;
		case 4:i=re;
		i.peri();
		break;
		default:System.out.println("invalid choice\n");
		}
		}
		while(ch!=0);
	}
}



interface inter{
	void area();
	void peri();
}

class circle implements inter{
	Scanner sc=new Scanner(System.in);
	public void area(){
		System.out.println("enter the radius\n");
		int r=sc.nextInt();
		System.out.println("Area of Circle:"+3.14*r*r);
	}
	public void peri(){
		System.out.println("enter the radius\n");
		int r=sc.nextInt();
		System.out.println("Perimeter of Circle:"+2*3.14*r);
	}
	
}
class rectangle implements inter{
	Scanner sc=new Scanner(System.in);
	public void area(){
		System.out.println("enter the length\n");
		int l=sc.nextInt();
		System.out.println("enter the breadth\n");
		int b=sc.nextInt();
		System.out.println("Area of Rectangle:"+(l*b));
	}
	public void peri(){
		System.out.println("enter the length\n");
		int l=sc.nextInt();
		System.out.println("enter the breadth\n");
		int b=sc.nextInt();
		System.out.println("Perimeter of Rectangle:"+(2*(l+b)));
	}	
}
