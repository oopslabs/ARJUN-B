import java.util.*;
class AuthenticateException extends Exception{
    public AuthenticateException(String str){
        System.out.println(str);
    }
}

public class authenticate {
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the username\n");
            String uname=sc.next();
            System.out.println("enter the password\n");
            String pass=sc.next();
            if(uname.equals("arjunb0320") && (pass.equals("arjunb"))){
                System.out.println("login successfull\n");
                
            }
            else{
                throw new AuthenticateException("Authentication Failed.");
            }

        }
        catch(AuthenticateException e){
            System.out.println(e);

        }
    }
    
}
