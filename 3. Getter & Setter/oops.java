public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a Pen object called p1

        // Set color
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        // Set tip size
        p1.setTip(5);
        System.out.println(p1.getTip());


        p1.setColor("Red");
        System.out.println(p1.getColor());


        p1.setTip(2);
        System.out.println(p1.getTip());
        


    }
}

class Pen {
    //properties
    private String color;
    private int tip;

    //get method
    String getColor() {
        return this.color;
    }
    int getTip() {
        return this.tip;
    }/

    //set method
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

