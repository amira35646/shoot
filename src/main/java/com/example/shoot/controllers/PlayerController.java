package com.example.shoot.controllers;

import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired(required=true);
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoot.models.PlayerModel;
import com.example.shoot.services.PlayerService;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/players")
public class PlayerController {
	@Autowired
	private PlayerService playerService;
	@GetMapping("")
	 public List<PlayerModel> getAllPlayers(){
	 return playerService.getAllPlayers();
	}
	 @PutMapping("/{id}")
	public PlayerModel update(@PathVariable Integer id ,@RequestBody PlayerModel player) {
	 return playerService.update(player);
	}
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		 playerService.delete(id);
	 }
	 @PostMapping
	 public PlayerModel add(@RequestBody PlayerModel clients) {
	  return playerService.add(clients);
	  }
	  @GetMapping("/{id}")
	 public PlayerModel getPlayerById(@PathVariable Long id) {
	 return playerService.findById(id);
	 }
	 }


