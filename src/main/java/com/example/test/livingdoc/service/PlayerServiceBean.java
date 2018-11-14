package com.example.test.livingdoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.livingdoc.entity.Player;
import com.example.test.livingdoc.repository.PlayerRepository;

@Service
public class PlayerServiceBean implements PlayerServiceInterface {

    @Autowired
    private PlayerRepository repository;

    @Override
    public List<Player> findAllPlayers() {

        List<Player> players = (List<Player>) repository.findAll();

        return players;
    }

    @Override
    public Player findTeamById(long _id) {

        Player player = repository.findOne(_id);
        return player;

    }

}
