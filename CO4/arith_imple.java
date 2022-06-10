import arithmetic.*;
import java.util.*;
public class arith_imple {
    public static void main(String args[]){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers\n");
        a=sc.nextInt();
        b=sc.nextInt();
        calcu c=new calcu(a, b);
        c.add();
        c.sub();
        c.mul();
        c.div();

    }
    
}
