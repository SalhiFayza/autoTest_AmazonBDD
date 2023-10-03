@identification
Feature: Authentication
  
  As a user, I want to authenticate myself on the Amazon application.

  Background: 
    Given I log in to the application
    And I accept cookies

  @identificationValid
  Scenario: Authentication with valid credentials
    When I click on "identifiez vous"
    And I enter the email "qatest207@gmail.com"
    And I click on the Continue button
    And I enter the password "2015.codeamazon"
    And I click on the Sign In button
    Then I am redirected to the customer's home page, and "Bonjour TEST" is displayed
