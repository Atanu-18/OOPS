public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "xyz";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "abc";


        System.out.println("s1.schoolName: " + s1.schoolName);
        System.out.println("s2.schoolName: " + s2.schoolName);
        System.out.println("s3.schoolName: " + s3.schoolName);


        // “The returnPercentage method is static, which means it belongs to the class, not to any individual object.”
        // class --> Student || object ----> s1,s2..
        int percentage1 = Student.returnPercentage(90, 80, 70);
        int percentage2 = Student.returnPercentage(50, 60, 40);

        System.out.println("Percentage1: " + percentage1);
        System.out.println("Percentage2: " + percentage2);
    }
}


class Student {
    static int returnPercentage(int math, int phy, int chem) {
        return(math + phy + chem) / 3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}