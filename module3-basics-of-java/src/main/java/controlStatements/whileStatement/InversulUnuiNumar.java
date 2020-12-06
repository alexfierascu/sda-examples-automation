package controlStatements.whileStatement;

import java.util.Scanner;

public class InversulUnuiNumar {

    /**
     * numar citit de la tastatura = 981
     * inversul numarului citit de la tastatura = 189
     * 981 = 9*100 + 8*10 + 1
     * 981 = 9*10^2 + 8*10^1 + 1*10^0
     * 189 = 1*10^2 + 8*10^1 + 9*10^0
     * <p>
     * 12 = 1*10 + 2
     * 981 % 10 = 1
     * 235679532 % 10 = 2
     * <p>
     * ultima cifra = nr % 10
     * <p>
     * 981 / 10 = 98
     * 5763278856932523 / 10 = 576327885693252 (/3)
     * <p>
     * <p>
     * nr = 9817
     * inversulNr = 0
     * <p>
     * ultimaCifra = nr % 10
     * inversulNr = inversulNr * 10
     * inversulNr = inversulNr + ultimaCifra
     * <p>
     * nr = nr / 10
     * <p>
     * <p>
     * nr = 123
     * inversulNr = 0
     * <p>
     * Pasul 1 - ultimaCifra = 123 % 10 = 3
     * inversulNr = inversulNr * 10 = 0 * 10 = 0
     * inversulNr = inversulNr + ultimaCifra = 0 + 3 = 3
     * nr = nr / 10 = 123 / 10 = 12
     * <p>
     * Pasul 2 - ultimaCifra = nr % 10 = 12 % 10 = 2
     * inversulNr = inversulNr * 10 = 3 * 10 = 30
     * inversulNr = inversulNr + ultimaCifra = 30 + 2 = 32
     * nr = nr / 10 = 12 /10 = 1
     * <p>
     * Pasul 3 - ultimaCifra = nr % 10 = 1 % 10 = 1
     * *           inversulNr = inversulNr * 10 = 32 * 10 = 320
     * *           inversulNr = inversulNr + ultimaCifra = 320 + 1 = 321
     * *           nr = nr / 10 = 1 /10 = 0
     * <p>
     * Pasul 4 - ultimaCifra = nr % 10 = 0 % 10 = 0
     * inversulNr= inversulNr * 10 = 321 * 10 =3210
     * inversulNr = inversulNr + ultim
     */

    public static void main(String[] args) {


        System.out.println("Program care calculeaza inversul unui numar");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar de la tastatura!");
        int nrCititDeLaTastatura = scanner.nextInt();

        int ultimaCifra, inversulNumarului = 0;


        int numarulInitial = nrCititDeLaTastatura;


        while (nrCititDeLaTastatura != 0) {
            ultimaCifra = nrCititDeLaTastatura % 10;
            inversulNumarului = inversulNumarului * 10 + ultimaCifra;
            nrCititDeLaTastatura = nrCititDeLaTastatura / 10;
        }

        System.out.println("Inversul numarului " + numarulInitial + " este: " + inversulNumarului);
    }
}
