package com.gkni.contest.model;

public interface Team {
	
	// ---- id
	
	public Integer	getId();
	
	// ---- name
	
	public String getName();
	public void setName(String name);
	
	// ---- location
	
	public String getLocation();
	public void setLocation(String location);
	
	// ---- league
	
	public League getLeague();
	public boolean setLeague(League league);
	
}
