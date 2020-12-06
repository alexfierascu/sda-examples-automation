package manipulareStringuri;

public class StringsExample {
    public static void main(String[] args) {
        //int, boolean, char, long, double, float, byte - primitive data type
        // String - nu este primitiva

        String cuvant1 = "ceva";
        String cuvant2 = "altceva";
        String cuvant3 = "ceva ce nu a mai fost";

        String cuvant4 = "Un aSa feL nu S-a Mai VaZuT";

        int x = 9;


        //numeVariabilaString.numeMetoda(); - sintaxa apelare metoda pentru un String

        if (cuvant1.contains("e")) {
            System.out.println("contine litera e");
        }

        System.out.println("Lungimea cuvantului este " + cuvant1.length());

        System.out.println(cuvant4.toLowerCase());
        System.out.println(cuvant4.toUpperCase());


    }
}
