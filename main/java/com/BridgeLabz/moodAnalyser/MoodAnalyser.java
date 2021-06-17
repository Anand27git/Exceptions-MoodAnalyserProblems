package com.BridgeLabz.moodAnalyser;

/************
 * 
 * @author ANAND 
 * UC-1-ability to analyse and Respond Happy or Sad Mood message
 *
 ********/

public class MoodAnalyser {

	/******
	 * 
	 * @param message
	 * @return
	 */
	// method to AnalyseMood
	public String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

}
