import java.util.*;
/**
 * evenWord
 */
public class evenWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senstence = new String();
        String word = "";
        String[] words = new String[50];
        int numberOfWords=0;
        senstence = sc.nextLine();
        for (int i = 0; i < senstence.length(); i++) {
            if (senstence.charAt(i) == ' ') {
                words[numberOfWords] = word;
                numberOfWords++;
                word = "";
            }else{
                word+=senstence.charAt(i);
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null && words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }
}