package extra;

public class BoxingNumerals {

    /*
     * It will print “num1 == num2”.
     * Whenever two different object references are compared using “==,”
     * the value is always “false.” But here, because of the Integer caching,
     *  num1 and num2 are autoboxed. Thus num1==num2 returns “true”.
     * Integer caching happens only for values between -128 and 127.
     * */
    public static void main(String[] args) {
        Integer s1 = 128;
        Integer s2 = 128;
        if (s1 == s2) {
            System.out.println("S1 and S2 are the same");
        } else {
            System.out.println("S1 and S2 are not the same");
        }

        Integer s3 = 127;
        Integer s4 = 127;
        if (s3 == s4) {
            System.out.println("s3 and s4 are the same");
        } else {
            System.out.println("s3 and s4 are not the same");
        }

    }
}
