@notification
  Feature: Open Notification Bell

    @positive-test
    Scenario: User should be able to see message in notification
      Given user is on home page
      And user go to login page
      And user input username with "marcelkurniawan26@gmail.com"
      And user input password with "asdfasdf"
      When user click on login button
      Then user is on home page
      When user click notification button
      Then user is on notification page
