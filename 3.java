import java.util.*;
public class matrix {
	int m;
	int n;
	int[][] array=new int[10][10];
	
	public void get(){
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the numnber of rows\n");
		this.m=s.nextInt();
		System.out.println("enter the numnber of coloum\n");
		this.n=s.nextInt();
		System.out.println("enter the array elemets\n");
		for(i=0;i<this.m;i++){
			for(j=0;j<this.n;j++){
				this.array[i][j]=s.nextInt();
			}
		}	
	}
	
	public static matrix sum(matrix m1,matrix m2){
		int i,j;
		matrix temp=new matrix();
		if((m1.m==m2.m)&&(m1.n==m2.n)){
			temp.m=m1.m;
			temp.n=m1.n;
			for(i=0;i<m1.m;i++){
				for(j=0;j<m1.n;j++){
					temp.array[i][j]=m1.array[i][j]+m2.array[i][j];
				}
			}	
		}
		else{
			System.out.println("invalid matrix\n");
		}
		return temp;
	}
	
	public void display(){
		int i,j;
		System.out.println(" the array elemets\n");
		for(i=0;i<this.m;i++){
			for(j=0;j<this.n;j++){
				System.out.println(this.array[i][j]);
			}
		}		
	}
		
	public static void main(String[] args) {
		matrix ma1=new matrix();
		matrix ma2=new matrix();
		matrix temp=sum(ma1,ma2);
		ma1.get();
		ma2.get();
		temp=sum(ma1, ma2);
		
		System.out.println("-----sum-----\t");
		
		temp.display();
		System.out.println("-----END---------\t");
		

	}

}
