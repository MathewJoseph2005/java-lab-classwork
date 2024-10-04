import  java.util.*;
/**
 * inheritance
 * by-Mathew Joseph
 */
class Employ{

    String Name;
    int age;
    long phoneNumber;
    String adress;
    int salary;

    void printSarlary(){
        System.out.println("the salary is "+salary);
    }
    void printEmpoly(){
        System.out.print("Name: "+this.Name+"\n");
        System.out.print("age: "+this.age+"\n");
        System.out.print("Adress: "+this.adress+"\n");
        System.out.println("Phone number: "+this.phoneNumber);
    }

}

class Officer extends Employ{
    String specialization;
    void printSpecialization(){
        System.out.println("Specialization: "+this.specialization);
    }
    
}
class Manager extends Employ{
    String department;
    void printDepartment(){
        System.out.println("department: "+this.department);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer obj1 = new Officer();
        Manager obj2 = new Manager();
        
        System.out.print("enter the officer's name: ");
        obj1.Name = sc.nextLine();

        System.out.print("Enter the officers adress: ");
        obj1.adress = sc.nextLine();

        System.out.print("Enter the Specialization: ");
        obj1.specialization = sc.next();

        System.out.print("Enter the age: ");
        obj1.age = sc.nextInt();

        System.out.print("Enter the Phone number: ");
        obj1.phoneNumber = sc.nextLong();

        System.out.print("enter the salary: ");
        obj1.salary = sc.nextInt();

        System.out.print("enter the Manager's name: ");
        obj2.Name = sc.next();
        sc.nextLine();
        System.out.print("Enter the Manager adress: ");
        obj2.adress = sc.nextLine();

        System.out.print("Enter the department: ");
        obj2.department = sc.next();

        System.out.print("Enter the age: ");
        obj2.age = sc.nextInt();

        System.out.print("Enter the Phone number: ");
        obj2.phoneNumber = sc.nextLong();

        System.out.print("enter the salary: ");
        obj2.salary = sc.nextInt();

        System.out.println("OFFICER DETAILS:");
        obj1.printEmpoly();
        obj1.printSarlary();
        obj1.printSpecialization();

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("MANAGER DETAILS:");
        obj2.printEmpoly();
        obj2.printSarlary();
        obj2.printDepartment();
    }
}