package operatori;

public class OperatoriMatematici {
    public static void main(String[] args) {
        int primulNumar = 75, alDoileaNumar = 8;

        int suma = primulNumar + alDoileaNumar; // operator de adunare
        System.out.println("Suma nr este " + suma);

        int diferenta = primulNumar - alDoileaNumar; // operator de scadere
        System.out.println("diferenta nr este " + diferenta);

        int rezultatInmultire = primulNumar * alDoileaNumar; // operator de inmultire
        System.out.println("rezultatInmultire nr este " + rezultatInmultire);

        int rest = primulNumar / alDoileaNumar; // operator de impartire
        System.out.println("restul impartirii nr este " + rest);

        int cat = primulNumar % alDoileaNumar; // operatorul modulo
        System.out.println("catul impartirii nr este " + cat);
    }
}
