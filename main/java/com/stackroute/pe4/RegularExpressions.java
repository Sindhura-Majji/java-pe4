package com.stackroute.pe4;

//program to match the input in the given pattern

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {


    public boolean matchingStringChecker(String input,String sequence){

        boolean result = false;

        // checking for null condition
        if(input==null || sequence==null){
            return false;
        }

        // checking for empty string
        else if(input==""|| sequence==""){
            return false;
        }

        else {

            // pattern to match the given inout
            Pattern pattern = Pattern.compile(sequence);

            // Search above pattern in the given pattern
            Matcher m = pattern.matcher(input);

            if (m.find()) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
