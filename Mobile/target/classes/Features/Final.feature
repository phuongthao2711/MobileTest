Feature: Verify product in Banggood Easy Online Shopping App
  Background: Open Banggood Easy Online Shopping App

#  TC_01
  @Test
  Scenario: Verify product in Category
    Given Open Banggood Easy Online Shopping App
    When user click to the Category on footer menu
    And user scroll and click to Home and Garden in Left menu
    And user click to the Home Decor
    And user lick to the Filter
    And user input price from 20 to 30
    And user click Done
    And user click first product
    Then product name should be displayed
    And product price in range 20 to 30

#  TC_02
  Scenario: Verify product in Hot Categories
    Given Banggood Easy Online Shopping App is opened
    When user scroll to Hot Categories
    And user click to the first category
    And user click to the first product
    Then The product detail page should be displayed: Product name, product price, Buy now button

  Scenario: Add to Cart button
    Given Banggood Easy Online Shopping is opened
    When user click to Cart button
    And user click Add to Cart
    And user click to Add to Cart button
    And user click to Cart icon on footer
    Then product name, product size, product price and quantity should be dislayed


#  TC_03
  Scenario: Verify the login screen
    Given Open Banggood App
    When user click Account on footer menu
    And user click View All Order
    Then the login screen should be displayed with: Email, password and Sign In button



