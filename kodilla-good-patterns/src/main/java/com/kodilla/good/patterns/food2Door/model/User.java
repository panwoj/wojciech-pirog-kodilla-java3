package com.kodilla.good.patterns.food2Door.model;

public class User {
    private String name;
    private String surname;
    private String phoneNumber;
    private String city;

    public User(String name, String surname, String phoneNumber, String city) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }
}
