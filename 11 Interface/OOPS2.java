

public class OOPS2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.start();
    }
}


interface Vehicle {
    void drive();
}

interface Engine {
    void start();
}


class Car implements Vehicle, Engine{
    public void drive() {
        System.out.println("car is driving on the road");
    }

    public void start() {
        System.out.println("engine has started");
    }
}