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
	 //String genre;
	 String author;
	 fiction(){
		 super();
		 Scanner s=new Scanner(System.in);
//		 System.out.print("enter the genre name\n");
//		 genre=s.next(); 
		 System.out.print("enter the author name\n");
		 author=s.next();
	 }
	 void display()
		{
			System.out.println("----THE FICTION BOOK DETAILS:-----");			
			System.out.println("book name:"+name);
			System.out.println("publisher:"+pname);
			System.out.println("edition:"+edition);
			System.out.println("author:"+author);
			System.out.println("genere:"+"fiction");
			System.out.println("price:"+price);
		}
 }
 class literature extends publisher{
	 String autho;
	 literature(){
		 super();
		 Scanner s=new Scanner(System.in);
		 System.out.print("enter the author name\n");
		 autho=s.next();
	 }
	 void display(){
		 System.out.print("------LITERATURE BOOK DETAILS-----\n");
		 System.out.print("Name:"+name+"\n");
		 System.out.print("Author:"+autho+"\n");
		 System.out.print("Price:"+price+"\n");
		 System.out.print("Publisher:"+pname+"\n");
		 System.out.print("Genre:"+"Literature"+"\n");
		 System.out.print("Edition:"+edition+"\n"); 
	 } 
 }
public class co3_4{
	public static void main(String[] args) {
		literature l=new literature();
		fiction f=new fiction();
		l.display();
		f.display();

	}
}


