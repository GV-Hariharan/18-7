  Java Lab Week5 programmes:-

Program-1:
public class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}

public class Main {
    public static void main(String[] args){
        Person myObj = new Person();
        myObj.setName("John");
        System.out.println(myObj.getName());
    }
}


Output:
 
Program-2:
public class Vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println(("boi boi!"));
    }
}

 class Car extends Vehicle{
    private String modelName = "Moustang";
    public static void main(String[] args){
        Car myFastCar = new Car();
        myFastCar.honk();
        System.out.println(myFastCar.brand+" "+myFastCar.modelName);
    }
    
}


Output:
 
Program-3:
 class Animal{
    public void animalSound(){
        System.out.println("the animal makes a sound ");
    }
}
class pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }
}
class Dog extends Animal{
    public static void main(String[] args) {
        System.out.println("The dog says: bow bow");
    }
}

class Main{
    public static void main(String[] args) {
        Animal myAnimal= new Animal();
        Animal myDog = new Dog();
        Animal myPig = new pig();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();     
    }
}

Output:
 
Program-4:
/**
 * OuterClass
 */
 class OuterClass {

    int x = 10;
    class InnerClass{
        int y =5;
    }
}
public class Main{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y+myOuter.x);
    }
}

Output:
 
Program-5:
/**
 * OuterClass
 */
 class OuterClass {

    int x = 10;
    static class InnerClass{
        int y =5;
    }
}
public class Main{
    public static void main(String[] args){
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);
    }
}

Output:
 
Program-6:
/**
 * OuterClass
 */
 class OuterClass {

    int x = 10;
    class InnerClass{
        public int myInnerMethod(){
            return  x;
        }
    }
}
public class Main{
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner=myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}

Output:
 
Program-7:
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("ZZZzzzz");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: weee wee");
    }
}

class Main{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

Output:
 
Program-8:
interface Animal{
    public void animalSound();
    public void sleep();

}
class Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says : wee wee");
    }
    public void sleep(){
        System.out.println("ZZzz");
    }
}
class Main{
    public static void main(String[] args) {
        Pig myPig=new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

Output:
