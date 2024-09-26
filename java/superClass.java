import java.util.*;
/**
 * inheritence2
 */
class Employee{
    float basic;
    float da;
    float hra;
    float salary;
    Employee(float basic,float da, float hra) {
        this.basic = basic;
        this.da = da;
        this.hra = hra;
    }

    void calcSalary(){
        this.salary = this.basic + ((this.da/100)*this.basic) + ((this.hra/100)*this.basic);
        System.out.println("salary of the employ is"+salary);
    }

    void display(){
        System.out.println("....... Employee.......");
    }
    
}
class engineer extends Employee{
    engineer(float  basic,float da, float hra){
        super(basic, da, hra);
    }
    
    void calcSalary(){
        super.salary = (this.basic + ((this.da/100)*this.basic) + ((this.hra/100)*this.basic))*2;
        System.out.println("salary of the engineer is"+super.salary);
    }
    @Override
    void display(){
        super.display();
        super.calcSalary();
        System.out.println("....... Engineer.......");
        calcSalary();
    }
}
public class superClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ba,da,hra;
        System.out.println("Enter the basic Salary of the employ is");
        ba = sc.nextFloat();
        System.out.println("Enter the Da % of the Employ:");
        da = sc.nextFloat();
        System.out.println("Enter the Hra % of the Employ:");
        hra = sc.nextFloat();
        engineer obj = new engineer(ba,da,hra);
        obj.display();

    }
}