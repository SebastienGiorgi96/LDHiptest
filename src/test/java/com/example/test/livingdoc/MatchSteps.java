package com.example.test.livingdoc;

import org.junit.Assert;

import com.example.test.livingdoc.entity.Match;
import com.example.test.livingdoc.entity.Team;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MatchSteps {

    private Team team1;
    private Team team2;

    private Match match1;

    // FIRST SCENARIO

    @Given("^Two teams$")
    public void create_two_teams() throws Throwable {
        team1 = new Team(1, "FC Barcelone");
        team2 = new Team(2, "Paris SG");
    }

    @When("^Start match with these two teams$")
    public void start_match_with_these_two_teams() {
        match1 = new Match(1, team1, team2);
    }

    @Then("^Both teams have no goals$")
    public void both_teams_have_no_goals() {
        Assert.assertEquals(0, match1.getButTeamDom());
        Assert.assertEquals(0, match1.getButTeamExt());
    }

}
