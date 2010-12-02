package com.gkni.contest.services;

import java.util.Set;

import com.gkni.contest.exceptions.ContestException;
import com.gkni.contest.model.Season;

public interface SeasonSvc {
	
	public Season getNew() throws ContestException;
	
	public Season find(Integer id) throws ContestException;
	
	public Set<? extends Season> find(Season season) throws ContestException;

	public Set<? extends Season> getAll() throws ContestException;
	
	public void save(Season season) throws ContestException;
	
	public void delete(Season season) throws ContestException;
	
}
