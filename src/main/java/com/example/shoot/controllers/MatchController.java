package com.example.shoot.controllers;
//dans ce fichier on va declarer des methodes dans les qelles on va faire appels au methodes du service 
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

import com.example.shoot.models.MatchModel;
import com.example.shoot.services.MatchService;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/matchs")      //service bech yabath adresse haka
public class MatchController {
  @Autowired
  private MatchService matchService;

  
  @GetMapping("")
  public List<MatchModel> getAllMatches() {
      return matchService.getAllMatches();
  }

  @PutMapping//("/{id}")//
  public MatchModel update( @RequestBody MatchModel match) //lezem fel front editmatch(obj,id)
   {
      return matchService.update(match);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) // la variable li baaththa maa l path 
  {
      matchService.delete(id);;
  }

  @PostMapping
  public MatchModel add(@RequestBody MatchModel match) {
      return matchService.add(match);
  }

  @GetMapping("/{id}")
  public MatchModel getMatchById(@PathVariable Long id) {
      return matchService.getMatchById(id);
  }
}