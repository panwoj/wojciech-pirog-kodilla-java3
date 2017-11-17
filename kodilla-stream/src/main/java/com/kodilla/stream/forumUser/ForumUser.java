package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final Integer idNumber;
    private final String name;
    private final Character sex;
    private final LocalDate birthday;
    private final Integer postNumber;

    public ForumUser(final Integer idNumber, final String name, final Character sex,
                     final int year, final int month, final int day, final Integer postNumber) {
        this.idNumber = idNumber;
        this.name = name;
        this.sex = sex;
        this.birthday = LocalDate.of(year, month, day);
        this.postNumber = postNumber;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public Character getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Integer getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return idNumber + "." +
                 name +
                ", sex:" + sex +
                ", birthday:" + birthday +
                ", Number of posts:" + postNumber + ";";
    }
}
