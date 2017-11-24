package com.kodilla.exception.io;

public class FileReaderException extends Exception {
    @Override
    public String toString() {
        return "Problem while reading a file!";
    }
}
