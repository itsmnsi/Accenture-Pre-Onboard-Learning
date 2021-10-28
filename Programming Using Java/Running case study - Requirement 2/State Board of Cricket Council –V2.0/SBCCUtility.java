package com.sbcc.utility;

import com.sbcc.model.Player;
import java.util.*;
public class SBCCUtility {
	
	// Include the logic of parsePlayerDetails method as specified in the requirement document - 2
	public static Player parsePlayerDetails(String playerDetails)
	{
	    String[] details = playerDetails.split(":");
	    String playerId = details[0];
	    String playerName = details[1];
	    int matchesPlayed = Integer.parseInt(details[2]);
	    String[] runs = new String[matchesPlayed];
	    for(int i=0;i<matchesPlayed;i++)
	    {
	        runs[i] = details[i+3];
	    }
	    String playingZone = details[matchesPlayed+3];
	    String playerType = details[matchesPlayed+4];
	    String numberofhundredsormaidenovers = details[matchesPlayed+5];
	    String numberoffiftiesorhatrickwickets = details[matchesPlayed+6];
	    Player pp = new Player();
	    int totalRuns = pp.calculateTotalRuns(runs);
	    Player pp1 = new Player(playerId, playerName, matchesPlayed, totalRuns, playingZone);
	    return pp1;
	}

}
