package com.stackroute.pe4;

//program to sort the words in alphabetical order

public class SortWords {

    public String sortingWords(String input){

        String result="";String words="";
        int i=0,j=0;

        //checking for null condition
        if(input == null){
            return "enter the String";
        }

        // checking for empty string
        else if(input==""){
            return "given String is empty";
        }


        else {
            String[] input1=input.split(" ");
            for (i = 0; i <= input1.length - 1; i++) {
                for (j = 1; j <= input1.length - 1; j++) {
                    if (input1[j - 1].compareTo(input1[j]) > 0) {
                        String temp = input1[j - 1];
                        input1[j - 1] = input1[j];
                        input1[j] = temp;
                    }
                }
            }
            for (i = 0; i <= input1.length - 1; i++) {

                result += input1[i] + " ";
            }
        }

        return result.trim();

    }
}

