#this is how you specify comments

Feature: feature to test login functionality
  #using of tags helps us to execute teh specific secnario or feature
  @smoketest #this is a tag assigned to a scenario you can also do it for feature
  Scenario: check login is successful on proper credentials
    Given user is on login page
    When user enters username and password
    And click on submit
    Then user is navigated to home page
    
