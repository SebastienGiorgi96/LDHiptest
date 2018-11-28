Feature: Players and teams
  
  As a coach, i want to create players in my team

  Scenario: Creating a player in a team  
  #{IMPORTANT: Asciidoc markup inside *steps* must be surrounded by *curly brackets*.}


  Given New player
    # {NOTE: Steps comments are placed *before* each steps so this comment is for the *WHEN* step.}
  When  a Player in a team
  Then  the Team has a player
  
  Scenario: Creating two players with same num
  Given three players
  When a player has the same number
  Then we choose another number
  