package execution;

public class CourseExample {
    public static void main(String[] args) {
        System.out.println(divide(10, 7));
        System.out.println(divide(0, 7));
        System.out.println(divide(10, 0));
    }

    public static double divide(int divident, int divisor) {
        if (Double.isInfinite(divident / divisor)) {
            return (double) divident / divisor;
        }
        return (double) divident / divisor;
    }
}
