import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.CalculatorOperation;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorStepImplementation {
    int a, b;

    @Given("^I have a first number (.*)$")
    public void m1(int firstNumber) {
        a = firstNumber;
    }

    @When("^I add a second number (.*) to it$")
    public void m2(int secondNumber) {
        b = secondNumber;
    }

    @Then("^sum of the numbers is (.*)$")
    public void m3(int sumOfNumbers) {
        assertEquals(CalculatorOperation.sum(a, b), sumOfNumbers);
    }

    @When("^I subtract a second number (.*) to it$")
    public void iSubtractASecondNumberSecondNumberToIt(int secondNumber) {
        b = secondNumber;
    }

    @Then("^the difference of the numbers is (.*)$")
    public void theDifferenceOfTheNumbersIsDifference(int value) {
        assertEquals(CalculatorOperation.difference(a, b), value);
    }
}
