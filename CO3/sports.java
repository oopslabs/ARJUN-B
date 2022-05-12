import java.util.*;
interface sport{
	void sportsMark();
}
class student{
	int ascore;
	student(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the academic mark\n ");
		ascore=sc.nextInt();
	}
}

class result extends student implements sport{
int score,re;
	result(){
		super();
	
	}
	@Override
	public void sportsMark(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the sports  score ");
		score=sc.nextInt();
	}
	void display(){
		System.out.print("Academic Mark: "+ascore+"\n");
		System.out.print("Spoprts Score: "+score);
	}
}

public class sports {

	public static void main(String[] args) {
		result r=new result();
		r.sportsMark();
		r.display();

	}

}
