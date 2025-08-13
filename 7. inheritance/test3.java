// hierarchical inheritance
public class test3 {
    public static void main(String[] args) {
        // object
        // ---
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
   void   walk(){
    System.out.println("walks");
   }
}

class Fish extends Animal {
   void   swim(){
    System.out.println("swims");
   }
}

class Bird extends Animal {
   void   fly(){
    System.out.println("flies");
   }
}



// Derived class / sub class
// class Fish extends Animal {
//     int fins;
//     void swim() {
//         System.out.println("swims in water");
//     }
// }
