package controlStatements.forStatement;

import java.util.Scanner;

//declararea clasei ("fisierul java" cu care lucram)
public class NumaraDinCinciInCinci {

    /* declararea functiei main
     ca sa putem executa ceva, codul nostru trebuie sa se afle
     in interiorul functiei main
     */
    public static void main(String[] args) {

        //afisam un mesaj la consola pentru a informa utilizatorul despre programul nostru
        System.out.println("Program care numara din 5 in 5 pana la n - n fiind citit de la tastatura ");

        //afisam un mesaj la consola pentru a intreba utilizatorul pana la ce valoare vrem ca programul nostru sa numere
        System.out.println("Pana la ce valoarea vreti sa cititi? ");

        //construirea obiectului scanner de care ne vom folosi pentru a face citirea de la tastatura
        Scanner scanner = new Scanner(System.in);

        //declaram o variabila in care vom salva ceea ce am introdus de la tastatura
        int nrCititDeLaTastatura = scanner.nextInt();

        //prin intermediul structurii de control "for" vom parcurge numerele
        //din 5 in 5, pornind de la 0, pana la nr citit de la tastatura
        for (int i = 0; i <= nrCititDeLaTastatura; i += 5) {

            //afisam nr care se incrementeaza la fiecare pas cu 5
            //eg: pt PAS1: i=0, pt PAS2: i=5, pt PAS3: i=10, etc
            System.out.print(i + " ");
        }

    }
}
