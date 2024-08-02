import java.util.*;
class methodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len,wid;
        double radius,base,height;
        System.out.println("Enter the base of the triangle :");
        base = sc.nextDouble();
        System.out.println("Enter the height of the triangle :");
        height = sc.nextDouble();
        System.out.println("Enter the weidth of of the rectangle:");
        wid = sc.nextInt();
        System.out.println("Enter the height of the rectangle:");
        len = sc.nextInt();
        System.out.println("Enter the radius of the circle :");
        radius = sc.nextDouble();

        dimension triangle = new dimension();
        triangle.dimension(height, base);
        dimension rectangle = new dimension();
        rectangle.dimension(wid, len);
        dimension circle = new dimension();
        circle.dimension(radius); 
    }
}
class dimension{
    void dimension(double height,double base){
        System.out.println("Area of the triganle with base "+base+" and height "+height+"is "+(base*height)/3);
    }
    void dimension(int width,int length){
        System.out.println("Area of the rectangle with width "+width+" and length "+length+"is "+length*width);
    }
    void dimension(double radius){
        System.out.println("Area of the circle with "+(3.14*(radius*radius)));
    }
}