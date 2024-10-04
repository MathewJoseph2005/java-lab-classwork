/**
 * javacustomexception
 */
import java.io.IOError;
import java.util.*;

class mybank {
    String accountnumber;
    String type;
    String nameofholder;
    int balence;
}

class InvalidAmountException extends Exception{
    private String message;
    InvalidAmountException(String msg){
            message = msg;
    }

    public String getMessage(){
        return message;
    }
}

class InsufficientFundsException extends Exception{
    private String message;
    InsufficientFundsException(String msg){
        message = msg;
    }

    public String getMessage(){
        return message;
    }
}


/**
 * javacustomexception
 */
public class javacustomexception {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    mybank array[] = new mybank[100];
    public static void main(String[] args) {
        boolean y = true;
        while (y) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.add accounds\n2.Display all account details\n3.Search by account number\n4.Deposit the amount\n5.Withdraw the amount\n6.exit");
            int choie = sc.nextInt();
            switch (choie) {
                case 1:
                openAccound();
                    break;
                case 2:
                showAccound();
                break;
                case 3:
                depositMoney();
                break;
                case 4:
                widrawMoney();
                break; 
                default:
                    break;
            }
        }
    }
    void openAccound() throws IOError{
        
        array[count] = new mybank();
        System.out.print("Enter accound number:");
        array[count].accountnumber = sc.next();
        System.out.print("Enter account type:");
        array[count].type = sc.next();
        System.out.print("Enter name:");
        array[count].nameofholder = sc.nextLine();
        System.out.print("Enter Balence:");
        array[count].balence = sc.nextInt();
        count++;
    }
    void showAccound(){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Name of the accound holder"+array[i].nameofholder);
            System.out.println("Accound no:"+array[i].accountnumber);
            System.out.println("Account type:"+array[i].type);
            System.out.println("balence"+array[i].balence);
        }
    }
    void depositMoney(){
        System.out.print("enter the accound number:");
        String number = sc.next();
        System.out.print("enter the amout of money to demosit:");
        int money = sc.nextInt();
        if (money<=0) {
            throw new InvalidAmountException("negative amound of money deposited");
        }else{
            for (int i = 0; i < array.length; i++) {
                if (number == array[i].accountnumber) {
                    array[i].balence+=money;
                }
        }
        }
    }
    void widrawMoney(){
        System.out.print("enter the accound number:");
        String number = sc.next();
        System.out.print("enter the amout of money to widraw:");
        int money = sc.nextInt();
        if (money<=0) {
            throw new InvalidAmountException("negative amound or amound lesser than 0");
        }else if (money<500) {
            throw new InvalidAmountException("amound less than 500");
        }else{
            for (int i = 0; i < array.length; i++) {
                if (number == array[i].accountnumber) {
                    array[i].balence-=money;
                }
            }
        }
    }
    void searchAccound(){
        System.out.println("enter the accound number:");
        String number = sc.next();
        for (int i = 0; i < array.length; i++) {
            if (number == array[i].accountnumber) {
                System.out.println("Name of the accound holder"+array[i].nameofholder);
                System.out.println("Accound no:"+array[i].accountnumber);
                System.out.println("Account type:"+array[i].type);
                System.out.println("balence"+array[i].balence);
            }else{
                System.out.println("enter the corect number");
            }
        }
    }

    
}