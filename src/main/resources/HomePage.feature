Feature: Orange HRM test

Scenario Outline:
 
Given User launch browser
When user enters credentials "<username>" and "<password>" 
Then user clicks login button
Then user lands home page
Given User lands home page with proper login
When User clicks admin in homePage
Then user land user creation page
When user click Add User button on user creation page
Then user can able to see admin creation from
#When User entered all required fields input as select employee role, employee status, "<employeNmae>", "<roleUserName>" , "<userPassword>", "<confirmUserPassword>"
#Then User clicks save button
#And Verify successfull toast message

Examples:
| username | password  | employeeName | roleUserName | userPassword    | confirmUserPassword |
  | Admin    | admin123  | Ravi M B     | Ravi@123     | Maniprabu11@95  | Maniprabu11@95      |



