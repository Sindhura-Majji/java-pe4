package com.stackroute.pe4;

//program to replace character in the given string

public class CharacterReplace {

    public String replaceOfCharacter( String string)
    {
        String result="";

        //If null should return null
        if(string == null)
        {
            result = null;
        }

        // If the given string is empty should return empty
        else if( string == " " )
        {
            result = "Empty String not accepted";
        }

        //If the above things are not satisfied then this block runs
        else
        {
           String string1 = string.replace('d', 'f');
           result = string1.replace('l', 't');
        }
        return result;
    }
}
