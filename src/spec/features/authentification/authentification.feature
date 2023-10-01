@identification
Feature: authentification
  
  En tant qu'un utilisateur je  veux m'identifier a l'application Amazon

  Background: 
    Given je me connecte sur l'application
    And j'accepte les cookies

  @identificationValide
  Scenario: authentification avec des coordonnees valides
    When je clique sur identifiez vous
    And je saisi l'email  "qatest207@gmail.com"
    And je clique sur le bouton Continuer
    And je saisi le mot de passe "2015.codeamazon"
    And je clique sur le bouton S'identifier
    Then je me redirige vers la page d'accueil de client et "Bonjour TEST" s'affiche

  @identificationNonvalide
  Scenario Outline: authentification avec des coordonnees invalides
    When je clique sur identifiez vous
    And je saisi l'email  "<email>"
    And je clique sur le bouton Continuer
    And je saisi le mot de passe "<password>"
    And je clique sur le bouton S'identifier
    Then je me redirige vers la page d'accueil de client et "<expected_result>" s'affiche

    Examples: 
      | email                | password         | expected_result |
      | qatest2077@gmail.com | 2015.codeamazon  | "Bonjour TEST"  |
      | qatest207@gmail.com  | 20155.codeamazon | "Bonjour TEST"  |
      | qatest207@gmail.com  | 2015.codeamazon  | "Hello Test"    |
      | qatest207@gmail.com  | 2015.codeamazon  | "             " |
