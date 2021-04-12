Feature: Register feature

Background: Start driver
Given driver is called

Scenario: positive login 
Given user is on login page
When user enters credentials
|fname|Roshni|
|lname|Roshni@123|
|address|Nerul|
|emailaddress|Roshni@gmail.com|
|phone|1234567890|
|gender|Female|
|hobbies|Hockey|
|country|India|
And user clicks on submit button
Then user is on the home page