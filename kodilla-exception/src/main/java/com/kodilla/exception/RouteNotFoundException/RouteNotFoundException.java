package com.kodilla.exception.RouteNotFoundException;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "RouteNotFoundException: " + this.getMessage();
    }
}
