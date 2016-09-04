package com.csdisco.qa;

import java.util.ArrayList;

// Write a method that determines if the input strings are a palindrome, and then prints out two lists:
// a list of palindromes, and a list of non-palindromes.
// Ignore capitalization, whitespace, and punctuation.

public class Main {

    public static void main(String[] args) {

        ArrayList<String> palendromes = new ArrayList<String>();
        ArrayList<String> nonPalendromes = new ArrayList<String>();

        for (int i = 0; i < args.length; i++) {

            String preProcessedWord = preProcess(args[i]);  // this passes the result of args[i] into preProcess
            boolean isPalindrome = isPalendrome(preProcessedWord);

            // add to palindromes
            if (isPalindrome) {
                palendromes.add(args[i]);
            }
            // add to non-palindromes
            else {
                nonPalendromes.add(args[i]);
            }
        }

        if (!palendromes.isEmpty()) {
            System.out.println("Palendromes");
            System.out.println("----------------");

            for (String p : palendromes) {
                System.out.println("- " + p);
            }
        }

        if (!nonPalendromes.isEmpty()) {
            System.out.println();
            System.out.println("Non-palendromes");
            System.out.println("----------------");

            for (String np : nonPalendromes) {
                System.out.println("- "+ np);
            }
        }
    }

    public static String preProcess(String toProcess){

        //String wordToProcess = toProcess.toLowerCase().replaceAll("\\s","").replaceAll("![a-z0-9]","");
        //return wordToProcess;

        // or this could be written:
        return toProcess.toLowerCase().replaceAll("\\s","").replaceAll("[^a-z0-9]+","");
    }

    public static boolean isPalendrome(String preProcessedWord){

        String reversedWord = new String();  // this is calling the constructor String
        // also can be written as:  String reversedWord = "";

        for (int p = preProcessedWord.length()-1; p >= 0; p--) {
            char letter = preProcessedWord.charAt(p);
            reversedWord = reversedWord + letter;
        }
        return preProcessedWord.equals(reversedWord);
    }
}
