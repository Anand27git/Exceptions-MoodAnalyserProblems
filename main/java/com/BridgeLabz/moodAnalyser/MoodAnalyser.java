package com.BridgeLabz.moodAnalyser;

/************
 * 
 * @author ANAND 
 * UC-1-ability to analyse and Respond Happy or Sad Mood message
 * Refactoring the test code test case for  mood Analyser should have two constructors
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

	// method to analyse the mode
	public String analyseMood() {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}


}
