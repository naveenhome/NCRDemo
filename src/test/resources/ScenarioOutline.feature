Feature: Test

  @Regression
  Scenario Outline: Regression Test
    Given user enter <product>
    And enter <qty>
    When Select <operation>
    Then System display <total>

    Examples: 
      | product  | qty | operation | total |
      | "apple"  | 5   | "Add"     | 500   |
      | "Orange" | 15  | "Add"     | 600   |
      | "Banana" | 5   | "Add"     | 300   |
