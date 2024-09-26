import java.util.*;

/**
 * inheritanceWork1
 */
class Empoly{
    String name;
    int age;
    long phoneNumber;
    String adress;
    int salary;
    void printSalary(){
        System.out.println("the salary is "+salary);
    }
}
class officer extends Empoly{
    String specilization;
    String department;
}
class manager extends Empoly{
    String specilization;
    String department;
}
public class inheritanceWork1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        manager objManager = new manager();
        officer objOfficer = new officer();

        System.out.println("enter the name of the manager:");
        objManager.name = sc.nextLine();
        System.out.println("enter the age of the manager :");
        objManager.age = sc.nextInt();
        System.out.println("enter the phone Number :");
        objManager.phoneNumber = sc.nextLong();
        System.out.println("enter the salary of the manager:");
        objManager.salary = sc.nextInt();
        sc.nextLine();

        System.out.print("enter the name of the Officer:");
        objOfficer.name = sc.nextLine();
        System.out.println("enter the age of the Officer :");
        objOfficer.age = sc.nextInt();
        System.out.println("enter the phone Number :");
        objOfficer.phoneNumber = sc.nextLong();
        System.out.println("enter the salary of the Officer:");
        objOfficer.salary = sc.nextInt();
        sc.nextLine();

        System.out.println("the name of the manager is "+objManager.name);
        System.out.println("the age of "+objManager.name+" is "+objManager.age);
        System.out.println("phone number of "+objManager.name+" is "+objManager.phoneNumber);
        objManager.printSalary();


        System.out.println("the name of the officer is "+objOfficer.name);
        System.out.println("the age of "+objOfficer.name+" is "+objOfficer.age);
        System.out.println("phone number of "+objOfficer.phoneNumber+" is "+objOfficer.phoneNumber);
        objOfficer.printSalary();
    }
}