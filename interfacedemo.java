

/**
 * interfacedemo
 */

abstract class Animal{
    protected int legs;

    public Animal(int legs){
        this.legs = legs;
    }

    
    
    abstract void eat();

    void walk(){
        if (legs == 0) {
            System.out.println("Fish has no legs");
        }else{
            System.out.println("this animal walks by "+legs+" legs");
        }
    }
}

class Spider extends Animal{
    Spider(int legs){
        super(legs);
    }

    void eat(){
        System.out.println("Spider eats insects");
    }
}
/**
 * pet
 */
interface pets {
    abstract String getName();
    abstract void setName(String name);
    abstract void play();
    
}

class Cat extends Animal implements pets{
    String name;
    Cat(int legs,String name){
        super(legs);
        this.name = name;
    }
    public String getName(){
        return name;
    }
    void eat(){
        System.out.println("Cat eats fish");
    }
    public void setName(String newname){
        System.out.println("this cats name is "+newname);
    }

    public void play(){
        System.out.println("cat plays with rats");
    }
}

class Fish extends Animal implements pets{
    String name;
    Fish(int legs,String name){
        super(legs);
        this.name = name;
    }
    public String getName(){
        return name;
    }
    void eat(){
        System.out.println("Fish eat plants");
    }
    public void setName(String newName){
        System.out.println("this Fish name is "+newName);
    }
    public void play(){
    }

}
public class interfacedemo {
    public static void main(String[] args) {
        Spider spiderobj = new Spider(8);
        Cat catobj = new Cat(4, "Fluffy");
        Fish fish = new Fish(0, "Mimi");
        System.out.println("FISH");
        String fishName = fish.getName();
        System.out.println("This fish name is "+fishName);
        fish.eat();
        fish.walk();
        fish.setName("Momo");
        System.out.println("CAT");
        String catName = catobj.getName();
        System.out.println("This cat name is "+catName);
        catobj.walk();
        catobj.play();
        catobj.eat();
        catobj.setName("Moose");
        System.out.println("SPIDER");
        spiderobj.eat();
        spiderobj.walk();

    }
    
}