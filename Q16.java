

class Triangle {
    int a, b, c;
    static String type = "Triangle";

    void checkTriangle() {
        String triangleType;

        if (a <= 0 || b <= 0 || c <= 0 ||
            a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid Triangle");
            return;
        }

        if (a == b && b == c) {
            triangleType = "Equilateral";
        } else if (a == b || b == c || a == c) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }

        System.out.println("Type: " + type);
        System.out.println("Triangle: " + triangleType);
    }
}

public class Q16 {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.a = 5;
        t.b = 5;
        t.c = 5;

        t.checkTriangle();
    }
}
