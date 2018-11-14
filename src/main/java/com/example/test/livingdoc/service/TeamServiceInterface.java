package com.example.test.livingdoc.service;

import java.util.List;

import com.example.test.livingdoc.entity.Team;

public interface TeamServiceInterface {

    List<Team> findAll();

    Team findTeamById(long _id);

}
