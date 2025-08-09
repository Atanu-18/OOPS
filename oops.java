public class oops {
    public static void main(String[] args) {
        Student s = new Student();

        // System.out.println(s.name);
    }
}

class Student {
    String name;
    int roll;

    //constructor
    // Student(String name) {
    //     this.name  = name;
    // }

    Student(){
        System.out.println("Constructor is called..");
    }
}
