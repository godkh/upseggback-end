package com.upse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upse.dto.Summoner;

@Repository
public interface RankRepository extends JpaRepository<Summoner, String> {

}