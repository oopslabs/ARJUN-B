import java.util.*;

class cube {
    int l;
    int b;

    cube(int l, int b) {
        int length = l;
        int breadth = b;
    }
}

class volume extends cube {

    volume(int h) {
        int height = h;
    }

    int calc(int length,int  breadth , int height) {
        return (length * breadth * height);
    }
}

public class test {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length\n");
        int l = s.nextInt();
        System.out.println("enter the breadth\n");
        int b = s.nextInt();
        int h = s.nextInt();
        cube c = new cube(l, b);
        volume v = new volume(h);                                                                                                                                                                                                                                                                                                                                                                              
        System.out.println("volume of room=\t" + v.calc(l,b,h));
    }

}