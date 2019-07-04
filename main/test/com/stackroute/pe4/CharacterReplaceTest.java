package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterReplaceTest {

    CharacterReplace characterReplace;

    @Before
    public void setUp() {
        characterReplace = new CharacterReplace();
    }

    @After
    public void tearDown() {
        characterReplace = null;
    }
    @Test
    public void givenStringContainsStringShouldReturnReplacedString(){
        //Arrange
        //Act
        String replace = characterReplace.replaceOfCharacter("daily dry");
        //Assert
        assertEquals("faity fry",replace);
    }
    @Test
    public void givenStringContainsStringShouldReturnNull(){
        //Arrange
        //Act
        String replace = characterReplace.replaceOfCharacter(null);
        //Assert
        assertEquals(null,replace);
    }
    @Test
    public void givenStringContainsNullStringCharacterShouldReturnErrorMessage(){
        //Arrange
        //Act
        String replace = characterReplace.replaceOfCharacter(" ");
        //Assert
        assertEquals("Empty String not accepted",replace);
    }
}