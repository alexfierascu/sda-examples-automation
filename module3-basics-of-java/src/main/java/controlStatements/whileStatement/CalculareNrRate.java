package controlStatements.whileStatement;

import java.util.Scanner;

public class CalculareNrRate {
    public static void main(String[] args) {
        System.out.println("Program care imi calculeaza nr de rate ramase");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati suma de bani pe care vreti sa o imprumutati");
        int sumaDeBaniCititaDeLaTastatura = scanner.nextInt();
        int sumaDeBaniIntrodusaInitial = sumaDeBaniCititaDeLaTastatura;

        int rataBancaraLunara = 157;

        int nrRateDePlatit = 0;

        while (sumaDeBaniCititaDeLaTastatura >= 0) {
            nrRateDePlatit++;
            sumaDeBaniCititaDeLaTastatura = sumaDeBaniCititaDeLaTastatura - rataBancaraLunara;
        }
        System.out.println("Voi rambursa suma " + sumaDeBaniIntrodusaInitial +
                " RON in " + nrRateDePlatit + " luni");
    }
}
