@search
Feature: Product Search
  
  As a registered and logged-in user,
   I want to search for an existing product in the Amazon application - category Apps and Games.

  Background: 
    Given I log in to the application
    And I accept cookies
    When I click on "identifiez vous"
    And I enter the email "qatest207@gmail.com"
    And I click on the Continue button
    And I enter the password "2015.codeamazon"
    And I click on the Sign In button
    Then I am redirected to the customer's home page, and "Bonjour TEST" is displayed

  @searchProductBtnSearch
  Scenario: Search for a product in a specific category
    When I click on the dropdown list "Toutes nos catégories"
    And I select the category "Jeux et Jouets" from the dropdown menu
    And I enter "NBA 2K24 PS4" in the search bar
    And I click on the search button
    Then the search results should display "NBA 2K24 Édition Black Mamba - PS4"
