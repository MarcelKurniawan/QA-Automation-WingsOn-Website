@login
Feature: Edit Profile

  @positive-test
  Scenario: User should be able to update their profile
    Given user is on home page
    And user go to login page
    And user input username with "marcelkurniawan26@gmail.com"
    And user input password with "asdfasdf"
    When user click on login button
    Then user is on homepage
    When user click profile button
    And user click edit profile button
    And user fill fullname with "Marcel Kurniawan"
    And user fill number phone with "087867126669"
    And user click send button
    Then user profile should be updated
