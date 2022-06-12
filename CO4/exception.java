
import java.util.*;
class NegativeNoException extends Exception{
    public NegativeNoException(String s){
        System.out.println(s);
    }
}
public class negative {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n,no,sum=0;
    System.out.println("enter the limit\n");
    n=sc.nextInt();
    for (int i=1;i<=n;i++){
        System.out.println("enter the number\n"+i);
        no=sc.nextInt();
        try{
        if(no<0){
            throw new NegativeNoException("negative!!!!");
        }
        else{
            sum=sum+no;
        }
    }
    catch(NegativeNoException e){
        System.out.println(e);
        i--;
    }
    }
    System.out.println("average\n"+(sum/n));
    }
}
