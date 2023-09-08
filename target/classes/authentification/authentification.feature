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
    Then je me redirige vers la page d'accueil de client et "Bonjour Salhi"

        #*****(-_-)*****

        Scenario Outline: authentification avec une adresse mail invalide
        Given je me connecte sur l'application Amazon
        And j'accepte les cookies
        When je clique sur identifiez vous
        And je saisi adresse mail de connexion invalide "qatest207+@gmail.com"
        And je clique sur le bouton Continuer
        Then un message d'erreur s'affiche "Impossible de trouver un compte correspondant à cette adresse e-mail"

        #*****(-_-)*****

        Scenario Outline: authentification avec une adresse mail valide et un mot de passe invalide
        Given je me connecte sur l'application Amazon
        And j'accepte les cookies
        When je clique sur identifiez vous
        And je saisi adresse mail de connexion valide "qatest207@gmail.com"
        And je clique sur le bouton Continuer
        And je saisi le mot de passe "2015.codeamazon@"
        And je clique sur le bouton S'identifier
        Then un message d'erreur s'affiche "un probleme est survenu votre mot de passe est incorrecte"




