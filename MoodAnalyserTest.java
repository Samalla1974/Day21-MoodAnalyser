package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMood_IsHappy_ShouldReturnSad() throws MoodAnalyserException {
		MoodAnalyser analyser = new MoodAnalyser("I am in Sad mood");
		Assert.assertEquals("SAD",analyser.analyseMood());
	}
}
