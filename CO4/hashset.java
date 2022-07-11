import java.util.HashSet;

public class hashset {
	 public static void main(String args[])
	    {
	        boolean cmp;
	        HashSet<String> arrset1=new HashSet<String>();
	        arrset1.add("hello");
	        arrset1.add("bye");
	        System.out.println("The first hashset is "+arrset1);
	        HashSet<String> arrset2=new HashSet<String>();
	        arrset2.add("welcome");
	        arrset2.add("thank you");
	        System.out.println("The second hashset is "+arrset2);
	        cmp=arrset1.equals(arrset2);
	        System.out.println(cmp);

	    }
}
