package com.example.shoot.services;
import java.util.List ; 
import com.example.shoot.models.TeamModel;

public interface TeamService {
	
	public List<TeamModel> getAllTeams();
    public TeamModel update(TeamModel team);
    public void delete(Long id);
    public TeamModel add(TeamModel team);
    public TeamModel findById(Long id);

}
