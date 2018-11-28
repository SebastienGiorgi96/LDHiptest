Feature: Players and teams
  
  As a coach, i want to create players in my team

  Scenario: Creating twos players in a team  
  #{IMPORTANT: Asciidoc markup inside *steps* must be surrounded by *curly brackets*.}
  # {NOTE: Steps comments are placed *before* each steps so this comment is for the *WHEN* step.}


  Given New player
  When  a Player in a team
  Then  the Team has a player
  
  Scenario: Creating two players with same num
  Given three players
  When a player has the same number
  Then we choose another number
  
  Scenario: Transfer of Critiano Ronaldo
  Given Ronaldo plays for Real Madrid
  When Ronaldo moves to the Juventus
  Then Real Madrid hasn't Ronaldo anymore