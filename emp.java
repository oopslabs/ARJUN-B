package CO3;
import java.util.*;

public class emp{
    public static void main(String args[]){
        Teacher t[]=new Teacher[10];
        System.out.print("ente the number of employee\n");
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();
        for(int i=0;i<no;i++){
            
            System.out.print("enter the  employee number\n");
            int n=s.nextInt();
            System.out.print("enter the  employee name\n");
            String na=s.next();
            System.out.print("enter the  employee address\n");
            String a=s.next();
            System.out.print("enter the  employee salary\n");
            float sa=s.nextFloat();
            System.out.print("enter the  employee department\n");
            String d=s.next();
            System.out.print("enter the  employee subject\n");
            String sub=s.next();
            t[i]=new Teacher(n,na,sa,a,d,sub);;
            t[i].display();

        }
    }
}


class employee {
    int Empid;
    String Name;
    float Salary;
    String Address;
    employee(int eno,String name,float salary,String address){
        this.Empid=eno;
        this.Name=name;
        this.Salary=salary;
        this.Address=address;
    }
    void display(){
        System.out.println("EmployeeId:"+Empid+"\n");
        System.out.println("Employee Name:"+Name+"\n");
        System.out.println("Employee Address:"+Address+"\n");
        System.out.println("Employee Salary:"+Salary+"\n");
    }
    
}
class Teacher extends employee{
    String dept;
    String sub;
    Teacher(int eno,String name,float salary,String address,String d,String s){
        super(eno,name,salary,address);
        this.dept=d;
        this.sub=s;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Employee department:"+dept+"\n");
        System.out.println("Employee subject:"+sub+"\n");

    }

}
