package com.kodilla.good.patterns.movies;

import java.util.stream.Collectors;

public class MovieStroreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String title = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(title);
    }
}
