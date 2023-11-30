Feature: Sign In

  @Positive
  Scenario Outline: Login with valid account
    Given User already access the Autoexercise Website
    When User verify that the homepage is visible successfully
    And User click on Signup or Login Button
    And User verify that login to your account page is visible
    And User input email "<Email>" and password "<Password>"
    And User click on login button
    And User verify login as their username is visible
    And User click on delete account button
    Then User should be presented with account deleted page is visible

    Examples:
      | Email            | Password |
      | testaje@mail.com | testaje1 |

    @Negative
    Scenario Outline: Login with invalid account
      Given User already access the Autoexercise Web
      When User verify that the homepage is visible successfully
      And User click on Signup or Login Button
      And User verify that login to your account page is visible
      And User input email "<Email>" and password "<Password>"
      And User click on login button
      Then User should see the your email or password is incorrect! warning

      Examples:
        | Email             | Password   |
        | salahwoi@mail.com | testaje123 |
