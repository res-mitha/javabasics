abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }
    abstract void makesound();
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    void makesound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    Cat(String name){
        super(name);
    }
    void makesound(){
        System.out.println("Meow Meow");
    }
}
public class One{
    public static void main(String[] args){
        Dog obj1 = new Dog("Brusely");
        System.out.println(obj1.name);
        obj1.makesound();
        Cat obj2 = new Cat("catesu");
        System.out.println(obj2.name);
        obj2.makesound();
    }
}