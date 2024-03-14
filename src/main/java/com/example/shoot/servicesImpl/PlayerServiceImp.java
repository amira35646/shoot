package com.example.shoot.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoot.models.PlayerModel;
import com.example.shoot.repositories.PlayerRepository;
import com.example.shoot.services.PlayerService;

@Service
public class PlayerServiceImp implements PlayerService {
	@Autowired
	public PlayerRepository playerRepository;
	public List<PlayerModel> getAllPlayers(){
	return playerRepository.findAll() ;
	}
	public PlayerModel update(PlayerModel player) {
	return playerRepository.save(player);
	}
	public void delete(Long id) {
	playerRepository.deleteById(id);
	}
	public PlayerModel add(PlayerModel player) {
	return playerRepository.save(player);
	}
	public PlayerModel findById(Long id) {
	Optional<PlayerModel> Players = playerRepository.findById(id);
	 return Players.isPresent() ? Players.get() : null;
	}


}