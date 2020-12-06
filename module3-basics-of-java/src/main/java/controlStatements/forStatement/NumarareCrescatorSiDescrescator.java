package controlStatements.forStatement;

//declararea clasei ("fisierul java" cu care lucram)
public class NumarareCrescatorSiDescrescator {

    /* declararea functiei main
     ca sa putem executa ceva, codul nostru trebuie sa se afle
     in interiorul functiei main
     */
    public static void main(String[] args) {
        //afisam un mesaj la consola pentru a informa utilizatorul despre programul nostru
        System.out.println("Program ce numara crescator de la 1 la 10");

        //sintaxa FOR
        // for (contor de start; conditie de stop; pas incremenetare contor)


        //prin intermediul structurii de control "for" vom parcurge numerele
        //din 1 in 1 (cu pasul de incrementare 1), pornind de la 1,
        // pana la valoare 10, in ordine crescatoare
        for (int contor = 1; contor <= 10; contor++) {
            //afisam nr incrementat
            System.out.print(contor + " ");
        }


        System.out.println("\nProgram ce numara descrescator de la 10 la 1");

        //prin intermediul structurii de control "for" vom parcurge numerele
        //din 1 in 1 (cu pasul de decrementare 1), pornind de la 10,
        // pana la valoare 1, in ordine descrescatoare
        for (int contor = 10; contor >= 1; contor--) {
            //afisam nr decrementat
            System.out.print(contor + " ");
        }
    }
}
