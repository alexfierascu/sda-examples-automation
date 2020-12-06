package classesAndObjects;

import java.util.Scanner;

public class Elev {
    double greutate;
    int inaltime;
    int varsta;
    String nume;
    String preNume;
    int nrDePantofi;
    char sexElev;
    int coeficientInteligenta;
    int nrOreParticipare = 0;
    int nrOreObligatorii = 4;

    void afisareIQ() {
        System.out.println("Coeficientul de inteligenta a elevului este de: "
                + coeficientInteligenta);
    }

    /* 1. A participat la curs?
       2. Daca a participat la curs creste nr de ore cu valoarea 1
       3. Comparam nr de ore participat cu nr de ore obligatorii!!!
    */
    void verificareParticipareCurs() {
        Scanner participareCurs1 = new Scanner(System.in);
        System.out.println("Ai participat la cursul 1? ");
        boolean raspuns1 = participareCurs1.nextBoolean();
        if (raspuns1) {
            nrOreParticipare++;
        }
        Scanner participareCurs2 = new Scanner(System.in);
        System.out.println("Ai participat la cursul 2? ");
        boolean raspuns2 = participareCurs2.nextBoolean();
        if (raspuns2) {
            nrOreParticipare++;
        }
        Scanner participareCurs3 = new Scanner(System.in);
        System.out.println("Ai participat la cursul 3? ");
        boolean raspuns3 = participareCurs3.nextBoolean();
        if (raspuns3) {
            nrOreParticipare++;
        }
        Scanner participareCurs4 = new Scanner(System.in);
        System.out.println("Ai participat la cursul 4? ");
        boolean raspuns4 = participareCurs4.nextBoolean();
        if (raspuns4) {
            nrOreParticipare++;
        }
        if (nrOreParticipare == nrOreObligatorii) {
            System.out.println("Ai participat la toate orele si esti un elev silitor");
        } else {
            System.out.println("Insuficienta prezenta");
            int nrOreAbsente = nrOreObligatorii - nrOreParticipare;
            System.out.println("Elevul a chiulit de la " + nrOreAbsente + " ore");
        }
    }

    void verificarePrezentaCursVariantaImbunatatita() {
        int nrCursuriParticipate = 0;
        Scanner scannerNrCursuri = new Scanner(System.in);
        System.out.println("Care este nr maxim de cursuri la care poate participa elevul?");
        int nrCursuri = scannerNrCursuri.nextInt();
        for (int i = 1; i <= nrCursuri; i++) {
            System.out.println("A participat elevul la cursul " + i + " ?\n" +
                    "Variante de raspuns: true / false");
            Scanner scannerRaspuns = new Scanner(System.in);
            boolean raspuns = scannerRaspuns.nextBoolean();
            if (raspuns) {
                nrCursuriParticipate++;
            }
        }
        System.out.println("Elevul a fost prezent la " + nrCursuriParticipate + " cursuri!");

        if (nrCursuriParticipate == nrCursuri) {
            System.out.println("Elevul a fost prezent la toate cursurile");
        } else {
            int nrCursuriAbsentate = nrCursuri - nrCursuriParticipate;
            System.out.println("Elevul a fost absent la " + nrCursuriAbsentate + " cursuri");
        }
    }
}
