@search
Feature: RechercheProduit
  
  En tant qu'un utilisateur enregistré et connecté ,
   je veux chercher un produit existant  dans l'application  Amazon- catégorie Applis et Jeux 


  Background: 
    Given je me connecte sur l'application
    And j'accepte les cookies
    When je clique sur identifiez vous
    And je saisi l'email  "qatest207@gmail.com"
    And je clique sur le bouton Continuer
    And je saisi le mot de passe "2015.codeamazon"
    And je clique sur le bouton S'identifier
    Then je me redirige vers la page d'accueil de client et "Bonjour TEST" s'affiche
    
  @searchProductBtnSearch
  
  Scenario: Recherche d'un produit dans une catégorie spécifique
  When Cliquer sur la liste déroulante « Toutes nos catégories »
  And je sélectionne la catégorie «Jeux et Jouets» depuis le menu déroulant
  And j'entre "NBA 2K24 PS4" dans la barre de recherche
  And je clique sur le bouton de recherche
  Then  Les résultats de recherche devraient s'afficher "NBA 2K24 Édition Black Mamba - PS4" 
  

