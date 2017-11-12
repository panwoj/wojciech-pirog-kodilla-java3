package com.kodilla.testing.forum.statistics;

public class CheckStatistics {
    private Statistics statistics;
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsNumberOnUser;
    private double averageCommentsNumberOnUser;
    private double averageCommentsNumberOnPosts;

    public CheckStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        averagePostsNumberOnUser = postsNumber/usersNumber;
        averageCommentsNumberOnUser = commentsNumber/usersNumber;
        averageCommentsNumberOnPosts = commentsNumber/postsNumber;
    }

    public void ShowStatistics() {
        System.out.println("Number of users: " + usersNumber);
        System.out.println("Number of posts: " + postsNumber);
        System.out.println("Number of comments: " + commentsNumber);
        System.out.println("Average posts written by user: " + averagePostsNumberOnUser);
        System.out.println("Average comments written by user: " + averageCommentsNumberOnUser);
        System.out.println("Average comments written on post: " + averageCommentsNumberOnPosts);
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsNumberOnUser() {
        return averagePostsNumberOnUser;
    }

    public double getAverageCommentsNumberOnUser() {
        return averageCommentsNumberOnUser;
    }

    public double getAverageCommentsNumberOnPosts() {
        return averageCommentsNumberOnPosts;
    }
}
