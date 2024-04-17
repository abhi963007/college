// Interface for basic arithmetic operations
interface ArithmeticOperation {
    double operate(double a, double b);
}

// Addition operation class
class Addition implements ArithmeticOperation {
    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}

// Subtraction operation class
class Subtraction implements ArithmeticOperation {
    @Override
    public double operate(double a, double b) {
        return a - b;
    }
}

// Multiplication operation class
class Multiplication implements ArithmeticOperation {
    @Override
    public double operate(double a, double b) {
        return a * b;
    }
}

// Division operation class
class Division implements ArithmeticOperation {
    @Override
    public double operate(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}

// Arithmetic package class
class Arithmetic {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        // Perform addition
        ArithmeticOperation add = new Addition();
        double resultAdd = add.operate(num1, num2);
        System.out.println("Addition result: " + resultAdd);

        // Perform subtraction
        ArithmeticOperation subtract = new Subtraction();
        double resultSubtract = subtract.operate(num1, num2);
        System.out.println("Subtraction result: " + resultSubtract);

        // Perform multiplication
        ArithmeticOperation multiply = new Multiplication();
        double resultMultiply = multiply.operate(num1, num2);
        System.out.println("Multiplication result: " + resultMultiply);

        // Perform division
        ArithmeticOperation divide = new Division();
        try {
            double resultDivide = divide.operate(num1, num2);
            System.out.println("Division result: " + resultDivide);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

