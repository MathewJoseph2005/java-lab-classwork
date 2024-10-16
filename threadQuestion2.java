import java.util.*;

/**
 * threadQuestion2
 */
public class threadQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number to print table");
        int num1 = sc.nextInt();
        System.out.println("enter the second number to print table");
        int num2 = sc.nextInt();
        System.out.println("enter the third number to print table");
        int num3 = sc.nextInt();
        table t1 = new table(num1);
        table t2 = new table(num2);
        table t3 = new table(num3);
        t1.start();
        t3.start();
        t2.start();
    }

}
class table extends Thread{
    int number;
    table(int number){
        this.number = number;
    }
    @Override
    public void run() {
        synchronized (table.class) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number+"+"+i+"="+(number+i));
            }
            try {
            } catch (Exception e) {
            }
            
        }
    }
    
}