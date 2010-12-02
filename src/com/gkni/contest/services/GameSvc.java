package com.gkni.contest.services;

import java.util.Set;

import com.gkni.contest.exceptions.ContestException;
import com.gkni.contest.model.Game;

public interface GameSvc {
	
	public Game getNew() throws ContestException;
	
	public Game find(Integer id) throws ContestException;
	
	public Set<? extends Game> find(Game game) throws ContestException;

	public Set<? extends Game> getAll() throws ContestException;
	
	public void save(Game game) throws ContestException;
	
	public void delete(Game game) throws ContestException;

}
