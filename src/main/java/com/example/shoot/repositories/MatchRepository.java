package com.example.shoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoot.models.MatchModel;

@Repository
public interface MatchRepository extends JpaRepository<MatchModel,Long>  {
	
	//contient des queries predifinies 
	
	
	

}
