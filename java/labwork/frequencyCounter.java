package labwork;
import java.util.*;
/**
 * frequencyCounter
 */
public class frequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        System.out.print("enter the char to search:");
        char checkChar = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (checkChar == str.charAt(i)) {
                count++;
            }
        }
        System.out.print("the char "+checkChar+" was repeated "+count+" times");
    }
}