package operatori;

public class OperatoriRelationali {
    public static void main(String[] args) {
        int a = 5, b = 9;
        if (a > b) {
            System.out.println("maximul este a");
        }

        if (a < b) {
            System.out.println("maximul este b");
        } else {
            System.out.println("maximul este a");
        }

        if (a != b) {
            System.out.println("Numerele sunt diferite");
        }

        if (a == b) {
            System.out.println("numerele sunt egale");
        }


        String cuvant1 = "multi bani";
        String cuvant2 = "multi bani";

//        if(cuvant1==cuvant2) {
//            System.out.println("cuvintele sunt asemanatoare");
//        }
//        else {
//            System.out.println("cuvintele nu sunt asemanatoare");
//        }

        if(cuvant1.equals(cuvant2)) {
            System.out.println("propozitiile sunt asemanatoare");
        }
        else {
            System.out.println("propozitiile nu sunt asemanatoare");
        }
    }
}
