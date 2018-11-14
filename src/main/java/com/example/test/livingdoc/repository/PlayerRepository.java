package com.example.test.livingdoc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.test.livingdoc.entity.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
