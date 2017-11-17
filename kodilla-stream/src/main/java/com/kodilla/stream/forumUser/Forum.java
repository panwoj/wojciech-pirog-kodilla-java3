package com.kodilla.stream.forumUser;


import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "jim21", 'M',
                1878, 2, 13, 0));
        forumUsers.add(new ForumUser(2, "joanne12", 'F',
                1990, 5, 3, 3));
        forumUsers.add(new ForumUser(3, "xyz12", 'M',
                1988, 12, 1, 24));
        forumUsers.add(new ForumUser(4, "alice", 'F',
                1981, 5, 30, 12));
        forumUsers.add(new ForumUser(5, "tom", 'M',
                1985, 3, 23, 99));
        forumUsers.add(new ForumUser(6, "katrina84", 'F',
                1995, 1, 1, 101));
        forumUsers.add(new ForumUser(7, "caroline1990", 'F',
                1990, 9, 2, 63));
        forumUsers.add(new ForumUser(8, "arek.p", 'M',
                1969, 11, 20, 153));
        forumUsers.add(new ForumUser(9, "frank", 'M',
                1981, 7, 13, 67));
        forumUsers.add(new ForumUser(10, "oleg", 'M',
                1980, 5, 3, 2));
        forumUsers.add(new ForumUser(11, "angelina234", 'F',
                1992, 10, 30, 27));
        forumUsers.add(new ForumUser(12, "alex1234", 'M',
                1973, 3, 13, 87));
        forumUsers.add(new ForumUser(13, "smartGuy", 'M',
                1975, 12, 12, 253));
        forumUsers.add(new ForumUser(14, "paulH", 'M',
                1999, 9, 25, 33));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
