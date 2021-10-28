package com.sbcc.model;



/*The class and methods should be declared as public 
and all the attributes should be declared as private.*/

public abstract class Player {

	// Include all attributes, getters, setters and constructors as specified in the requirement document
	private String playerId;
	private String playerName;
	private int matchesPlayed;
	private int runScored;
	private String playingZone;
	
	public Player(String playerId, String playerName, int matchesPlayed, int runScored, String playingZone)
	{
	    this.playerId=playerId;
	    this.playerName=playerName;
	    this.matchesPlayed=matchesPlayed;
	    this.runScored=runScored;
	    this.playingZone=playingZone;
	}
	public Player()
	{
	    playerId = "";
	    playerName = "";
	    matchesPlayed = 0;
	    runScored = 0;
	    playingZone = "";
	}
	public void setPlayerId(String playerId)
	{
	    this.playerId=playerId;
	}
	public String getPlayerId()
	{
	    return playerId;
	}
	public void setPlayerName(String playerName)
	{
	    this.playerName=playerName;
	}
	public String getPlayerName()
	{
	    return playerName;
	}
	public void setMatchesPlayed(int matchesPlayed)
	{
	    this.matchesPlayed=matchesPlayed;
	}
	public int getMatchesPlayed()
	{
	    return matchesPlayed;
	}
	public void setRunScored(int runScored)
	{
	    this.runScored=runScored;
	}
	public int getRunScored()
	{
	    return runScored;
	}
	public void setPlayingZone(String playingZone)
	{
	    this.playingZone=playingZone;
	}
	public String getPlayingZone()
	{
	    return playingZone;
	}
	public static int calculateTotalRuns(String[] securedRuns)
	{
	    int totalRuns = 0;
	    for(int i=0;i<securedRuns.length;i++)
	    {
	        totalRuns+=Integer.parseInt(securedRuns[i]);
	    }
	    return totalRuns;
	}
	public abstract void findStarRating();
}
