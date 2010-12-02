package com.gkni.contest.model;

import java.util.Date;

public interface Game {
	
	// ---- id
	
	public Integer	getId();
	
	// ---- season
	
	public Season getSeason();
	public boolean setSeason(Season season);

	// ---- date and time of game
	
	public Date getDate();
	public void setDate(Date date);
	
	// ---- home team
	
	public Team getHomeTeam();
	public void setHomeTeam(Team team);
	
	// ---- away team
	
	public Team getAwayTeam();
	public void setAwayTeam(Team team);
	
}
