
import java.io.File;
import java.io.FileOutputStream;
import java.util.*;

/**
 * fileInputOutput
 */
public class fileInputOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file1 = new File("numbers.txt");
        File file2 = new File("even.txt");
        File file3 = new File("odd.txt");
        int[] array = new int[50];
        System.out.println("enter the number of element :");
        int n = sc.nextInt();
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (Exception e) {
            System.out.println("file already created");
        }
        try {
            FileOutputStream f = new FileOutputStream("numbers.txt");
            for (int i = 0; i < 10; i++) {
                String s = String.valueOf(array[i])+"\n";
                f.write(s.getBytes());
            }
            System.out.println("writing to the file done");   
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}

