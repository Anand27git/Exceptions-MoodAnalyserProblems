package com.BridgeLabz.moodAnalyser;

/************
 * 
 * @author ANAND
 *  UC-1-ability to analyse and Respond Happy or Sad Mood message
 *  Refactoring the code mood Analyser should have two constructors
 *  UC-2-Handling exceptions when user provides invalid mood like Null
 *
 ********/

public class MoodAnalyser {

	private String message;

	// default constructor
	public MoodAnalyser() {
	}

	// constructor with parameter message
	public MoodAnalyser(String message) {
		this.message = message;
	}

	// method to Handle the exception and analyse the mode
	public String analyseMood() {
		try {
			if (message.contains("Sad")) {
				return "SAD";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
		return null;
	}

}
