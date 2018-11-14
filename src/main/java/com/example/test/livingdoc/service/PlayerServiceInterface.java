package com.example.test.livingdoc.service;

import java.util.List;

import com.example.test.livingdoc.entity.Player;

public interface PlayerServiceInterface {

    List<Player> findAllPlayers();

    Player findTeamById(long _id);

}
