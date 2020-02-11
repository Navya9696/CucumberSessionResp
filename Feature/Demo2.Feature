Feature: Testing the demo web shop page

  Scenario: User registration
    Given the login page is opened
    When user clicks on Register Button
    And user will select Female in gender field
    And user enters the Navya as the First Name
    And user enter Ravi as the Last Name
    And user enters avfc@gmail.com as Email ID
    And user enters teraserd as Password
    And user enters teraserd as Confirm Password
    Then user clicks on Register
    Then user will be registered successfully
