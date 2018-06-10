Feature: Create Lead
Scenario: Login into LeafTaps
Given Invoke LeafTap application
And Enter the UserName as DemoSalesManager
And Enter the PassWord as crmsfa
And Click on Login button
And Select CRM/SFA
And Select Create Lead button
And Enter CompanyName as IBM
And Enter First Name as Dheeraj
And Enter Last Name as Wagdre
And Click on Create Lead button
Then Verify lead created successfully