package graphics;
import graphics.*;
import java.util.*;

public class area{
    public static void main(String[] args){
        figures f=new figures();
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.area of rectangle\n2.area of circle\n3.area of triangle\n4.sqaure\n5.exit\nenter your choice");
            ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("enter the length and breadth of rectangle\n");
                float l=sc.nextFloat();
                float b=sc.nextFloat();
                f.rect(l,b);
                break;
                case 2:System.out.println("enter the radius \n");
                float r=sc.nextFloat();
                f.circle(r);
                break;
                case 3:System.out.println("enter the hight and breadth\n");
                float h=sc.nextFloat();
                float a=sc.nextFloat();
                f.triangle(a,h);
                break;
                case 4:System.out.println("enter the side of square\n");
                int s=sc.nextInt();
                f.square(s);
                break;
                case 5:System.out.println("exiting.....");
                default:System.out.println("invalid choice\n");     
         }
        }while(ch==5);
    }
}
