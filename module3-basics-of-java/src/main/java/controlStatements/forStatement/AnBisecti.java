package controlStatements.forStatement;

import java.util.Scanner;

public class AnBisecti {

    public static void main(String[] args) {
        System.out.println("Introduceti anul");
        Scanner scanner = new Scanner(System.in);
        int anulCurent = scanner.nextInt();


        for (int contor = 1; contor <= anulCurent; contor++) {

            //verificare daca anul este an bisect
            if ((contor % 4 == 0) && (contor % 100 != 0) || (contor % 400 == 0)) {
                System.out.println("Anul " + contor + " a fost un an bisect!");
            }
        }
    }
}
