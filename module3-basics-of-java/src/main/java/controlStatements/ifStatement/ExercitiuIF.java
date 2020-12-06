package controlStatements.ifStatement;

import java.util.Scanner;

public class ExercitiuIF {

    public static void main(String[] args) {
        int sumaPortofel;
        double temperatura;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati valoarea din portofel ");
        sumaPortofel = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Dati temperatura de afara ");
        temperatura = scanner2.nextDouble();

        if (sumaPortofel > 50) {
            if (temperatura > 15) {
                System.out.println("Iesi afara la plimbare!!!");
            } else {
                System.out.println("Stai in casa!!!");
            }
        } else {
            System.out.println("Stai in casa!!!");
        }

    }
}
