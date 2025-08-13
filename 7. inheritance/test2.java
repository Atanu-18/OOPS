// multi-level inheritance
public class test2 {
    public static void main(String[] args) {
        // object
        Dog tonny = new Dog();
        tonny.eat();
        tonny.legs = 4;
        System.out.println(tonny.legs);
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

class Mammals extends Animal {
   int legs; 
}

class Dog extends Mammals {
    String breeds;
}

// Derived class / sub class
// class Fish extends Animal {
//     int fins;
//     void swim() {
//         System.out.println("swims in water");
//     }
// }