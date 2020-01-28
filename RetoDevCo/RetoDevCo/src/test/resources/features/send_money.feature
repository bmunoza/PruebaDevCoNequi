#Author: brayan.yamid@gmail.com

Feature: send money from my nequi account
  I as a user of the nequi app
  I want to send money
  to help my family

    @testCase1
    Scenario: send money to my own account
    Given Bryan is logged into the nequi app with his credentials
    When he sends money to his own nequi account
    Then he should see a shipping error message not allowed