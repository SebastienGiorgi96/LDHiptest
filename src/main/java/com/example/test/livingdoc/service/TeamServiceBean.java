package com.example.test.livingdoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.livingdoc.entity.Team;
import com.example.test.livingdoc.repository.TeamRepository;

@Service
public class TeamServiceBean implements TeamServiceInterface {

    @Autowired
    private TeamRepository repository;

    @Override
    public List<Team> findAll() {

        List<Team> teams = (List<Team>) repository.findAll();

        return teams;
    }

    @Override
    public Team findTeamById(long _id) {

        Team team = repository.findOne(_id);
        return team;

    }
}