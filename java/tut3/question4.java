/**
Write a Java program to check if a given year is a leap year or not using if-else
statements.
 */
import java.util.*;
public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year in the format(YYYY):");
        int year = sc.nextInt();
        if ((year%4 == 0 && year%400 == 0 && year%100 == 0) || year%4 == 0) {
            System.out.println("leap year");
            sc.close();
            return;
        }else{
            System.out.println("not a leap year");
        }
        sc.close();
    }
    
}
/*
 * output
 * 
 * 
 * Enter the year in the format(YYYY):2020
leap year
dell@dell-Inspiron-5593:~/java/tut3$ java question4

Enter the year in the format(YYYY):2021
not a leap year
 */