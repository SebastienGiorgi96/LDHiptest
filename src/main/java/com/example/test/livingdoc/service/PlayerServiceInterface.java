package com.example.test.livingdoc.service;

import java.util.List;

import com.example.test.livingdoc.entity.PlayerEntity;

public interface PlayerServiceInterface {

    List<PlayerEntity> findAllPlayers();

    PlayerEntity findTeamById(long _id);

}
