public class ShapeArea {
    // Method to calculate the area of a square
    public static double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Calculate the area of a square
        double squareArea = calculateArea(5.0);
        System.out.println("Area of the square: " + squareArea);

        // Calculate the area of a rectangle
        double rectangleArea = calculateArea(4.0, 6.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate the area of a circle
        double circleArea = calculateArea(3.0);
        System.out.println("Area of the circle: " + circleArea);
    }
}
