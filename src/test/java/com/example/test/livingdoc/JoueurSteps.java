package com.example.test.livingdoc;

import org.junit.Assert;

import com.example.test.livingdoc.entity.PlayerEntity;
import com.example.test.livingdoc.entity.TeamEntity;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JoueurSteps {

    private PlayerEntity player;
    private TeamEntity team;

    @Given("^New player$")
    public void create_a_new_player() throws Throwable {
        player = new PlayerEntity(1, "Messi", 10, "attaquant");

    }

    @When("^a Player in a team$")
    public void an_team_is_declared_for_Messi() {
        team = new TeamEntity(1, "FC Barcelone");

    }

    @Then("^the Team has a player$")
    public void the_team_has_a_player() {
        player.setTeam(team);
        Assert.assertEquals("Messi", player.getName());
    }

}
