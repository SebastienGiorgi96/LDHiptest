package com.example.test.livingdoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.livingdoc.entity.TeamEntity;
import com.example.test.livingdoc.repository.TeamRepository;

@Service
public class TeamServiceBean implements TeamServiceInterface {

    @Autowired
    private TeamRepository repository;

    @Override
    public List<TeamEntity> findAll() {

        List<TeamEntity> teams = (List<TeamEntity>) repository.findAll();

        return teams;
    }

    @Override
    public TeamEntity findTeamById(long _id) {

        TeamEntity team = repository.findOne(_id);
        return team;

    }
}