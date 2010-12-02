package com.gkni.contest.model;

import java.util.Set;

public interface League {
	
	// ---- id
	
	public Integer	getId();

	// ---- name
	
	public String getName();
	public void setName(String name);
	
	// ---- teams
	
	public Set<? extends Team> getTeams();

	// ---- seasons
	
	public Set<? extends Season> getSeasons();
	
}
