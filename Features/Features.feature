@Main
Feature: Login Action
Test login Fucntionaltiy
@scene1
Scenario Outline: Successfull login with valid credentials
Given navigate to homepage
When user enter the username and password"<username>" "<password>"
Then message login successfully
Examples:
|username|password|
|Laltiha|Password123|
|Rick|Rick123|
|Andrew|Andrew123|