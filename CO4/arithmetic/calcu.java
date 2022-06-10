package arithmetic;
import java.util.*;
import arithmetic.arith_interface;
public class calcu implements arith_interface{
    int a,b;
    public calcu(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void add(){
        System.out.println("sum="+(a+b));
    }
    public void sub(){
        System.out.println("substraction="+(a-b));
    }

    public void mul(){
        System.out.println("multiplication="+(a*b));
    }

    public void div(){
        System.out.println("division="+(a/b));
    }
}
