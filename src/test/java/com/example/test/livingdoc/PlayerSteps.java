package com.example.test.livingdoc;

import org.junit.Assert;

import com.example.test.livingdoc.entity.Player;
import com.example.test.livingdoc.entity.Team;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlayerSteps {

    private Player player1;
    private Player player2;
    private Player player3;

    private Team team1;
    private Team team2;

    // FIRST SCENARIO

    @Given("^New player$")
    public void create_a_new_player() throws Throwable {
        player1 = new Player(1, "Messi", 10, "Attaquant");
        player2 = new Player(2, "Suarez", 9, "Attaquant");
    }

    @When("^a Player in a team$")
    public void an_team_is_declared_for_Messi() {
        team1 = new Team(1, "FC Barcelone");

    }

    @Then("^the Team has a player$")
    public void the_team_has_a_player() {
        player1.setTeam(team1);
        player2.setTeam(team1);
        Assert.assertEquals(2, team1.getPlayers().size());
    }

    // SECOND SCENARIO

    @Given("^three players$")
    public void three_new_players() throws Throwable {
        player1 = new Player(1, "Coutinho", 7, "Milieu");
        player2 = new Player(2, "Umtiti", 23, "Defenseur");
        player3 = new Player(3, "Piqué", 3, "Defenseur");
    }

    @When("^a player has the same number$")
    public void a_player_has_the_same_number() {
        team1 = new Team(1, "FC Barcelone");
        player1.setTeam(team1);
        player2.setTeam(team1);
        player3.setTeam(team1);
        player2.setNum(7);
    }

    @Then("^we choose another number$")
    public void choose_another_number() {
        Assert.assertEquals(23, player2.getNum());
    }

    // THIRD SCENARIO FAIL

    @Given("^Ronaldo plays for Real Madrid$")
    public void a_player_and_two_teams() {
        team1 = new Team(1, "Real Madrid");
        team2 = new Team(2, "Juventus Turin");

        player1 = new Player(1, "Cristiano Ronaldo", 7, "Attaquant");
        player1.setTeam(team1);
    }

    @When("^Ronaldo moves to the Juventus$")
    public void a_player_moves_to_another_team() {
        player1.setTeam(team2);
    }

    @Then("^Real Madrid hasn't Ronaldo anymore$")
    public void the_old_team_is_empty() {
        Assert.assertEquals(0, team1.getPlayers().size());

    }

}
