package com.sbcc.utility;

import com.sbcc.model.Player;
import java.util.*;
import java.util.regex.*;
public class SBCCUtility {
	
	// Include the logic of parsePlayerDetails method as specified in the requirement document - 2
	public static Player parsePlayerDetails(String playerDetails)
	{
	    String[] details = playerDetails.split(":");
	    String playerId = details[0];
	    if(validatePlayerId(playerId))
	    {
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
	    return null;
	}
	public static boolean validatePlayerId(String pId)
	{
	    Pattern p = Pattern.compile("[A-Z]{4}[0-9]{4}[A-Z]{1}");
	    Matcher m = p.matcher(pId);
	    if(m.matches())
	    {
	        return true;
	    }
	    return false;
	}
}
