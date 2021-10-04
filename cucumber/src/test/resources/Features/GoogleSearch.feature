Feature: to open a specific browser

 Scenario:
   Given browser is open
   And user is on the browser
   When  enters the text in search bar
   And clicks on enter 
   Then user is navigated to the search page
   And navigae to about us
   