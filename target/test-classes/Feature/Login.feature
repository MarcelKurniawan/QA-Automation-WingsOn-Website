@login
Feature: Login

  @positive-test
  Scenario: Login with valid email and password
    Given user is on home page
    And user go to login page
    And user input username with "marcelkurniawan26@gmail.com"
    And user input password with "asdfasdf"
    When user click on login button
    Then user is on homepage

  @negative-test
  Scenario: Login with invalid email and password
    Given user is on home page
    And user go to login page
    And user input username with "asdasd@gmail.com"
    And user input password with "wq4ehjgjh"
    When user click on login button
    Then user is able to see error message