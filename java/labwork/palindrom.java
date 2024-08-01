package labwork;
import java.util.*;
/**
 * palindrom
 */
class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String orgStr = sc.nextLine();
        int i = 0,j = orgStr.length()-1,flag = 1;
        while (i<orgStr.length()) {
            if(orgStr.charAt(i) != orgStr.charAt(j)){
                flag = 0;
                break;
            }
            i++;
            j--;
        }
        if (flag == 1) {
            System.out.println("Reverse: "+orgStr);
            System.out.println(orgStr+" is a palindrom");
        }else{
            System.out.println(orgStr+" is not a palindrom");
        }
    }
    
}