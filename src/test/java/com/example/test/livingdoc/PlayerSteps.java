package com.example.test.livingdoc;

import org.junit.Assert;

import com.example.test.livingdoc.entity.PlayerEntity;
import com.example.test.livingdoc.entity.TeamEntity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlayerSteps {

    private PlayerEntity player;
    private PlayerEntity player2;
    private PlayerEntity player3;
    private TeamEntity team;

    @Given("^New player$")
    public void create_a_new_player() throws Throwable {
        player = new PlayerEntity(1, "Messi", 10, "Attaquant");
        player2 = new PlayerEntity(2, "Suarez", 9, "Attaquant");
    }

    @When("^a Player in a team$")
    public void an_team_is_declared_for_Messi() {
        team = new TeamEntity(1, "FC Barcelone");

    }

    @Then("^the Team has a player$")
    public void the_team_has_a_player() {
        player.setTeam(team);
        player2.setTeam(team);
        Assert.assertEquals(2, team.getPlayers().size());
    }

    @Given("^two players$")
    public void two_new_players() throws Throwable {
        player = new PlayerEntity(1, "Coutinho", 7, "Milieu");
        player2 = new PlayerEntity(2, "Umtiti", 23, "Defenseur");
        player3 = new PlayerEntity(3, "Piqué", 3, "Defenseur");

    }

    @When("^a player has the same number$")
    public void a_player_has_the_same_number() {
        team = new TeamEntity(1, "FC Barcelone");
        player.setTeam(team);
        player2.setTeam(team);
        player3.setTeam(team);
        player2.setNum(7);

    }

    @Then("^we choose another number$")
    public void choose_another_number() {

        Assert.assertEquals(23, player2.getNum());
    }

}
