package october25.recapitulare;

public class InterschimbareA2Variabile {
    public static void main(String[] args) {
        int a = 5, b = 4;
        System.out.println("Valorile initiale sunt a=" + a + " si b=" + b);

        interschimbare(a, b);
        interschimbareV2(a, b);
        interschimbareV3(a, b);
    }

    static void interschimbare(int x, int y) {
        int auxiliar;
        auxiliar = x; // auxiliar =5, a=5, b=4
        x = y; // a=4, auxiliar = 5, b = 4
        y = auxiliar; // a=4, auxiliar = 5, b=5
        System.out.println("Valorile interschimbate sunt a=" + x + " si b=" + y);
    }

    static void interschimbareV2(int primulNr, int alDoileaNr) {
        primulNr = primulNr + alDoileaNr;
        alDoileaNr = primulNr - alDoileaNr;
        primulNr = primulNr - alDoileaNr;
        System.out.println("Valorile interschimbate sunt a=" + primulNr + " si b=" + alDoileaNr);
    }

    static void interschimbareV3(int primulNr, int alDoileaNr) {
        primulNr = primulNr * alDoileaNr;
        alDoileaNr = primulNr / alDoileaNr;
        primulNr = primulNr / alDoileaNr;
        System.out.println("Valorile interschimbate sunt a=" + primulNr + " si b=" + alDoileaNr);
    }
}
