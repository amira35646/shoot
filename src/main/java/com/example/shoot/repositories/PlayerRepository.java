package com.example.shoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoot.models.PlayerModel;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerModel,Long>{



}