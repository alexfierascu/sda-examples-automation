package controlStatements.switchStatement;

import java.util.Scanner;

public class SwitchCaseControlFlow {
    public static void main(String[] args) {
        System.out.println("Program de iti spune daca poti vota sau nu");

        System.out.println("Introduceti varsta dvoastra, drag alegator!");
        Scanner scanner = new Scanner(System.in);
        int varsta = scanner.nextInt();

        int varstaElev = 9;


        switch (varsta) {
            case 16:
                System.out.println("Nu poti vota, mai du-te si manancan mamaliga 2 ani!");
                break;
            case 18:
                System.out.println("Poti vota, pregateste-ti buletinul!");
                break;
            case 25:
                System.out.println("Bravo tinere ca ai venit la vot!");
                break;
            case 64:
                System.out.println("Inca putin si nu mai ai dreptul la vot! Fa macar acum o schimbare!");
                break;
            case 65:
                System.out.println("Poate intr-o alta veata!");
                break;
            case 70:
                System.out.println("Ne pare rau, perioada de gratie a expirat!");
                break;
            default:
                System.out.println("Nu este o varsta valida");
                break;
        }
    }
}
