package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.beautifier.PoemFunctions;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("text", "---",
                (poemText, beautifier) -> beautifier + poemText + beautifier);
        poemBeautifier.beautify("This is example poem", "ABC",
                (poemText, beautifier) -> beautifier + poemText + beautifier);
        poemBeautifier.beautify("This is example poem with Upper Case", "---",
                (poemText, beautifier) -> poemText.toUpperCase());
        poemBeautifier.beautify("This is example poem with quote", "...",
                PoemFunctions::addQuote);
        poemBeautifier.beautify("This is example poem with leftBeautifier", "***",
                PoemFunctions::leftBeautifier);
        poemBeautifier.beautify("This is example poem with rightBeautifier", "000",
                PoemFunctions::rightBeautifier);
        System.out.println();
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
