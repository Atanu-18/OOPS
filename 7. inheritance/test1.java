public class test1 {
    public static void main(String[] args) {
        // object
        Fish shark = new Fish();
        shark.eat();
    }
}


// Base class
class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class / sub class
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims in water");
    }
}