import java.io.*;


public class string {
    
        public static void main(String args[]){
            String sa="programming java";
            String s[]=sa.split(" ");
            int sl=s.length;
            for(int i=0;i<sl-1;i++){
                for(int j=i+1;j<sl;j++){
                    if(s[i].compareTo(s[j])>0){
                        String temp=s[i];
                        s[i]=s[j];
                        s[j]=temp;
                    }
                }

            }
            for(int i=0;i<s.length;i++){
                System.out.println(s[i]);
            }

        }
    
    
}
