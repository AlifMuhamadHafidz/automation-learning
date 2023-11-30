Feature: Logout

  Scenario Outline: User Logout
    Given User already access Autoexercise web
    When User verify that the homepage is visible successfully
    And User click on Signup or Login Button
    And User verify that login to your account page is visible
    And User input email "<Email>" and password "<Password>"
    And User click on login button
    And User verify login as their username is visible
    And User click logout button
    Then User should navigate back to login page

    Examples:
      | Email           | Password |
      | dummy1@mail.com | 123      |
