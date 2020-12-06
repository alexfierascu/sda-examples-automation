package october24.methods;

import java.util.Scanner;

public class OperatiiMatematice {
    public static void main(String[] args) {
        int a = 99, b = 100;
        int rezultat = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti operatie matematica");
        String operatieMatematica = scanner.nextLine();

        switch (operatieMatematica) {
            case "adunare": {
                rezultat = suma(a, b);
                break;
            }
            case "scadere": {
                rezultat = scadere(a, b);
                break;
            }
            case "inmultire": {
                rezultat = inmultire(a, b);
                break;
            }
            case "impartire": {
                rezultat = impartire(a, b);
                break;
            }
            case "cat": {
                rezultat = aflaCat(a, b);
                break;
            }
            default: {
                System.out.println("operatia nu este valida");
                break;
            }

        }
        System.out.println("Rezultatul operatiei de " + operatieMatematica + " este " + rezultat);
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static int scadere(int a, int b) {
        return a - b;
    }

    static int inmultire(int a, int b) {
        return a * b;
    }

    static int impartire(int a, int b) {
        return a / b;
    }

    static int aflaCat(int a, int b) {
        return a % b;
    }
}
