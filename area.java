import java.util.*;

interface shape {
    float pi = 3.14f;

    float area();

}

class rectangle implements shape {
    Scanner s = new Scanner(System.in);
    int l, b;

    public float area() {
        System.out.print("enter the length\n");
        l = s.nextInt();
        System.out.print("enter the width\n");
        b = s.nextInt();
        return (l * b);
    }

    class circle implements shape {
        Scanner s = new Scanner(System.in);
        int r;

        public float area() {
            System.out.print("enter the radius\n");
            r = s.nextInt();
            return (pi * r * r);
        }
    }

    public class area {
        public static void main(String args[]) {
            circle c = new circle();
            rectangle r = new rectangle();
            System.out.println("area of circle\n" + c.area());
            System.out.println("area of rectangle\n" + r.area());
        }

}
