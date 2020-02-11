Feature: Testing the demo web shop page

  Scenario Outline: User enters Email ID and Password
    Given User opens the allpication
    When User clicks on the log in link
    When User enters "<username>" and "<password>"
    Then User will click on login button
    Then demo Web Shop page will open successfully

Examples:
    | username | password |
    |aravind.guggilla57@gmail.com| aravind |
    |nvr433@gmail.com | navya |
    
    