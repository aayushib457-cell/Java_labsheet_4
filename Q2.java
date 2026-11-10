

class Rectangle {
    double length, breadth;
    static String shapeName = "Rectangle";

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + area);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        r.calculateArea();
    }
}
