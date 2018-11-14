package com.example.test.livingdoc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.livingdoc.entity.Player;
import com.example.test.livingdoc.entity.Team;
import com.example.test.livingdoc.service.PlayerServiceBean;
import com.example.test.livingdoc.service.TeamServiceBean;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClassTest {

    @Autowired
    TeamServiceBean teamService;

    @Autowired
    PlayerServiceBean playerService;

    @Test
    public void teamTest() {

        Team teamInt = teamService.findTeamById(6);
        Team team = new Team(9, "Paris SG");

        // assert statements
        assertEquals("Paris SG", team.getName());
        assertEquals("Liverpool FC", teamInt.getName());

    }

    @Test
    public void playerTest() {

        Player playerTest = playerService.findTeamById(7);
        Team club = playerTest.getTeam();
        assertEquals("Salah", playerTest.getName());
        assertEquals("Liverpool FC", club.getName());

    }

}
