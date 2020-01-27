Feature: I as a user of My Store
  I want to add a product to the shopping cart
  for place an order

  Scenario: Buy a product and send proof by email
    Given that Megan is on the My Store website
    When she buys a product on the website
    And she sent the receipt to the email prueba@gmail.com
    Then she should see that the email was sent correctly