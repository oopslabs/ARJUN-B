import java.util.*;
import java.util.Date;

public class product1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Date d;
        int price,qty,ch,uprice,total,utotal,i=0,j=0,id,netamnt=0;
        String name;
        generate b[]=new generate[100]; 
        System.out.println("_____BILL_____\n");
        int c=1;
        do{
            System.out.println("1.Add item\n2.Generate bill\n3.exit\n");
            ch=sc.nextInt();
            switch(ch){
                case 1: System.out.println("enter the product id\n");
                id=sc.nextInt();
                System.out.println("enter the product name\n");
                name=sc.next();
                System.out.println("enter the  qty\n");
                qty=sc.nextInt();
                System.out.println("enter the unit price\n");
                uprice=sc.nextInt();
                utotal=qty*uprice;
                netamnt=netamnt+utotal;
                b[i]=new generate(id, name, qty, uprice, utotal);
                i++;
                break;
                case 2:d=new Date();
                System.out.println("Date:\n"+d.toString());
                System.out.println(" productid   name   qty   price   total\n");
                System.out.println("______________________________________________");
                while(j<i){
                    b[j].call_bill();
                    j++;
                }
                System.out.println("______________________________________________");
				System.out.println("                       Net Amount        "+netamnt);
                break;
                case 3:System.out.println("Exiting.......");
                break;

            }

        }
        while(c==1);

    }   
}
interface bill{
    void call_bill();
}
class generate implements bill{
    int id,uprice,qty,utotal;
    String name;
    generate(int id,String name,int qty,int uprice,int utotal){
        this.id=id;
        this.name=name;
        this.qty=qty;
        this.uprice=uprice;
        this.utotal=utotal;
    }
    public void call_bill(){
        System.out.printf("%5s%9s%8s%11s%11s\n",this.id,this.name,this.qty,this.uprice,this.utotal);

    }
}
