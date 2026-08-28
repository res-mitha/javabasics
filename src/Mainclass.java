class Counter {
    static int count = 0;
    int instance_number = 0;

    Counter() {
        count++;
        instance_number++;
    }

    void display() {
        System.out.println("Count: " + count);
        System.out.println("instance_number: " + instance_number);
    }
}

public class Mainclass {
    public static void main(String[] args) {

        Counter obj1 = new Counter();
        obj1.display();
        Counter obj2 = new Counter();
        obj2.display();
        Counter obj3 = new Counter();
        obj3.display();
    }
}