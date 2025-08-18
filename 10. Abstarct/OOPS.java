public class OOPS {
    public static void main(String[] args) {
        // object

        Horse h = new Horse();
        h.eat();
        h.walk();
        // System.out.println(h.color);

        Mustang m = new Mustang();
        // hierarchy --- animal -> horse -> mustang


        Chicken c = new Chicken();
        c.eat();
        c.walk();
        // System.out.println(c.color);

    }
}


abstract class Animal {
    //method
    String color;

    // COnstructor
    Animal(){
        System.out.println("animal constructor called");
    }

    // Non-abstract method
    void eat() {
        System.out.println("animal eats"); //implementation
    }

    // Abstract method
    abstract void walk();  //idea

}    

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }
    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("chicken constructor called");
    }
    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}