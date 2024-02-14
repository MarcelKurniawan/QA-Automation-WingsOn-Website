@logout
Feature: Logout

  @positive-test
  Scenario: User can logout from their account
    Given user is on home page
    And user go to login page
    And user input username with "marcelkurniawan26@gmail.com"
    And user input password with "asdfasdf"
    When user click on login button
    Then user is on homepage
    And user click the account button
    When user click the logout button
    And user is able to see Alert popup : Apakah anda yakin ingin logout?
    And user click Ya on the Alert popup
    Then user able to see login button
