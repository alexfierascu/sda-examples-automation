package october24.methods;

public class SimpleFunctionBeingCreatedAndCalledInsideMain {

    public static void main(String[] args) {

        int primulNumar = 99, alDoileaNumar = 12378;

        //afisam suma celor 2 nr adunate
        System.out.println(sumaCelorDouaNr(primulNumar, alDoileaNumar));
    }


    //definim o metoda care va returna un int cu numele  "sumaCelorDouaNr" si care primeste 2 parametrii, a si b
    static int sumaCelorDouaNr(int a, int b) {

        //returnam valoarea sumei dintre cei 2 parametrii
        return a + b;

    }
}
