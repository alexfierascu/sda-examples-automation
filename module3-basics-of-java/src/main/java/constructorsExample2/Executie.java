package constructorsExample2;

public class Executie {
    static Om x1; // declar un obiect x1 de tip Om

    public static void main(String[] args) {
        String x; // declarare
        x = "prastie"; //initializare


        x1 = new Om(); // instantiez obiectul x1 si in referentiez la clasa Om folosindu-ma de constructorul implicit
        //Om() - constructor implicit
        x1.setNume("cel mare");
        x1.setPrenume("Stefan");

        Om x2 = new Om(); //Om() - constructor implicit
        Om x3 = new Om("Robert"); // Om(String) - constructor explicit 1
        Om x4 = new Om("Hohenzollern", "Franz"); // Om(String) - constructor explicit 2

    }

}

