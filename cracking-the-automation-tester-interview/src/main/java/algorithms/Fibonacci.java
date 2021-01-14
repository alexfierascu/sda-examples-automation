package algorithms;

import java.util.Scanner;

//https://dev.to/khalilsaboor/fibonacci-recursion-vs-iteration--474l
//https://en.wikipedia.org/wiki/Golden_ratio#Relationship_to_Fibonacci_sequence
//https://www.guru99.com/fibonacci-series-java.html
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Cate numere din secventa fibonacci doriti sa generati?");
        Scanner scanner = new Scanner(System.in);
        int sequenceNumber = scanner.nextInt();
        //        nr=0 ->0
        //        nr=1 ->1
        //        nr=2 ->1
        //        nr=3 ->2
        //        nr=4 ->3
        //        nr=5 ->5
        //        nr=6 ->8
        System.out.println("Fibonacci recursiv");
        for (int i = 0; i < sequenceNumber; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println("\n\nFibonacci iterativ");
        for (int i = 0; i < sequenceNumber; i++) {
            System.out.print(fibonacciIterative(i) + " ");
        }
        System.out.println("\n\nFibonacci starting with double 0");
        for (int i = 0; i < sequenceNumber; i++) {
            System.out.print(fibonacciStartingWithDouble0IterativeWay(i) + " ");
        }

        System.out.println("Show value for the " + sequenceNumber + " Fibonacci number!");
        System.out.print(fibonacciRecursive(sequenceNumber) + " ");
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fibonacci = 1;
        int prevFibonacci = 1;

        for (int i = 2; i < n; i++) {
            int temp = fibonacci;
            fibonacci += prevFibonacci;
            prevFibonacci = temp;
        }
        return fibonacci;
    }

    static int fibonacciStartingWithDouble0IterativeWay(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        int prevPrev = 0;
        int prev = 1;
        int currentNumber = 0;
        for (int i = 2; i < n; i++) {
            currentNumber = prevPrev + prev;
            prevPrev = prev;
            prev = currentNumber;
        }
        return currentNumber;
    }
}
