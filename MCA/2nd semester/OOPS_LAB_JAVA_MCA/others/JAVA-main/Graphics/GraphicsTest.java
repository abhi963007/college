package Graphics;

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

