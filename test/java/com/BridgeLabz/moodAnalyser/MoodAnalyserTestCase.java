package com.BridgeLabz.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

/********
 * 
 * @author ANAND 
 * UC-1-TestCase to analyse and Respond Happy or Sad Mood
 * Refactoring test case for  mood Analyser should have two constructors
 * UC-2-TestCase to Handle exceptions when user provides invalid mood like Null
 */
public class MoodAnalyserTestCase {

	// Refactoring test case for mood Analyser should have two constructors
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	// Refactoring test case for mood Analyser should have two constructors
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
	//UC-2-Handling exceptions when user provides invalid mood like Null
	@Test
	public void givenNullmood_ShouldThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("null");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}


