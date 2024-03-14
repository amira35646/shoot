package com.example.shoot.services;

import java.util.List;

import com.example.shoot.models.PlayerModel;

public interface PlayerService {
	
	public List<PlayerModel> getAllPlayers();
	public PlayerModel update(PlayerModel player);
	public void delete(Long id);
	public PlayerModel add(PlayerModel player);
	public PlayerModel findById(Long id);


}
