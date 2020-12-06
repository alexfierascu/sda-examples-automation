package controlStatements.ifStatement;

import java.util.Scanner;

public class ProgramVot {

    public static void main(String[] args) {
        System.out.println("--Program de iti spune daca poti vota sau nu--");

        System.out.println("Introduceti varsta dvoastra, drag alegator!");
        Scanner scanner = new Scanner(System.in);
        int varsta = scanner.nextInt();

        if (varsta < 18) {
            System.out.println("Nu poti vota");
        }
        if (varsta >= 18 && varsta <= 65) {
            System.out.println("Bravo cetatene!");
        }
        if (varsta > 65) {
            System.out.println("Ne pare rau, perioada de gratie a expirat!");
        }
    }
}
