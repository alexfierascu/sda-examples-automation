package beginner;

import java.util.Scanner;

/*
Write a function called FooBar
that takes input integer n
and prints all the numbers from 1 up to n in a new line.
If the number is divisible by 3 then print "Foo",
if the number is divisible by 5 then print "Bar"
and if the number is divisible by both 3 and 5, print "FooBar".
Otherwise just print the number.
 */

public class FooBarExercise {
    public static void main(String[] args) {
        System.out.println("Introduceti un numar!");
        Scanner scanner = new Scanner(System.in);
        int numarTastatura = scanner.nextInt();
        fooBar(numarTastatura);
    }

    public static void fooBar(int n) {
        if (n == 0) {
            System.out.println("Numarul de la tastatura este 0");
        }
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("foobar");
                } else {
                    if (i % 3 == 0) {
                        System.out.println("foo");
                    } else {
                        if (i % 5 == 0) {
                            System.out.println("bar");
                        } else {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
        //todo - for a negative number
    }
}