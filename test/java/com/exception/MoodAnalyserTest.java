package com.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest<ExpectedException> {



    @Test
    public void givenNullMood_ShouldReturnException() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{

            moodAnalyser.analyseMood(" ");
        } catch (MoodAnalysisException e) {

                Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.getMessage());
        }
        }


    }

