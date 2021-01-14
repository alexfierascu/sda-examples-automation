package medium;

import java.util.Scanner;

//https://www.programiz.com/java-programming/examples/armstrong-number
//https://mathworld.wolfram.com/NarcissisticNumber.html
public class ArmstrongNumberNDigits {
    public static void main(String[] args) {
        System.out.println("Ce numar doriti sa verificati daca este un nr Armstrong?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkIfNumberRepresentsArmstrongNumber(number);
    }

    public static void checkIfNumberRepresentsArmstrongNumber(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (; originalNumber != 0; originalNumber /= 10, ++n) ;

        originalNumber = number;

        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
