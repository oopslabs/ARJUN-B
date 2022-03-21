import java.util.*;
public class pruduct {
	int id;
	int price;
	String name;
	public void get(){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the item id");
		id=s.nextInt();
		System.out.println("enter the item name");
		name=s.next();
		System.out.println("enter the item price");
		price=s.nextInt();
	}
	public static void main(String[] args) {
		pruduct p1=new pruduct();
		p1.get();
		System.out.println(" item id :"+p1.id);
		System.out.println(" item name :"+p1.name);
		System.out.println(" item price :"+p1.price);
		pruduct p2=new pruduct();
		p2.get();
		System.out.println(" item id :"+p2.id);
		System.out.println(" item name :"+p2.name);
		System.out.println(" item price :"+p2.price);
		pruduct p3=new pruduct();
		p3.get();
		System.out.println(" item id :"+p3.id);
		System.out.println(" item name :"+p3.name);
		System.out.println(" item price :"+p3.price);
		
		if((p1.price < p2.price)&& (p1.price < p3.price)){
			System.out.println("product 1 is less expensive");
		}
		else if((p2.price < p1.price)&& (p2.price < p3.price)){
			System.out.println("product 2 is less expensive");
		}
		else{
			System.out.println("product 3 is less expensive");
		}
	}
}
