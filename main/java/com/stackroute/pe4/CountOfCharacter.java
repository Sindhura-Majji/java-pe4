package com.stackroute.pe4;

public class CountOfCharacter {

    public String countCharacter(String string, char ch) {
        int count = 0;
        String result = "";
        if(string == null)
        {
            result = null;
        }
        else if( string == " " || ch == ' ' )
        {
            result = "Empty String or character not accepted";
        }
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
