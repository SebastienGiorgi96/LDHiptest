package com.example.test.livingdoc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.test.livingdoc.entity.TeamEntity;

@Repository
public interface TeamRepository extends CrudRepository<TeamEntity, Long> {

}