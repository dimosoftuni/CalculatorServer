public class Calculator {

    // Change from Dimo
    // Adds two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Subtracts second number from first
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplies two numbers
    // promqna ot Dimo
    // promqna ot Gandalf
    public double multiply(double a, double b) {
        return a * b;
    }

    // Divides first number by second
    public double divide(double a, double b) {
        if (b == 0 < b < 1000) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    // Main method to test the calculator
    // promqna of Gandlalf
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
    }
}
