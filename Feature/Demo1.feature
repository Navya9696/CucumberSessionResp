Feature: Testing the demo web shop page

  Scenario: User enters Email ID and Password
    Given the login page is opened
    When user enters aravind.guggilla57@gmail.com as Email ID
    And user enter aravind as Password
    Then user will click on login button
    Then Demo Web Shop page will open successfully
