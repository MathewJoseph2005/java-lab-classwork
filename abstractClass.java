import java.util.*;

abstract class shape{
    abstract void numberOfSides();
}

class Triangle extends shape{
    int sides;
    Triangle(int sides) {
        this.sides = sides;
    }
    
    @Override
    void numberOfSides(){
        System.out.println("Shape with 3 sides:");
        System.out.println("I am a Triangle. I have 3 sides.");
        System.out.println("Sum of Angles ="+(this.sides-2)*180);
    }
}

class Rectangle extends shape{
    int sides;
    Rectangle(int sides) {
        this.sides = sides;
    }
    @Override
    void numberOfSides(){
        System.out.println("Shape with 4 sides:");
        System.out.println("I am a Rectangle. I have 4 sides.");
        System.out.println("Sum of Angles"+(this.sides-2)*180);
    }
}

class Hexagon extends shape{
    int sides;
    Hexagon(int sides){
        this.sides = sides;
    }
    @Override
    void numberOfSides(){
        System.out.println("Shape with 6 sides:");
        System.out.println("I am a Hexagon. I have 6 sides.");
        System.out.println("Sum of Angles"+(this.sides-2)*180);
    }
}

/**
 * abstractClass
 */
public class abstractClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int condition = 1;
        Triangle objT = new Triangle(3);
        Rectangle objR = new Rectangle(4);
        Hexagon objH = new Hexagon(6);
        while (condition == 1) {
            System.out.println("Enter the number of sides for the geometric shape:");
            int choice = sc.nextInt();
            if (choice == 3) {
                objT.numberOfSides();
            }else if(choice == 4){
                objR.numberOfSides();
            }else if(choice == 6){
                objH.numberOfSides();
            }else{
                System.out.println("Shape with "+choice+"sides is not supported");
            }
            System.out.println("do you want to continue:(1/0)");
            condition = sc.nextInt();
            if (condition != 1) {
                System.out.println("good bye...");
                return;
            }
        }
        
    }
}