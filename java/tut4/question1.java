// package tut4;
import java.util.Scanner;
/**
 1. Write a Java program to calculate the sum of all elements in an integer array.
 */
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of the array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int len = a.length;
        int sum =0;
        for(int i = 0;i<n;i++){
            sum += a[i];
        }
        System.out.println("the sum of the elements of the array is "+ sum);
    }
    
}