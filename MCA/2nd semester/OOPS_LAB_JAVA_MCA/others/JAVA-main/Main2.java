class Shapes {
    void cal(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    void cal(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void cal(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }

    void cal(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.cal(5); // Square
        shapes.cal(4, 6); // Rectangle
        shapes.cal(3.0, 4.0); // Triangle
        shapes.cal(2.5); // Circle
    }
}

public class Main {
    // Main method is now included in Shapes class
}

