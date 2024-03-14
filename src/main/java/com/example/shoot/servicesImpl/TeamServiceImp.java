package com.example.shoot.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoot.models.TeamModel;
import com.example.shoot.repositories.TeamRepository;
import com.example.shoot.services.TeamService; 
@Service 
public class TeamServiceImp implements TeamService {
    @Autowired
    public TeamRepository teamRepository; 

    public List<TeamModel> getAllTeams() {
        return teamRepository.findAll();
    }

    public TeamModel update(TeamModel team) {
        return teamRepository.save(team);
    }

    public void delete(Long id) {
        teamRepository.deleteById(id);
    }

    public TeamModel add(TeamModel team) {
        return teamRepository.save(team);
    }

    public TeamModel findById(Long id) {
        Optional<TeamModel> teams = teamRepository.findById(id);
        return teams.isPresent() ? teams.get() : null;
    }
}