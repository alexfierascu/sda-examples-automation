package october24.methods;

import java.util.Scanner;

public class ExampleCreateFunctionsAndCallThemInsideMain {

    public static void main(String[] args) {
        int a, b;
        int x = 99, y = 58;

        int variabilaNebuna = 8 + diferentaADouaNumere(x, y);

        System.out.println(sumaADouaNumere(9, 7)); // va returna 16
        int sumaBani = 99 + 8 + 78 + 6 + 89 + 3 + sumaADouaNumere(99, 8);
        System.out.println(sumaBani);
        sumaADouaNumere(56, 98);

        a = citireaUnuiNumarDeLaTastatura();
        b = citireaUnuiNumarDeLaTastatura();
        System.out.println(sumaADouaNumere(a, b));

        sumaPrimelorTreiNumere(99, 89.9, 99);
        sumaPrimelorTreiNumere(462, 13, 99);

        returneazaNumeleMeu();
    }

    //sintaxa declarare metoda/ functie
    //tip_de_data_returnat    nume_metoda (tip_de_data_folosit    nume_variabila,   tip_de_data_folosit    nume_variabila2, ...)
    static int sumaADouaNumere(int primulNumar, int alDoileaNumar) {
        int sumaCelorDouaNumere = primulNumar + alDoileaNumar;
        return sumaCelorDouaNumere;
    }

    static int citireaUnuiNumarDeLaTastatura() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti un numar ");
        int primulNumarCititDeLaTastatura = scanner1.nextInt();
        return primulNumarCititDeLaTastatura;
    }

    static int diferentaADouaNumere(int a, int b) {
        int dif = a - b;
        return dif;
    }

    static double sumaPrimelorTreiNumere(int a, double b, int c) {
        return a + b + c;
    }

    static String returneazaNumeleMeu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele");
        return scanner.nextLine();
    }

}
