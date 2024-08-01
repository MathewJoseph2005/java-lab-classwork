/**
Write a Java program to print all prime numbers between 1 and 100 using a for
loop and if-else statements.
 */
public class question5 {
    public static void main(String[] args) {
        for(int i = 1;i<= 100;i++){
            int flag = 1;
            for(int j = 2;j<i/2;j++){
                if(i%j == 0){
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(i + " ");
            }
        }
        
    }
    
}
/*
 * output
 * dell@dell-Inspiron-5593:~/java/tut3$ java question5
1 2 3 4 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
 */