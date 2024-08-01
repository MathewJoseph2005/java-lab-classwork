/**
    Write a Java program to print the reverse of a given number using a for loop.
 */
import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,rev = 0;
        num = sc.nextInt();
        for(;num>0;num/=10){
            rev = (rev*10) + num % 10; 
        }
        System.out.println(rev);
        sc.close();
    }
    
}
/*
 * output
 * dell@dell-Inspiron-5593:~/java/tut3$ java question3
    38827773
    37772883
 */