package com.example.shoot.services;
import java.util.List ;

import com.example.shoot.models.MatchModel; 

public interface MatchService {
	
	public List<MatchModel> getAllMatches();
	
	public MatchModel getMatchById(Long id)  ;

	public MatchModel update(MatchModel match); //edit and new creation 
	
	public void delete(Long id);
	
	public MatchModel add(MatchModel match);


	
	
	

}
