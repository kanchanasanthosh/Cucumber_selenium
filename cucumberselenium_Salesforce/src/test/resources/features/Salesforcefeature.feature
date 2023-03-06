Feature: login functionality
@test
Scenario: login with valid  credentials
Given application is up and running and in loginpage
When user enters username "bhc.bishophebercollege-pr27@force.com"
And  user enters password "palgar311"
And click on the login button
Then user should get the new home page
And check the title of the page "Salesforce - Essentials Edition"



Scenario: Error message should be displayed

Given application is up and running and in loginpage
When user enters username "bhc.bishophebercollege-pr27@force.com"
And user enters null password " "
And click on the login button
Then Error message get displayed


Scenario: check remember me functionality
Given application is up and running and in loginpage
When user enters username "bhc.bishophebercollege-pr27@force.com"
And  user enters password "palgar311"
Then Remember me checkbox checked 
And click on the login button
Then user should get the new home page
And check the title of the page "Salesforce - Essentials Edition"
Then Logout from the application 
Given application is up and running and in loginpage
Then check usename field for username 


Scenario: Test forgot password
Given application is up and running and in loginpage
When click on the Forgot ypur password link
Then user should get the forgot your password page
And user provides username "bhc.bishophebercollege-zhkb@force.com"


Scenario: Validate Login error message
Given application is up and running and in loginpage
When user provides invalid username "123"
And user provides invalid password "22131"
When click on the login button
Then error message displayed in the loginpage