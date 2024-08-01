// Write a Java program to print the Fibonacci series up to a given number using a while loop.
import java.util.*;
public class question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int i = 0,fib = 0,add1 = 1,add2 = 0;
        System.out.print("0 1 ");
        while(i<=num){
            
            fib = add1 + add2;
            System.out.print(fib + " ");
            add2 = add1;
            add1 = fib;
            i++;
        }
        System.out.println();
        sc.close();    
    }
    /*
     * java question2
    7
    0 1 1 2 3 5 8 13 21 34 
     */
}