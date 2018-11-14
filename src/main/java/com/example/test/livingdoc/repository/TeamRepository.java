package com.example.test.livingdoc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.test.livingdoc.entity.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {

}