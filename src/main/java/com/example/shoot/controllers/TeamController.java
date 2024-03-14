package com.example.shoot.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.shoot.models.TeamModel;
import com.example.shoot.services.TeamService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/teams")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("")
    public List<TeamModel> getAllTeams() {
        return teamService.getAllTeams();
    }

    @PutMapping("/{id}")
    public TeamModel update(@PathVariable Long id, @RequestBody TeamModel team) {
        return teamService.update(team);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        teamService.delete(id);
    }

    @PostMapping
    public TeamModel add(@RequestBody TeamModel team) {
        return teamService.add(team);
    }

    @GetMapping("/{id}")
    public TeamModel getTeamById(@PathVariable Long id) {
        return teamService.findById(id);
    }
}