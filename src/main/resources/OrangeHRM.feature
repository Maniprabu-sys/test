@LoginPage_Valid
Feature: this test to Orange HRM App test
Scenario Outline: Orange HRM Scenario
Given user launch app URL
Then verify the URL
When user enter creadentials "<username>" and "<password>"
Then user clicks login button

Examples:

|username | password|
|Admin|admin123|
