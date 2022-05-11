import java.util.*;
class book {
	String name;
	int price;
	book(){
		Scanner s=new Scanner(System.in);
		System.out.print("enter the book name\n");
		name=s.next();
		System.out.print("enter the price\n");
		price=s.nextInt();
	}		
}
class publisher extends book{
	String pname;
	int edition;
	publisher(){
		super();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the publisher name\n");
		pname=s.next();
		System.out.print("enter the edition\n");
		edition=s.nextInt();
	}
}
 class fiction extends publisher{
	 String genre;
	 fiction(){
		 super();
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the genre name\n");
		 genre=s.next(); 
	 }
 }
 class literature extends fiction{
	 String author;
	 literature(){
		 super();
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the author name\n");
		 author=s.next();
	 }
	 void display(){
		 System.out.print("------BOOK DETAILS-----\n");
		 System.out.print("Name:"+name+"\n");
		 System.out.print("Author:"+author+"\n");
		 System.out.print("Price:"+price+"\n");
		 System.out.print("Publisher:"+pname+"\n");
		 System.out.print("Genre:"+genre+"\n");
		 System.out.print("Edition:"+edition+"\n"); 
	 } 
 }
public class co3_4{
	public static void main(String[] args) {
		literature l=new literature();
		l.display();

	}
}


