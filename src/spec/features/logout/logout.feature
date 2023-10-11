@logout
Feature: Logout from Amazon Account
  
  As a registered and logged-in user, I want to successfully log out of my Amazon account.

  Background: 
    Given I log in to the application
    And I accept cookies
    When I click on "identifiez vous"
    And I enter the email "qatest207@gmail.com"
    And I click on the Continue button
    And I enter the password "2015.codeamazon"
    And I click on the Sign In button
    Then I am redirected to the customer's home page, and "Bonjour TEST" is displayed
    When I click on the dropdown list "Toutes nos catégories"
    And I select the category "Jeux et Jouets" from the dropdown menu
    And I enter "NBA 2K24 PS4" in the search bar
    And I click on the search button
    Then the search results should display
    And I click on my product
    And the search result should display "NBA 2K24 Édition Black Mamba - PS4"

  @logoutAmazon
  Scenario: Successful logout from Amazon account
    When I hover the mouse over the icon «Bonjour TEST Comptes et listes»
    And I click on  «Déconnexion»
    Then I should be logged out and redirected to the Amazon login page "S'identifier"
