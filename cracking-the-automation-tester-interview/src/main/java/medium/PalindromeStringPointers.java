package medium;

import java.util.Scanner;

public class PalindromeStringPointers {
    public static void main(String[] args) {
        System.out.println("Please enter a string that you want to check that is a palindrome");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(isPalindrome(text));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("No word entered");
            return false;
        }
        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
}
