package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("John Smith", "ABC 1", 2010, "A12"));
        bookSet.add(new Book("John Smith", "ABC 2", 2000, "A13"));
        bookSet.add(new Book("John Smith", "ABC 3", 1990, "A14"));
        bookSet.add(new Book("John Smith", "ABC 4", 1980, "A15"));
        bookSet.add(new Book("John Smith", "ABC 5", 1987, "A16"));
        bookSet.add(new Book("John Smith", "ABC 5", 1985, "A16"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        System.out.println(median);
        //Then

    }
}
