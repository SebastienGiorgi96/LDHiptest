package com.example.test.livingdoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.livingdoc.entity.PlayerEntity;
import com.example.test.livingdoc.repository.PlayerRepository;

@Service
public class PlayerServiceBean implements PlayerServiceInterface {

    @Autowired
    private PlayerRepository repository;

    @Override
    public List<PlayerEntity> findAllPlayers() {

        List<PlayerEntity> players = (List<PlayerEntity>) repository.findAll();

        return players;
    }

    @Override
    public PlayerEntity findTeamById(long _id) {

        PlayerEntity player = repository.findOne(_id);
        return player;

    }

}
