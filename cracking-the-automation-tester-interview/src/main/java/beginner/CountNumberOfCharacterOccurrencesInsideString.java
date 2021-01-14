package beginner;

import java.util.Scanner;

public class CountNumberOfCharacterOccurrencesInsideString {
    public static void main(String[] args) {
        System.out.println("Program that displays the number of occurrences of a character inside a string ");
        System.out.println("Dati cuvantul in care doriti sa cautati");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Dati litera pe care vreti sa o cautati in cuvant");
        Scanner scanner2 = new Scanner(System.in);
        char character = scanner2.next().charAt(0);
        System.out.println(countChar(word, character));
    }

    public static int countChar(String searchedString, char searchedCharacter) {
        int counter = 0;

        for (int i = 0; i < searchedString.length(); i++) {
            if (searchedString.charAt(i) == searchedCharacter)
                counter++;
        }
        return counter;
    }
}
