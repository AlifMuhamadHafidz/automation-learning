Feature: Autoexercise Web - Register Page


  @Positive
  Scenario Outline: Register a new user
    Given User already access the Autoexercise Web
    When User validate that the homepage is visible successfully
    And click on Signup or Login Button
    And User input name "<Name>"
    And User input email "<Email>"
    And User click on Signup Button
    And User choose the "<Salutation>" radio button
    And User input password "<Password>"
    And User selects the day of birth as "<Day>"
    And User selects the month of birth as "<Month>"
    And User selects the year of birth as "<Year>"
    And User input first name "<FirstName>"
    And User input last name "<LastName>"
    And User input address "<Address>"
    And User selects the country as "<Country>"
    And User input state "<State>"
    And User input city "<City>"
    And User input zip code "<ZipCode>"
    And User input phone number "<PhoneNumber>"
    And User click on create account button
    And User should be presented with a successful create account message
    And User click on continue button
    And User verify login as their username is visible
    And User click delete account button
    And User verify their account been deleted
    And User click on another continue button
    Then User should be presented with a homepage

    Examples:
      | Name        | Email            | Salutation | Password | Day | Month    | Year | FirstName | LastName | Address | Country | State | City | ZipCode | PhoneNumber |
      | Testing Aje | testaje@mail.com | Mr.        | testaje1 | 12  | January  | 2002 | Testing   | Aje      | IDN     | Canada  | dtw   | wtd  | 1234    | 9999        |
      | Aje Testing | ajetest@mail.com | Mrs.       | ajetest1 | 13  | February | 2003 | Aje       | Testing  | NDI     | Canada  | dtw   | wtd  | 1234    | 8888        |

  @Negative
  Scenario: Register with existing email
    Given User already access the Autoexercise Web
    When User validate that the homepage is visible successfully
    And click on Signup or Login Button
    And User input name "testing"
    And User input email "dummy1@mail.com"
    And User click on Signup Button
    Then User should see the email Address already exist! warning







