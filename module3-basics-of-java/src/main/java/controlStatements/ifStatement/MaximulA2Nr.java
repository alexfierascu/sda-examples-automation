package controlStatements.ifStatement;

import java.util.Scanner;

public class MaximulA2Nr {

    public static void main(String[] args) {
        int primulNumar, alDoileaNumar, maximul;

//        primulNumar=99;
//        alDoileaNumar=12764;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati valoarea pt primul numar ");
        primulNumar = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Dati valoarea pt al 2lea numar ");
        alDoileaNumar = scanner2.nextInt();

        if (primulNumar > alDoileaNumar) {
            maximul = primulNumar;
        } else {
            maximul = alDoileaNumar;
        }

        System.out.println("Numarul maxim este " + maximul);
    }
}
