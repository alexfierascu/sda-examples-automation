package algorithms;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Ce numar doriti sa verificati daca este prim?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isTheNumberAPrimeNumber(number)) {
            System.out.println("Numarul " + number + " este un nr prim!");
        } else {
            System.out.println("Numarul " + number + " nu este un nr prim!");
        }

        if (isAPrimeNumberImprovedVersion(number)) {
            System.out.println("Numarul " + number + " este un nr prim!");
        } else {
            System.out.println("Numarul " + number + " nu este un nr prim!");
        }

    }

    public static boolean isTheNumberAPrimeNumber(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) { // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

    public static boolean isAPrimeNumberImprovedVersion(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
