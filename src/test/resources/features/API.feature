#API Scenario – Practical Test

#Note: You have 15 minutes to complete this scenario
#In the test we require you to demonstrate the following automation practices:
#Usage of Feature Files
#Java Classes
#Automation Best practices
#Test Execution & Reporting

#Automation Tool Recommendation:
#Selenium
#Rest Assured
#Cucumber

#Endpoint: http://universities.hipolabs.com/search?country=South+Africa

#Return the value of “state province” where name is the University of Witwatersrand
  @TEST02
Feature: API

    Scenario: API Test
      Given A header
      When  Endpoint
      Then  Return the value of “state province” where name is the University of Witwatersrand
