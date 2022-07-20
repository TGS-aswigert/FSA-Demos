package com.example.springreactdemo.services;

import com.example.springreactdemo.models.Team;
import com.example.springreactdemo.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    
    @Autowired
    private TeamRepository teamRepository;

    public List<Team> getPaginatedTeams(int page, int limit) {
        Pageable paging = PageRequest.of(page, limit);
        Page<Team> pagedResults = teamRepository.findAll(paging);
        return pagedResults.toList();
    }

    public Team getTeam(Long id) {
        Optional<Team> team = teamRepository.findById(id);
        if (team.isPresent()) {
            return team.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Team exists with id " + id);
        }
    }

    public Long getTeamsCount() {
        return teamRepository.count();
    }

    public List<Team> createTeams(List<Team> teams) {
        return teamRepository.saveAll(teams);
    }

    public Team updateTeam(Long id, Team teamDetails) {
        Optional<Team> team = teamRepository.findById(id);
        if (team.isPresent()) {
            Team newTeam = team.get();
            newTeam.setName(teamDetails.getName());
            return teamRepository.save(newTeam);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Team exists with id " + id);
        }
    }

    public void deleteTeam(Long id) {
        try {
            teamRepository.deleteById(id);
        } catch (EmptyResultDataAccessException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "No Team exists with id " + id);
        }
    }
}
