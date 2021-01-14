package algorithms;

import java.util.Scanner;

//https://www.javatpoint.com/armstrong-number-in-java
//http://gandirelogica.blogspot.com/2012/03/numere-narcisiste.html
//https://www.programiz.com/java-programming/examples/armstrong-number
public class ArmstrongNumberMax3Digits {
    public static void main(String[] args) {
        System.out.println("Ce numar doriti sa verificati daca este un nr Armstrong?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkIfNumberRepresentsArmstrongNumber(number);
    }

    public static void checkIfNumberRepresentsArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number!");
        else
            System.out.println(number + " is not an Armstrong number!");

    }
}
