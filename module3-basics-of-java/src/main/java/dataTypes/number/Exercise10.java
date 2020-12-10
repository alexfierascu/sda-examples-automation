package dataTypes.number;

/*
* Check if an Integer is Divisible By Five
Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.

Examples
divisibleByFive(5) ➞ true

divisibleByFive(-55) ➞ true

divisibleByFive(37) ➞ false*/
public class Exercise10 {
    public static void main(String[] args) {
        System.out.println(divisibleByFive(5));
        System.out.println(divisibleByFive(-55));
        System.out.println(divisibleByFive(37));
    }

    public static boolean divisibleByFive(int num) {
        if (num % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
