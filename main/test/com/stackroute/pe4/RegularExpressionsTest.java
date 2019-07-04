package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionsTest {

    RegularExpressions regularExpressions;

    @Before
    public void setUp() {
        regularExpressions = new RegularExpressions();
    }

    @After
    public void tearDown() {
        regularExpressions = null;
    }
    @Test
    public void givenStringContainsStringShouldReturnTrue() {
        //Arrange
        //Act
        boolean result = regularExpressions.matchingStringChecker("This is Harry", "Harry");
        //Assert
        assertTrue( result);
    }
    @Test
    public void givenStringContainsStringShouldReturnFalse() {
        //Arrange
        //Act
        boolean result = regularExpressions.matchingStringChecker("This is Henry", "Harry");
        //Assert
        assertFalse( result);
    }
    @Test
    public void givenStringContainsNullShouldReturnFalse() {
        //Arrange
        //Act
        boolean result = regularExpressions.matchingStringChecker(null, null);
        //Assert
        assertFalse( result);
    }
    @Test
    public void givenStringContainsEmptyShouldReturnFalse() {
        //Arrange
        //Act
        boolean result = regularExpressions.matchingStringChecker("", "");
        //Assert
        assertFalse( result);
    }
}