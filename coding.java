// Base Class
class coding {
    String name;
    int age;

    void makesound() {
        System.out.println("Animal makes sound");
    }
}

// Subclass inheriting from Animal
class Dog extends coding {
    String breed;

    @Override
    void makesound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog is fetching");
    }
}

// Main class to run the program
 class Main {
    public static void main(String[] args) {
        Dog obj2 = new Dog();
        obj2.makesound(); // Outputs: Dog barks
        obj2.fetch();     // Outputs: Dog is fetching
    }
}