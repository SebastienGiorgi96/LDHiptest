Feature: Players and teams

  Scenario: Creating a player in a team  
  Given New player
  When  a Player in a team
  Then  the Team has a player
  
  Scenario: Creating two players with same num
  Given two players
  When a player has the same number
  Then we choose another number