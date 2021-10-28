package com.sbcc.model;

/*The class and methods should be declared as public 
and all the attributes should be declared as private.*/
public class Batsman extends Player{
	
	// Include all attributes, getters, setters and constructors as specified in the requirement document - 1
	
	// Fill the logic of findStarRating as specified in the requirement document - 4
	private double starRating;
	private int noOfHundreds;
	private int noOfFifties;
	public double getStarRating()
	{
	    return starRating;
	}
	public void setStarRating(double r)
	{
	    starRating = r;
	}
	public void setNoOfHundreds(int h)
	{
	    noOfHundreds = h;
	}
	public void setNoOfFifties(int f)
	{
	    noOfFifties = f;
	}
	public int getNoOfHundreds()
	{
	    return noOfHundreds;
	}
	public int getNoOfFifties()
	{
	    return noOfFifties;
	}
	public Batsman()
	{

	}
	public Batsman(String playerId, String playerName, int matchesPlayed, int runScored, String playingZone, int noOfHundreds, int noOfFifties)
	{
	    super(playerId, playerName, matchesPlayed, runScored, playingZone);
	    this.noOfHundreds = noOfHundreds;
	    this.noOfFifties = noOfFifties;
	}
	public void findStarRating()
	{
	    this.starRating = ((this.noOfHundreds*10.0)+(this.noOfFifties*5.0))*this.getMatchesPlayed()/100;
	}
}
