package beginner;

import java.util.Scanner;

public class ReverseOfAString {
    public static void main(String[] args) {
        System.out.println("Ce cuvant doriti sa inversati?");
        Scanner scanner = new Scanner(System.in);
        String keyboardString = scanner.nextLine();
        System.out.println("Cuvantul " + keyboardString + " rasturnat este " + reverseString(keyboardString));
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
}
