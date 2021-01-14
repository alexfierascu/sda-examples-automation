package medium;

//sieve of Eratosthenes - ciurul lui eratostene (https://www.youtube.com/watch?v=CaLHff59uo0&ab_channel=MathRomania)
//https://ro.wikipedia.org/wiki/Ciurul_lui_Eratostene

import java.util.Scanner;

public class PrimeNumberEratosthenes {

    public static void main(String[] args) {
        System.out.println("Pana la ce numar doriti sa generati numere prime?");
        Scanner scanner = new Scanner(System.in);
        int sequenceNumber = scanner.nextInt();
        sieveOfEratosthenes(sequenceNumber);
    }

    public static void sieveOfEratosthenes(int n) {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
}
