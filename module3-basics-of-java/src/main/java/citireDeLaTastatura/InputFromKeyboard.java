package citireDeLaTastatura;

import java.util.Scanner;

public class InputFromKeyboard {

    public static void main(String[] args) {
        int numarCititDeLaTastatura;

        System.out.println("Introduceti un nr de la tastatura!");
        Scanner scanner = new Scanner(System.in);

        numarCititDeLaTastatura = scanner.nextInt();

        System.out.println("Numarul citit de la tastatura este " +
                numarCititDeLaTastatura);
    }
}
