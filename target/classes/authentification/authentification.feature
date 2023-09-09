@tag
Feature: authentification

   En tant qu'un utilisateur je veux m'identifier a l'application Amazon

    @tag1
    Scenario: authentification avec des coordionnees valides
    Given je me connecte sur l'application Amazon
    And j'accepte les cookies
    When je clique sur identifiez vous
    And je saisi l'email "qatest207@gmail.com"
    And je clique sur le bouton Continuer
    And je saisi le mot de passe "2015.codeamazon"
    And je clique sur le bouton S'identifier
    Then je me redirige vers la page d'accueil de client et "Bonjour TEST"

       