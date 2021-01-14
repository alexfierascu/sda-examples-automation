package beginner;

import java.util.Scanner;

//https://www.java67.com/2015/10/how-to-print-pyramid-pattern-in-java-example.html
public class PrintingPyramidPattern {
    public static void main(String[] args) {
        System.out.println("Care este inaltimea piramidei pe care doriti sa o printati?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printPyramidPatternWithStars(number);
        printPyramidPatternWithNumbers(number);
    }

    public static void printPyramidPatternWithStars(int pyramidDepth) {
        for (int i = 0; i < pyramidDepth; i++) {
            for (int j = 0; j < pyramidDepth - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramidPatternWithNumbers(int pyramidDepth) {
        for (int i = 0; i < pyramidDepth; i++) {
            for (int j = 0; j < pyramidDepth - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

