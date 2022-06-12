import java.util.Scanner;

public class runnable {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit to find fibnocci series\n");
        int a=sc.nextInt();
        System.out.println("enter the lower range to find even numbers");
        int l=sc.nextInt();
        System.out.println("enter the lower range to find even numbers");
        int u=sc.nextInt();
        fib f=new fib(a);
        even e=new even(l, u);
        Thread t1=new Thread(f);
        Thread t2=new Thread(e);
        t1.start();
        t2.start();
    }
    
}


class fib implements Runnable{
    int n;
    fib(int n){
        this.n=n;
    }
    public synchronized void run(){
        System.out.println("fibonocci series up to"+n);
        int a=0,b=1,c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
class even implements Runnable{
    int a,b;
    even(int a,int b){
        this.a=a;
        this.b=b;
    }
    public synchronized void run(){
        System.out.println("even numbers from "+a+"to"+b);
        for(int i=a;i<b;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
