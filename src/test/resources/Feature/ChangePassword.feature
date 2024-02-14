@change-password
Feature: Change Password

  @positive-test
  Scenario: User should be able to update their password
    Given user is on home page
    And user go to login page
    And user input username with "marcelkurniawan26@gmail.com"
    And user input password with "asdfasdf"
    When user click on login button
    Then user is on homepage
    When user click accounts button
    And user click change password button
    And user fill password form with "asdfasdf", "asdfasdf", "asdfasdf"
    And user click send button
    Then user password should be updated
