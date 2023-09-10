@mot-de-passe-oublie
Feature: Mot de passe oublié sur l'application Amazon
  En tant qu’un utilisateur je veux avoir la possibilité de changer  mon mot de passe en cas d'oublie

  Scenario: J'ai oublié mon mot de passe et je veux le réinitialiser
    Given je me trouve sur la page de connexion d'Amazon
    And j'accepte les cookies
    When je saisis mon adresse e-mail enregistrée "qatest207@gmail.com"
    And je clique sur le bouton Continuer
    And je clique sur le lien cliquable «Mot de passe oublié»
    Then je dois être redirigé vers la page Vérification requise

    When je saisis mon adresse e-mail enregistrée "qatest207@gmail.com" Ou mon numéro de téléphone portable enregistré "123456789"
    And je clique sur le bouton Continuer
    Then je dois voir un message de confirmation indiquant qu'un code de OTP a été envoyé

    When je vérifie ma boîte de réception e-mail pour "qatest207@gmail.com" Ou mon téléphone pour le code de réinitialisation "123456789"
    And j'ouvre l'e-mail ou le SMS de réinitialisation du mot de passe
    Then le message doit contenir un code OTP de mot de passe

    When je saisis le code de OTP "55555"
    Then je clique sur le bouton Continuer

    When je saisis un nouveau mot de passe "newPassword"
    And je confirme le nouveau mot de passe "newPassword"
    And je clique sur le bouton Enregistrer les modifications et se connecter
    Then je dois voir un message de confirmation indiquant que mon mot de passe a été réinitialisé avec succès
    And je clique sur le lien cliquable «Ignorer»
    And je dois être connecté et redirigé vers la page d'accueil Amazon
    And j'accepte les cookies
    
    #***********
    
    #When je retourne à la page de connexion Amazon
    #And je saisis mon adresse e-mail enregistrée "qatest207@gmail.com"
    #And je clique sur le bouton "Continuer"
    #And je saisis le nouveau mot de passe "newPassword"
    #And je clique sur le bouton "S'identifier"
    #Then je dois être connecté et redirigé vers la page d'accueil Amazon
  