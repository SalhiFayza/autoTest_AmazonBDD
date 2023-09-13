Feature: As an Amazon user, I should be able to log in and log out with valid credentials
@identification
  Scenario: Login into the application with valid credentials
    Given I am on the Login page URL "https://www.amazon.fr/"
    Then I accept cookies
    Then I click on identify yourself
    When I enter the username as "qatest207@gmail.com"
    And I Click on the Continue button
    And I enter the password as "2015.codeamazon"
    And I click on the Sign In button
    Then I am redirected to the customer home page, and it says "Bonjour TEST"
    And I clear the cart items if any
    Then I choose Electronics > Headphones, and the headphones list appears
    Then I add the first available headphone to the cart
    Then I search for "Macbook Pro" and add the second available item to the cart
    Then I select the cart from the homepage and remove the previously added headphones
    Then I reduce the quantity of the Macbook Pro product to one and proceed to checkout
    And I hover the mouse over the text "Hello TEST"
    And I click Log Out
    Then I am logged out from the application and land on the sign-in page

  Scenario Outline: Searching for different products after login
    Given I am on the Login page URL "https://www.amazon.fr/"
    Then I accept cookies
    Then I click on identify yourself
    When I enter the username as "qatest207@gmail.com"
    And I click on the Continue button
    And I enter the password as "2015.codeamazon"
    And I click on the Sign In button
    Then I am logged in
    And I search for different "<products>" from the search bar

   Examples:
    | products          |
    | laptops           |
    | pendrive          |
    | LED TV            |