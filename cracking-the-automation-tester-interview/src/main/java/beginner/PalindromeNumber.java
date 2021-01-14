package beginner;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Ce numar doriti sa verificati daca este palindrom?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isPalindrome(number);
    }

    public static void isPalindrome(int numarulMeu) {
        int nrInitial = numarulMeu;
        int nrInversat = 0;
        int ultimaCifra = 0;

        if (numarulMeu < 10) {
            System.out.println("Numarul are o singura cifra! " +
                    "\nRulati programul pentru un nr cu cel putin 2 cifre");
        } else {
            while (numarulMeu != 0) {
                ultimaCifra = numarulMeu % 10;
                numarulMeu = numarulMeu / 10;
                nrInversat = nrInversat * 10 + ultimaCifra;
            }
            if (nrInitial == nrInversat) {
                System.out.println("Numarul " + nrInitial + " este palindrom");
            } else {
                System.out.println("Numarul " + nrInitial + " nu este palindrom");
            }

        }
    }
}
