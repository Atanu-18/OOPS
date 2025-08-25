// oops.java
public class OOps {
    public static void main(String[] args) {
        // default constructor call
        Student s1 = new Student();
        System.out.println("Name: " + s1.name); // null (কারণ value assign করা হয়নি)
        System.out.println("Roll: " + s1.roll); // 0 (default value of int)

        System.out.println("------------------");

        // parameterized constructor call
        Student s2 = new Student("Atanu", 101);
        System.out.println("Name: " + s2.name);
        System.out.println("Roll: " + s2.roll);
    }
}

class Student {
    String name;
    int roll;

    // default constructor (no-argument)
    Student() {
        System.out.println("Default Constructor is called..");
    }

    // parameterized constructor
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("Parameterized Constructor is called..");
    }
}
