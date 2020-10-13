Feature: Guru99 Login
  Background:
    Given I am on Guru99Login page

    @SS1 @guru99
    Scenario: Verify the login section
      When I enter mngr288458 into username field
      And I enter azebEry into password field
      When I click on login button
      Then I verify that login is successful

  @SS2 @guru99
  Scenario: Verify the login section with invalid User Id
    When I enter orhan into username field
    And I enter azebEry into password field
    When I click on login button
    Then I verify that login is successful

  @SS3 @guru99
  Scenario: Verify the login section with invalid password
    When I enter mngr288458 into username field
    And I enter 5trt into password field
    When I click on login button
    Then I verify that login is successful

  @SS1 @guru99
  Scenario: Verify the login section with invalid User Id and password
    When I enter orhan into username field
    And I enter demirci into password field
    When I click on login button
    Then I verify that login is successful