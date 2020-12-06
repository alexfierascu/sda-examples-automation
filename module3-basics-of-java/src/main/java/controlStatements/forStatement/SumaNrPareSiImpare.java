package controlStatements.forStatement;

import java.util.Scanner;

public class SumaNrPareSiImpare {
    public static void main(String[] args) {

        //declaram 2 variabile in care vom salva suma nr pare si suma nr impare
        int sumaPare = 0, sumaImpare = 0;

        //construirea obiectului scanner de care ne vom folosi pentru a face citirea de la tastatura
        Scanner scanner = new Scanner(System.in);

        //afisam un mesaj la consola pentru a intreba utilizatorul pana la ce valoare vrem ca programul nostru sa faca
        //logica programului
        System.out.println("Introduceti un nr de la tastatura!");

        //declaram o variabila in care vom salva ceea ce am introdus de la tastatura
        int nrCititDeLaTastatura = scanner.nextInt();

        //prin intermediul structurii de control "for" vom parcurge numerele
        //din 1 in 1(cu pasul de incrementare 1), pornind de la 1,
        // pana la nr citit de la tastatura
        for (int i = 1; i <= nrCititDeLaTastatura; i++) {

            //aflam daca numarul care se incrementeaza (contorul) este par
            if (i % 2 == 0) {
                //daca este par il adunam la suma nr pare
                sumaPare += i;
            } else {
                //daca nu este par il adunam la suma nr impare
                sumaImpare += i;
            }
        }

        //afisam suma nr impare
        System.out.println("Suma numerelor impare pana la " + nrCititDeLaTastatura + " este " + sumaImpare);

        //afisam suma nr pare
        System.out.println("Suma numerelor pare pana la " + nrCititDeLaTastatura + " este " + sumaPare);
    }
}
