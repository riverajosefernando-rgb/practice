@BuyAll
Feature: OpenCart purchase flow

  As a store user
  I want to add products to the cart
  So that I can complete a purchase successfully

  Background:
    Given the user opens the home page

  @ByPosition
  Scenario: Add products by selecting them by position in the grid

    When the user adds the product in position 1
    And the user adds the product in position 2
    And the user proceeds to checkout as guest
    Then the user should see the order confirmation message


  @ByName
  Scenario: Add products by selecting them by name

    When the user adds the product with name:
      | name    |
      | MacBook |
    And the user adds the product with name:
      | name   |
      | iPhone |
    And the user proceeds to checkout as guest
    Then the user should see the order confirmation message


  @ByNameList
  Scenario Outline: Add products by selecting them by name list

    When the user adds the following products:
      | name     |
      | <Name1>  |
      | <Name2>  |
    And the user proceeds to checkout as guest
    Then the user should see the order confirmation "<Message>"

    Examples:
      | Name1   | Name2  | Message                     |
      | MacBook | iPhone | Your order has been placed! |
      | MacBook | iPhone | Your order has not been placed! |