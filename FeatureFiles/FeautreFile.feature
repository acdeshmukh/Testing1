Feature: Smoke Test By Anand D

  Background: 
    Given Finance Portal is open

  @Scenario1
  Scenario Outline: To add comments in commentry==>1
    When AuraRole <user> add <comments>
    Then Comments must get added on report
    And Check th para:
      """
      public interface JavascriptExecutor
      """

    Examples: 
      | user       | comments  |
      #     | username 1 | password1 |
      | username 2 | password2 |
