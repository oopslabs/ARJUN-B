package lab;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string\n");
		String str=sc.nextLine();
		String[] s=str.split(" ");
		System.out.print("String Handling Functions\n");
		System.out.print("------------------------------\n");
        System.out.println("Length of the string: "+str.length());
        System.out.println("Uppercase :"+str.toUpperCase());
        System.out.println("Lowerrcase :"+str.toLowerCase());
        
        String str1=" Language";
        System.out.println("Concatinate :"+str.concat(str1));
        System.out.println("Compare string 1 and string 2 :"+str.equals(str1));
        System.out.println("Index of v :"+str.indexOf("v"));
        System.out.println("Charector at index 8 :"+str.charAt(8));
        System.out.println("replace Java to Python :"+str.replace("Java", "python"));
        sc.close();    
	}

}
