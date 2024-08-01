import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        long fact = 1L;
        int i = 1;

        while (i <= number) { 
            fact *= i;
            i++;
        }

        System.out.println(fact);
        sc.close();
    }
    /*
     * output
     * java question1
    6
    720
     */
}
