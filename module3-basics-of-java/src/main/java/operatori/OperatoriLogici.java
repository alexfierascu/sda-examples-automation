package operatori;

public class OperatoriLogici {
    public static void main(String[] args) {

        //true && true = true
        //false && false = false
        //true && false = false
        //false && true = false

        //true || true = true
        //false || false = false
        //true || false = true
        //false || true = true

        boolean estiBogat = true;
        boolean aiValoare = false;

        if (estiBogat && aiValoare) {
            System.out.println("Esti un norocos in veata!");
        }

        if (estiBogat || aiValoare) {
            System.out.println("Nu poti sa le ai pe toate in veata!");
        }


        boolean maiAiSalariu = false;
        boolean maiAiCredite = false;
        if (maiAiCredite || maiAiSalariu) {
            System.out.println("Nu dati banii pe prosti, invatati Java");
        }


    }
}
