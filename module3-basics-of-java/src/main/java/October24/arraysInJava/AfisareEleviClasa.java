package october24.arraysInJava;

public class AfisareEleviClasa {
    public static void main(String[] args) {

        //ne declaram un vector de tip String care se cheama eleviiDinClasaOlimpica
        //si ii dam valorile "Tiberiu", "Robert", "Cristi", "Florin", "Narcisa", "Mihai", "Catalin"
        String[] eleviiDinClasaOlimpica = {"Tiberiu", "Robert", "Cristi", "Florin", "Narcisa", "Mihai", "Catalin"};

        //aflam lungimea vectorului apeland metoda lenght pe vectorul "eleviiDinClasaOlimpica"
        //salvam lungimea vectorului in variabila de tip int numita "lungimeaVectorului"
        int lungimeaVectorului = eleviiDinClasaOlimpica.length;

        //afisam lungimea vectorului, mai exact cati copii se afla in clasa
        System.out.println("Numarul de elevi olimpici din clasa este " + lungimeaVectorului);
        //afisam un alt mesaj la consola
        System.out.println("In ordinea in care au fost introdusi : ");
        //parcurgem vectorul in ordine crescatoare (de la cap la coada) pentru a afisa toti elevii din clasa
        for (int index = 0; index < lungimeaVectorului; index++) {
            System.out.print(eleviiDinClasaOlimpica[index] + " ");
        }

        /*
        *  indexMaxim = 7
           indexMinim = 0
           lungime =8
           * int index = 8; index>=0;index--
        * */

        System.out.println("\n\nIn ordine inversa: ");
        //parcurgem vectorul in ordine descrescatoare (de la coada la cap) pentru a afisa toti elevii din clasa
        for (int index = eleviiDinClasaOlimpica.length - 1; index >= 0; index--) {
            System.out.print(eleviiDinClasaOlimpica[index] + " ");
        }
    }
}
