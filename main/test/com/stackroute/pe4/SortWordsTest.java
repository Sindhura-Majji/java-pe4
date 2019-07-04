package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {

    SortWords sortWords;

    @Before
    public void setUp() {
        sortWords = new SortWords();
    }

    @After
    public void tearDown() {
        sortWords = null;
    }
    @Test
    public void givenStringContainsStringShouldReturnReverseString() {
        //Arrange
        //Act
        String result = sortWords.sortingWords("hi this is sindhu");
        //Assert
        assertEquals("hi is sindhu this", result);
    }
    @Test
    public void givenStringContainsNullShouldReturnErrorMessage() {
        //Arrange
        //Act
        String result = sortWords.sortingWords(null);
        //Assert
        assertEquals("enter the String", result);
    }
    @Test
    public void givenStringContainsEmptyShouldReturnErrorMessage() {
        //Arrange
        //Act
        String result = sortWords.sortingWords("");
        //Assert
        assertEquals("given String is empty", result);
    }
}