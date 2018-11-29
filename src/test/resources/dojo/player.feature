Feature: Players and teams
  
  As a coach, i want to create players in my team

  Scenario: Creating two players in a team  
  
 NOTE: This is a note 

  Given New player
  When  a Player in a team
  Then  the Team has a player
  
  
  Scenario: Creating two players with same num
  Given three players
  When a player has the same number
  Then we choose another number
  
  Scenario: Transfer of Cristiano Ronaldo
  Given Ronaldo plays for Real Madrid
  When Ronaldo moves to the Juventus
  Then Real Madrid hasn't Ronaldo anymore