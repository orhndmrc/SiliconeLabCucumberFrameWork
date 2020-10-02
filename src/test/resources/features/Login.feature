@web

Feature: Login Facebook Page

  Background:
    Given I am on LoginPage

    @login
    Scenario Outline: Verify invalid login for multiplre users
      When I enter <username> into username text field on home screen
      And I enter <password> into password text field on home screen
      And I click on login button on home screen
      Then I verify that I am on invalid login page

      Examples:
      | username         | password |
      |orhan@outlook.com | test123  |
      |john@gmail.com    | abc@123  |
      |miciP@yahoo.com    |i5i5gti   |
