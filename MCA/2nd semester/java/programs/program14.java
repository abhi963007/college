// File: Graphics.java
package Graphics;

public interface Shape {
    double calculateArea();
}

// File: Rectangle.java
package Graphics;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// File: Triangle.java
package Graphics;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// File: Square.java
package Graphics;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// File: Circle.java
package Graphics;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// File: GraphicsTest.java
import Graphics.*;

public class GraphicsTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(6, 3);
        Square square = new Square(5);
        Circle circle = new Circle(4);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}

