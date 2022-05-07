import java.util.*;
class shape{
    void area(int a){
        float re=a*a;
        System.out.print("area of square="+re+"\n");
    }
    void area(float l,float b){
        float re=l*b;
        System.out.print("area of rectangle="+re+"\n");
    }
    void area(float r){
       double re=3.14*r*r;
        System.out.print("area of circle="+re+"\n");
    }
}

public class area {

    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        shape sh=new shape();
        System.out.println("enter the side\n");
        int a=s.nextInt();
        sh.area(a);
        System.out.println("enter the length of rectangle\n");
        float l=s.nextInt();
        System.out.println("enter the breadth of rectangle");
        float b=s.nextInt();
        sh.area(l, b);
        System.out.println("enter the radius of circle\n");
        float r=s.nextInt();
        sh.area(r);
    }

    
}
