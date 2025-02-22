Feature: Meesho Test

Scenario Outline: User Successfully logged in Meesho App

Given user launch meesho app as per the given URL
Then  user land meesho app home page
When user click profile button from right corner
Then verify sign-up button enabled
When user click sign-up button and redirect to sign-up page
Then user confirm land sign-up page
When user enter valid "<phonenumber>"
And  click continue button

Examples:
|phonenumber|
|6381121156|
