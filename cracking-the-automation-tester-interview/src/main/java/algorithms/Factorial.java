package algorithms;

import java.util.Scanner;

//https://www.calculatorsoup.com/calculators/discretemathematics/factorials.php
//https://javarevisited.blogspot.com/2012/04/java-program-to-find-factorial-of.html#axzz6jWw6KFNf
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Pentru ce numar doriti sa generati factorial?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Folosind functia recursiva rezultatul este " + factorialRecursive(number));

        System.out.println("Folosind functia iterativa rezultatul este " + factorialIterative(number));

    }

    public static int factorialRecursive(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorialRecursive(number - 1);
    }

    public static int factorialIterative(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int result = 1;
        while (number != 0) {
            result *= number;
            number--;
        }
        return result;
    }

    public static int factorialIterativeV2(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        int rezultat = 1;
        for (int i = number; i > 0; i--) {
            rezultat = rezultat * i;
        }
        return rezultat;
    }
}
