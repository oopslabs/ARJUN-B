import java.util.*;
class Person{
    String name;
    String gender;
    String addr;
    int age;
    Person(String na,String b,String ad,int ag){
        this.name=na;
        this.gender=b;
        this.addr=ad;
        this.age=ag;

    }
}
class Employee extends Person{
    int empid;
    String cName;
    String qualification;
    float salary;
    Employee(String na,String b,String ad,int ag,int i,String a,String q,float s){
        super(na, b, ad, ag);
        this.empid=i;
        this.cName=a;
        this.qualification=q;
        this.salary=s;
    }
}
class Teacher extends Employee{
    String sub;
    String dept;
    int Tid;
    Teacher(String na,String b,String ad,int ag,int i,String a,String q,float s,String su,String dep,int id){
        super(na, b, ad, ag, i, a, q, s);
        this.Tid=id;
        this.sub=su;
        this.dept=dep;
    }
    void display(){
        System.out.println("Name			:"+name);
		System.out.println("Gender			:"+gender);
		System.out.println("Address			:"+addr);
		System.out.println("Age			    :"+age);
		System.out.println("Empid			:"+empid);
		System.out.println("Company Name    :"+cName);
		System.out.println("Qualification	:"+qualification);
		System.out.println("Salary			:"+salary);
		System.out.println("Subject			:"+sub);
		System.out.println("Department		:"+dept);
		System.out.println("Teacher Id		:"+Tid);
    }

    public static void main(String args[]){
        int i;
        Teacher[] t=new Teacher[10];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of teacher details you want to enter");
		int n=in.nextInt();
		for(i=1;i<=n;i++) {
			System.out.println("Enter the name of the teacher "+i);
			String a=in.nextLine();
			a=in.nextLine();
			System.out.println("Enter the gender of the teacher "+a);
			String b=in.nextLine();
			System.out.println("Enter the address of the teacher "+a);
			String c=in.nextLine();
			System.out.println("Enter the age of the teacher "+a);
			int d=in.nextInt();
			System.out.println("Enter the employee id of the teacher "+a);
			int e=in.nextInt();
			System.out.println("Enter the company name of the teacher "+a);
			String f=in.nextLine();
			f=in.nextLine();
			System.out.println("Enter the qualification of the teacher "+a);
			String g=in.nextLine();
			System.out.println("Enter the salary of the teacher "+a);
			int h=in.nextInt();
			System.out.println("Enter the subject of the teacher "+a);
			String j=in.nextLine();
			j=in.nextLine();
			System.out.println("Enter the department of the teacher "+a);
			String k=in.nextLine();
			System.out.println("Enter the teacher id of the teacher "+a);
			int l=in.nextInt();
			t[i]=new Teacher(a,b,c,d,e,f,g,h,j,k,l);

    }
    for(i=1;i<=n;i++) {
        System.out.println("-------Teacher Details--------");
        System.out.println();
        System.out.println("**"+i+"**");
        System.out.println();
        t[i].display();
        
        
    }
    }

}
