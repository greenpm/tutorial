package com.gkni.contest.services;

import java.util.Set;

import com.gkni.contest.exceptions.ContestException;
import com.gkni.contest.model.Team;

public interface TeamSvc {
	
	public Team getNew() throws ContestException;
	
	public Team find(Integer id) throws ContestException;
	
	public Set<? extends Team> find(Team team) throws ContestException;

	public Set<? extends Team> getAll() throws ContestException;
	
	public void save(Team team) throws ContestException;
	
	public void delete(Team team) throws ContestException;
	
}
