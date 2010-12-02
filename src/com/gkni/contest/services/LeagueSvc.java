package com.gkni.contest.services;

import java.util.Set;

import com.gkni.contest.exceptions.ContestException;
import com.gkni.contest.model.League;

public interface LeagueSvc {
	
	public League getNew() throws ContestException;
	
	public League find(Integer id) throws ContestException;
	
	public Set<? extends League> find(League league) throws ContestException;

	public Set<? extends League> getAll() throws ContestException;
	
	public void save(League league) throws ContestException;
	
	public void delete(League league) throws ContestException;
	
}
