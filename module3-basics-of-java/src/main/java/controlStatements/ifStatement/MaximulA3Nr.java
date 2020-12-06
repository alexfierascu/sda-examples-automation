package controlStatements.ifStatement;

import java.util.Scanner;

public class MaximulA3Nr {
    public static void main(String[] args) {
        int max;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Dati prima valoare!");
        int primulNumar = scanner1.nextInt();
        System.out.println("Dati a 2a valoare!");
        int alDoileaNumar = scanner1.nextInt();
        System.out.println("Dati a 3a valoare!");
        int alTreileaNumar = scanner1.nextInt();

        if (primulNumar > alDoileaNumar) {
            if (primulNumar > alTreileaNumar) {
                max = primulNumar;
            } else {
                max = alTreileaNumar;
            }
        } else {
            if (alDoileaNumar > alTreileaNumar) {
                max = alDoileaNumar;
            } else {
                max = alTreileaNumar;
            }
        }
        System.out.println("Numarul maxim este " + max);
    }
}
