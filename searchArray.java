import java.io.*;
import java.util.Scanner;
public class searchArray {
    public static void main(String args[]){
        int a[]=new int[10];
        int n,flag=0,se;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array\n");
        n=s.nextInt();
        System.out.println("enter array element\n");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter the element to be search\n");
        se=s.nextInt();
        for(int i=0;i<n;i++){
          if(a[i]==se){
              flag=1;
          }
        }
        if(flag==1){
            System.out.println("the element  found\n");
        }
        else{
            System.out.println("the element not found\n");
        }
    }
    
}
