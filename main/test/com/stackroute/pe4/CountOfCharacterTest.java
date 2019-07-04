package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfCharacterTest {

    CountOfCharacter countOfCharacter;
    @org.junit.Before
    public void setUp() {
    countOfCharacter = new CountOfCharacter();
    }

    @org.junit.After
    public void tearDown() {
        countOfCharacter = null;
    }

    @Test
    public void givenStringContainsStringShouldReturnCharacterCount(){
        //Arrange
        //Act
        String count = countOfCharacter.countCharacter(" This is Sindhu", 's');
        //Assert
        assertEquals("3", count);
    }
    @Test
    public void givenStringContainsStringShouldReturnNull(){
        //Arrange
        //Act
        String count = countOfCharacter.countCharacter(null, 's');
        //Assert
        assertEquals(null,count);
    }
    @Test
    public void givenStringContainsNullStringCharacterShouldReturnErrorMessage(){
        //Arrange
        //Act
        String count = countOfCharacter.countCharacter(" ", ' ');
        //Assert
        assertEquals("Empty String or character not accepted",count);
    }
    @Test
    public void givenStringContainsNullStringShouldReturnErrorMessage(){
        //Arrange
        //Act
        String count = countOfCharacter.countCharacter(" ", 'a');
        //Assert
        assertEquals("Empty String or character not accepted",count);
    }
    @Test
    public void givenStringContainsNullCharacterShouldReturnErrorMessage(){
        //Arrange
        //Act
        String count = countOfCharacter.countCharacter("This is sindhu", ' ');
        //Assert
        assertEquals("Empty String or character not accepted",count);
    }
}