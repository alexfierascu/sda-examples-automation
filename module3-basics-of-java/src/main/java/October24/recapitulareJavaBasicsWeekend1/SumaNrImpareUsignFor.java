package october24.recapitulareJavaBasicsWeekend1;

import java.util.Scanner;

public class SumaNrImpareUsignFor {
    public static void main(String[] args) {
        System.out.println("Program care afiseaza suma cifrelor impare pana la n, n fiind citit de la tastatura");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un nr de la tastatura");
        int nrCititDeLaTastatura = scanner.nextInt();
        int sumaNrImpare = 0;
        for (int i = 1; i <= nrCititDeLaTastatura; i++) {
            if (i % 2 != 0) {
                sumaNrImpare = sumaNrImpare + i;
                //todo - imbunatatit program a.i. imi va calcula suma nr impare pana la un pas dat de mine
                //eg: nrCititTastatura = 198745648; si vreau sa se opreasca cand am gasit primele 31 cifre impare si le-am calculat suma
                //nrCititTastatura = 198745648 = > sumaNrImpare = 1+3+5 + ...... al 31lea nr = ?
            }
        }
        System.out.println("Suma nr impare pana la " + nrCititDeLaTastatura + " este " + sumaNrImpare);

    }
}
