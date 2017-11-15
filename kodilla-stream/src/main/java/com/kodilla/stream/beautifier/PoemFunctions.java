package com.kodilla.stream.beautifier;

public class PoemFunctions {
    public static String addQuote(String poemText, String beautifier) {
        return beautifier + " " + "\"" + poemText + "\"";
    }
    public static String leftBeautifier(String poemText, String beautifier) {
            return beautifier + poemText;

    }
    public static String rightBeautifier(String poemText, String beautifier) {
        return poemText + beautifier;
    }
}
