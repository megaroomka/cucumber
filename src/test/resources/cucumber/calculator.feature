Feature: Calculator

  Scenario: Sum two numbers
    Given calculator is open
    When I enter two numbers <num1> and <num2>
    And I click sum
    Then the result should be <num3>

    Examples:
      | num1 | num2 | num3 |
      | 1070 | 1030 | 2100 |
      | 10   | 15   | 25   |
      | 107  | 165  | 272  |

  Scenario Outline: div two numbers
    Given calculator is open
    When I enter two numbers <num1> and <num2>
    And I click div
    Then the result should be <result>

    Examples:
      | num1 | num2 | result |
      | 55   | 15   | 40     |
      | 17   | 13   | 4      |
      | 7    | 3    | 4      |