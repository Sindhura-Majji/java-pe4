package com.stackroute.pe4;

import java.lang.String;


public class TransposeString {

    public String transpose(String str) {

        String[] words = str.split(" ");
        String reverseString = "", result ="";
        if (str == " ")
        {
            result = "Empty string not accepted";
        }
        else
            {
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reverseString = reverseString + reverseWord + " ";
            }
            result= reverseString.trim();
        }
        return result;
    }
}