import java.util.Scanner;
class threadimp{
    public static void main(String args[]){
        five f=new five();
        prime p=new prime();
        f.start();
        p.start();
        
    }
} 
class five extends Thread{
    public synchronized void run(){
        System.out.println("multiplication table of five");
        for(int i=0;i<=10;i++){
            System.out.println("5 *"+i+"="+(5*i)+"\n");
        }

    }

}
class prime extends Thread{
    int n;
    Scanner sc=new Scanner(System.in);
    public prime(){
    System.out.println("enter the limit");
    n=sc.nextInt();
    }
    public synchronized void run(){
        int p=0;
        for(int i=2;i<n;i++){
            p=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    p=1;
                }
            }
        if(p==0){
            System.out.println(i+" is prime");
        }
        }  
    }
}
