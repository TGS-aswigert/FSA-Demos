package com.example.springreactdemo.controllers;

import com.example.springreactdemo.models.Team;
import com.example.springreactdemo.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("/")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Team> getPaginatedTeams(@RequestParam int page,
                                        @RequestParam int limit) {
        return teamService.getPaginatedTeams(page, limit);
    }

    @GetMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Team getTeam(@PathVariable Long id) {
        return teamService.getTeam(id);
    }

    @GetMapping("/count")
    @CrossOrigin(origins = "http://localhost:3000")
    public Long getTeamCount() {
        return teamService.getTeamsCount();
    }

    @PostMapping("/")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Team> createTeams(@RequestBody List<Team> teams) {
        return teamService.createTeams(teams);
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Team updateTeam(@PathVariable Long id,
                                 @RequestBody Team teamDetails) {
        return teamService.updateTeam(id, teamDetails);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }
}
