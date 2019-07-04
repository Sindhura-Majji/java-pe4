package com.stackroute.pe4;

//count the number of times a character is present in the given string

public class CountOfCharacter {

    public String countCharacter(String string, char ch) {
        int count = 0;
        String result = "";

        // checking for null condition
        if(string == null)
        {
            result = null;
        }

        // checking for empty string
        else if( string == " " || ch == ' ' )
        {
            result = "Empty String or character not accepted";
        }

        //logic to find the number of times a character is present
        else {
            string = string.toLowerCase();

            int length = string.length();

            int a = string.replace(String.valueOf(ch), "").length();

            count = length - a;
            result += count;


        }
        return result;
    }
}
