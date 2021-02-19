package beginner;

public class Exceptions {

    public static void main(String[] args) {
        try {
            String x = "1";
            System.out.println(x.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("null pointer exception");
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("end of program");
        }
    }
}
