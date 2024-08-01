// package workout;
import java.util.*;
/**
 * Innerboxdemo
 */
public class boxdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        box obj = new box();
        obj.depth = sc.nextInt();
        obj.height = sc.nextInt();
        obj.width = sc.nextInt();
        System.out.println("the dept of the obj is "+ obj.depth);
        System.out.println("the height of the obj is "+obj.height);
        System.out.println("the width of the obj is "+obj.width);
    }
    
}