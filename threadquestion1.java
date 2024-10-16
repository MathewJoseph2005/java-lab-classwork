
import java.util.Random;

/**
 * threadquestion1
 */
public class threadquestion1 {

    public static void main(String[] args) {
        numberGenerator threadObject = new numberGenerator();
        threadObject.start();
    }
}

class SquareThread extends Thread{
    int number;
    public SquareThread(int number) {
        this.number = number;
    }

    
    public void run(){
        System.out.println("square of "+number+" = "+(number*number));
    }
}

class CubeThread extends Thread{
    int number;
    public CubeThread(int number) {
        this.number = number;
    }

    
    public void run(){
        System.out.println("cube of "+number+" = "+(number*number*number));
    }
}

class numberGenerator extends Thread{

    public void run() {
        Random num = new Random(); 
        for (int i = 0; i < 10; i++) {
            int randNum = num.nextInt(100);
            if ((randNum%2)==0) {
                SquareThread thread1 = new SquareThread(randNum);
                thread1.start();
            }else{
                CubeThread thread2 = new CubeThread(randNum);
                thread2.start();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            
            
        }
        
    }
    
}