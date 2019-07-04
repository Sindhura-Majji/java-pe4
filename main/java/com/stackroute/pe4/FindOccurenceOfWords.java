package com.stackroute.pe4;

//program to find the index of the given sequence of characters

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurenceOfWords {
    String result="";

    public String findWords(String input, String sequence) {

        // checking for empty string
        if(input == "" || sequence == ""){
            result = "Empty String not accepted";
        }

        // checking for null
        else if ( input == null || sequence == null){
            result = "Null not accepted";
        }


        else {
            // Create a pattern to be searched
            Pattern pattern = Pattern.compile(sequence);

            //Search for the given sequence in the given pattern
            Matcher m = pattern.matcher(input);

            // Storing starting and ending indexes of the pattern
            while (m.find())
                result += m.start() + "-" + (m.end()) + " ";

        }
        return result.trim();
    }
}
