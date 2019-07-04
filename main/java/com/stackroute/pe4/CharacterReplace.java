package com.stackroute.pe4;

public class CharacterReplace {

    public String replaceOfCharacter( String string)
    {
        String result="";
        if(string == null)
        {
            result = null;
        }
        else if( string == " " )
        {
            result = "Empty String not accepted";
        }
        else
        {
           String string1 = string.replace('d', 'f');
           result = string1.replace('l', 't');
        }
        return result;
    }
}
