package com.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest<ExpectedException> {



    @Test
    public void givenNullMood_ShouldReturnException() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{

            moodAnalyser.analyseMood(null);
        } catch (MoodAnalysisException e) {

                Assertions.assertEquals("PLease enter proper message" , e.getMessage());
        }
        }


    }

