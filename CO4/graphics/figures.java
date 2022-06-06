package graphics;
interface shape{
    void rect(float x,float y);
    void circle(float r);
    void triangle(float a,float b);
    void square(int x);
}
public class figures implements shape{

public void rect(float x,float y){
    System.out.println("area of rectangle:"+x*y);
}
public void circle(float r){
    System.out.println("area of circle:"+(3.14*r*r));
}
public void triangle(float a,float h){
    System.out.println("area of triangle:"+(0.5*a*h));
}
public void square(int x){
    System.out.println("area of square:"+x*x);
}

}
    
