import java.util.*;
public class symmetric {

	public static void main(String[] args) {
		int i,j,n,m;
		int flag=0;
		int ar[][] =new int[10][10];
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of matrix\n");
		n=s.nextInt();
		System.out.print("enter the matrix\n");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				ar[i][j]=s.nextInt();
			}
		}
		
		System.out.print("Matrix:\n");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(ar[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(ar[i][j]!=ar[j][i]){
					flag=1;
				}
			}
		}
		
		if(flag==1){
			System.out.print("Matrix is not Symmetric\n");
		}
		else{
			System.out.print("Matrix is Symmetric \n");
		}

	}

}
