package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {
    private String name;
    private String realName;
    private List<ForumPost> posts = new ArrayList<ForumPost>();
    private List<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost (String author, String postBody){
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(thePost, commentBody, author);
        comments.add(theComment);
    }

    public int getPostQuantity() {
        return posts.size();
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    public ForumPost getPost(int postNumber) {
        ForumPost thePost = null;
        if (postNumberIsNot0andSmallerThenSize(postNumber)) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    private boolean postNumberIsNot0andSmallerThenSize(int postNumber) {
        if (postNumber >= 0 && postNumber < posts.size()) {
            return true;
        } else {
            return false;
        }
    }

    public ForumComment getComment(int commentNumber){
        ForumComment theComment = null;
        if (commentNumber >=0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removeComment(ForumComment theComment) {
        if (comments.contains(theComment)) {
            comments.remove(theComment);
            return true;
        } else {
            return false;
        }

    }

    public boolean removePost(ForumPost thePost) {
        if (posts.contains(thePost)) {
            posts.remove(thePost);
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
