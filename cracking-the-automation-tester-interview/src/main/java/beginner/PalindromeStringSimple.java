package beginner;

import java.util.Scanner;
//https://www.geeksforgeeks.org/reverse-a-string-in-java/

public class PalindromeStringSimple {
    public static void main(String[] args) {
        System.out.println("Ce cuvant doriti sa verificati daca este palindrom?");
        Scanner scanner = new Scanner(System.in);
        String keyboardString = scanner.nextLine();
        isTheStringAPalindrome(keyboardString);
    }

    public static String reverseString(String initialString) {
        if (initialString == null || initialString.isEmpty()) {
            System.out.println("Nu ati introdus niciun cuvant");
            return null;
        }

        String reversedString = "";
        char[] initialStringToCharArray = initialString.toCharArray();

        for (int i = initialStringToCharArray.length - 1; i >= 0; i--) {
            //System.out.print(try1[i]);
            reversedString += initialStringToCharArray[i];
        }
        return reversedString;
    }

    public static String reverseStringMethod2(String initialString) {
        if (initialString == null || initialString.isEmpty()) {
            System.out.println("Nu ati introdus niciun cuvant");
            return null;
        }

        String reversedString = "";
        for (int i = initialString.length() - 1; i >= 0; i--) {
            reversedString += initialString.charAt(i);
        }

        return reversedString;
    }

    public static void isTheStringAPalindrome(String text) {
        if (text.isEmpty() || text == null) {
            System.out.println("Impossible to detect if it's a palindrome!");
        } else {
            String reversedString = reverseString(text);
            if (text.equals(reversedString)) {
                System.out.println("Cuvantul introdus este palindrom");
            } else {
                System.out.println("Cuvantul introdus nu este palindrom");
            }
        }
    }
}
