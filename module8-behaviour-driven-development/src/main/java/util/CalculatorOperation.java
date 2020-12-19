package util;

public abstract class CalculatorOperation {
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double difference(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
