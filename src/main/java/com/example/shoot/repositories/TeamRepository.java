package com.example.shoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoot.models.TeamModel;

public interface TeamRepository extends JpaRepository<TeamModel,Long>{

}