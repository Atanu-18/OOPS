public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a Pen object called p1

        // Set color
        p1.setColor("Blue");
        System.out.println(p1.color);

        // Set tip size
        p1.setTip(5);
        System.out.println(p1.tip);
    }
}

class Pen {
    //properties
    String color;
    int tip;

    //functions
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
