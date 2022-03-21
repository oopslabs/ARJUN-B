import java.util.*;
public class getString {
	
	String name;
	int roll;
	int mark;
	public void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		name=s.nextLine();
		System.out.println("enter the roll no");
		roll=s.nextInt();
		System.out.println("enter the mark");
		mark=s.nextInt();	
	}
	public void display(){
		
	}
	public static void main(String[] args) {
		getString no=new getString();
		no.get();
		System.out.println("name="+no.name);
		System.out.println("rollno="+no.roll);
		System.out.println("mark="+no.mark);
	}
}

