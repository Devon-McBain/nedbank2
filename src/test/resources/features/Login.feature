# A login feature file
#Navigate to this website:
#https://katalon-demo-cura.herokuapp.com/profile.php#login

#Login with:
#Username: John Doe
#Password: ThisIsNotAPassword
#Select the Hong Kong Center
#tick the Apply for readmission option
#Select None as the healthcare program
#Enter today’s date and a random comment
#Click on Book appointment
#Return and print out the Facility Name

Feature: Navigate and Login to website
    Scenario Outline: Login
      Given Navigate to '<URL>'
      When login using the '<Username>' and '<Password>'
      Then  Select the Hong Kong Centre
      And Tick the apply checkbox
      And Select none radio button
      And Enter todays date
      And Enter a comment
      And Click Book Appointment button
      And return and print facility name


      Examples:
        | URL | Username | Password |
        |https://katalon-demo-cura.herokuapp.com/profile.php#login |John Doe|ThisIsNotAPassword|