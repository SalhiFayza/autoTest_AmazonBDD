@mot-de-passe-oublie
Feature: Mot de passe oublié sur l'application Amazon
  En tant qu’un utilisateur je veux avoir la possibilité de changer  mon mot de passe en cas d'oublie

  Scenario: J'ai oublié mon mot de passe et je veux le réinitialiser
    Given je me trouve sur la page de connexion d'Amazon
    And j'accepte les cookies
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
