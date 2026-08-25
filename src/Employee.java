public class Employee {
      String name;
      int id;
      static int nextId = 101;

    Employee(String name){
        this.name = name;
        id = nextId;
        nextId++;
    }
     void displayEmployee(){
         System.out.println("ID:" + id + " NAME:" + name);

    }
}
class Main{
    public static void main(String[] args){
        Employee obj1 = new Employee("Alice");
        Employee obj2 = new Employee("Bob");
        Employee obj3 = new Employee("Mark");
        obj1.displayEmployee();
        obj2.displayEmployee();
        obj3.displayEmployee();

    }
}
