package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString transposeString;

    @Before
    public void setUp()
    {
        transposeString = new TransposeString();
    }

    @After
    public void tearDown()
    {
        transposeString = null;
    }

    @Test
    public void givenStringContainsStringCharacterShouldReturnReverseString() {
        //Arrange
        //Act
        String result = transposeString.transpose("hi this is sindhu");
        //Assert
        assertEquals("ih siht si uhdnis", result);
    }
    @Test
    public void givenStringContainsEmptyStringShouldReturnErrorMesage() {
        //Arrange
        //Act
        String result = transposeString.transpose(" ");
        //Assert
        assertEquals("Empty string not accepted", result);
    }
}