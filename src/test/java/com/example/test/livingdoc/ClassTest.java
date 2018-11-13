package com.example.test.livingdoc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test.livingdoc.entity.PlayerEntity;
import com.example.test.livingdoc.entity.TeamEntity;
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

        TeamEntity teamInt = teamService.findTeamById(6);
        TeamEntity team = new TeamEntity(9, "Paris SG");

        // assert statements
        assertEquals("Paris SG", team.getName());
        assertEquals("FC Barcelone", teamInt.getName());

    }

    @Test
    public void playerTest() {

        PlayerEntity playerTest = playerService.findTeamById(7);
        TeamEntity club = playerTest.getTeam();
        assertEquals("Salah", playerTest.getName());
        assertEquals("Liverpool FC", club.getName());

    }

}
