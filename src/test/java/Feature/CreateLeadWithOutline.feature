Feature: Create Lead
Scenario Outline: Login into LeafTaps
Given Invoke LeafTap application
And Enter the UserName as <userName>
And Enter the PassWord as <Password>
And Click on Login button
And Select CRM/SFA
And Select Create Lead button
And Enter CompanyName as <Company>
And Enter First Name as <FirstName>
And Enter Last Name as <LastName>
And Click on Create Lead button
Then Verify lead created successfully
Examples:
|userName|Password|Company|FirstName|LastName|
|DemoSalesManager|crmsfa|IBM|Dheeraj|Wagdre|
|DemoCSR|crmsfa|IBM|Devesh|Bhardwaj|
