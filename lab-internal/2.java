import java.util.ArrayList;
import java.util.Scanner;

public class array {
    public static void main(String args[]){
        ArrayList<String> s=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        
        int c;

        while(true){
            System.out.println("\n1.Append\n2.insert at given position\n3.search\n4.display with given letter\nenter your choice\n");
            c=sc.nextInt();
            switch(c){
                case 1: System.out.print("enter the string you want to append\n");
                        String a=sc.next();
                        s.add(a);
                        
                        System.out.print("Array: ");
                        for(int i=0;i<s.size();i++){
                            System.out.print(s.get(i));
                        }
                        
                        break;
                case 2: System.out.print("enter the position you want to insert\n"); 
                        int pos=sc.nextInt();
                        System.out.print("enter the element\n");
                        String d=sc.next(); 
                        s.set(pos,d); 
                        for(int i=0;i<s.size();i++){
                            System.out.println("Array:"+s.get(i)); 
                        }
                        break;
                case 3: System.out.print("enter the index to search\n");  
                        int se=sc.nextInt();
                        if(s.equals(se)==true) {
                            System.out.print("element found\n"); 
                        }
                        else{
                            System.out.print("element not found\n");
                        }
                        break;
                case 4: System.out.print("enter the letter\n");  
                        String l=sc.next();
                        System.out.print("Array list:"+s.equals(l));  
                
            }
           
              

        }

    }
    
}
