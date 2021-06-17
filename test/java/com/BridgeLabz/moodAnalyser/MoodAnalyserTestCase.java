package com.BridgeLabz.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

/********
 * 
 * @author ANAND 
 * UC-1-TestCase to analyse and Respond Happy or Sad Mood
 *
 */
public class MoodAnalyserTestCase {

	// TestCase to analyse and Respond Sad Mood
	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	}

	// TestCase to analyse and Respond Happy Mood
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Happy Mood");
		Assert.assertEquals("HAPPY", mood);
	}

}
