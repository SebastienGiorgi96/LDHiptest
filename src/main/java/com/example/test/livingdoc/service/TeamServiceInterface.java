package com.example.test.livingdoc.service;

import java.util.List;

import com.example.test.livingdoc.entity.TeamEntity;

public interface TeamServiceInterface {

    List<TeamEntity> findAll();

    TeamEntity findTeamById(long _id);

}
