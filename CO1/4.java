import java.util.*;
public class complex {
	int real,img;
	
	 void get(){
		Scanner s=new Scanner(System.in);
		System.out.print("enter the real part of the complex number\n");
		real=s.nextInt();
		System.out.print("enter the imaginary the complex number\n");
		img=s.nextInt();	
	}
	 void display(){
		 System.out.print("complex No:"+real+"+"+img+"i"+"\n");
	 }
	public static void main(String[] args) {
		complex ob1=new complex();
		ob1.get();
		ob1.display();
		complex ob2=new complex();
		ob2.get();
		ob2.display();
		int r,i;
		r=ob1.real+ob2.real;
		i=ob1.img+ob2.img;
		System.out.print("SUM:"+r+"+"+i+"i");
	}
}
