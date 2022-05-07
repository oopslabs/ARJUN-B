import java.util.*;
public class employee {
	int eno;
	String eName;
	float eSalary;
	
	public void get(){
		Scanner s=new Scanner(System.in);
		System.out.print("ente the employee number\n");
		eno=s.nextInt();
		System.out.print("ente the employee name\n");
		eName=s.next();
		System.out.print("ente the salary of employee\n");
		eSalary=s.nextFloat();
	}
	public void display(){
		System.out.print("EMPLOYEE NAME\t"+eName+"\n");
	}

	public static void main(String[] args) {
		int flag=0;
		employee e[]=new employee[10];
		System.out.print("ente the number of employee\n");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=0;i<n;i++){
			e[i]=new employee();
			e[i].get();
		}
		
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
		
		System.out.print("\n----SEARCH------\n");
		while(true){
			Scanner s1=new Scanner(System.in);
			int en=s1.nextInt();
			for(int i=0;i<n;i++){
				if(e[i].eno==en){
					flag=1;
					System.out.print("employee found");
					break;
				}
			}
			if(flag==0){
				System.out.print("employee not found");
			}
			
		}
		
	}

}
