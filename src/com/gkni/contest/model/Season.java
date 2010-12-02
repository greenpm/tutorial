package com.gkni.contest.model;

import java.util.Set;

public interface Season {
	
	// ---- id
	
	public Integer	getId();
	
	// ---- name
	
	public String getName();
	public void setName(String name);
	
	// ---- league
	
	public League getLeague();
	public boolean setLeague(League league);
	
	// ---- teams
	
	public Set<? extends Team> getTeams();
	public boolean addTeam(Team team);
	public boolean removeTeam(Team team);
	
	// ---- games
	
	public Set<? extends Game> getGames();

}
