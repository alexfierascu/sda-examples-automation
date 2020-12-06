package controlStatements.ifStatement;

import java.util.Scanner;

public class ExercitiuIF2 {
    public static void main(String[] args) {
        System.out.println("S-au copt strugurii?");
        String mesaj1 = "Vom bea vin";
        String mesaj2 = "Vom bea apa";

        String sauCoptStrugurii;
        boolean conditieCititaDeLaTastatura;

        Scanner scanner = new Scanner(System.in);
        sauCoptStrugurii = scanner.nextLine().toLowerCase();

        System.out.println("Dati conditia pentru citirea de la tastatura! (acceptat true/false)");
        Scanner scanner1 = new Scanner(System.in);
        conditieCititaDeLaTastatura = scanner1.nextBoolean();
        //        if (sauCoptStrugurii.equals("da") || sauCoptStrugurii.equals("DA") || sauCoptStrugurii.equals("Da")) {
//            System.out.println(mesaj1);
//        } else {
//            System.out.println(mesaj2);
//        }
        if (sauCoptStrugurii.equals("da") && conditieCititaDeLaTastatura) {
            System.out.println(mesaj1);
        } else {
            System.out.println(mesaj2);
        }
    }
}
