package beginner;

public class ChangeValuesOfTwoNumbers {
    public static void main(String[] args) {

        changeValuesOfTwoNumbersUsingAuxiliaryNumber(9, 8);
        changeValuesOfTwoNumbersUsingMathematicalOperationsOfSumAndSubstraction(10, 11);
        changeValuesOfTwoNumbersUsingMathematicalOperationsOfMultiplyAndDivision(99, 100);
    }


    static void changeValuesOfTwoNumbersUsingAuxiliaryNumber(int firstNumber, int secondNumber) {

        System.out.println("----------");
        System.out.println("----------");
        int auxiliaryNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = auxiliaryNumber;

        System.out.println("First number after swapping is " + firstNumber);
        System.out.println("Second number after swapping is " + secondNumber);
    }


    static void changeValuesOfTwoNumbersUsingMathematicalOperationsOfSumAndSubstraction(int firstNumber, int secondNumber) {

        System.out.println("----------");
        System.out.println("----------");
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("First number after swapping is " + firstNumber);
        System.out.println("Second number after swapping is " + secondNumber);
    }

    static void changeValuesOfTwoNumbersUsingMathematicalOperationsOfMultiplyAndDivision(int firstNumber, int secondNumber) {

        System.out.println("----------");
        System.out.println("----------");
        firstNumber = firstNumber * secondNumber;
        secondNumber = firstNumber / secondNumber;
        firstNumber = firstNumber / secondNumber;

        System.out.println("First number after swapping is " + firstNumber);
        System.out.println("Second number after swapping is " + secondNumber);
    }
}
