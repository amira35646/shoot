package com.example.shoot.servicesImpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoot.models.MatchModel;
import com.example.shoot.repositories.MatchRepository;
import com.example.shoot.services.MatchService;
@Service
public class MatchServiceImp implements MatchService {
	@Autowired 
	public MatchRepository matchRepository; 

	public List<MatchModel> getAllMatches() {
	    return matchRepository.findAll(); //select * from matchModel-->table 
	}

	public MatchModel update(MatchModel match) {
	    return matchRepository.save(match);
	}

	public void delete(Long id) {
	    matchRepository.deleteById(id);
	}

	public MatchModel add(MatchModel match) {
	    return matchRepository.save(match);
	}

	
	public MatchModel getMatchById(Long id) {
		// TODO Auto-generated method stub
		Optional<MatchModel> matches = matchRepository.findById(id);
	    return matches.isPresent() ? matches.get() : null;
	}
	}


