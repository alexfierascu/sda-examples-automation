Feature: simple basic calculator

  Scenario Outline: Two numbers can be added
    Given I have a first number <firstNumber>
    When I add a second number <secondNumber> to it
    Then  sum of the numbers is <sum>
    Examples:
      | firstNumber | secondNumber | sum |
      | 25          | 2            | 27  |
      | 0           | 1            | 1   |
      | -20         | -0           | -20 |
      | -20         | 50           | 30  |

  Scenario Outline: Two numbers can be subtracted
    Given I have a first number <firstNumber>
    When I subtract a second number <secondNumber> to it
    Then  the difference of the numbers is <difference>
    Examples:
      | firstNumber | secondNumber | difference |
      | 25          | 2            | 23         |
      | 0           | 1            | -1         |
      | -20         | -0           | -20        |
      | -20         | 50           | -70        |

  Scenario Outline: Calculator Operations with two numbers
    Given I have number <firstNumber> and number <secondNumber>
    When I apply the <operation> operation
    Then  the value should be <result>
    Examples:
      | firstNumber | secondNumber | operation | result |
      | 25          | 2            | add       | 27     |
      | 0           | 1            | subtract  | -1     |
      | -20         | -0           | multiply  | 0      |
      | -60         | 30           | divide    | -2     |