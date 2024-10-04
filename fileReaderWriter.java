import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 * fileReaderWriter
 */
public class fileReaderWriter {

    public static void main(String[] args){
        String path = "sample.txt";
        String path2 = "new-sample.txt";
        Scanner sc = new Scanner(System.in);
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                System.out.println("sample.txt exits");
            }else{
                System.out.println("file already exit");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            FileWriter fw = new FileWriter(path);
            System.out.print("enter the string:\n");
            String content = sc.nextLine();
            for (int i = 0; i < content.length(); i++) 
                fw.write(content.charAt(i)); 
            System.out.println("content written to sample.txt");
            fw.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            File f2 = new File("new-sample.txt");
            if (f2.createNewFile()) {
                System.out.println("file created");
            }else{
                System.out.println("new-sample.txt already exit");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileWriter fw2 = new FileWriter(path2);
            FileReader fr1 = new FileReader(path);
            int i;
            System.out.println("------Contents of sample.txt------");
            while ((i = fr1.read()) != -1) {
                System.out.print((char)i);
                fw2.write((char)i);
            }
            fw2.flush();
            System.out.println("\ncontent copied from sample.txt to new-sample.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("\n------contents of new-sample.txt------");
            FileReader fr2 = new FileReader(path2);
            int i;
            while ((i = fr2.read()) != -1) {
                System.out.print((char)i);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}