 class Person {
    public String name;
    private int age;
    protected int SocialSecurityNumber;
    String address;

    Person(String name,int age,int socialSecurityNumber,String address){
        this.name = name;
        this.age = age;
        this.SocialSecurityNumber = SocialSecurityNumber;
        this.address = address;

    }
}
class Emplo extends Person{


    Emplo(String name, int age, int socialSecurityNumber, String address){
        super(name,age,socialSecurityNumber,address);
    }

}
public class A{
    public static void main(String[] args){
        Emplo obj = new Emplo("resh",19,45,"coimbotore");
        System.out.println(obj.name);

        System.out.println(obj.SocialSecurityNumber);
        System.out.println(obj.address);
    }

}