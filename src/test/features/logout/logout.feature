@tag
Feature: Logout
  En tant qu'un utilisateur enregistré et connecté je veux me déconnecter de mon espace Amazon avec succés

  @tag1
  Scenario: Déconnexion de mon compte Amazon avec succés
    Given je me déconnecter de mon espace Amazon avec succés
    When je faire un mouse hoover sur le text "Bonjour TEST"
    And je clique Déconnexion
    Then se déconnécter et se rediriger vers la page login
    

