import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class copyeo
{
public static void main(String args[]) throws IOException
{
FileInputStream fr = new FileInputStream("C:\\Users\\ARJUN B\\Desktop\\S2\\JAVA\\a.txt");
FileOutputStream fw1 = new FileOutputStream("C:\\Users\\ARJUN B\\Desktop\\S2\\JAVA\\even.txt");
FileOutputStream fw2 = new FileOutputStream("C:\\Users\\ARJUN B\\Desktop\\S2\\JAVA\\odd.txt");
System.out.println("\nFrom the file 'a.txt' ,Odd Numbers are copied to 'odd.txt'file and Even numbers are copied to 'even.txt' file\n");
int i;
while((i=fr.read()) != -1)
{
if(i%2==0)
fw1.write(i);
else
fw2.write(i);
}
fr.close();
fw1.close();
fw2.close();
}
}
