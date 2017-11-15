package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String poemText, String beautifier, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(poemText, beautifier);
        System.out.println(result);
    }
}
