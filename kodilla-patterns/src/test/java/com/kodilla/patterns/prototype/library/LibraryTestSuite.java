package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //creating Books for Library
        Library library = new Library("Library 1");
        IntStream.iterate(1, n -> n+1)
                .limit(20)
                .forEach(b -> library.getBooks().add(
                        new Book("Book number " + b, "Author " + (21 - b),
                                LocalDate.now().minusYears(b).minusMonths(b*2).minusDays(3 * b))) );

        //making a shallow copy of object library
        Library library2 = null;
        try {
            library2 = library.shallowCopy();
            library2.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library library3 = null;
        try {
            library3 = library.deepCopy();
            library3.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(
                new Book("Book number 21", "Author 1", LocalDate.of(2010,10,11)));
        //Then
        System.out.println(library);
        System.out.println(library2);
        System.out.println(library3);
        Assert.assertEquals(21, library.getBooks().size());
        Assert.assertEquals(21, library2.getBooks().size());
        Assert.assertEquals(20, library3.getBooks().size());
    }
}
