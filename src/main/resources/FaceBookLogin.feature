Feature: This test for facebook application

Scenario Outline: Perform facebook testing in cucumber

Given user launch facebook URL
Then user enter valid credentials as "<username>" and "<password>"
Then click login button
And user navigate to homePage


Examples:

| username | password |
| Maniprabu11 | Maniprabu11@95 |