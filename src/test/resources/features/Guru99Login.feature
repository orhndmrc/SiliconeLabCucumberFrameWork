Feature: Guru99 Login
  Background:
    Given I am on Guru99LoginPage
 @SS1 @guru99
    Scenario: Verify the Login Section
      When I enter mngr288458 into username section
      And I enter azebEry into password section
      And I click on login button
      Then I verify the title of HomePage