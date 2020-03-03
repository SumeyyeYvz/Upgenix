@login

  Feature: Login

    @successful_login
      Scenario: Authorized user should be able to login
      Given the user is on the login page
      When the user enters valid credentials and clicks on signin button
      Then the page title should be "#Inbox"

