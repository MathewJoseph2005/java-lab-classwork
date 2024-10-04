/**
 * javaexception
 */
import java.util.*;
public class javaexception {

    public static void main(String[] args) {
        boolean y = true;
        Scanner sc = new Scanner(System.in);
        while (y) {
        System.out.println("enter case 1 or 2:");
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.println("Program to perform Division");
                        System.out.print("enter the number-1:");
                        int num1 = sc.nextInt();
                        System.out.print("Enter the number-2:");
                        int num2 = sc.nextInt();
                        System.out.println("result = "+(num1/num2));
                        System.out.println("end of try block");
                    } catch (ArithmeticException e) {
                        System.out.println(e);
                    }finally{
                        System.out.println("finally block content\nmy code is safe from expection");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Enter the number of elements you want to store:");
                        int len = sc.nextInt();
                        int[] array = new int[len];
                        System.out.println("Enter the elements of the array:");
                        for (int i = 0; i < array.length; i++) {
                            array[i] = sc.nextInt();
                        }
                        System.out.println("Array length:"+len);
                        System.out.println("Array elements are:");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i]+"\t");
                        }
                        System.out.println("enter the position of element to be accessed:");
                        int pos = sc.nextInt();
                        System.out.println("the accesed element is"+array[pos]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e);
                    }
                    break;

                    
            
                default:
                    break;
            }
        System.out.println("do you want to continue :(1/0)");
            int dis = sc.nextInt();
            if (dis == 1) {
                    y = true;
                }else{
                    y = false;
                }
        }
    }
}